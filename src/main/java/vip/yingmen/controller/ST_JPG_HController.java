package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_JPG_H;
import vip.yingmen.service.ST_JPG_HService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_JPG_HController {
    @Autowired
    private ST_JPG_HService stJpgHService;

    //水库水清第二gis滑框的历史列表查询
    @GetMapping(value = "/table/ST_JPG_H")
    public PageInfo<ST_JPG_H> findBySingleLiShi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                @RequestParam String STCD,
                                                @RequestParam( value="Time_min", required=false)  String Time_min,
                                                @RequestParam( value="Time_max", required=false)  String Time_max,
                                                @RequestParam( value="_orderby", required=false,defaultValue = "")  String _orderby){
        return stJpgHService.findBySingleLiShi(_page,_page_size,STCD,Time_min,Time_max,_orderby);
    }
}
