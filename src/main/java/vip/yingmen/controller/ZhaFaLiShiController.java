package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ZhaFaKaiDuLiShi;
import vip.yingmen.pojo.ZhaFaLiShiZhaMen;
import vip.yingmen.service.ZhaFaLiShiService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ZhaFaLiShiController {
    @Autowired
    private ZhaFaLiShiService zhaFaLiShiService;
    //历史数据的闸阀历史的开度历史信息查询
    @GetMapping(value = "/zhafakongzhi/kaidulishi")
    public PageInfo<ZhaFaKaiDuLiShi> findByKaiDu(@RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                 @RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                 @RequestParam(value="_orderby", required=false)String _orderby,
                                                 @RequestParam(value="STCD", required=false)String STCD,
                                                 @RequestParam(value="Time_min", required=false)String Time_min,
                                                 @RequestParam(value="Time_max", required=false)String Time_max){
        return   zhaFaLiShiService.findByKaiDu(_page,_page_size, _orderby, STCD, Time_min, Time_max);
    }
    //历史数据的闸阀历史的闸门信息查询
    @GetMapping(value = "/zhafakongzhi/zhamenlishi")
    public PageInfo<ZhaFaLiShiZhaMen> findByZhaMen(@RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                   @RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                   @RequestParam(value="_orderby", required=false)String _orderby,
                                                   @RequestParam(value="STCD", required=false)String STCD,
                                                   @RequestParam(value="Time_min", required=false)String Time_min,
                                                   @RequestParam(value="Time_max", required=false)String Time_max){
        return   zhaFaLiShiService.findByZhaMen(_page,_page_size, _orderby, STCD, Time_min, Time_max);
    }

}
