package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.QuDaoShuiQingYueBiao;
import vip.yingmen.service.QuDaoShuiQingYueBiaoService;

import java.util.List;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class QuDaoShuiQingYueBiaoController {
    @Autowired
    private QuDaoShuiQingYueBiaoService yueBiaoService;
    //历史数据的渠道水情月表查询结果
    @GetMapping(value = "/qudaoshuiqing/lishi_yuebiao")
    public PageInfo<QuDaoShuiQingYueBiao> findByYueBiao(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                                        @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size,
                                                        @RequestParam( value="YE", required=false) String YE,
                                                        @RequestParam( value="MON", required=false) String MON,
                                                        @RequestParam( value="ADDVCD", required=false) String ADDVCD,
                                                        @RequestParam( value="Canal_Code", required=false) String Canal_Code,
                                                        @RequestParam( value="STYPE", required=false) String STYPE,
                                                        @RequestParam(value="STNM", required=false) String STNM){
        return   yueBiaoService.findByYueBiao(_page,_page_size,YE,MON,ADDVCD,Canal_Code,STYPE,STNM);
    }
}
