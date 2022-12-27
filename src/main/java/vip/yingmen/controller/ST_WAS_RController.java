package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_WAS_R;
import vip.yingmen.service.ST_WAS_RService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_WAS_RController {
    @Autowired
    private ST_WAS_RService stWasRService;

    //闸阀水情gis第二滑框的历史列表查询
    @GetMapping(value = "/table/ST_WAS_R")
    public PageInfo<ST_WAS_R> findBySingleLiShi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                @RequestParam String STCD,
                                                @RequestParam( value="Time_min", required=false)  String Time_min,
                                                @RequestParam( value="Time_max", required=false)  String Time_max,
                                                @RequestParam( value="_orderby", required=false,defaultValue = "TM desc" )String _orderby){
        return stWasRService.findBySingleLiShi(_page,_page_size,STCD,Time_min,Time_max,_orderby);
    }
}
