package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_RIVER_R;
import vip.yingmen.service.ST_RIVER_RService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_RIVER_RController {
    @Autowired
    private ST_RIVER_RService stRiverRService;

    //河道水情gis的第二滑框历史列表查询
    @GetMapping(value = "/hedaoshuiqing/single_lishi")
    public PageInfo<ST_RIVER_R> findBySingleXun(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                @RequestParam( value="_page_size", required=false,defaultValue = "999999999" ) Integer _page_size,
                                                @RequestParam String STCD,
                                                @RequestParam( value="_orderby", required=false,defaultValue = "tm desc" )String _orderby,
                                                @RequestParam( value="Time_min", required=false)  String Time_min,
                                                @RequestParam( value="Time_max", required=false)  String Time_max){
        return stRiverRService.findByLiShi(_page,_page_size,STCD,_orderby,Time_min,Time_max);
    }
}
