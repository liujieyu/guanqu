package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WRP_FieldInfo;
import vip.yingmen.pojo.WRP_IrrBSPerson;
import vip.yingmen.service.WRP_FieldInfoService;
import vip.yingmen.service.WRP_IrrBSPersonService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class WRP_FieldInfoController {
    @Autowired
    private WRP_FieldInfoService wrpFieldInfoService;

    //查询基本信息基础数据
    @GetMapping(value = "/admin/WRP_FieldInfo")
    public PageInfo<WRP_FieldInfo> findByJiBenXinXi(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                                    @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size,
                                                    @RequestParam( value="FieldID", required=false) String FieldID){
        return wrpFieldInfoService.findByJiBenXinXi(_page,_page_size,FieldID);
    }

    //查询基本信息基础数据
    @GetMapping(value = "/admin/ShuiKuLevle")
    public PageInfo<WRP_FieldInfo> findByShuiKuShuiQingLevle(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                                             @RequestParam( value="_page_size", required=false,defaultValue = "9999999" )Integer _page_size,
                                                             @RequestParam( value="FieldID", required=false) String FieldID){
        return wrpFieldInfoService.findByShuiKuShuiQingLevle(_page,_page_size,FieldID);
    }
}
