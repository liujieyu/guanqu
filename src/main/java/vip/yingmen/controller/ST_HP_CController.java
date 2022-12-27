package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_HP_C;
import vip.yingmen.service.ST_HP_CService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_HP_CController {
    @Autowired
    private ST_HP_CService stHpCService;

    //雨情gis第二滑框的小时列表查询
    @GetMapping(value = "/yuqing/single_xiaoshi")
    public PageInfo<ST_HP_C> findBySingleXiaoShi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                 @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                 @RequestParam String STCD,@RequestParam( value="Time_min", required=false)  String Time_min,
                                                 @RequestParam( value="Time_max", required=false)  String Time_max,
                                                 @RequestParam( value="_orderby", required=false,defaultValue = "TM desc")String _orderby){
        return stHpCService.findBySingleXiaoShi(_page,_page_size,STCD,Time_min,Time_max,_orderby);
    }
}
