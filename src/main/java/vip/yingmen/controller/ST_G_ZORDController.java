package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_G_CQORD;
import vip.yingmen.pojo.ST_G_ZORD;
import vip.yingmen.service.ST_G_CQORDService;
import vip.yingmen.service.ST_G_ZORDService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_G_ZORDController {
    @Autowired
    private ST_G_ZORDService stGZordService;

    //水库水情的最高水位
    @GetMapping(value = "/shuikushuiqing/single_zuigaoshuiwe")
    public PageInfo<ST_G_ZORD> findBySTCD(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                          @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                          @RequestParam String STCD){
        return stGZordService.findBySTCD(_page,_page_size,STCD);
    }

    //查找全部
    @GetMapping(value = "/table/ST_G_ZORD")
    public PageInfo<ST_G_ZORD> findAll(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                       @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                       @RequestParam( value="STCD", required=false) String STCD){
        return stGZordService.findBySTCD(_page,_page_size,STCD);
    }
}
