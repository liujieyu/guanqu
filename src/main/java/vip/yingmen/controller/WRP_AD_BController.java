package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WRP_AD_B;
import vip.yingmen.service.WRP_AD_BService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class WRP_AD_BController {
    @Autowired
    private WRP_AD_BService wrpAdBService;

    //根据AD_CD查询全部行政区划表
    @GetMapping(value = "/admin/WRP_AD_B")
    public PageInfo<WRP_AD_B> findAll(@RequestParam( value="AD_CD", required=false) String AD_CD){
        return wrpAdBService.findByAD_CD(AD_CD);
    }
}
