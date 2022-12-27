package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WRP_IRA_BSIN;
import vip.yingmen.service.WRP_IRA_BSINService;

import java.util.List;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class WRP_IRA_BSINController {
    @Autowired
    private WRP_IRA_BSINService wrpIraBsinService;

    //基础数据的灌区基本信息查询
    @GetMapping(value = "/admin/WRP_IRA_BSIN")
    public PageInfo<WRP_IRA_BSIN> findAll(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                          @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size,
                                          @RequestParam String IARHWPRTP,@RequestParam String IRASC){
        return wrpIraBsinService.findByIARHWPRTPAndIRASC(_page,_page_size,IARHWPRTP,IRASC);
    }
}
