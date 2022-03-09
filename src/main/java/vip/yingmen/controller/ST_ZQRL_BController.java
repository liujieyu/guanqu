package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_ZQRL_B;
import vip.yingmen.service.ST_ZQRL_BService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_ZQRL_BController {
    @Autowired
    private ST_ZQRL_BService stZqrlBService;

    //根据stcd查找
    @GetMapping(value = "/admin/ST_ZQRL_B")
    public PageInfo<ST_ZQRL_B> findBySTCD(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                          @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                          @RequestParam String STCD){
        return stZqrlBService.findBySTCD(_page, _page_size, STCD);
    }
}
