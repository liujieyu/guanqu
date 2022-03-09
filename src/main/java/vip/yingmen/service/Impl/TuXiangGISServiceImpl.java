package vip.yingmen.service.Impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_JPG_HMapper;
import vip.yingmen.mapper.TuXiangGISMapper;
import vip.yingmen.pojo.*;
import vip.yingmen.service.TuXiangGISService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class TuXiangGISServiceImpl implements TuXiangGISService {
    @Autowired
    private TuXiangGISMapper tuXiangGISMapper;
    @Autowired
    private ST_JPG_HMapper stJpgHMapper;

    //闸阀状态的gis第一滑框实时数据查询
    @Override
    public Map findByTuXiangGIS(Map searchMap) {
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
        List<TuXiangGIS> tuXiangGISList = tuXiangGISMapper.findByTuXiangGIS(searchMap);
        for (TuXiangGIS s : tuXiangGISList) {
            DateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm");
            Date date1 = new Date();
            Calendar g = Calendar.getInstance();
            g.setTime(date1);
            g.add(Calendar.DAY_OF_MONTH, -1);
            Date d2 = g.getTime();
            if (stJpgHMapper.findBySingleLiShi(s.getSTCD(), "20" + df.format(d2), "20" + df.format(date1)).size() == 0) {
                s.set_status("0");
            } else {
                s.set_status("1");
            }

        }
//
//            if (!s.getTm().substring(6, 8).contains("00")) {
//                int parseInt = Integer.parseInt(s.getTm().substring(6, 8));
//                if (parseInt - 01 < 10) {
//                    String s1 = "0" + String.valueOf(parseInt - 01);
//                    StringBuffer buffer = new StringBuffer(s.getTm());
//                    StringBuffer stringBuffer = buffer.replace(6, 8, s1);
//                    System.out.println(stJpgHMapper.findBySingleLiShi(s.getSTCD(), "20" + stringBuffer.toString(), "20" + s.getTm()));
//                    if (stJpgHMapper.findBySingleLiShi(s.getSTCD(), "20" + stringBuffer.toString(), "20" + s.getTm()).size()==0) {
//                        s.set_status("0");
//                    } else {
//                        s.set_status("1");
//                    }
//                } else {
//                    String s1 = String.valueOf(parseInt - 01);
//                    StringBuffer buffer = new StringBuffer(s.getTm());
//                    StringBuffer stringBuffer = buffer.replace(6, 8, s1);
//                    System.out.println(stJpgHMapper.findBySingleLiShi(s.getSTCD(), "20" + stringBuffer.toString(), "20" + s.getTm()));
//                    if (stJpgHMapper.findBySingleLiShi(s.getSTCD(), "20" + stringBuffer.toString(), "20" + s.getTm()).size()==0) {
//                        s.set_status("0");
//                    } else {
//                        s.set_status("1");
//                    }
//
//                }
//
//            }
//        }
        List<features> featuresList = new ArrayList<>();
        for (TuXiangGIS s : tuXiangGISList) {
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

    //闸阀状态的gis第一滑框实时数据查询
    @Override
    public Map findByTuXiangGIS() {
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
        List<TuXiangGIS> tuXiangGISList = tuXiangGISMapper.findByTuXiangGIS();
        List<features> featuresList = new ArrayList<>();
        for (TuXiangGIS s : tuXiangGISList) {
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

    //闸阀状态的gis第一滑框实时数据查询统计
    @Override
    public Integer findByTuXiangGISTJ(Map searchMap) {
        List<TuXiangGIS> tuXiangGISList = tuXiangGISMapper.findByTuXiangGIS(searchMap);
        List<TuXiangGIS> tuXiangGISArrayList = new ArrayList<>();
        for (TuXiangGIS s : tuXiangGISList) {
            DateFormat df = new SimpleDateFormat("yy-MM-dd HH:mm");
            Date date1 = new Date();
            Calendar g = Calendar.getInstance();
            g.setTime(date1);
            g.add(Calendar.DAY_OF_MONTH, -1);
            Date d2 = g.getTime();
            if (stJpgHMapper.findBySingleLiShi(s.getSTCD(), "20" + df.format(d2), "20" + df.format(date1)).size() == 0) {
                s.set_status("0");
            } else {
                s.set_status("1");
            }

            if (searchMap.get("_status") != null && !searchMap.get("_status").toString().equals("all")) {
                if (s.get_status().equals(searchMap.get("_status").toString())) {
                    tuXiangGISArrayList.add(s);
                }
            } else {
                tuXiangGISArrayList.add(s);
            }
        }
        return tuXiangGISArrayList.size();
    }

}
