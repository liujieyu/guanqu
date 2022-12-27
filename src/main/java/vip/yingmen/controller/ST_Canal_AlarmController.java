package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_Canal_Alarm;
import vip.yingmen.service.ST_Canal_AlarmService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_Canal_AlarmController {
    @Autowired
    private ST_Canal_AlarmService stCanalAlarmService;

    //根据STCD查询渠道水情预警信息
    @GetMapping(value = "/table/ST_Canal_Alarm")
    public PageInfo<ST_Canal_Alarm> findBySTCD(@RequestParam String STCD){
        return stCanalAlarmService.findBySTCD(STCD);
    }

    //根据STCD查询渠道水情预警信息
    @GetMapping(value = "/admin/ST_Canal_Alarm")
    public PageInfo<ST_Canal_Alarm> findBySTCDAndAdmin(@RequestParam String STCD){
        return stCanalAlarmService.findBySTCD(STCD);
    }
}
