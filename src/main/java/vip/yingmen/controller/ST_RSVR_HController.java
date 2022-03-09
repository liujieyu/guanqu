package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_RSVR_H;
import vip.yingmen.service.ST_RSVR_HService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_RSVR_HController {
    @Autowired
    private ST_RSVR_HService stRsvrHService;

    //水库水情gis第二滑框小时列表查询
    @GetMapping(value = "/shuikushuiqing/single_xiaoshi")
    public PageInfo<ST_RSVR_H> findBySingleXiaoShi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                   @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                   @RequestParam String STCD,
                                                   @RequestParam  String Time_min,
                                                   @RequestParam  String Time_max,
                                                   @RequestParam( value="_orderby", required=false,defaultValue = "dt desc" )String _orderby){
        return stRsvrHService.findBySingleXiaoShi(_page,_page_size,STCD,Time_min,Time_max,_orderby);
    }
}
