package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_G_CQORD;
import vip.yingmen.pojo.ST_JPG_H;
import vip.yingmen.service.ST_G_CQORDService;
import vip.yingmen.service.ST_JPG_HService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_G_CQORDController {
    @Autowired
    private ST_G_CQORDService stGCqordService;

    //根据stcd查询
    @GetMapping(value = "/table/ST_G_CQORD")
    public PageInfo<ST_G_CQORD> findBySTCD(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                           @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                           @RequestParam String STCD,
                                           @RequestParam( value="YR", required=false)  String YR){
        return stGCqordService.findBySTCD(_page,_page_size,STCD,YR);
    }
}
