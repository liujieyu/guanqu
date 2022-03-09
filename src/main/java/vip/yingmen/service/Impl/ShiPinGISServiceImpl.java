package vip.yingmen.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ShiPinGISMapper;
import vip.yingmen.pojo.*;
import vip.yingmen.service.ShiPinGISService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShiPinGISServiceImpl implements ShiPinGISService {
    @Autowired
    private ShiPinGISMapper shiPinGISMapper;

    //视频gis列表实时查询
    @Override
    public Map findByShiPinGIS(Map searchMap) {
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
        List<ShiPinGIS> shiPinGISList = shiPinGISMapper.findByShiPinGIS(searchMap);
        List<features> featuresList = new ArrayList<>();
        for (ShiPinGIS s : shiPinGISList) {
            if (s.getPicPath()!=null){
                String s1 = s.getPicPath().substring(2,s.getPicPath().length());//只要c：后面的值
                String s2 = s1.replace('\\', '/');     //把绝对字符修改
                s.setPicPath(s2);                                     //再存进list
            }
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

    //视频gis列表实时查询
    @Override
    public Map findByShiPinGIS() {
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
        List<ShiPinGIS> shiPinGISList = shiPinGISMapper.findByShiPinGIS();

        List<features> featuresList = new ArrayList<>();
        for (ShiPinGIS s : shiPinGISList) {
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


    @Override
    public PageInfo<ShiPinFuZhu> findByShiPin(Integer _page, Integer _page_size, String stcd) {
        PageHelper.startPage(_page,_page_size);
        List<ShiPinFuZhu> byShiPinGIS = shiPinGISMapper.findByShiPin(stcd);
        PageInfo<ShiPinFuZhu> shiPinGISPageInfo = new PageInfo<>(byShiPinGIS);
        return shiPinGISPageInfo;
    }

}
