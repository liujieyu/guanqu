package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_HWAS_C;
import vip.yingmen.service.ST_HWAS_CService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_HWAS_CController {
    @Autowired
    private ST_HWAS_CService stHwasCService;

    //闸阀水情gis第二滑框小时列表查询
    @GetMapping(value = "/zhafashuiqing/item_xiaoshi")
    public PageInfo<ST_HWAS_C> findBySingleXiaoShi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                   @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                   @RequestParam String STCD,
                                                   @RequestParam( value="Time_min", required=false)  String Time_min,
                                                   @RequestParam( value="Time_max", required=false)  String Time_max,
                                                   @RequestParam( value="_orderby", required=false,defaultValue = "DT desc" )String _orderby){
        return stHwasCService.findBySingleXiaoShi(_page,_page_size,STCD,Time_min,Time_max,_orderby);
    }
}
