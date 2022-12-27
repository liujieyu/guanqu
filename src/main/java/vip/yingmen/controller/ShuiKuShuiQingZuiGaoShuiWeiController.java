package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ShuiKuShuiQingZuiGaoShuiWei;
import vip.yingmen.service.ShuiKuShuiQingZuiGaoShuiWeiService;

import java.util.List;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ShuiKuShuiQingZuiGaoShuiWeiController {
    @Autowired
    private ShuiKuShuiQingZuiGaoShuiWeiService zuiGaoShuiWeiService;

    //历史数据的水库水情的最高水位查询
    @GetMapping(value = "/shuikushuiqing/lishi_zuigaoshuiwei")
    public PageInfo<ShuiKuShuiQingZuiGaoShuiWei> findByZuiGaoShuiWei(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                                                     @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size,
                                                                     @RequestParam String YR, @RequestParam String ADDVCD, @RequestParam String STGR,
                                                                     @RequestParam(value="STNM", required=false) String STNM,
                                                                     @RequestParam(value="_orderby", required=false) String _orderby){
        return zuiGaoShuiWeiService.findByZuiGaoShuiWei(_page,_page_size,YR,ADDVCD,STGR,STNM,_orderby);
    }
}
