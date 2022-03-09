package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.LiShiTuXiangXinXi;
import vip.yingmen.service.LiShiTuXiangXinXiService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class LiShiTuXiangXinXiController {

    @Autowired
    private LiShiTuXiangXinXiService liShiTuXiangXinXiService;
    //历史数据的图像信息查询
    @GetMapping(value = "/tuxiangxinxi/lishi_tuxiang")
    public PageInfo<LiShiTuXiangXinXi> findByLiShiTuXiangXinXi(@RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                                               @RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size,
                                                               @RequestParam(value="ADDVCD", required=false) String addvcd,
                                                               @RequestParam(value="STNM", required=false) String stnm,
                                                               @RequestParam(value="Canal_Code", required=false) String canalCode){
        return   liShiTuXiangXinXiService.findByLiShiTuXiangXinXi(_page,_page_size,addvcd,stnm,canalCode);
    }



    @GetMapping(value = "/gis/pic_content")
    public byte[] findByLiShiTuXiangXinXi(@RequestParam(value="id") String STCD){
        return  liShiTuXiangXinXiService.findByLiShiTuXiangpic(STCD);
    }

    //历史数据的图像信息查询今日收到的图像
    @GetMapping(value = "/tuxiangxinxi/lishi_tuxiangtj")
    public Integer findByLiShiTuXiangXinXiTj(@RequestParam(value="_page", required=false,defaultValue = "1") Integer _page,
                                             @RequestParam(value="_page_size", required=false,defaultValue = "999999") Integer _page_size){
        return   liShiTuXiangXinXiService.findByLiShiTuXiangXinXiTj();
    }
}
