package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.JCQSSSBa;
import vip.yingmen.pojo.JCQSSSBengZhan;
import vip.yingmen.pojo.JCQSSSSheShi;
import vip.yingmen.pojo.JiChuQuShuiSheShiShuiZha;
import vip.yingmen.service.JiChuQuShuiSheShiService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JiChuQuShuiSheShiConTroller {
    @Autowired
    private JiChuQuShuiSheShiService jiChuQuShuiSheShiService;

    //基础数据的取水设置水闸基本信息
    @GetMapping(value = "/jichuqushuisheshi/shuizha")
    public PageInfo<JiChuQuShuiSheShiShuiZha> findByQuDao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                          @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                          @RequestParam(value = "_orderby", required = false) String _orderby,
                                                          @RequestParam(value = "SLNM", required = false) String SLNM,
                                                          @RequestParam(value = "SLTP", required = false) String SLTP,
                                                          @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                          @RequestParam(value = "GS", required = false) String GS) {
        return jiChuQuShuiSheShiService.findByShuiZha(_page, _page_size, _orderby, SLNM, SLTP, ADDVCD, GS);
    }



    //基础数据的取水设施的取水设施基本信息
    @GetMapping(value = "/jichuqushuisheshi/sheshi")
    public PageInfo<JCQSSSSheShi> findBySheShi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                               @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                               @RequestParam(value = "_orderby", required = false) String _orderby,
                                               @RequestParam(value = "FStructure_Name", required = false) String FStructure_Name,
                                               @RequestParam(value = "FStructure_Type", required = false) String FStructure_Type,
                                               @RequestParam(value = "Fetch_Mode", required = false) String Fetch_Mode,
                                               @RequestParam(value = "GS", required = false) String GS) {
        return jiChuQuShuiSheShiService.findBySheShi(_page, _page_size, _orderby, FStructure_Name, FStructure_Type, Fetch_Mode, GS);
    }


    //基础数据的取水设施的取水设施基本信息
    @GetMapping(value = "/jichuqushuisheshi/ba")
    public PageInfo<JCQSSSBa> findByBa(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                       @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                       @RequestParam(value = "_orderby", required = false) String orderBy,
                                       @RequestParam(value = "Dam_Name", required = false) String damName,
                                       @RequestParam(value = "Dam_Type", required = false) String damType,
                                       @RequestParam(value = "Dam_Grade", required = false) String damGrade,
                                       @RequestParam(value = "Structure_Type", required = false) String structureType,
                                       @RequestParam(value = "GS", required = false) String gs) {
        return jiChuQuShuiSheShiService.findByBa(page, pageSize, orderBy, damName, damType, damGrade,structureType, gs);
    }


    //基础数据的取水设施的取水设施基本信息
    @GetMapping(value = "/jichuqushuisheshi/bengzhan")
    public PageInfo<JCQSSSBengZhan> findByBengZhan(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                   @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                   @RequestParam(value = "_orderby", required = false) String orderBy,
                                                   @RequestParam(value = "IDSTNM", required = false) String idstnm,
                                                   @RequestParam(value = "ADDVCD", required = false) String addvcd,
                                                   @RequestParam(value = "IDSTTP", required = false) String idsttp,
                                                   @RequestParam(value = "GS", required = false) String gs) {
        return jiChuQuShuiSheShiService.findByBengZhan( page,  pageSize,  orderBy,  idstnm,  addvcd,  idsttp, gs);
    }
}
