package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_RIVER_H;
import vip.yingmen.service.ST_RIVER_HService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_RIVER_HController {
    @Autowired
    private ST_RIVER_HService stRiverHService;

    //河道水情gis第二滑框的小时列表查询
    @GetMapping(value = "/hedaoshuiqing/single_xiaoshi")
    public PageInfo<ST_RIVER_H> findByXiaoShi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                              @RequestParam( value="_page_size", required=false,defaultValue = "999999999" ) Integer _page_size,
                                              @RequestParam String STCD,
                                              @RequestParam( value="_orderby", required=false,defaultValue = "dt desc" )String _orderby,
                                              @RequestParam( value="Time_min", required=false)  String Time_min,
                                              @RequestParam( value="Time_max", required=false)  String Time_max){
        return stRiverHService.findByXiaoShi(_page,_page_size,STCD,_orderby,Time_min,Time_max);
    }
}
