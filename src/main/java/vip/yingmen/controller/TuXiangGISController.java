package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.TuXiangGISService;

import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class TuXiangGISController {
    @Autowired
    private TuXiangGISService tuXiangGISService;
    //图像的gis第一滑框实时数据
    @PostMapping(value = "/tuxiang/gis")
    public Map findByTuXiangGIS(@RequestBody(required = false) Map searchMap){
        return tuXiangGISService.findByTuXiangGIS(searchMap);
    }

    //图像的gis第一滑框实时数据
    @GetMapping(value = "/tuxiang/gis")
    public Map findByTuXiangGIS(){
        return tuXiangGISService.findByTuXiangGIS();
    }

    //图像的gis第一滑框实时数据统计
    @PostMapping(value = "/tuxiang/gistj")
    public Integer findByTuXiangGISTJ(@RequestBody(required = false) Map searchMap){
        return tuXiangGISService.findByTuXiangGISTJ(searchMap);
    }
}
