package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.Details;
import vip.yingmen.pojo.ShiPinDetails;
import vip.yingmen.service.DetalisService;

@RestController
@CrossOrigin
@RequestMapping(value = "/guanqu")
public class DetailsController {
    @Autowired
    private DetalisService detalisService;

    //gis的第二滑框站点信息查询
    @GetMapping(value = "/table/details")
    public Details findByZhanDianXinXi(@RequestParam String ID,@RequestParam String pk){
        if (pk.equals("STCD")){
            return detalisService.findByZhanDianXinXi(ID);
        }
       return null;
    }

    //gis的第二滑框站点信息查询
    @GetMapping(value = "/gis/details")
    public ShiPinDetails findByZhanDianXinXiAndgis(@RequestParam String ID,
                                                   @RequestParam String pk){
        if (pk.equals("STCD")){
            return detalisService.findByZhanDianShiPin(ID);
        }
        return null;
    }

    //gis的第二滑框站点信息查询
    @GetMapping(value = "/kushuiqing/single_details")
    public Details findByZhanDianXinXiAndKuShuiQing(@RequestParam String STCD) {
        return detalisService.findByZhanDianXinXi(STCD);
    }

    //gis的第二滑框站点信息查询
    @GetMapping(value = "/gongkuang/details")
    public Details findByZhanDianXinXiAndSTCD(@RequestParam String STCD) {
        return detalisService.findByZhanDianXinXi(STCD);
    }

    //gis的第二滑框站点信息查询
    @GetMapping(value = "/tuxiang/details")
    public Details findByZhanDianXinXiTuXiang(@RequestParam String STCD) {
        return detalisService.findByZhanDianXinXi(STCD);
    }

    //gis的第二滑框站点信息查询
    @GetMapping(value = "/shipin/details")
    public ShiPinDetails findByZhanDianShiPin(@RequestParam String ID,
                                              @RequestParam String pk){
        if (pk.equals("STCD")){
            return detalisService.findByZhanDianShiPin(ID);
        }
        return null;
    }

}
