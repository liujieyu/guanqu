package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_RIVER_Alarm;
import vip.yingmen.service.ST_RIVER_AlarmService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_RIVER_AlarmController {
    @Autowired
    private ST_RIVER_AlarmService stRiverAlarmService;

    //根据stcd查询
    @GetMapping(value = "/table/ST_RIVER_Alarm")
    public PageInfo<ST_RIVER_Alarm> findBySTCD(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                               @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                               @RequestParam( value="STCD", required=false) String STCD){

        return  stRiverAlarmService.findBySTCD(_page, _page_size, STCD);
    }

    //河道水情根据stcd查询预警
    @GetMapping(value = "/hedaoshuiqing/single_yujing")
    public PageInfo<ST_RIVER_Alarm> findByYuJing(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                 @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                 @RequestParam( value="STCD", required=false) String STCD){

        return  stRiverAlarmService.findBySTCD(_page, _page_size, STCD);
    }
}
