package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WRP_RVR_BSIN;
import vip.yingmen.service.WRP_RVR_BSINService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class WRP_RVR_BSINController {
    @Autowired
    private WRP_RVR_BSINService wrpRvrBsinService;

    //根据RVCD查询河流基本信息表
    @GetMapping(value = "/admin/WRP_RVR_BSIN")
    public PageInfo<WRP_RVR_BSIN> findByRVCD(@RequestParam( value="RVCD", required=false) String RVCD){
        return wrpRvrBsinService.findByRVCD(RVCD);
    }
}
