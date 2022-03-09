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
}
