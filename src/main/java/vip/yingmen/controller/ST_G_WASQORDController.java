package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_G_WASQORD;
import vip.yingmen.pojo.ST_G_ZORD;
import vip.yingmen.service.ST_G_WASQORDService;
import vip.yingmen.service.ST_G_ZORDService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_G_WASQORDController {
    @Autowired
    private ST_G_WASQORDService stGWasqordService;

    //查找全部
    @GetMapping(value = "/table/ST_G_WASQORD")
    public PageInfo<ST_G_WASQORD> findBySTCDAndYR(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                  @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                  @RequestParam( value="STCD", required=false) String STCD,
                                                  @RequestParam String YR_min,@RequestParam String YR_max){
        return stGWasqordService.findBySTCDAndYR(_page,_page_size,STCD,YR_min,YR_max);
    }
}
