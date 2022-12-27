package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_Gatage_H;
import vip.yingmen.pojo.WRP_IRA_BSIN;
import vip.yingmen.service.ST_Gatage_HService;
import vip.yingmen.service.WRP_IRA_BSINService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_Gatage_HController {
    @Autowired
    private ST_Gatage_HService stGatageHService;

    //闸阀状态gis第二滑框的闸阀门开度历史列表查询
    @GetMapping(value = "/table/ST_Gatage_H")
    public PageInfo<ST_Gatage_H> findByZhaFaZhuangTai(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                      @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                      @RequestParam String STCD, @RequestParam( value="Time_min", required=false)  String Time_min,
                                                      @RequestParam( value="Time_max", required=false)  String Time_max,
                                                      @RequestParam( value="_orderby", required=false,defaultValue = "TM desc" )String _orderby){
        return stGatageHService.findByZhaFaZhuangTai(_page,_page_size,STCD,Time_min,Time_max,_orderby);
    }
}
