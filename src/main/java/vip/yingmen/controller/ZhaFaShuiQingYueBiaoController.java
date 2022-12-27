package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.QuDaoShuiQingYueBiao;
import vip.yingmen.pojo.ZhaFaShuiQingYueBiao;
import vip.yingmen.service.QuDaoShuiQingYueBiaoService;
import vip.yingmen.service.ZhaFaShuiQingYueBiaoService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ZhaFaShuiQingYueBiaoController {
    @Autowired
    private ZhaFaShuiQingYueBiaoService yueBiaoService;
    //历史数据的闸阀水情月表查询
    @GetMapping(value = "/zhafashuiqing/lishi_yuebiao")
    public PageInfo<ZhaFaShuiQingYueBiao> findByYueBiao(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                                        @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size,
                                                        @RequestParam(value="YR", required=false) String YR,
                                                        @RequestParam String MON,
                                                        @RequestParam String ADDVCD,
                                                        @RequestParam String Canal_Code,
                                                        @RequestParam String CTYPE,
                                                        @RequestParam(value="STNM", required=false) String STNM,
                                                        @RequestParam(value="_orderby", required=false) String _orderby){
        return   yueBiaoService.findByYueBiao(_page,_page_size,YR,MON,ADDVCD,Canal_Code,CTYPE,STNM,_orderby);
    }
}
