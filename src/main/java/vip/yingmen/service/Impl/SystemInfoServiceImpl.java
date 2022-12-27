package vip.yingmen.service.Impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import vip.yingmen.pojo.*;
import vip.yingmen.service.SystemInfoService;
import vip.yingmen.service.WRP_AD_BService;
import vip.yingmen.service.WRP_IRA_BSINService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SystemInfoServiceImpl implements SystemInfoService {
    @Autowired
    private WRP_IRA_BSINService wrpIraBsinService;
    @Autowired
    private WRP_AD_BService wrpAdBService;
    @Autowired
    private GIS_CENTER gisCenter1;



    /**
     * system_info的查询
     */
    @Override
    public Map findAll() {
        JSONObject map = new JSONObject();
        List<FeatureLayers> featureLayersList = new ArrayList<>();
        GIS_CENTER gisCenter = new GIS_CENTER();
        gisCenter.setXmax(gisCenter1.getXmax());
        gisCenter.setXmin(gisCenter1.getXmin());
        gisCenter.setYmax(gisCenter1.getYmax());
        gisCenter.setYmin(gisCenter1.getYmin());
        map.put("GIS_CENTER", gisCenter);
        BaseInfo baseInfo = new BaseInfo();
        baseInfo.setTitle("智慧量测水系统");
        FeatureLayers featureLayers7 = new FeatureLayers();
        featureLayers7.setItype("shuikushuiqing");
        featureLayers7.setTitle("水库水情");
        featureLayers7.setIcon("/static/demo-hunanguanqu/2.png");
        featureLayers7.setIcon_warning("/static/demo-hunanguanqu/2-alert.png");
        featureLayers7.setUrl("/guanqu/shuikushuiqing/gis");
        featureLayers7.setShow("0");
        featureLayersList.add(featureLayers7);

        FeatureLayers featureLayers6 = new FeatureLayers();
        featureLayers6.setItype("yuqing");
        featureLayers6.setTitle("雨情");
        featureLayers6.setIcon("/static/demo-hunanguanqu/1.png");
        featureLayers6.setIcon_warning("/static/demo-hunanguanqu/1-alert.png");
        featureLayers6.setUrl("/guanqu/yuqing/gis");
        featureLayers6.setShow("0");
        featureLayersList.add(featureLayers6);

       /*FeatureLayers featureLayers8 = new FeatureLayers();
        featureLayers8.setItype("hedaoshuiqing");
        featureLayers8.setTitle("河道水情");
        featureLayers8.setIcon("/static/demo-hunanguanqu/3.png");
        featureLayers8.setIcon_warning("/static/demo-hunanguanqu/3-alert.png");
        featureLayers8.setUrl("/guanqu/hedaoshuiqing/gis");
        featureLayers8.setShow("0");
        featureLayersList.add(featureLayers8);

        FeatureLayers featureLayers0 = new FeatureLayers();
        featureLayers0.setItype("qudaoshuiqing");
        featureLayers0.setTitle("渠道水情");
        featureLayers0.setIcon("/static/demo-hunanguanqu/4.png");
        featureLayers0.setIcon_warning("/static/demo-hunanguanqu/4-alert.png");
        featureLayers0.setUrl("/guanqu/qudaoshuiqing/gis");
        featureLayers0.setShow("0");
        featureLayersList.add(featureLayers0);

        FeatureLayers featureLayers1 = new FeatureLayers();
        featureLayers1.setItype("zhafashuiqing");
        featureLayers1.setTitle("闸阀水情");
        featureLayers1.setIcon("/static/demo-hunanguanqu/5.png");
        featureLayers1.setIcon_warning("/static/demo-hunanguanqu/5-alert.png");
        featureLayers1.setUrl("/guanqu/zhafashuiqing/gis");
        featureLayers1.setShow("0");
        featureLayersList.add(featureLayers1);

        FeatureLayers featureLayers2 = new FeatureLayers();
        featureLayers2.setItype("zhafazhuangtai");
        featureLayers2.setTitle("闸阀状态");
        featureLayers2.setIcon("/static/demo-hunanguanqu/6.png");
        featureLayers2.setIcon_warning("/static/demo-hunanguanqu/6-alert.png");
        featureLayers2.setUrl("/guanqu/zhafazhuangtai/gis");
        featureLayers2.setShow("0");
        featureLayersList.add(featureLayers2);

        FeatureLayers featureLayers3 = new FeatureLayers();
        featureLayers3.setItype("tuxiang");
        featureLayers3.setTitle("图像");
        featureLayers3.setIcon("/static/demo-hunanguanqu/7.png");
        featureLayers3.setIcon_warning("/static/demo-hunanguanqu/7-alert.png");
        featureLayers3.setUrl("/guanqu/tuxiang/gis");
        featureLayers3.setShow("0");
        featureLayersList.add(featureLayers3);*/
        FeatureLayers featureLayers4 = new FeatureLayers();
        featureLayers4.setItype("shipin");
        featureLayers4.setTitle("视频");
        featureLayers4.setIcon("/static/demo-hunanguanqu/8.png");
        featureLayers4.setIcon_warning("/static/demo-hunanguanqu/8-alert.png");
        featureLayers4.setUrl("/guanqu/shipin/gis");
        featureLayers4.setShow("0");
        featureLayersList.add(featureLayers4);

        FeatureLayers featureLayers5 = new FeatureLayers();
        featureLayers5.setItype("yunxinggongkuang");
        featureLayers5.setTitle("运行工况");
        featureLayers5.setIcon("/static/demo-hunanguanqu/9.png");
        featureLayers5.setIcon_warning("/static/demo-hunanguanqu/9-alert.png");
        featureLayers5.setUrl("/guanqu/gongkuang/gis");
        featureLayers5.setShow("0");
        featureLayersList.add(featureLayers5);


        List<WRP_AD_B> wrpAdBList = wrpAdBService.findAll();
        List<WRP_IRA_BSIN> wrpIraBsinList = wrpIraBsinService.findAll();


        map.put("BaseInfo", baseInfo);
        map.put("FeatureLayers", featureLayersList);
        map.put("WRP_AD_B", wrpAdBList);
        map.put("WRP_IRA_BSIN", wrpIraBsinList);

        return map;
    }
}


