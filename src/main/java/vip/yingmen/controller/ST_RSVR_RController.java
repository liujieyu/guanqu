package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_RSVR_R;
import vip.yingmen.service.ST_RSVR_RService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_RSVR_RController {
    @Autowired
    private ST_RSVR_RService stRsvrRService;

    //水库水清第二gis滑框的历史列表查询
    @GetMapping(value = "/shuikushuiqing/single_lishi")
    public PageInfo<ST_RSVR_R> findBySingleLiShi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                 @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                 @RequestParam String STCD,
                                                 @RequestParam  String Time_min,
                                                 @RequestParam  String Time_max,
                                                 @RequestParam( value="_orderby", required=false,defaultValue = "TM desc" )String _orderby){
        return stRsvrRService.findBySingleLiShi(_page,_page_size,STCD,Time_min,Time_max,_orderby);
    }
}
