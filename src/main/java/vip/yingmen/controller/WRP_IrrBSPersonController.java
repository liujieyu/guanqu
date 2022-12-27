package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WRP_IrrBSPerson;
import vip.yingmen.service.WRP_IrrBSPersonService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class WRP_IrrBSPersonController {
    @Autowired
    private WRP_IrrBSPersonService wrpIrrBSPersonService;

    //基础数据的灌区人员基本信息查询
    @GetMapping(value = "/admin/WRP_IrrBSPerson")
    public PageInfo<WRP_IrrBSPerson> findAll(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                             @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size,
                                             @RequestParam( value="Post_Code", required=false)String Post_Code,
                                             @RequestParam( value="Sex", required=false)String Sex,
                                             @RequestParam( value="Positional_Title", required=false)String Positional_Title,
                                             @RequestParam( value="Educastional_Level", required=false)String Educastional_Level,
                                             @RequestParam( value="Personal_Name", required=false)String Personal_Name,
                                             @RequestParam( value="_orderby", required=false)String _orderby){
        return wrpIrrBSPersonService.findAll(_page,_page_size, Post_Code, Sex, Positional_Title, Educastional_Level, Personal_Name, _orderby);
    }
}
