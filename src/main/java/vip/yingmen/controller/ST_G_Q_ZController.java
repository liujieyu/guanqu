package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_G_Q_Z;
import vip.yingmen.service.ST_G_Q_ZService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_G_Q_ZController {
    @Autowired
    private ST_G_Q_ZService stGQZService;
    //根据stcd查找全部
    @GetMapping(value = "/admin/ST_G_Q_Z")
    public PageInfo<ST_G_Q_Z> findBySTCD(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                         @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                         @RequestParam( value="STCD", required=false) String STCD){
        return stGQZService.findBySTCD(_page,_page_size,STCD);
    }
}
