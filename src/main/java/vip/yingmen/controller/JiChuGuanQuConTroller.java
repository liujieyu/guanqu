package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.JiChuGuanQuJiBenXinXi;
import vip.yingmen.service.JiChuGuanQuService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JiChuGuanQuConTroller {
    @Autowired
    private JiChuGuanQuService jiChuGuanQuService;
    //基础数据的灌区基本信息
    @GetMapping(value = "/jichuxinxi/guanqu_jiben")
    public PageInfo<JiChuGuanQuJiBenXinXi> findByShuiKuShuiQingRiBiao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                      @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                      @RequestParam(value = "_orderby", required = false) String _orderby ,
                                                                      @RequestParam(value = "IARHWPRTP", required = false) String IARHWPRTP,
                                                                      @RequestParam(value = "IRASC", required = false) String IRASC,
                                                                      @RequestParam(value = "IRANM", required = false) String IRANM) {
        return jiChuGuanQuService.findByJiBenXinXi(_page, _page_size, _orderby,IARHWPRTP,IRASC,IRANM);
    }
}
