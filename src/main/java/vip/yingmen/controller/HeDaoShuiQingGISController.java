package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.HeDaoShuiQingGISService;

import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class HeDaoShuiQingGISController {
    @Autowired
    private HeDaoShuiQingGISService heDaoShuiQingGISService;
    //河道水情的gis第一滑框实时数据
    @PostMapping(value = "/hedaoshuiqing/gis")
    public Map findByHeDaoShuiQingGIS(@RequestBody(required = false) Map searchMap){
        return heDaoShuiQingGISService.findByHeDaoShuiQingGIS(searchMap);
    }

    //河道水情的gis第一滑框实时数据
    @GetMapping(value = "/hedaoshuiqing/gis")
    public Map findByHeDaoShuiQingGIS(){
        return heDaoShuiQingGISService.findByHeDaoShuiQingGIS();
    }
}
