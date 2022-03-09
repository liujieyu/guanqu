package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_MCanal_C;
import vip.yingmen.service.ST_MCanal_CService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_MCanal_CController {
    @Autowired
    private ST_MCanal_CService stMCanalCService;

    //渠道水情gis第二滑框的月列表查询
    @GetMapping(value = "/table/View_ST_MCanal_C")
    public PageInfo<ST_MCanal_C> findBySingleYue(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                 @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                 @RequestParam String STCD,
                                                 @RequestParam( value="_orderby", required=false,defaultValue = "dt desc" )String _orderby,
                                                 @RequestParam( value="Time_min", required=false)  String Time_min,
                                                 @RequestParam( value="Time_max", required=false)  String Time_max){
        return stMCanalCService.findBySingleYue(_page,_page_size,STCD,_orderby,Time_min,Time_max);
    }
}
