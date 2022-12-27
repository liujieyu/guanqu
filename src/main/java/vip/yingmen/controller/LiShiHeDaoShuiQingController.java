package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.HeDaoShuiQingLiShiBiao;
import vip.yingmen.pojo.HeDaoShuiQingRiBiao;
import vip.yingmen.pojo.HeDaoShuiQingYueBiao;
import vip.yingmen.pojo.HeDaoShuiQingZuiGaoShuiWeiBiao;
import vip.yingmen.service.LiShiHeDaoShuiQingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class LiShiHeDaoShuiQingController {
    @Autowired
    private LiShiHeDaoShuiQingService liShiHeDaoShuiQingService;

    //历史数据的河道水情小时表查询
    @GetMapping(value = "/hedaoshuiqing/lishi_xiaoshibiao")
    public List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(@RequestParam(value = "Time_min", required = false) String Time_min,
                                                                          @RequestParam(value = "Time_max", required = false) String Time_max,
                                                                          @RequestParam String ADDVCD,
                                                                          @RequestParam String Canal_Code,
                                                                          @RequestParam(value = "LEVEL", required = false) String LEVEL,
                                                                          @RequestParam(value = "STGR", required = false) String STGR,
                                                                          @RequestParam(value = "STNM", required = false) String STNM) {
        return liShiHeDaoShuiQingService.findByXiaoShi(Time_min, Time_max, ADDVCD, Canal_Code, LEVEL, STGR, STNM);
    }

    //历史数据的河道水情日表查询
    @GetMapping(value = "/hedaoshuiqing/lishi_ribiao")
    public PageInfo<HeDaoShuiQingRiBiao> findByShuiKuShuiQingRiBiao(@RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                    @RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                    @RequestParam(value = "TM", required = false) String TM,
                                                                    @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                                    @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                                    @RequestParam(value = "LEVEL", required = false) String LEVEL,
                                                                    @RequestParam(value = "STGR", required = false) String STGR,
                                                                    @RequestParam(value = "STNM", required = false) String STNM,
                                                                    @RequestParam(value = "_orderby", required = false) String _orderby) {
        return liShiHeDaoShuiQingService.findByRiBiao(_page_size, _page, TM, ADDVCD, Canal_Code, STGR, STNM, _orderby);
    }

    //历史数据的河道水情月表查询
    @GetMapping(value = "/hedaoshuiqing/lishi_yuebiao")
    public PageInfo<HeDaoShuiQingYueBiao> findByShuiKuShuiQingYueBiao(@RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                      @RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                      @RequestParam(value = "YR", required = false) String YR, @RequestParam String MON,
                                                                      @RequestParam String ADDVCD, @RequestParam String Canal_Code,
                                                                      @RequestParam(value = "STGR", required = false) String STGR,
                                                                      @RequestParam(value = "STNM", required = false) String STNM,
                                                                      @RequestParam(value = "_orderby", required = false) String _orderby) {
        return liShiHeDaoShuiQingService.findByYueBiao(_page_size, _page, YR, MON, ADDVCD, Canal_Code, STGR, STNM, _orderby);
    }

    //历史数据的河道水情历史表查询
    @GetMapping(value = "/hedaoshuiqing/lishi_lishibiao")
    public PageInfo<HeDaoShuiQingLiShiBiao> findByShuiKuShuiQingLiShiBiao(@RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                          @RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                          @RequestParam(value = "Time_min", required = false) String Time_min,
                                                                          @RequestParam(value = "Time_max", required = false) String Time_max,
                                                                          @RequestParam String STCD,
                                                                          @RequestParam(value = "_orderby", required = false) String _orderby) {
        return liShiHeDaoShuiQingService.findByLiShiBiao(_page_size, _page, Time_min, Time_max, STCD, _orderby);
    }

    //历史数据的河道水情的最高水位查询
    @GetMapping(value = "/hedaoshuiqing/lishi_zuigaoshuiwei")
    public PageInfo<HeDaoShuiQingZuiGaoShuiWeiBiao> findByZuiGaoShuiWei(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                        @RequestParam(value = "_page_size", required = false, defaultValue = "99999999") Integer _page_size,
                                                                        @RequestParam String YR, @RequestParam String ADDVCD, @RequestParam String STGR,
                                                                        @RequestParam(value = "STNM", required = false) String STNM,
                                                                        @RequestParam(value = "_orderby", required = false) String _orderby) {
        return liShiHeDaoShuiQingService.findByZuiGaoShuiWei(_page, _page_size, YR, ADDVCD, STGR, STNM, _orderby);
    }
}
