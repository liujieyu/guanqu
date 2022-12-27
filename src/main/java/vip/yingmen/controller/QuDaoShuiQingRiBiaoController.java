package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.QuDaoShuiQingRiBiao;
import vip.yingmen.service.QuDaoShuiQingRiBiaoService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class QuDaoShuiQingRiBiaoController {
    @Autowired
    private QuDaoShuiQingRiBiaoService quDaoShuiQingRiBiaoService;

    //历史数据的渠道水情日表查询
    @GetMapping(value = "/qudaoshuiqing/lishi_ribiao")
    public PageInfo<QuDaoShuiQingRiBiao> findByQuDaoShuiQingRiBiao(@RequestParam Integer _page_size, @RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                                   @RequestParam(value="TM", required=false) String TM,
                                                                   @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                                   @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                                   @RequestParam(value="STYPE", required=false) String STYPE,
                                                                   @RequestParam(value="STNM", required=false) String STNM,
                                                                   @RequestParam(value="_orderby", required=false)String _orderby){
        return   quDaoShuiQingRiBiaoService.findByQuDaoShuiQingRiBiao(_page_size,_page,TM,ADDVCD,Canal_Code,STYPE,STNM,_orderby);
    }
}
