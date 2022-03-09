package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WRP_LY_BSIN;
import vip.yingmen.service.WRP_LY_BSINService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class WRP_LY_BSINController {
    @Autowired
    private WRP_LY_BSINService wrpLyBsinService;

    //根据CTCD查询基础数据流域信息
    @GetMapping(value = "/admin/WRP_LY_BSIN")
    public PageInfo<WRP_LY_BSIN> findByCTCD(@RequestParam(value="CTCD", required=false) String CTCD){
        return wrpLyBsinService.findByCTCD(CTCD);
    }
}
