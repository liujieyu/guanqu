package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WRP_IRA_BSIN;
import vip.yingmen.pojo.WRP_IrrBTCanalSystem;
import vip.yingmen.service.WRP_IRA_BSINService;
import vip.yingmen.service.WRP_IrrBTCanalSystemService;

import java.util.List;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class WRP_IrrBTCanalSystemController {
    @Autowired
    private WRP_IrrBTCanalSystemService wrpIrrBTCanalSystemService;

    //基础数据的渠道查询
    @GetMapping(value = "/admin/WRP_IrrBTCanalSystem")
    public PageInfo<WRP_IrrBTCanalSystem> findAll(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                                  @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size){
        return wrpIrrBTCanalSystemService.findAll(_page,_page_size);
    }
}
