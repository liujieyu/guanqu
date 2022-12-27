package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ShiPinFuZhu;
import vip.yingmen.pojo.ShiPinGIS;
import vip.yingmen.service.ShiPinGISService;

import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ShiPinGISController {
    @Autowired
    private ShiPinGISService shiPinGISService;
    //视频的gis第一滑框实时数据
    @PostMapping(value = "/shipin/gis")
    public Map findByShiPinGIS(@RequestBody(required = false) Map searchMap){
        return shiPinGISService.findByShiPinGIS(searchMap);
    }

    //视频的gis第一滑框实时数据
    @GetMapping(value = "/shipin/gis")
    public Map findByShiPinGIS(){
        return shiPinGISService.findByShiPinGIS();
    }

    //视频的辅助表单表查询
    @GetMapping(value = "/shipin/fuzhu")
    public PageInfo<ShiPinFuZhu> findByShiPin(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                              @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size,
                                              @RequestParam( value="STCD", required=false) String stcd){
        return shiPinGISService.findByShiPin(_page,_page_size,stcd);
    }
}
