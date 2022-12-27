package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.QuDaoShuiQingGISService;
import vip.yingmen.service.ShuiKuShuiQingGISService;

import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ShuiKuShuiQingGISController {
    @Autowired
    private ShuiKuShuiQingGISService shuiKuShuiQingGISService;
    //水库水情的gis第一滑框实时数据
    @PostMapping(value = "/shuikushuiqing/gis")
    public Map findByShuiKuShuiQingGIS(@RequestBody(required = false) Map searchMap){
        return shuiKuShuiQingGISService.findByShuiKuShuiQingGIS(searchMap);
    }

    //水库水情的gis第一滑框实时数据
    @GetMapping(value = "/shuikushuiqing/gis")
    public Map findByShuiKuShuiQingGIS(){
        return shuiKuShuiQingGISService.findByShuiKuShuiQingGIS();
    }

    //水库水雨情工况的gis第一滑框实时数据
    @PostMapping(value = "/sksiteinfo/gis")
    public Map findBySiteInfoGIS(@RequestBody(required = false) Map searchMap){
        return shuiKuShuiQingGISService.findBySiteInfoGIS(searchMap);
    }
    //获取全县预警数据
    //水库水雨情工况的gis第一滑框实时数据
    @GetMapping(value = "/cursiteinfo/real")
    public Map findSiteYujingInfo(){
        return shuiKuShuiQingGISService.findCurYujing();
    }
    //获取系统当前时间
    @GetMapping(value = "/system/nowtime")
    public String findCurrentTime(){return shuiKuShuiQingGISService.findCurrentTime();}

    //仪表图数据
    @GetMapping(value = "/system/chartdata")
    public Map findSiteTongjiInfo(){return shuiKuShuiQingGISService.findSiteTongjiInfo();}
}
