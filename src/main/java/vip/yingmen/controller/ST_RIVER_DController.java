package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_RIVER_D;
import vip.yingmen.service.ST_RIVER_DService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_RIVER_DController {
    @Autowired
    private ST_RIVER_DService stRiverDService;

    //河道水情gis的第二滑框的日列表查询
    @GetMapping(value = "/hedaoshuiqing/single_ri")
    public PageInfo<ST_RIVER_D> findByRi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                         @RequestParam( value="_page_size", required=false,defaultValue = "999999999" ) Integer _page_size,
                                         @RequestParam String STCD,
                                         @RequestParam( value="_orderby", required=false,defaultValue = "TM desc" )String _orderby,
                                         @RequestParam( value="Time_min", required=false)  String Time_min,
                                         @RequestParam( value="Time_max", required=false)  String Time_max){
        return stRiverDService.findByRi(_page,_page_size,STCD,_orderby,Time_min,Time_max);
    }
}
