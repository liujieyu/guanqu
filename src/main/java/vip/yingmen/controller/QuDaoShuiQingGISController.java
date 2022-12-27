package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.HeDaoShuiQingGISService;
import vip.yingmen.service.QuDaoShuiQingGISService;

import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class QuDaoShuiQingGISController {
    @Autowired
    private QuDaoShuiQingGISService quDaoShuiQingGISService;
    //渠道水情的gis第一滑框实时数据
    @PostMapping(value = "/qudaoshuiqing/gis")
    public Map findByQuDaoShuiQingGIS(@RequestBody(required = false) Map searchMap){
        return quDaoShuiQingGISService.findByQuDaoShuiQingGIS(searchMap);
    }

    //渠道水情的gis第一滑框实时数据
    @GetMapping(value = "/qudaoshuiqing/gis")
    public Map findByQuDaoShuiQingGIS(){
        return quDaoShuiQingGISService.findByQuDaoShuiQingGIS();
    }
}
