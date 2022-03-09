package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_RSVR_R1;
import vip.yingmen.service.ST_RSVR_R1Service;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_RSVR_R1Controller {
    @Autowired
    private ST_RSVR_R1Service stRsvrR1Service;

    @GetMapping(value = "/table/ST_RSVR_R1")
    public PageInfo<ST_RSVR_R1> findBySingleRi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                               @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size){
        return stRsvrR1Service.findAll(_page,_page_size);
    }
}
