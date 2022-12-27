package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_YRP_F;
import vip.yingmen.service.ST_YRP_FService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_YRP_FController {
    @Autowired
    private ST_YRP_FService stYrpFService;

    //雨情gis第二滑框的年列表查询
    @GetMapping(value = "/yuqing/single_nian")
    public PageInfo<ST_YRP_F> findBySingleNian(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                               @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                               @RequestParam String STCD,
                                               @RequestParam( value="_orderby", required=false,defaultValue = "yr desc" )String _orderby,
                                               @RequestParam( value="Time_min", required=false)  String Time_min,
                                               @RequestParam( value="Time_max", required=false)  String Time_max){
        return stYrpFService.findBySingleNian(_page,_page_size,STCD,_orderby,Time_min,Time_max);
    }
}
