package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.LiShiShuiWeiKuRongLieBiao;
import vip.yingmen.service.LiShiShuiWeiKuRongService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class LiShiShuiWeiKuRongController {
    @Autowired
    private LiShiShuiWeiKuRongService liShiShuiWeiKuRongService;

    //历史数据的水位库容列表查询
    @GetMapping(value = "/shuiweikurong/lishi_liebiao")
    public PageInfo<LiShiShuiWeiKuRongLieBiao> findByLieBiao(@RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                             @RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                             @RequestParam(value="ADDVCD", required=false) String ADDVCD,
                                                             @RequestParam(value="Canal_Code", required=false) String Canal_Code,
                                                             @RequestParam(value="LEVEL", required=false) String LEVEL,
                                                             @RequestParam(value="STGR", required=false) String STGR,
                                                             @RequestParam(value="STNM", required=false) String STNM,
                                                             @RequestParam(value="_orderby", required=false) String _orderby){
        return   liShiShuiWeiKuRongService.findByLieBiao(_page_size,_page,ADDVCD,Canal_Code,LEVEL,STGR,STNM,_orderby);
    }
}
