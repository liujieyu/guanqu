package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.*;
import vip.yingmen.service.JiChuShuiYuanXinXiService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JiChuShuiYuanXinXiConTroller {
    @Autowired
    private JiChuShuiYuanXinXiService jiChuShuiYuanXinXiService;

    //基础数据的水源基本信息
    @GetMapping(value = "/jichushuiyuanxinxi/shuiyuan")
    public PageInfo<JiChuShuiYuanXinXiShuiYuan> findByShuiKuShuiQingRiBiao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                                           @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                                           @RequestParam(value = "_orderby", required = false) String _orderby,
                                                                           @RequestParam(value = "SourceE_Type", required = false) String SourceE_Type,
                                                                           @RequestParam(value = "Source_Type", required = false) String Source_Type,
                                                                           @RequestParam(value = "RSNM", required = false) String RSNM) {
        return jiChuShuiYuanXinXiService.findByShuiYuan(_page, _page_size, _orderby, SourceE_Type, Source_Type, RSNM);
    }

    //基础数据的水源的水库基本信息
    @GetMapping(value = "/jichushuiyuanxinxi/shuiku")
    public PageInfo<JiChuShuiYuanShuiKu> findByShuiKu(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                      @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                      @RequestParam(value = "_orderby", required = false) String _orderby,
                                                      @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                      @RequestParam(value = "PRSC", required = false) String PRSC,
                                                      @RequestParam(value = "BLSYS", required = false) String BLSYS,
                                                      @RequestParam(value = "RSNM", required = false) String RSNM) {
        return jiChuShuiYuanXinXiService.findByShuiKu(_page, _page_size, _orderby, ADDVCD, PRSC, BLSYS, RSNM);
    }

    //基础数据的水源的河流基本信息
    @GetMapping(value = "/jichushuiyuanxinxi/heliu")
    public PageInfo<JiChuShuiYuanHeLiu> findByHeLiu(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                    @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                    @RequestParam(value = "_orderby", required = false) String _orderby,
                                                    @RequestParam(value = "RVNM", required = false) String RVNM,
                                                    @RequestParam(value = "RVTP", required = false) String RVTP,
                                                    @RequestParam(value = "RLEVEL", required = false) String RLEVEL) {
        return jiChuShuiYuanXinXiService.findByHeLiu(_page, _page_size, _orderby, RVNM, RVTP, RLEVEL);
    }


    //基础数据的水源的河流基本信息
    @GetMapping(value = "/jichushuiyuanxinxi/jing")
    public PageInfo<JiChuShuiYuanJing> findByJing(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                  @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                  @RequestParam(value = "_orderby", required = false) String _orderby,
                                                  @RequestParam(value = "Well_Name", required = false)String Well_Name,
                                                  @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                  @RequestParam(value = "Diameter_Type", required = false)String Diameter_Type,
                                                  @RequestParam(value = "Depth_Type", required = false) String Depth_Type,
                                                  @RequestParam(value = "Motivity_Type", required = false) String Motivity_Type,
                                                  @RequestParam(value = "Material_Type", required = false) String Material_Type) {
        return jiChuShuiYuanXinXiService.findByJing(_page, _page_size, _orderby, Well_Name, Canal_Code, Diameter_Type,Depth_Type,Motivity_Type,Material_Type);
    }
}
