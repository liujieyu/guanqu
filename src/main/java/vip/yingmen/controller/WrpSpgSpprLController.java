package vip.yingmen.controller;


import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WrpDfrSrhrds;
import vip.yingmen.pojo.WrpDfrSrvrds;
import vip.yingmen.pojo.WrpSpgSppr;
import vip.yingmen.pojo.WrpSpgSpprL;
import vip.yingmen.service.WrpSpgSpprLService;

import java.util.Map;

/**
 * <p>
 *  大坝安全一张图、实时监测、表格
 *  前端控制器
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
@RestController
@RequestMapping("/guanqu")
@CrossOrigin
public class WrpSpgSpprLController {
    @Autowired
    private WrpSpgSpprLService wrpSpgSpprLService;
    //根据条件获取实时大坝站点信息
    @PostMapping(value = "/dabasafe/gis")
    public Map findSafeBySiteInfoGIS(@RequestBody(required = false) Map searchMap){
        return wrpSpgSpprLService.findSafeBySiteInfoGIS(searchMap);
    }
    //渗流压力历史数据
    @GetMapping(value = "/slyldetail/lishi")
    public PageInfo<WrpSpgSppr> findSafeSlylBylishi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                    @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                    @RequestParam String MPCD,
                                                    @RequestParam  String Time_min,
                                                    @RequestParam  String Time_max,
                                                    @RequestParam( value="_orderby", required=false,defaultValue = "MSTM desc" )String _orderby){
        return wrpSpgSpprLService.findSafeSlylBylishi(_page,_page_size,MPCD,Time_min,Time_max,_orderby);
    }
    //渗流量历史数据
    @GetMapping(value = "/slldetail/lishi")
    public PageInfo<WrpSpgSpprL> findSafeSllBylishi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                    @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                    @RequestParam String MPCD,
                                                    @RequestParam  String Time_min,
                                                    @RequestParam  String Time_max,
                                                    @RequestParam( value="_orderby", required=false,defaultValue = "MSTM desc" )String _orderby){
        return wrpSpgSpprLService.findSafeSllBylishi(_page,_page_size,MPCD,Time_min,Time_max,_orderby);
    }
    //表面水平位移历史数据
    @GetMapping(value = "/spwydetail/lishi")
    public PageInfo<WrpDfrSrhrds> findSafeSpwyBylishi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                      @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                      @RequestParam String MPCD,
                                                      @RequestParam  String Time_min,
                                                      @RequestParam  String Time_max,
                                                      @RequestParam( value="_orderby", required=false,defaultValue = "MSTM desc" )String _orderby){
        return wrpSpgSpprLService.findSafeSpwyBylishi(_page,_page_size,MPCD,Time_min,Time_max,_orderby);
    }
    //表面垂直位移历史数据
    @GetMapping(value = "/czwydetail/lishi")
    public PageInfo<WrpDfrSrvrds> findSafeCzwyBylishi(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                      @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                      @RequestParam String MPCD,
                                                      @RequestParam  String Time_min,
                                                      @RequestParam  String Time_max,
                                                      @RequestParam( value="_orderby", required=false,defaultValue = "MSTM desc" )String _orderby){
        return wrpSpgSpprLService.findSafeCzwyBylishi(_page,_page_size,MPCD,Time_min,Time_max,_orderby);
    }
    //大坝安全情势分析
    @GetMapping(value = "/cursafeinfo/real")
    public Map findSafeCurYujing(){
        return wrpSpgSpprLService.findSafeCurYujing();
    }
    //渗流量超阈值统计
    @GetMapping(value = "/safechart/tongji")
    public Map findSafeChartByTongji(){
        return wrpSpgSpprLService.findSafeChartByTongji();
    }
}
