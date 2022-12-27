package vip.yingmen.service.Impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.FLayersMapper;
import vip.yingmen.pojo.*;
import vip.yingmen.service.FLayersService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FLayersServiceImpl implements FLayersService {
    @Autowired
    private FLayersMapper fLayersMapper;

    @Override
    public Map findFLayers(String type) {
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
//        switch (type) {
//            case "1":
//                List<FLayers> features_1 = fLayersMapper.findFLayers();
//                List<features> featuresList = new ArrayList<>();
//                for (FLayers s : features_1) {
//                    features features = new features();
//                    attributes attributes = new attributes();
//                    geometry geometry = new geometry();
//                    attributes.setID(s.getID() + "");
//                    attributes.setSTCD(s.getSTCD());
//                    attributes.setSTNM(s.getSTNM());
//                    attributes.setSTTP(s.getSTTP());
//                    attributes.setLGTD(s.getLGTD() + "");
//                    attributes.setLTTD(s.getLTTD() + "");
//                    features.setAttributes(attributes);
//                    geometry.setX(s.getLGTD() + "");
//                    geometry.setY(s.getLTTD() + "");
//                    features.setGeometry(geometry);
//                    features.setRowinfo(s);
//                    featuresList.add(features);
//                }
//                map.put("features", featuresList);
//                break;
//            case "2":
//                List<FLayers> features_2 = fLayersMapper.findFLayers();
//                List<features> featuresList_2 = new ArrayList<>();
//                for (FLayers s : features_2) {
//                    features features = new features();
//                    attributes attributes = new attributes();
//                    geometry geometry = new geometry();
//                    attributes.setID(s.getID() + "");
//                    attributes.setSTCD(s.getSTCD());
//                    attributes.setSTNM(s.getSTNM());
//                    attributes.setSTTP(s.getSTTP());
//                    attributes.setLGTD(s.getLGTD() + "");
//                    attributes.setLTTD(s.getLTTD() + "");
//                    features.setAttributes(attributes);
//                    geometry.setX(s.getLGTD() + "");
//                    geometry.setY(s.getLTTD() + "");
//                    features.setGeometry(geometry);
//                    features.setRowinfo(s);
//                    featuresList_2.add(features);
//                }
//                map.put("features", featuresList_2);
//                break;
//            case "3":
//                List<FLayers> features_3 = fLayersMapper.findFLayers();
//                List<features> featuresList_3 = new ArrayList<>();
//                for (FLayers s : features_3) {
//                    features features = new features();
//                    attributes attributes = new attributes();
//                    geometry geometry = new geometry();
//                    attributes.setID(s.getID() + "");
//                    attributes.setSTCD(s.getSTCD());
//                    attributes.setSTNM(s.getSTNM());
//                    attributes.setSTTP(s.getSTTP());
//                    attributes.setLGTD(s.getLGTD() + "");
//                    attributes.setLTTD(s.getLTTD() + "");
//                    features.setAttributes(attributes);
//                    geometry.setX(s.getLGTD() + "");
//                    geometry.setY(s.getLTTD() + "");
//                    features.setGeometry(geometry);
//                    features.setRowinfo(s);
//                    featuresList_3.add(features);
//                }
//                map.put("features", featuresList_3);
//                break;
//            case "4":
//                List<FLayers> features_4 = fLayersMapper.findFLayers();
//                List<features> featuresList_4 = new ArrayList<>();
//                for (FLayers s : features_4) {
//                    features features = new features();
//                    attributes attributes = new attributes();
//                    geometry geometry = new geometry();
//                    attributes.setID(s.getID() + "");
//                    attributes.setSTCD(s.getSTCD());
//                    attributes.setSTNM(s.getSTNM());
//                    attributes.setSTTP(s.getSTTP());
//                    attributes.setLGTD(s.getLGTD() + "");
//                    attributes.setLTTD(s.getLTTD() + "");
//                    features.setAttributes(attributes);
//                    geometry.setX(s.getLGTD() + "");
//                    geometry.setY(s.getLTTD() + "");
//                    features.setGeometry(geometry);
//                    features.setRowinfo(s);
//                    featuresList_4.add(features);
//                }
//                map.put("features", featuresList_4);
//                break;
//            case "5":
//                List<FLayers> features_5 = fLayersMapper.findFLayers();
//                List<features> featuresList_5 = new ArrayList<>();
//                for (FLayers s : features_5) {
//                    features features = new features();
//                    attributes attributes = new attributes();
//                    geometry geometry = new geometry();
//                    attributes.setID(s.getID() + "");
//                    attributes.setSTCD(s.getSTCD());
//                    attributes.setSTNM(s.getSTNM());
//                    attributes.setSTTP(s.getSTTP());
//                    attributes.setLGTD(s.getLGTD() + "");
//                    attributes.setLTTD(s.getLTTD() + "");
//                    features.setAttributes(attributes);
//                    geometry.setX(s.getLGTD() + "");
//                    geometry.setY(s.getLTTD() + "");
//                    features.setGeometry(geometry);
//                    features.setRowinfo(s);
//                    featuresList_5.add(features);
//                }
//                map.put("features", featuresList_5);
//                break;
//            case "6":
//                List<FLayers> features_6 = fLayersMapper.findFLayers();
//                List<features> featuresList_6 = new ArrayList<>();
//                for (FLayers s : features_6) {
//                    features features = new features();
//                    attributes attributes = new attributes();
//                    geometry geometry = new geometry();
//                    attributes.setID(s.getID() + "");
//                    attributes.setSTCD(s.getSTCD());
//                    attributes.setSTNM(s.getSTNM());
//                    attributes.setSTTP(s.getSTTP());
//                    attributes.setLGTD(s.getLGTD() + "");
//                    attributes.setLTTD(s.getLTTD() + "");
//                    features.setAttributes(attributes);
//                    geometry.setX(s.getLGTD() + "");
//                    geometry.setY(s.getLTTD() + "");
//                    features.setGeometry(geometry);
//                    features.setRowinfo(s);
//                    featuresList_6.add(features);
//                }
//                map.put("features", featuresList_6);
//                break;
//            case "7":
//                List<FLayers> features_7 = fLayersMapper.findFLayers();
//                List<features> featuresList_7 = new ArrayList<>();
//                for (FLayers s : features_7) {
//                    features features = new features();
//                    attributes attributes = new attributes();
//                    geometry geometry = new geometry();
//                    attributes.setID(s.getID() + "");
//                    attributes.setSTCD(s.getSTCD());
//                    attributes.setSTNM(s.getSTNM());
//                    attributes.setSTTP(s.getSTTP());
//                    attributes.setLGTD(s.getLGTD() + "");
//                    attributes.setLTTD(s.getLTTD() + "");
//                    features.setAttributes(attributes);
//                    geometry.setX(s.getLGTD() + "");
//                    geometry.setY(s.getLTTD() + "");
//                    features.setGeometry(geometry);
//                    features.setRowinfo(s);
//                    featuresList_7.add(features);
//                }
//                map.put("features", featuresList_7);
//                break;
//            case "8":
//                List<FLayers> features_8 = fLayersMapper.findFLayers();
//                List<features> featuresList_8 = new ArrayList<>();
//                for (FLayers s : features_8) {
//                    features features = new features();
//                    attributes attributes = new attributes();
//                    geometry geometry = new geometry();
//                    attributes.setID(s.getID() + "");
//                    attributes.setSTCD(s.getSTCD());
//                    attributes.setSTNM(s.getSTNM());
//                    attributes.setSTTP(s.getSTTP());
//                    attributes.setLGTD(s.getLGTD() + "");
//                    attributes.setLTTD(s.getLTTD() + "");
//                    features.setAttributes(attributes);
//                    geometry.setX(s.getLGTD() + "");
//                    geometry.setY(s.getLTTD() + "");
//                    features.setGeometry(geometry);
//                    features.setRowinfo(s);
//                    featuresList_8.add(features);
//                }
//                map.put("features", featuresList_8);
//                break;
//            case "9":
//                List<FLayers> features_9 = fLayersMapper.findFLayers();
//                List<features> featuresList_9 = new ArrayList<>();
//                for (FLayers s : features_9) {
//                    features features = new features();
//                    attributes attributes = new attributes();
//                    geometry geometry = new geometry();
//                    attributes.setID(s.getID() + "");
//                    attributes.setSTCD(s.getSTCD());
//                    attributes.setSTNM(s.getSTNM());
//                    attributes.setSTTP(s.getSTTP());
//                    attributes.setLGTD(s.getLGTD() + "");
//                    attributes.setLTTD(s.getLTTD() + "");
//                    features.setAttributes(attributes);
//                    geometry.setX(s.getLGTD() + "");
//                    geometry.setY(s.getLTTD() + "");
//                    features.setGeometry(geometry);
//                    features.setRowinfo(s);
//                    featuresList_9.add(features);
//                }
//                map.put("features", featuresList_9);
//                break;
//
//        }

        map.put("spatialReference", spatialReference);
        map.put("fields", fields);
        return map;
    }
}
