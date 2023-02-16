package vip.yingmen.service.Impl;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.entity.LvDingParam;
import vip.yingmen.entity.StPpAlarm;
import vip.yingmen.mapper.ShuiKuShuiQingGISMapper;
import vip.yingmen.mapper.StAlarminfoMapper;
import vip.yingmen.pojo.*;
import vip.yingmen.service.ShuiKuShuiQingGISService;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ShuiKuShuiQingGISServiceImpl implements ShuiKuShuiQingGISService {
    @Autowired
    private ShuiKuShuiQingGISMapper shuiKuShuiQingGISMapper;
    @Autowired
    private StAlarminfoMapper stAlarminfoMapper;

    //水库水情的gis第一滑框实时数据查询
    @Override
    public Map findByShuiKuShuiQingGIS(Map searchMap) {
        if (searchMap.get("max_yichang") == null) {
            searchMap.put("max_yichang", null);
        }
        JSONObject map = new JSONObject(new HashMap<>());
        String displayFieldName = "";
        fieldAliases fieldAliases = new fieldAliases();
        fieldAliases.setID("ID");
        fieldAliases.setSTCD("STCD");
        fieldAliases.setSTNM("STNM");
        fieldAliases.setSTTP("STTP");
        fieldAliases.setLGTD("LGTD");
        fieldAliases.setLTTD("LTTD");
        String geometryType = "";
        spatialReference spatialReference = new spatialReference();
        spatialReference.setWkid(4326);
        List<fields> fields = new ArrayList<>();
        fields fields1 = new fields();
        fields1.setName("ID");
        fields1.setType("esriFieldTypeOID");
        fields1.setAlias("ID");
        fields.add(fields1);

        fields fields2 = new fields();
        fields2.setName("STCD");
        fields2.setType("esriFieldTypeString");
        fields2.setAlias("STCD");
        fields2.setLength(100);
        fields.add(fields2);

        fields fields3 = new fields();
        fields3.setName("STNM");
        fields3.setType("esriFieldTypeString");
        fields3.setAlias("STCD");
        fields3.setLength(100);
        fields.add(fields3);

        fields fields4 = new fields();
        fields4.setName("STTP");
        fields4.setType("esriFieldTypeString");
        fields4.setAlias("STTP");
        fields4.setLength(100);
        fields.add(fields4);

        fields fields5 = new fields();
        fields5.setName("LGTD");
        fields5.setType("esriFieldTypeString");
        fields5.setAlias("LGTD");
        fields5.setLength(100);
        fields.add(fields5);

        fields fields6 = new fields();
        fields6.setName("LTTD");
        fields6.setType("esriFieldTypeString");
        fields6.setAlias("LTTD");
        fields6.setLength(100);
        fields.add(fields6);


        map.put("displayFieldName", displayFieldName);
        map.put("fieldAliases", fieldAliases);
        map.put("geometryType", "esriGeometryPoint");
        List<ShuiKuShuiQingGIS> shuiKuShuiQingGISList = shuiKuShuiQingGISMapper.findByShuiKuShuiQingGIS(searchMap);
        List<ShuiKuShuiQingGIS>  shuiQingGISlist = new ArrayList<>();
        for (ShuiKuShuiQingGIS s : shuiKuShuiQingGISList) {
            if (s.getTm().substring(5, 7).contains("07") | s.getTm().substring(5, 7).contains("08") | s.getTm().substring(5, 7).contains("09")) {
                if (Double.parseDouble(s.getRZ()) > Double.parseDouble(s.getYUJING_FWL79())) {
                    s.set_status("0");
                } else {
                    s.set_status("1");
                }
            } else {
                if (Double.parseDouble(s.getRZ()) > Double.parseDouble(s.getYUJING_FWL())) {
                    s.set_status("0");
                } else {
                    s.set_status("1");
                }

            }
            if (s.getCV() != null || s.getCV() != "") {
                if (searchMap.get("max_yichang")!= null) {
                    if (Math.abs(Double.parseDouble(s.getCV())) > Math.abs(Double.parseDouble(searchMap.get("max_yichang").toString()))) {
                        s.setSingular("0");
                    } else {
                        s.setSingular("1");
                    }
                } else {
                    s.setSingular("1");
                }

            } else {
                s.setSingular("1");
            }
            if (searchMap.get("_status")!=null && !searchMap.get("_status").toString().equals("all")){
                if (s.get_status().equals(searchMap.get("_status").toString())){
                    shuiQingGISlist.add(s);
                }
            }else{
                shuiQingGISlist.add(s);
            }
        }

        List<features> featuresList = new ArrayList<>();
        for (ShuiKuShuiQingGIS s : shuiQingGISlist) {
            features features = new features();
            attributes attributes = new attributes();
            geometry geometry = new geometry();
            attributes.setID(s.getID());
            attributes.setSTCD(s.getSTCD());
            attributes.setSTNM(s.getSTNM());
            attributes.setSTTP(s.getSTTP());
            attributes.setLGTD(s.getLGTD());
            attributes.setLTTD(s.getLTTD());
            features.setAttributes(attributes);
            geometry.setX(s.getLGTD());
            geometry.setY(s.getLTTD());
            features.setGeometry(geometry);
            features.setRowinfo(s);
            featuresList.add(features);
        }
        map.put("features", featuresList);
        map.put("spatialReference", spatialReference);
        map.put("fields", fields);
        return map;
    }
    //仪表图统计数据
    public Map<String,Object> findSiteTongjiInfo(){
        String[] nowdates=nowarray();
        Map<String,Object> search=new HashMap<String,Object>();
        search.put("Time_min",nowdates[0]);
        search.put("Time_max",nowdates[1]);
        List<SiteRealInfoGIS> yuanlist = shuiKuShuiQingGISMapper.findBySiteInfoGIS(search);
        //设备故障统计 正常 故障 通讯故障 电压故障
        int sb_zcnum=0,sb_gznum=0,sb_txgz=0,sb_dygz=0;
        List<Map<String,Object>> sblist=new ArrayList<Map<String,Object>>();
        //水情统计 正常水位 超汛限水位
        int sq_zcnum=0,sq_jxx=0;
        List<Map<String,Object>> sqlist=new ArrayList<Map<String,Object>>();
        //雨情统计  无降雨 正常降雨  预警降雨  红色预警  橙色预警  黄色预警
        int yq_nonum=0,yq_zcnum=0,yq_yjnum=0,yq_redyj=0,yq_orgyj=0,yq_yelyj=0;
        List<Map<String,Object>> yqlist=new ArrayList<Map<String,Object>>();
        //预警详情
        List<SiteRealInfoGIS> yjlist=new ArrayList<SiteRealInfoGIS>();
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        //站点实时信息
        List<Map<String,Object>> sslist=new ArrayList<Map<String,Object>>();
        //雨量预警指标
        Map<String,List<StPpAlarm>> mapalarm=getRainalarmByStcd();
        for(SiteRealInfoGIS s: yuanlist){
            s.setSIGN1(rainlevel(1,Float.parseFloat(s.getRAIN1()),mapalarm.get(s.getSTCD())));
            s.setSIGN3(rainlevel(3,Float.parseFloat(s.getRAIN3()),mapalarm.get(s.getSTCD())));
            s.setSIGN6(rainlevel(6,Float.parseFloat(s.getRAIN6()),mapalarm.get(s.getSTCD())));
            s.setSIGN12(rainlevel(12,Float.parseFloat(s.getRAIN12()),mapalarm.get(s.getSTCD())));
            s.setSIGN24(rainlevel(24,Float.parseFloat(s.getRAIN24()),mapalarm.get(s.getSTCD())));
            if(s.getSIGN1()>0||s.getSIGN3()>0||s.getSIGN6()>0||s.getSIGN12()>0||s.getSIGN24()>0){
                yq_yjnum++;
                s.set_status("0");
            }else{
                yq_zcnum++;
                s.set_status("1");
            }
            if(Double.parseDouble(s.getJxx())>0){
                sq_jxx++;
                s.set_skstatus("0");
            }else{
                sq_zcnum++;
                s.set_skstatus("1");
            }
            if(Integer.parseInt(s.get_gkstatus())==0){
                sb_gznum++;
                if(s.getCS().equals("异常")){
                    sb_txgz++;
                }else{
                    sb_dygz++;
                }
            }else{
                sb_zcnum++;
            }
            if(s.get_status().equals("0")||s.get_skstatus().equals("0")){
                int level=0,sign=0;
                float weight=0;
                String rain="";
                if(s.getSIGN1()>level){
                    level=s.getSIGN1();sign=1;
                    rain=s.getRAIN1();
                }
                if(s.getSIGN3()>level){
                    level=s.getSIGN3();sign=3;
                    rain=s.getRAIN3();
                }
                if(s.getSIGN6()>level){
                    level=s.getSIGN6();sign=6;
                    rain=s.getRAIN6();
                }
                if(s.getSIGN12()>level){
                    level=s.getSIGN12();sign=12;
                    rain=s.getRAIN12();
                }
                if(s.getSIGN24()>level){
                    level=s.getSIGN24();sign=24;
                    rain=s.getRAIN24();
                }
                if(level>0){
                    String yjtype="黄色预警";
                    if(level==1){
                        yq_yelyj++;
                    }
                    if(level==2){
                        yq_orgyj++;
                        yjtype="橙色预警";

                    }else if(level==3){
                        yq_redyj++;
                        yjtype="红色预警";
                    }
                    s.set_status(yjtype+"|"+sign+"|"+rain);
                    weight+=level+1;
                }else{
                    s.set_status("no");
                }
                if(s.get_skstatus().equals("1")){
                    s.set_skstatus("no");
                }else{
                    s.set_skstatus((5+Float.parseFloat(s.getJxx()))+"|"+s.getJxx());
                    weight+=5+Float.parseFloat(s.getJxx());
                }
                s.setSingular(String.valueOf(weight));
                yjlist.add(s);
            }
            Map<String,Object> ssmap=new HashMap<String,Object>();
            ssmap.put("STCD",s.getSTCD());
            ssmap.put("STNM",s.getSTNM());
            ssmap.put("W",s.getW());
            ssmap.put("RZ",s.getRZ());
            ssmap.put("JL",s.getJxx());
            ssmap.put("P",s.getP());
            ssmap.put("HOURP",s.getHourp());
            if(s.get_status().equals("no") || s.get_status().equals("1")){
                ssmap.put("RAINALARM",0);
            }else{
                ssmap.put("RAINALARM",1);
            }
            if(s.get_skstatus().equals("no") ||s.get_skstatus().equals("1")){
                ssmap.put("ALARM",0);
            }else{
                ssmap.put("ALARM",1);
            }
            sslist.add(ssmap);
        }
        Map<String,Object> sbgz=new HashMap<String,Object>();
        sbgz.put("TITLE","正常");
        sbgz.put("TOTAL",sb_zcnum);
        sbgz.put("GZSIGN",0);
        sblist.add(sbgz);
        Map<String,Object> sbgz1=new HashMap<String,Object>();
        sbgz1.put("TITLE","故障");
        sbgz1.put("TOTAL",sb_gznum);
        sbgz1.put("GZSIGN",1);
        sblist.add(sbgz1);
        Map<String,Object> sbgz2=new HashMap<String,Object>();
        sbgz2.put("TITLE","通讯故障");
        sbgz2.put("TOTAL",sb_txgz);
        sbgz2.put("GZSIGN",2);
        sblist.add(sbgz2);
        Map<String,Object> sbgz3=new HashMap<String,Object>();
        sbgz3.put("TITLE","电压故障");
        sbgz3.put("TOTAL",sb_txgz);
        sbgz3.put("GZSIGN",3);
        sblist.add(sbgz3);
        Map<String,Object> sqmap1=new HashMap<String,Object>();
        sqmap1.put("TITLE","正常");
        sqmap1.put("TOTAL",sq_zcnum);
        sqlist.add(sqmap1);
        Map<String,Object> sqmap2=new HashMap<String,Object>();
        sqmap2.put("TITLE","超汛限");
        sqmap2.put("TOTAL",sq_jxx);
        sqlist.add(sqmap2);
        Map<String,Object> yqmap1=new HashMap<String,Object>();
        yqmap1.put("TITLE","正常");
        yqmap1.put("TOTAL",yq_zcnum);
        yqmap1.put("YJSIGN",0);
        yqlist.add(yqmap1);
        Map<String,Object> yqmap2=new HashMap<String,Object>();
        yqmap2.put("TITLE","预警");
        yqmap2.put("TOTAL",yq_yjnum);
        yqmap2.put("YJSIGN",1);
        yqlist.add(yqmap2);
        Map<String,Object> yqmap3=new HashMap<String,Object>();
        yqmap3.put("TITLE","黄色预警");
        yqmap3.put("TOTAL",yq_yelyj);
        yqmap3.put("YJSIGN",2);
        yqlist.add(yqmap3);
        Map<String,Object> yqmap4=new HashMap<String,Object>();
        yqmap4.put("TITLE","橙色预警");
        yqmap4.put("TOTAL",yq_orgyj);
        yqmap4.put("YJSIGN",3);
        yqlist.add(yqmap4);
        Map<String,Object> yqmap5=new HashMap<String,Object>();
        yqmap5.put("TITLE","红色预警");
        yqmap5.put("TOTAL",yq_redyj);
        yqmap5.put("YJSIGN",4);
        yqlist.add(yqmap5);
        Collections.sort(yjlist, new Comparator<SiteRealInfoGIS>() {
            @Override
            public int compare(SiteRealInfoGIS o1, SiteRealInfoGIS o2) {
                float sort1 = Float.parseFloat(o1.getSingular());
                float sort2 = Float.parseFloat(o2.getSingular());
                if (sort1 == sort2) {
                    return 0;
                } else if(sort2>sort1){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        List<Map<String,Object>> zztlist=new ArrayList<Map<String,Object>>();
        for(int i=0;i<yjlist.size();i++){
            SiteRealInfoGIS yjobj=yjlist.get(i);
            String[] area=yjobj.getAdnm().split("\\|");
            String town=area[0];
            String country=area[1];
            String swyj="",ylyj="",sbyj="";
            if(!yjobj.get_skstatus().equals("no")){
                swyj="当前水位"+yjobj.getRZ()+"m，超汛限水位"+yjobj.getJxx()+"m";
                Map<String,Object> map=new HashMap<String,Object>();
                map.put("STNM",yjobj.getSTNM());
                map.put("YJTYPE",3);
                map.put("YMMEMO",swyj);
                list.add(map);
            }
            if(!yjobj.get_status().equals("no")){
                ylyj="雨量"+yjobj.get_status().split("\\|")[0]+","+yjobj.get_status().split("\\|")[1]+"小时降雨"+yjobj.get_status().split("\\|")[2]+"mm";
                Map<String,Object> map=new HashMap<String,Object>();
                map.put("STNM",yjobj.getSTNM());
                map.put("YJTYPE",2);
                map.put("YMMEMO",ylyj);
                list.add(map);
                Map<String,Object> yjrain=new HashMap<String,Object>();
                yjrain.put("STNM",yjobj.getSTNM());
                yjrain.put("P",yjobj.getP());
                yjrain.put("HOURP",yjobj.getHourp());
                zztlist.add(yjrain);
            }
        }
        Map<String,Object> returnMap=new HashMap<String,Object>();
        returnMap.put("sbtjinfo",sblist);
        returnMap.put("sqtjinfo",sqlist);
        returnMap.put("yqtjinfo",yqlist);
        returnMap.put("zztrain",zztlist);
        returnMap.put("detailinfo",list);
        returnMap.put("shishiinfo",sslist);
        return returnMap;
    }
    //获取今日雨情时间段
    private String[] nowarray(){
        String[] datestr=new String[2];
        String nowtime=shuiKuShuiQingGISMapper.selectCurrentTime();
        Calendar   now = Calendar.getInstance();
        now.set(2022,2,12,20,28,46);
        if(now.get(Calendar.HOUR_OF_DAY)<8){
            Calendar last=Calendar.getInstance();
            last.add(Calendar.DATE,-1);
            last.set(Calendar.HOUR_OF_DAY,8);
            last.set(Calendar.MINUTE,0);
            last.set(Calendar.SECOND,0);
            datestr[0]=new SimpleDateFormat( "yyyy-MM-dd HH").format(last.getTime())+":00:00";
        }else{
            datestr[0]=new SimpleDateFormat( "yyyy-MM-dd").format(now.getTime())+" 08:00:00";
        }
        datestr[1]=new SimpleDateFormat( "yyyy-MM-dd HH").format(now.getTime())+":00:00";
        return datestr;
    }
    //情势分析  获取预警数据
    public Map<String,Object> findCurYujing(){
        List<SiteRealInfoGIS> siteRealInfoGISList = shuiKuShuiQingGISMapper.findBySiteInfoGIS(new HashMap());
        List<SiteRealInfoGIS> yjlist=new ArrayList<SiteRealInfoGIS>();
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        Map<String,List<StPpAlarm>> mapalarm=getRainalarmByStcd();
        for(SiteRealInfoGIS s: siteRealInfoGISList){
            s.setSIGN1(rainlevel(1,Float.parseFloat(s.getRAIN1()),mapalarm.get(s.getSTCD())));
            s.setSIGN3(rainlevel(3,Float.parseFloat(s.getRAIN3()),mapalarm.get(s.getSTCD())));
            s.setSIGN6(rainlevel(6,Float.parseFloat(s.getRAIN6()),mapalarm.get(s.getSTCD())));
            s.setSIGN12(rainlevel(12,Float.parseFloat(s.getRAIN12()),mapalarm.get(s.getSTCD())));
            s.setSIGN24(rainlevel(24,Float.parseFloat(s.getRAIN24()),mapalarm.get(s.getSTCD())));
            if(s.getSIGN1()>0||s.getSIGN3()>0||s.getSIGN6()>0||s.getSIGN12()>0||s.getSIGN24()>0){
                s.set_status("0");
            }else{
                s.set_status("1");
            }
            if (s.getTm().substring(5, 7).contains("07") | s.getTm().substring(5, 7).contains("08") | s.getTm().substring(5, 7).contains("09")) {
                if (Double.parseDouble(s.getRZ()) > Double.parseDouble(s.getYUJING_FWL79())) {
                    s.set_skstatus("0");
                } else {
                    s.set_skstatus("1");
                }
            } else {
                if (Double.parseDouble(s.getRZ()) > Double.parseDouble(s.getYUJING_FWL())) {
                    s.set_skstatus("0");
                } else {
                    s.set_skstatus("1");
                }

            }
            if(s.get_status().equals("0")||s.get_skstatus().equals("0")||s.get_gkstatus().equals("0")){
                int level=0,sign=0;
                float weight=0;
                String rain="";
                if(s.getSIGN1()>level){
                    level=s.getSIGN1();sign=1;
                    rain=s.getRAIN1();
                }
                if(s.getSIGN3()>level){
                    level=s.getSIGN3();sign=3;
                    rain=s.getRAIN3();
                }
                if(s.getSIGN6()>level){
                    level=s.getSIGN6();sign=6;
                    rain=s.getRAIN6();
                }
                if(s.getSIGN12()>level){
                    level=s.getSIGN12();sign=12;
                    rain=s.getRAIN12();
                }
                if(s.getSIGN24()>level){
                    level=s.getSIGN24();sign=24;
                    rain=s.getRAIN24();
                }
                if(level>0){
                    String yjtype="黄色预警";
                    if(level==2){
                        yjtype="橙色预警";
                    }else if(level==3){
                        yjtype="红色预警";
                    }
                    s.set_status(yjtype+"|"+sign+"|"+rain);
                    weight+=level+1;
                }else{
                    s.set_status("no");
                }
                if(s.get_skstatus().equals("1")){
                    s.set_skstatus("no");
                }else{
                    s.set_skstatus((5+Float.parseFloat(s.getJxx()))+"|"+s.getJxx());
                    weight+=5+Float.parseFloat(s.getJxx());
                }
                if(s.get_gkstatus().equals("1")){
                    s.set_gkstatus("no");
                }else{
                    weight+=1;
                    if(s.getCS().equals("正常")){
                        s.set_gkstatus("1|"+"电压异常");
                    }else{
                        s.set_gkstatus("1|"+"通讯异常");
                    }
                }
                s.setSingular(String.valueOf(weight));
                yjlist.add(s);
            }
        }
        Collections.sort(yjlist, new Comparator<SiteRealInfoGIS>() {
            @Override
            public int compare(SiteRealInfoGIS o1, SiteRealInfoGIS o2) {
                float sort1 = Float.parseFloat(o1.getSingular());
                float sort2 = Float.parseFloat(o2.getSingular());
                if (sort1 == sort2) {
                    return 0;
                } else if(sort2>sort1){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        int sitenum=yjlist.size();
        for(int i=0;i<yjlist.size();i++){
            SiteRealInfoGIS yjobj=yjlist.get(i);
            String[] area=yjobj.getAdnm().split("\\|");
            String town=area[0];
            String country=area[1];
            String swyj="",ylyj="",sbyj="";
            if(!yjobj.get_skstatus().equals("no")){
                swyj="水位"+yjobj.getRZ()+"m，超汛限水位"+yjobj.getJxx()+"m";
                Map<String,Object> map=new HashMap<String,Object>();
                map.put("TOWN",town);
                map.put("COUNTRY",country);
                map.put("STNM",yjobj.getSTNM());
                map.put("YJTYPE",3);
                map.put("YMMEMO",swyj);
                list.add(map);
            }
            if(!yjobj.get_status().equals("no")){
                ylyj="雨量"+yjobj.get_status().split("\\|")[0]+","+yjobj.get_status().split("\\|")[1]+"小时降雨"+yjobj.get_status().split("\\|")[2]+"mm";
                Map<String,Object> map=new HashMap<String,Object>();
                map.put("TOWN",town);
                map.put("COUNTRY",country);
                map.put("STNM",yjobj.getSTNM());
                map.put("YJTYPE",2);
                map.put("YMMEMO",ylyj);
                list.add(map);
            }
            if(!yjobj.get_gkstatus().equals("no")){
                sbyj="设备"+yjobj.get_gkstatus().split("\\|")[1];
                Map<String,Object> map=new HashMap<String,Object>();
                map.put("TOWN",town);
                map.put("COUNTRY",country);
                map.put("STNM",yjobj.getSTNM());
                map.put("YJTYPE",1);
                map.put("YMMEMO",sbyj);
                list.add(map);
            }
        }
        Map<String,Object> returnmap=new HashMap<>();
        returnmap.put("sitenum",sitenum);
        returnmap.put("yjlist",list);
        return returnmap;
    }
    //站点雨情预警指标按站点编号进行分类
    private Map<String,List<StPpAlarm>> getRainalarmByStcd(){
        List<StPpAlarm> rainalarms= stAlarminfoMapper.selectStPpAlarmByStcd(new LvDingParam());
        Map<String,List<StPpAlarm>> mapalarm=new HashMap<String,List<StPpAlarm>>();
        for(int i=0;i<rainalarms.size();i++){
            StPpAlarm alarm=rainalarms.get(i);
            if(i==0){
                List<StPpAlarm> stalarm=new ArrayList<>();
                stalarm.add(alarm);
                mapalarm.put(alarm.getStcd(),stalarm);
            }else{
                if(mapalarm.get(alarm.getStcd())==null){
                    List<StPpAlarm> stalarm=new ArrayList<>();
                    stalarm.add(alarm);
                    mapalarm.put(alarm.getStcd(),stalarm);
                }else{
                    List<StPpAlarm> stalarm=mapalarm.get(alarm.getStcd());
                    stalarm.add(alarm);
                }
            }
        }
        return mapalarm;
    }
    //站点水雨情运行工况实时数据
    @Override
    public Map findBySiteInfoGIS(Map searchMap){
        if (searchMap.get("max_yichangsw") == null) {
            searchMap.put("max_yichangsw", null);
        }
        JSONObject map = new JSONObject(new HashMap<>());
        String displayFieldName = "";
        fieldAliases fieldAliases = new fieldAliases();
        fieldAliases.setID("ID");
        fieldAliases.setSTCD("STCD");
        fieldAliases.setSTNM("STNM");
        fieldAliases.setSTTP("STTP");
        fieldAliases.setLGTD("LGTD");
        fieldAliases.setLTTD("LTTD");
        spatialReference spatialReference = new spatialReference();
        spatialReference.setWkid(4326);
        List<fields> fields = new ArrayList<>();
        fields fields1 = new fields();
        fields1.setName("ID");
        fields1.setType("esriFieldTypeOID");
        fields1.setAlias("ID");
        fields.add(fields1);

        fields fields2 = new fields();
        fields2.setName("STCD");
        fields2.setType("esriFieldTypeString");
        fields2.setAlias("STCD");
        fields2.setLength(100);
        fields.add(fields2);

        fields fields3 = new fields();
        fields3.setName("STNM");
        fields3.setType("esriFieldTypeString");
        fields3.setAlias("STCD");
        fields3.setLength(100);
        fields.add(fields3);

        fields fields4 = new fields();
        fields4.setName("STTP");
        fields4.setType("esriFieldTypeString");
        fields4.setAlias("STTP");
        fields4.setLength(100);
        fields.add(fields4);

        fields fields5 = new fields();
        fields5.setName("LGTD");
        fields5.setType("esriFieldTypeString");
        fields5.setAlias("LGTD");
        fields5.setLength(100);
        fields.add(fields5);

        fields fields6 = new fields();
        fields6.setName("LTTD");
        fields6.setType("esriFieldTypeString");
        fields6.setAlias("LTTD");
        fields6.setLength(100);
        fields.add(fields6);

        map.put("displayFieldName", displayFieldName);
        map.put("fieldAliases", fieldAliases);
        map.put("geometryType", "esriGeometryPoint");
        Map<String,List<StPpAlarm>> mapalarm=getRainalarmByStcd();
        List<SiteRealInfoGIS> siteRealInfoGISList = shuiKuShuiQingGISMapper.findBySiteInfoGIS(searchMap);
        for(SiteRealInfoGIS s: siteRealInfoGISList){
            s.setSIGN1(rainlevel(1,Float.parseFloat(s.getRAIN1()),mapalarm.get(s.getSTCD())));
            s.setSIGN3(rainlevel(3,Float.parseFloat(s.getRAIN3()),mapalarm.get(s.getSTCD())));
            s.setSIGN6(rainlevel(6,Float.parseFloat(s.getRAIN6()),mapalarm.get(s.getSTCD())));
            s.setSIGN12(rainlevel(12,Float.parseFloat(s.getRAIN12()),mapalarm.get(s.getSTCD())));
            s.setSIGN24(rainlevel(24,Float.parseFloat(s.getRAIN24()),mapalarm.get(s.getSTCD())));
            s.setAdnm(s.getAdnm().replace("|",""));
            if (s.getP() != null && s.getP() != "") {
                if (searchMap.get("max_yichang")!=null && !StringUtils.isBlank(searchMap.get("max_yichang").toString())){
                    if (Double.parseDouble(s.getP()) > Double.parseDouble(searchMap.get("max_yichang").toString())) {
                        s.set_status("0");
                    } else {
                        s.set_status("1");
                    }
                }else {
                    s.set_status("1");
                }

            }else {
                if(s.getSTCD().equals("611H1037HC")){
                    s.set_status("0");
                }else{
                    s.set_status("1");
                }

            }
            if(s.getSIGN1()>0||s.getSIGN3()>0||s.getSIGN6()>0||s.getSIGN12()>0||s.getSIGN24()>0){
                s.set_status("0");
            }
            if (s.getTm().substring(5, 7).contains("07") | s.getTm().substring(5, 7).contains("08") | s.getTm().substring(5, 7).contains("09")) {
                if (Double.parseDouble(s.getRZ()) > Double.parseDouble(s.getYUJING_FWL79())) {
                    s.set_skstatus("0");
                } else {
                    s.set_skstatus("1");
                }
            } else {
                if (Double.parseDouble(s.getRZ()) > Double.parseDouble(s.getYUJING_FWL())) {
                    s.set_skstatus("0");
                } else {
                    s.set_skstatus("1");
                }

            }
            if (s.getCV() != null || s.getCV() != "") {
                if (searchMap.get("max_yichangsw")!= null) {
                    if (Math.abs(Double.parseDouble(s.getCV())) > Math.abs(Double.parseDouble(searchMap.get("max_yichangsw").toString()))) {
                        s.setSingular("0");
                    } else {
                        s.setSingular("1");
                    }
                } else {
                    s.setSingular("1");
                }

            } else {
                s.setSingular("1");
            }

        }
        List<features> featuresList = new ArrayList<>();
        for(SiteRealInfoGIS s: siteRealInfoGISList){
            features features = new features();
            attributes attributes = new attributes();
            geometry geometry = new geometry();
            attributes.setID(s.getID());
            attributes.setSTCD(s.getSTCD());
            attributes.setSTNM(s.getSTNM());
            attributes.setSTTP(s.getSTTP());
            attributes.setLGTD(s.getLGTD());
            attributes.setLTTD(s.getLTTD());
            features.setAttributes(attributes);
            geometry.setX(s.getLGTD());
            geometry.setY(s.getLTTD());
            features.setGeometry(geometry);
            features.setRowinfo(s);
            featuresList.add(features);
        }
        map.put("features", featuresList);
        map.put("spatialReference", spatialReference);
        map.put("fields", fields);
        return map;
    }
    private int rainlevel(int sign,float value,List<StPpAlarm> stalarm){
        switch (sign){
            case 1:
                if (value >= stalarm.get(0).getOhP() && value < stalarm.get(1).getOhP()) return 1;
                if (value >= stalarm.get(1).getOhP() && value < stalarm.get(2).getOhP()) return 2;
                if (value >= stalarm.get(2).getOhP()) return 3;
                return 0;
            case 3:
                if (value >= stalarm.get(0).getThP() && value < stalarm.get(1).getThP()) return 1;
                if (value >= stalarm.get(1).getThP() && value < stalarm.get(2).getThP()) return 2;
                if (value >= stalarm.get(2).getThP()) return 3;
                return 0;
            case 6:
                if (value >= stalarm.get(0).getShP() && value < stalarm.get(1).getShP()) return 1;
                if (value >= stalarm.get(1).getShP() && value < stalarm.get(2).getShP()) return 2;
                if (value >= stalarm.get(2).getShP()) return 3;
                return 0;
            case 12:
                if (value >= stalarm.get(0).getTwhP() && value < stalarm.get(1).getTwhP()) return 1;
                if (value >= stalarm.get(1).getTwhP() && value < stalarm.get(2).getTwhP()) return 2;
                if (value >= stalarm.get(2).getTwhP()) return 3;
                return 0;
            case 24:
                if (value >= stalarm.get(0).getOdP() && value < stalarm.get(1).getOdP()) return 1;
                if (value >= stalarm.get(1).getOdP() && value < stalarm.get(2).getOdP()) return 2;
                if (value >= stalarm.get(2).getOdP()) return 3;
                return 0;
        }
    return 0;
    }
    //获取当前时间
    public String findCurrentTime(){
        return shuiKuShuiQingGISMapper.selectCurrentTime();
    }
    //水库水情的gis第一滑框实时数据查询
    @Override
    public Map findByShuiKuShuiQingGIS() {
//        System.out.println(searchMap.get("STGR"));
        JSONObject map = new JSONObject(new HashMap<>());
        String displayFieldName = "";
        fieldAliases fieldAliases = new fieldAliases();
        fieldAliases.setID("ID");
        fieldAliases.setSTCD("STCD");
        fieldAliases.setSTNM("STNM");
        fieldAliases.setSTTP("STTP");
        fieldAliases.setLGTD("LGTD");
        fieldAliases.setLTTD("LTTD");
        String geometryType = "";
        spatialReference spatialReference = new spatialReference();
        spatialReference.setWkid(4326);
        List<fields> fields = new ArrayList<>();
        fields fields1 = new fields();
        fields1.setName("ID");
        fields1.setType("esriFieldTypeOID");
        fields1.setAlias("ID");
        fields.add(fields1);

        fields fields2 = new fields();
        fields2.setName("STCD");
        fields2.setType("esriFieldTypeString");
        fields2.setAlias("STCD");
        fields2.setLength(100);
        fields.add(fields2);

        fields fields3 = new fields();
        fields3.setName("STNM");
        fields3.setType("esriFieldTypeString");
        fields3.setAlias("STCD");
        fields3.setLength(100);
        fields.add(fields3);

        fields fields4 = new fields();
        fields4.setName("STTP");
        fields4.setType("esriFieldTypeString");
        fields4.setAlias("STTP");
        fields4.setLength(100);
        fields.add(fields4);

        fields fields5 = new fields();
        fields5.setName("LGTD");
        fields5.setType("esriFieldTypeString");
        fields5.setAlias("LGTD");
        fields5.setLength(100);
        fields.add(fields5);

        fields fields6 = new fields();
        fields6.setName("LTTD");
        fields6.setType("esriFieldTypeString");
        fields6.setAlias("LTTD");
        fields6.setLength(100);
        fields.add(fields6);


        map.put("displayFieldName", displayFieldName);
        map.put("fieldAliases", fieldAliases);
        map.put("geometryType", "esriGeometryPoint");
        List<ShuiKuShuiQingGIS> shuiKuShuiQingGISList = shuiKuShuiQingGISMapper.findByShuiKuShuiQingGIS();
        for (ShuiKuShuiQingGIS s : shuiKuShuiQingGISList) {
//            System.out.println(s.getTm().substring(5,7));
            if (s.getTm().substring(5, 7).contains("07") | s.getTm().substring(5, 7).contains("08") | s.getTm().substring(5, 7).contains("09")) {
                if (Double.parseDouble(s.getRZ()) > Double.parseDouble(s.getYUJING_FWL79())) {
                    s.set_status("0");
                } else {
                    s.set_status("1");
                }
            } else {
                if (Double.parseDouble(s.getRZ()) > Double.parseDouble(s.getYUJING_FWL())) {
                    s.set_status("0");
                } else {
                    s.set_status("1");
                }

            }
        }

        List<features> featuresList = new ArrayList<>();
        for (ShuiKuShuiQingGIS s : shuiKuShuiQingGISList) {
            features features = new features();
            attributes attributes = new attributes();
            geometry geometry = new geometry();
            attributes.setID(s.getID());
            attributes.setSTCD(s.getSTCD());
            attributes.setSTNM(s.getSTNM());
            attributes.setSTTP(s.getSTTP());
            attributes.setLGTD(s.getLGTD());
            attributes.setLTTD(s.getLTTD());
            features.setAttributes(attributes);
            geometry.setX(s.getLGTD());
            geometry.setY(s.getLTTD());
            features.setGeometry(geometry);
            features.setRowinfo(s);
            featuresList.add(features);
        }
        map.put("features", featuresList);
        map.put("spatialReference", spatialReference);
        map.put("fields", fields);
        return map;
    }
    //水位-库容-水面面积关系曲线数据
    public List<Map> selectRZKrArData(String STCD){
        return shuiKuShuiQingGISMapper.selectRZKrArData(STCD);
    }
    //根据水位获取库容
    public BigDecimal selectKrByRz(Double RZ,String STCD){
        return shuiKuShuiQingGISMapper.selectKrByRz(RZ,STCD);
    }
    //根据水位获取水面面积
    public BigDecimal selectArByRz(Double RZ,String STCD){
        return shuiKuShuiQingGISMapper.selectArByRz(RZ,STCD);
    }
}
