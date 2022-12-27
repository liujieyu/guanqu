package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_DCP_D;
import vip.yingmen.service.ST_DCP_DService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_DCP_DController {
    @Autowired
    private ST_DCP_DService stDcpDService;

    //雨情gis第二滑框的旬列表查询
    @GetMapping(value = "/yuqing/single_xun")
    public PageInfo<ST_DCP_D> findBySingleXun(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                              @RequestParam( value="_page_size", required=false,defaultValue = "999999999" ) Integer _page_size,
                                              @RequestParam String STCD,
                                              @RequestParam( value="_orderby", required=false,defaultValue = "PTBGDT desc")String _orderby,
                                              @RequestParam( value="Time_min", required=false)  String Time_min,
                                              @RequestParam( value="Time_max", required=false)  String Time_max){
        return stDcpDService.findBySingleXun(_page,_page_size,STCD,_orderby,Time_min,Time_max);
    }
}
