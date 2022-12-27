package vip.yingmen.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import vip.yingmen.pojo.*;
import vip.yingmen.mapper.WrpSpgSpprLMapper;
import vip.yingmen.service.WrpSpgSpprLService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * <p>
 *     大坝安全一张图、实时监测、表格
 *  服务实现类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
@Service
public class WrpSpgSpprLServiceImpl extends ServiceImpl<WrpSpgSpprLMapper, WrpSpgSpprL> implements WrpSpgSpprLService {
    @Autowired
    private WrpSpgSpprLMapper wrpSpgSpprLMapper;
    //根据条件获取实时大坝站点信息
    @Override
    public Map findSafeBySiteInfoGIS(Map searchMap) {
        JSONObject map = new JSONObject(new HashMap<>());
        String displayFieldName = "大坝安全监测";
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
        List<SiteSafeInfoGIS> listsafe=wrpSpgSpprLMapper.findSafeBySiteInfoGIS(searchMap);
        Map<String,Object> siteMap=new HashMap<String,Object>();
        if(!(searchMap.get("STNM")==null && searchMap.get("ADDlist")==null && searchMap.get("P")==null && searchMap.get("LEVEL")==null && searchMap.get("_stat")==null)){
             List<String> params=new ArrayList<String>();
             for(SiteSafeInfoGIS s : listsafe){
                 params.add(s.getSTCD());
             }
             siteMap.put("STCDlist",params);
        }else{
            siteMap.put("STCDlist",new ArrayList<String>());
        }
        //渗流量数据
        List<WrpSpgSpprL> slllist=wrpSpgSpprLMapper.findSafeSllByStcds(siteMap);
        //渗流压力数据
        List<WrpSpgSppr> slyllist=wrpSpgSpprLMapper.findSafeSlylByStcds(siteMap);
        //表面水平位移变形
        List<WrpDfrSrhrds> spwylist=wrpSpgSpprLMapper.findSafeSpwyByStcds(siteMap);
        //表面垂直位移变形
        List<WrpDfrSrvrds> czwylist=wrpSpgSpprLMapper.findSafeczwyByStcds(siteMap);
        for(SiteSafeInfoGIS s : listsafe){
            //渗流量数据处理
            for(WrpSpgSpprL l:slllist){
                if(s.getSTCD().equals(l.getStcd())){
                    s.addSllobj(l);
                    if(Float.parseFloat(l.getWljyz())>=0){
                        s.setSllyj("1");
                    }
                }
                if(s.getSlllist().size()>0 && !s.getSTCD().equals(l.getStcd())){
                    break;
                }
            }
            //渗流压力数据处理
            for(WrpSpgSppr y:slyllist){
                if(s.getSTCD().equals(y.getStcd())){
                    s.addSlylobj(y);
                    if(Float.parseFloat(y.getPzjyz())>=0){
                        s.setSlylyj("1");
                    }
                }
                if(s.getSlyllist().size()>0 && !s.getSTCD().equals(y.getStcd())){
                    break;
                }
            }
            //表面水平位移变形数据处理
            for(WrpDfrSrhrds h:spwylist){
                if(s.getSTCD().equals(h.getStcd())){
                    s.addSpwyobj(h);
                    if(Float.parseFloat(h.getXjyz())>=0 || Float.parseFloat(h.getYjyz())>=0){
                        s.setSpwyyj("1");
                    }
                }
                if(s.getSpwylist().size()>0 && !s.getSTCD().equals(h.getStcd())){
                    break;
                }
            }
            //表面垂直位移变形数据处理
            for(WrpDfrSrvrds v:czwylist){
                if(s.getSTCD().equals(v.getStcd())){
                    s.addCzwyobj(v);
                    if(Float.parseFloat(v.getVjyz())>=0){
                        s.setCzwyyj("1");
                    }
                }
                if(s.getCzwylist().size()>0 && !s.getSTCD().equals(v.getStcd())){
                    break;
                }
            }
        }
        List<features> featuresList = new ArrayList<>();
        for(SiteSafeInfoGIS s: listsafe){
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
    //大坝安全监测情势分析
    @Override
    public Map<String,Object> findSafeCurYujing(){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        List<SiteSafeInfoGIS> listsafe=wrpSpgSpprLMapper.findSafeBySiteInfoGIS(new HashMap());
        //渗流量数据
        List<WrpSpgSpprL> slllist=wrpSpgSpprLMapper.findSafeSllByStcds(new HashMap());
        //渗流压力数据
        List<WrpSpgSppr> slyllist=wrpSpgSpprLMapper.findSafeSlylByStcds(new HashMap());
        //表面水平位移变形
        List<WrpDfrSrhrds> spwylist=wrpSpgSpprLMapper.findSafeSpwyByStcds(new HashMap());
        //表面垂直位移变形
        List<WrpDfrSrvrds> czwylist=wrpSpgSpprLMapper.findSafeczwyByStcds(new HashMap());
        for(SiteSafeInfoGIS s : listsafe){
            //渗流量数据处理
            for(WrpSpgSpprL l:slllist){
                if(s.getSTCD().equals(l.getStcd())){
                    s.addSllobj(l);
                    if(Float.parseFloat(l.getWljyz())>=0){
                        s.setSllyj("1");
                        s.setSortsign(s.getSortsign()+10+100);
                    }
                }
                if(s.getSlllist().size()>0 && !s.getSTCD().equals(l.getStcd())){
                    break;
                }
            }
            //渗流压力数据处理
            for(WrpSpgSppr y:slyllist){
                if(s.getSTCD().equals(y.getStcd())){
                    s.addSlylobj(y);
                    if(Float.parseFloat(y.getPzjyz())>=0){
                        s.setSlylyj("1");
                        s.setSortsign(s.getSortsign()+5+10);
                    }
                }
                if(s.getSlyllist().size()>0 && !s.getSTCD().equals(y.getStcd())){
                    break;
                }
            }
            //表面水平位移变形数据处理
            for(WrpDfrSrhrds h:spwylist){
                if(s.getSTCD().equals(h.getStcd())){
                    s.addSpwyobj(h);
                    if(Float.parseFloat(h.getXjyz())>=0 || Float.parseFloat(h.getYjyz())>=0){
                        s.setSpwyyj("1");
                        s.setSortsign(s.getSortsign()+1);
                    }
                }
                if(s.getSpwylist().size()>0 && !s.getSTCD().equals(h.getStcd())){
                    break;
                }
            }
            //表面垂直位移变形数据处理
            for(WrpDfrSrvrds v:czwylist){
                if(s.getSTCD().equals(v.getStcd())){
                    s.addCzwyobj(v);
                    if(Float.parseFloat(v.getVjyz())>=0){
                        s.setCzwyyj("1");
                        s.setSortsign(s.getSortsign()+1);
                    }
                }
                if(s.getCzwylist().size()>0 && !s.getSTCD().equals(v.getStcd())){
                    break;
                }
            }
        }
        Collections.sort(listsafe, new Comparator<SiteSafeInfoGIS>() {
            @Override
            public int compare(SiteSafeInfoGIS o1, SiteSafeInfoGIS o2) {
                int sort1 = o1.getSortsign();
                int sort2 = o2.getSortsign();
                if (sort1 == sort2) {
                    return 0;
                } else if(sort2>sort1){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(int i=0;i<listsafe.size();i++){
            SiteSafeInfoGIS safeobj=listsafe.get(i);
            String[] area=safeobj.getAdnm().split("\\|");
            String town=area[0];
            String country=area[1];
            if(safeobj.getSllyj().equals("1")){
                for(int j=0;j<safeobj.getSlllist().size();j++){
                    WrpSpgSpprL sll=safeobj.getSlllist().get(j);
                    if(Float.parseFloat(sll.getWljyz())>0){
                        String sllyj="渗流量"+sll.getWlyz()+"L/s，超阈值"+sll.getWljyz()+"L/s";
                        Map<String,Object> map=new HashMap<String,Object>();
                        map.put("TOWN",town);
                        map.put("COUNTRY",country);
                        map.put("STNM",safeobj.getSTNM());
                        map.put("YJTYPE",4);
                        map.put("MPCD",sll.getMpcd());
                        map.put("YMMEMO",sllyj);
                        list.add(map);
                    }
                }
            }
            if(safeobj.getSlylyj().equals("1")){
                for(int j=0;j<safeobj.getSlyllist().size();j++){
                    WrpSpgSppr slyl=safeobj.getSlyllist().get(j);
                    if(Float.parseFloat(slyl.getPzjyz())>0){
                        String slylyj="渗压水位"+slyl.getPzyz()+"m，超阈值"+slyl.getPzjyz()+"m";
                        Map<String,Object> map=new HashMap<String,Object>();
                        map.put("TOWN",town);
                        map.put("COUNTRY",country);
                        map.put("STNM",safeobj.getSTNM());
                        map.put("YJTYPE",3);
                        map.put("MPCD",slyl.getMpcd());
                        map.put("YMMEMO",slylyj);
                        list.add(map);
                    }
                }
            }
            if(safeobj.getSpwyyj().equals("1")){
                for(int j=0;j<safeobj.getSpwylist().size();j++) {
                    WrpDfrSrhrds spwy = safeobj.getSpwylist().get(j);
                    if(Float.parseFloat(spwy.getXjyz())>0 || Float.parseFloat(spwy.getYjyz())>0){
                        String spwyjy="";
                        if(Float.parseFloat(spwy.getXjyz())>0){
                            spwyjy+=spwy.getXhrds()+"mm，超阈值"+spwy.getXjyz()+"mm";
                        }
                        if(Float.parseFloat(spwy.getYjyz())>0){
                            spwyjy+=spwy.getYhrds()+"mm，超阈值"+spwy.getYjyz()+"mm";
                        }
                        Map<String,Object> map=new HashMap<String,Object>();
                        map.put("TOWN",town);
                        map.put("COUNTRY",country);
                        map.put("STNM",safeobj.getSTNM());
                        map.put("YJTYPE",2);
                        map.put("MPCD",spwy.getMpcd());
                        map.put("YMMEMO",spwyjy);
                        list.add(map);
                    }
                }
            }
            if(safeobj.getCzwyyj().equals("1")){
                for(int j=0;j<safeobj.getCzwylist().size();j++) {
                    WrpDfrSrvrds czwy=safeobj.getCzwylist().get(j);
                    if(Float.parseFloat(czwy.getVjyz())>0){
                        String czwyyj="当前"+czwy.getVrds()+"mm，超阈值"+czwy.getVjyz()+"mm";
                        Map<String,Object> map=new HashMap<String,Object>();
                        map.put("TOWN",town);
                        map.put("COUNTRY",country);
                        map.put("STNM",safeobj.getSTNM());
                        map.put("YJTYPE",1);
                        map.put("MPCD",czwy.getMpcd());
                        map.put("YMMEMO",czwyyj);
                        list.add(map);
                    }
                }
            }
        }
        Map<String,Object> returnmap=new HashMap<>();
        returnmap.put("safeyjlist",list);
        return returnmap;
    }
    //渗流压力历史数据
    @Override
    public PageInfo<WrpSpgSppr> findSafeSlylBylishi(Integer _page, Integer _page_size,String MPCD,String Time_min,String Time_max,String _orderby){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WrpSpgSppr> spprlist = wrpSpgSpprLMapper.findSafeSlylBylishi(MPCD,Time_min,Time_max);
        PageInfo<WrpSpgSppr> spprinfo=new PageInfo<>(spprlist);
        return spprinfo;
    }
    //渗流量历史数据
    @Override
    public PageInfo<WrpSpgSpprL> findSafeSllBylishi(Integer _page, Integer _page_size,String MPCD,String Time_min,String Time_max,String _orderby){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WrpSpgSpprL> spprllist=wrpSpgSpprLMapper.findSafeSllBylishi(MPCD,Time_min,Time_max);
        PageInfo<WrpSpgSpprL> spprlinfo=new PageInfo<>(spprllist);
        return spprlinfo;
    }
    //表面水平位移历史数据
    @Override
    public PageInfo<WrpDfrSrhrds> findSafeSpwyBylishi(Integer _page, Integer _page_size,String MPCD,String Time_min,String Time_max,String _orderby){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WrpDfrSrhrds> spwylist=wrpSpgSpprLMapper.findSafeSpwyBylishi(MPCD,Time_min,Time_max);
        PageInfo<WrpDfrSrhrds> spwyinfo=new PageInfo<>(spwylist);
        return spwyinfo;
    }
    //表面垂直位移历史数据
    @Override
    public PageInfo<WrpDfrSrvrds> findSafeCzwyBylishi(Integer _page, Integer _page_size,String MPCD,String Time_min,String Time_max,String _orderby){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WrpDfrSrvrds> czwylist=wrpSpgSpprLMapper.findSafeCzwyBylishi(MPCD,Time_min,Time_max);
        PageInfo<WrpDfrSrvrds> czwyinfo=new PageInfo<>(czwylist);
        return czwyinfo;
    }

    //大坝安全监测超阈值统计
    public Map<String,Object> findSafeChartByTongji(){
        //渗流量
        List<Map> slllist=new ArrayList<Map>();
        Map<String,Object> sllobj=wrpSpgSpprLMapper.findSafeSllByTongji();
        Map<String,Object> sllmap1=new HashMap<String,Object>();
        sllmap1.put("TITLE","正常");
        sllmap1.put("TOTAL",Integer.parseInt(sllobj.get("TOTAL").toString())-Integer.parseInt(sllobj.get("YJNUM").toString()));
        slllist.add(sllmap1);
        Map<String,Object> sllmap2=new HashMap<String,Object>();
        sllmap2.put("TITLE","超阈值");
        sllmap2.put("TOTAL",sllobj.get("YJNUM"));
        slllist.add(sllmap2);
        //渗流压力
        List<Map> slyllist=new ArrayList<Map>();
        Map<String,Object> slylobj=wrpSpgSpprLMapper.findSafeSlylByTongji();
        Map<String,Object> slylmap1=new HashMap<String,Object>();
        slylmap1.put("TITLE","正常");
        slylmap1.put("TOTAL",Integer.parseInt(slylobj.get("TOTAL").toString())-Integer.parseInt(slylobj.get("YJNUM").toString()));
        slyllist.add(slylmap1);
        Map<String,Object> slylmap2=new HashMap<String,Object>();
        slylmap2.put("TITLE","超阈值");
        slylmap2.put("TOTAL",slylobj.get("YJNUM"));
        slyllist.add(slylmap2);
        //位移变形
        List<Map> wybxlist=new ArrayList<Map>();
        Map<String,Object> wybxobj=wrpSpgSpprLMapper.findSafeWybxByTongji();
        Map<String,Object> wybxmap1=new HashMap<String,Object>();
        wybxmap1.put("TITLE","正常");
        wybxmap1.put("TOTAL",Integer.parseInt(wybxobj.get("TOTAL").toString())-Integer.parseInt(wybxobj.get("YJNUM").toString()));
        wybxlist.add(wybxmap1);
        Map<String,Object> wybxmap2=new HashMap<String,Object>();
        wybxmap2.put("TITLE","超阈值");
        wybxmap2.put("TOTAL",wybxobj.get("YJNUM"));
        wybxlist.add(wybxmap2);
        //沉降变形
        List<Map> cjbxlist=new ArrayList<Map>();
        Map<String,Object> cjbxobj=wrpSpgSpprLMapper.findSageCjbxByTongji();
        Map<String,Object> cjbxmap1=new HashMap<String,Object>();
        cjbxmap1.put("TITLE","正常");
        cjbxmap1.put("TOTAL",Integer.parseInt(cjbxobj.get("TOTAL").toString())-Integer.parseInt(cjbxobj.get("YJNUM").toString()));
        cjbxlist.add(cjbxmap1);
        Map<String,Object> cjbxmap2=new HashMap<String,Object>();
        cjbxmap2.put("TITLE","超阈值");
        cjbxmap2.put("TOTAL",cjbxobj.get("YJNUM"));
        cjbxlist.add(cjbxmap2);
        Map<String,Object> map=new HashMap<>();
        map.put("slldata",slllist);
        map.put("slyldata",slyllist);
        map.put("wybxdata",wybxlist);
        map.put("cjbxdata",cjbxlist);
        return map;
    }
}
