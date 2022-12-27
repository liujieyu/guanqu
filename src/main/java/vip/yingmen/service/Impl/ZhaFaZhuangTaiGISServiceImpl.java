package vip.yingmen.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vip.yingmen.mapper.StGatageRDao;
import vip.yingmen.mapper.ZhaFaZhuangTaiGISMapper;
import vip.yingmen.pojo.*;
import vip.yingmen.service.ZhaFaZhuangTaiGISService;

import java.util.*;

@Service
public class ZhaFaZhuangTaiGISServiceImpl implements ZhaFaZhuangTaiGISService {
    @Autowired
    private ZhaFaZhuangTaiGISMapper zhaFaZhuangTaiGISMapper;
    @Autowired
    private StGatageRDao stGatageRDao;
    //闸阀状态的gis第一滑框实时数据查询
    @Override
    public Map findByZhaFaZhuangTaiGIS(Map searchMap) {
        if (searchMap.get("STNM") == null || searchMap.get("STNM").toString().equals("")) {
            searchMap.put("STNM", "");
        }
        if (searchMap.get("_status") == null || searchMap.get("_status").toString().equals("")) {
            searchMap.put("_status", "");
        }
        if (searchMap.get("ADDVCD") == null|| searchMap.get("ADDVCD").toString().equals("")) {
            searchMap.put("ADDVCD", "");
        }
        if (searchMap.get("Canal_Code") == null|| searchMap.get("Canal_Code").toString().equals("")) {
            searchMap.put("Canal_Code", "");
        }
        if (searchMap.get("CTYPE") == null|| searchMap.get("CTYPE").toString().equals("")) {
            searchMap.put("CTYPE", "");
        }
        if (searchMap.get("STCD") == null|| searchMap.get("STCD").toString().equals("")) {
            searchMap.put("STCD", "");
        }

        List<String> list = new ArrayList<>();              //定义一个list接收map的_status 数据
        Set<Map.Entry<String, String>> it2 = searchMap.entrySet();         //开始遍历map取得_status的value
        Iterator<Map.Entry<String, String>> entrys = it2.iterator();
        while (entrys.hasNext()) {

            Map.Entry<String, String> entry = entrys.next();
            if (entry.getKey().equals("_status")) {                 //判断key是否为_status
                String[] tmArray = entry.getValue().split(",");
                for (String s1 : tmArray) {
                    list.add(s1);
                }
            }
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
        map.put("spatialReference", spatialReference);
        map.put("fields", fields);
        List<ZhaFaZhuangTaiGIS> zhaFaZhuangTaiGISList = zhaFaZhuangTaiGISMapper.findByZhaFaZhuangTaiGIS(searchMap.get("STCD").toString(),searchMap.get("STNM").toString(), searchMap.get("ADDVCD").toString(), searchMap.get("Canal_Code").toString(), searchMap.get("CTYPE").toString(), list);
        List<features> featuresList = new ArrayList<>();
        for (ZhaFaZhuangTaiGIS s : zhaFaZhuangTaiGISList) {
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
        return map;
    }

    //闸阀状态的gis第一滑框实时数据查询
    @Override
    public Map findByZhaFaZhuangTaiGIS() {
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
        List<ZhaFaZhuangTaiGIS> zhaFaZhuangTaiGISList = zhaFaZhuangTaiGISMapper.findByZhaFaZhuangTaiGIS1();
        List<features> featuresList = new ArrayList<>();
        for (ZhaFaZhuangTaiGIS s : zhaFaZhuangTaiGISList) {
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
//            Wrapper<StGatageR> queryWrapper = new QueryWrapper<StGatageR>().eq( "STCD", s.getSTCD()) ;
//			StGatageR stGatageR = this.stGatageRDao.selectOne(queryWrapper);
			StGatageR stGatageR = this.stGatageRDao.selectById( s.getSTCD());
//            StGatageR stGatageR = new StGatageR();
//            stGatageR = stGatageR.selectById( s.getSTCD());
			features.setStGatageR(stGatageR);
			ZhaFaZhuangTaiGIS gis8= this.zhaFaZhuangTaiGISMapper.findByZhaFaZhuangTaiGIS8(s.getSTCD());
			if (gis8 == null) {
				this.zhaFaZhuangTaiGISMapper.findByZhaFaZhuangTaiGISByOther(s.getSTCD())	;	
			}
			features.setZhaFaZhuangTaiGIS8(gis8);
            featuresList.add(features);
        }
        map.put("features", featuresList);
        map.put("spatialReference", spatialReference);
        map.put("fields", fields);
        return map;
    }
}
