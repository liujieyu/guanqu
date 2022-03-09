package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WRP_IrrBFSource;
import vip.yingmen.service.WRP_IrrBFSourceService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class WRP_IrrBFSourceController {
    @Autowired
    private WRP_IrrBFSourceService wrpIrrBFSourceService;

    //基础数据的水源信息查询
    @GetMapping(value = "/admin/WRP_IrrBFSource")
    public PageInfo<WRP_IrrBFSource> findByShuiYuanXinXi(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                                         @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size){
        return wrpIrrBFSourceService.findByShuiYuanXinXi(_page,_page_size);
    }
}
