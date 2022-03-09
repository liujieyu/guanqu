package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.YuQingTongJiGIS;
import vip.yingmen.service.YuQingTongJiGISService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class YuQingTongJiGISController {
    @Autowired
    private YuQingTongJiGISService yuQingTongJiGISService;

    //雨情gis第二滑框的小时列表统计查询
    @GetMapping(value = "/yuqing/tongji_xiaoshi")
    public YuQingTongJiGIS findBySingleXiaoShi( @RequestParam String STCD,
                                                @RequestParam( value="Time_min", required=false)  String Time_min,
                                                @RequestParam( value="Time_max", required=false)  String Time_max){
        return yuQingTongJiGISService.findByXiaoShi(STCD,Time_min,Time_max);
    }

    //雨情gis第二滑框的日列表统计查询
    @GetMapping(value = "/yuqing/tongji_ri")
    public YuQingTongJiGIS findByRi( @RequestParam String STCD,
                                     @RequestParam( value="Time_min", required=false)  String Time_min,
                                     @RequestParam( value="Time_max", required=false)  String Time_max){
        return yuQingTongJiGISService.findByRi(STCD,Time_min,Time_max);
    }

    //雨情gis第二滑框的旬列表统计查询
    @GetMapping(value = "/yuqing/tongji_xun")
    public YuQingTongJiGIS findByXun( @RequestParam String STCD,
                                      @RequestParam( value="Time_min", required=false)  String Time_min,
                                      @RequestParam( value="Time_max", required=false)  String Time_max){
        return yuQingTongJiGISService.findByXun(STCD,Time_min,Time_max);
    }


    //雨情gis第二滑框的月列表统计查询
    @GetMapping(value = "/yuqing/tongji_yue")
    public YuQingTongJiGIS findByYue( @RequestParam String STCD,
                                      @RequestParam( value="Time_min", required=false)  String Time_min,
                                      @RequestParam( value="Time_max", required=false)  String Time_max){
        return yuQingTongJiGISService.findByYue(STCD,Time_min,Time_max);
    }

    //雨情gis第二滑框的年列表统计查询
    @GetMapping(value = "/yuqing/tongji_nian")
    public YuQingTongJiGIS findByNian( @RequestParam String STCD,
                                       @RequestParam( value="Time_min", required=false)  String Time_min,
                                       @RequestParam( value="Time_max", required=false)  String Time_max){
        return yuQingTongJiGISService.findByNian(STCD,Time_min,Time_max);
    }
}
