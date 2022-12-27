package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_Canal_R;
import vip.yingmen.service.ST_Canal_RService;

import java.util.Date;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_Canal_RController {
    @Autowired
    private ST_Canal_RService stCanalRService;

    //渠道水情gis的第二滑框历史表查询
    @GetMapping(value = "/table/ST_Canal_R")
    public PageInfo<ST_Canal_R> findBySingleLiShi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                  @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                  @RequestParam( value="Time_min", required=false)  String Time_min,
                                                  @RequestParam( value="Time_max", required=false)  String Time_max,
                                                  @RequestParam( value="STCD", required=false) String STCD,
                                                  @RequestParam( value="STNM", required=false) String STNM,
                                                  @RequestParam( value="_orderby", required=false) String _orderby){
        PageInfo<ST_Canal_R> bySingleLiShi = stCanalRService.findBySingleLiShi(_page, _page_size, STCD, STNM, Time_min, Time_max, _orderby);
        return bySingleLiShi;
    }
}
