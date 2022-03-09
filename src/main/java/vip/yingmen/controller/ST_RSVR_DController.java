package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_RSVR_D;
import vip.yingmen.pojo.ST_RSVR_R;
import vip.yingmen.service.ST_RSVR_DService;
import vip.yingmen.service.ST_RSVR_RService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_RSVR_DController {
    @Autowired
    private ST_RSVR_DService stRsvrDService;

    //水库水情gis的第二滑框的日列表查询
    @GetMapping(value = "/shuikushuiqing/single_ri")
    public PageInfo<ST_RSVR_D> findBySingleRi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                              @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                              @RequestParam String STCD,
                                              @RequestParam  String Time_min,
                                              @RequestParam  String Time_max,
                                              @RequestParam( value="_orderby", required=false,defaultValue = "TM desc" )String _orderby){
        return stRsvrDService.findBySingleRi(_page,_page_size,STCD,Time_min,Time_max,_orderby);
    }
}
