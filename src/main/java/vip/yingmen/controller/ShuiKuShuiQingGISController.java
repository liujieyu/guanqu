package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.QuDaoShuiQingGISService;
import vip.yingmen.service.ShuiKuShuiQingGISService;

import java.math.BigDecimal;
import java.util.List;
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

    //水位-库容-水面面积关系曲线数据
    @GetMapping(value = "/detail/rzkrdata")
    public List<Map> findRzKrData(@RequestParam String STCD){
        return shuiKuShuiQingGISService.selectRZKrArData(STCD);
    }
    //根据水位获取库容
    @GetMapping(value = "/detail/getkrval")
    public String getKrByRz(@RequestParam Double RZ,@RequestParam String STCD){
        BigDecimal value=shuiKuShuiQingGISService.selectKrByRz(RZ,STCD);
        return value.toString();
    }
    //根据水位获取水面面积
    @GetMapping(value = "/detail/getarval")
    public String getArByRz(@RequestParam Double RZ,@RequestParam String STCD){
        BigDecimal value=shuiKuShuiQingGISService.selectArByRz(RZ,STCD);
        return value.toString();
    }

}
