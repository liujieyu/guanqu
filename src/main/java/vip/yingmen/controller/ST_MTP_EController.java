package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_DP_C;
import vip.yingmen.pojo.ST_MTP_E;
import vip.yingmen.service.ST_DP_CService;
import vip.yingmen.service.ST_MTP_EService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_MTP_EController {
    @Autowired
    private ST_MTP_EService stMtpEService;

    //雨情gis第二滑框月列表查询
    @GetMapping(value = "/yuqing/single_yue")
    public PageInfo<ST_MTP_E> findBySingleYue(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                              @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                              @RequestParam String STCD,
                                              @RequestParam( value="_orderby", required=false,defaultValue = "dt desc" )String _orderby,
                                              @RequestParam( value="Time_min", required=false)  String Time_min,
                                              @RequestParam( value="Time_max", required=false)  String Time_max){
        return stMtpEService.findBySingleYue(_page,_page_size,STCD,_orderby,Time_min,Time_max);
    }
}
