package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.HeDaoShuiQingGISService;
import vip.yingmen.service.YunXingGongKuangGISService;

import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class YunXingGongKuangGISController {
    @Autowired
    private YunXingGongKuangGISService yunXingGongKuangGISService;
    //运行工况的gis第一滑框实时数据
    @PostMapping(value = "/gongkuang/gis")
    public Map findByYunXingGongKuangGIS(@RequestBody(required = false) Map searchMap){
        return yunXingGongKuangGISService.findByYunXingGongKuangGIS(searchMap);
    }

    //运行工况的gis第一滑框实时数据
    @GetMapping(value = "/gongkuang/gis")
    public Map findByYunXingGongKuangGIS(){
        return yunXingGongKuangGISService.findByYunXingGongKuangGIS();
    }
}
