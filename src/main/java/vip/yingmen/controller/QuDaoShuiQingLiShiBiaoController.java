package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.QuDaoShuiQingLiShiBiao;
import vip.yingmen.service.QuDaoShuiQingLiShiBiaoService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class QuDaoShuiQingLiShiBiaoController {
    @Autowired
    private QuDaoShuiQingLiShiBiaoService quDaoShuiQingLiShiBiaoService;

    //历史数据的渠道水情历史表查询
    @GetMapping(value = "/qudaoshuiqing/lishi_lishibiao")
    public PageInfo<QuDaoShuiQingLiShiBiao> findByZhaFaShuiQingLiShiBiao(@RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                                         @RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                                         @RequestParam(value="Time_min", required=false) String Time_min,
                                                                         @RequestParam(value="Time_max", required=false) String Time_max,
                                                                         @RequestParam(value="STCD") String STCD,
                                                                         @RequestParam(value="_orderby", required=false) String _orderby){
        return   quDaoShuiQingLiShiBiaoService.findByQuDaoShuiQingLiShiBiao(_page_size,_page,Time_min,Time_max,STCD,_orderby);
    }
}
