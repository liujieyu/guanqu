package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.JiChuJianCeZhanDian;
import vip.yingmen.service.JiChuJianCeZhanDianService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JiChuJianCeZhanDianConTroller {
    @Autowired
    private JiChuJianCeZhanDianService jiChuJianCeZhanDianService;

    //基础数据的监测站点基本信息
    @GetMapping(value = "/jichujiancezhandian/jiancezhandian")
    public PageInfo<JiChuJianCeZhanDian> findByJianCeZhanDian(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                              @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                              @RequestParam(value = "_orderby", required = false) String _orderby,
                                                              @RequestParam(value = "STNM", required = false) String STNM,
                                                              @RequestParam(value = "ADDVCD", required = false) String ADDVCD,
                                                              @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                              @RequestParam(value = "STTP", required = false) String STTP,
                                                              @RequestParam(value = "STGR", required = false) String STGR,
                                                              @RequestParam(value = "TYPE", required = false) String TYPE) {
        return jiChuJianCeZhanDianService.findByJianCeZhanDian(_page, _page_size, _orderby,  STNM,  ADDVCD,  Canal_Code,  STTP,  STGR,  TYPE);
    }
}
