package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.ShuiKuShuiQingGISService;
import vip.yingmen.service.ZhaFaShuiQingGISService;

import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ZhaFaShuiQingGISController {
    @Autowired
    private ZhaFaShuiQingGISService zhaFaShuiQingGISService;
    //闸阀水情的gis第一滑框实时数据
    @PostMapping(value = "/zhafashuiqing/gis")
    public Map findByZhaFaShuiQingGIS(@RequestBody(required = false) Map searchMap){
        return zhaFaShuiQingGISService.findByZhaFaShuiQingGIS(searchMap);
    }

    //闸阀水情的gis第一滑框实时数据
    @GetMapping(value = "/zhafashuiqing/gis")
    public Map findByZhaFaShuiQingGIS(){
        return zhaFaShuiQingGISService.findByZhaFaShuiQingGIS();
    }
}
