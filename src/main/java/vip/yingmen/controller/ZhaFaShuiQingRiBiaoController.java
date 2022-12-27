package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.QuDaoShuiQingRiBiao;
import vip.yingmen.pojo.ZhaFaShuiQingRiBiao;
import vip.yingmen.service.QuDaoShuiQingRiBiaoService;
import vip.yingmen.service.ZhaFaShuiQingRiBiaoService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ZhaFaShuiQingRiBiaoController {
    @Autowired
    private ZhaFaShuiQingRiBiaoService zhaFaShuiQingRiBiaoService;

    //历史数据的闸阀水情日表查询
    @GetMapping(value = "/zhafashuiqing/lishi_ribiao")
    public PageInfo<ZhaFaShuiQingRiBiao> findByZhaFaShuiQingRiBiao(@RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                                   @RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                                   @RequestParam(value="TM", required=false) String TM,
                                                                   @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                                   @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                                   @RequestParam(value="CTYPE", required=false) String CTYPE,
                                                                   @RequestParam(value="STNM", required=false) String STNM,
                                                                   @RequestParam(value="_orderby", required=false) String _orderby){
        return   zhaFaShuiQingRiBiaoService.findByZhaFaShuiQingRiBiao(_page_size,_page,TM,ADDVCD,Canal_Code,CTYPE,STNM,_orderby);
    }
}
