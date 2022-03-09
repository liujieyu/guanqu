package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.SWKRTwoGIS;
import vip.yingmen.service.SWKRTwoGISService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class SWKRTwoGISController {
    @Autowired
    private SWKRTwoGISService swkrTwoGISService;
    //水位库容的gis第二滑框
    @GetMapping(value = "/shuiweikurong/single")
    public PageInfo<SWKRTwoGIS> findByTwoGIS(@RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                             @RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                             @RequestParam(value="_orderby", required=false)String _orderby,
                                             @RequestParam(value="STCD")String STCD,
                                             @RequestParam(value="Time_min", required=false)String Time_min,
                                             @RequestParam(value="Time_max", required=false)String Time_max){
        return   swkrTwoGISService.findByTwoGIS(_page,_page_size, _orderby, STCD, Time_min, Time_max);
    }
}
