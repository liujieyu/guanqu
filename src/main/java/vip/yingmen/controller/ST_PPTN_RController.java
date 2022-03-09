package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_PPTN_R;
import vip.yingmen.pojo.ST_RSVR_R;
import vip.yingmen.service.ST_PPTN_RService;
import vip.yingmen.service.ST_RSVR_RService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_PPTN_RController {
    @Autowired
    private ST_PPTN_RService stPptnRService;

    //雨情第二gis滑框的历史列表查询
    @GetMapping(value = "/yuqing/single_lishi")
    public PageInfo<ST_PPTN_R> findBySingleLiShi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                 @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                 @RequestParam String STCD){
        return stPptnRService.findBySingleLiShi(_page,_page_size,STCD);
    }
}
