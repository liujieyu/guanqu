package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ZhaFaShuiQingLiShiBiao;
import vip.yingmen.pojo.ZhaFaShuiQingRiBiao;
import vip.yingmen.service.ZhaFaShuiQingLiShiBiaoService;
import vip.yingmen.service.ZhaFaShuiQingRiBiaoService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ZhaFaShuiQingLiShiBiaoController {
    @Autowired
    private ZhaFaShuiQingLiShiBiaoService zhaFaShuiQingLiShiBiaoService;

    //历史数据的闸阀水情历史表查询
    @GetMapping(value = "/zhafashuiqing/lishi_lishibiao")
    public PageInfo<ZhaFaShuiQingLiShiBiao> findByZhaFaShuiQingLiShiBiao(@RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                                         @RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                                         @RequestParam(value="Time_min", required=false) String Time_min,
                                                                         @RequestParam(value="Time_max", required=false) String Time_max,
                                                                         @RequestParam String STCD, @RequestParam(value="_orderby", required=false) String _orderby){
        return   zhaFaShuiQingLiShiBiaoService.findByZhaFaShuiQingLiShiBiao(_page_size,_page,Time_min,Time_max,STCD,_orderby);
    }
}
