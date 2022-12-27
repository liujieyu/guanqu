package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.YuQingGISService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class YuQingGISController {
    @Autowired
    private YuQingGISService yuQingGISService;
    //雨情的gis第一滑框实时数据
    @PostMapping(value = "/yuqing/gis")
    public Map findByYuQingGIS(@RequestBody(required = false) Map searchMap){
        return yuQingGISService.findByYuQingGIS(searchMap);
    }

    //雨情的gis第一滑框实时数据
    @GetMapping(value = "/yuqing/gis")
    public Map findByYuQingGIS(){
        return yuQingGISService.findByYuQingGIS();
    }
}
