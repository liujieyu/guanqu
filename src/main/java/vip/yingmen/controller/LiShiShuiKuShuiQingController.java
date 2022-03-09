package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import vip.yingmen.model.ExcelTemplate;
import vip.yingmen.pojo.ShuiKuShuiQingLiShiBiao;
import vip.yingmen.pojo.ShuiKuShuiQingRiBiao;
import vip.yingmen.pojo.ShuiKuShuiQingYueBiao;
import vip.yingmen.pojo.ZhaFaShuiQingRiBiao;
import vip.yingmen.service.LiShiShuiKuShuiQingService;
import vip.yingmen.service.ZhaFaShuiQingRiBiaoService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class LiShiShuiKuShuiQingController {
    @Autowired
    private LiShiShuiKuShuiQingService liShiShuiKuShuiQingService;

    //历史数据的水库水情日表查询
    @GetMapping(value = "/shuikushuiqing/lishi_ribiao")
    public PageInfo<ShuiKuShuiQingRiBiao> findByShuiKuShuiQingRiBiao(@RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                                     @RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                                     @RequestParam String TM,
                                                                     @RequestParam String ADDVCD,
                                                                     @RequestParam String Canal_Code,
                                                                     @RequestParam String LEVEL, @RequestParam(value="STGR", required=false) String STGR,
                                                                     @RequestParam(value="STNM", required=false) String STNM,
                                                                     @RequestParam(value="_orderby", required=false) String _orderby){
        return   liShiShuiKuShuiQingService.findByShuiKuShuiQingRiBiao(_page_size,_page,TM,ADDVCD,Canal_Code,LEVEL,STGR,STNM,_orderby);
    }

    //历史数据的水库水情月表查询
    @GetMapping(value = "/shuikushuiqing/lishi_yuebiao")
    public PageInfo<ShuiKuShuiQingYueBiao> findByShuiKuShuiQingYueBiao(@RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                                       @RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                                       @RequestParam(value="YR", required=false) String YR,
                                                                       @RequestParam String MON, @RequestParam String ADDVCD,
                                                                       @RequestParam String Canal_Code,
                                                                       @RequestParam(value="LEVEL", required=false) String LEVEL,
                                                                       @RequestParam(value="STGR", required=false) String STGR,
                                                                       @RequestParam(value="STNM", required=false) String STNM,
                                                                       @RequestParam(value="_orderby", required=false) String _orderby){
        return   liShiShuiKuShuiQingService.findByShuiKuShuiQingYueBiao(_page_size,_page,YR,MON,ADDVCD,Canal_Code,LEVEL,STGR,STNM,_orderby);
    }

    //历史数据的闸阀水情历史表查询
    @GetMapping(value = "/shuikushuiqing/lishi_lishibiao")
    public PageInfo<ShuiKuShuiQingLiShiBiao> findByShuiKuShuiQingLiShiBiao(@RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                                           @RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                                           @RequestParam(value="Time_min", required=false) String Time_min,
                                                                           @RequestParam(value="Time_max", required=false) String Time_max,
                                                                           @RequestParam String STCD,
                                                                           @RequestParam(value="_orderby", required=false) String _orderby){
        return   liShiShuiKuShuiQingService.findByShuiKuShuiQingLiShiBiao(_page_size,_page,Time_min,Time_max,STCD,_orderby);
    }
}
