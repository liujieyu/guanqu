package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.LiShiYunXingGongKuang;
import vip.yingmen.service.LiShiYunXingGongKuangService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class LiShiYunXingGongKuangController {
    @Autowired
    private LiShiYunXingGongKuangService liShiYunXingGongKuangService;
    //历史数据的图像信息查询
    @GetMapping(value = "/lishigongkuang/lishibiao")
    public PageInfo<LiShiYunXingGongKuang> findByGongKuang(@RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                           @RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                           @RequestParam(value="_orderby", required=false,defaultValue = "tm desc")String _orderby,
                                                           @RequestParam(value="STCD", required=false)String STCD,
                                                           @RequestParam(value="Time_min", required=false)String Time_min,
                                                           @RequestParam(value="Time_max", required=false)String Time_max){
        return   liShiYunXingGongKuangService.findByGongKuang(_page,_page_size, _orderby, STCD, Time_min, Time_max);
    }

}
