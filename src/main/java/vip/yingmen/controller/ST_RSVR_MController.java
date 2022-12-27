package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_RSVR_M;
import vip.yingmen.pojo.ST_RSVR_R;
import vip.yingmen.service.ST_RSVR_MService;
import vip.yingmen.service.ST_RSVR_RService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_RSVR_MController {
    @Autowired
    private ST_RSVR_MService stRsvrMService;

    //水库水情gis第二滑框月列表查询
    @GetMapping(value = "/shuikushuiqing/single_yue")
    public PageInfo<ST_RSVR_M> findBySingleYue(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                               @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                               @RequestParam String STCD,
                                               @RequestParam( value="_orderby", required=false,defaultValue = "dt desc" )String _orderby,
                                               @RequestParam( value="Time_min", required=false)  String Time_min,
                                               @RequestParam( value="Time_max", required=false)  String Time_max){
        return stRsvrMService.findBySingleYue(_page,_page_size,STCD,_orderby,Time_min,Time_max);
    }
}
