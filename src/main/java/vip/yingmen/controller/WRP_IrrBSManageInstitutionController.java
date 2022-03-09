package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.WRP_IrrBSManageInstitution;
import vip.yingmen.service.WRP_IrrBSManageInstitutionService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class
WRP_IrrBSManageInstitutionController {
    @Autowired
    private WRP_IrrBSManageInstitutionService wrpIrrBSManageInstitutionService;

    //基础数据的灌区管理机构查询
    @GetMapping(value = "/admin/WRP_IrrBSManageInstitution")
    public PageInfo<WRP_IrrBSManageInstitution> findAll(@RequestParam( value="_page", required=false,defaultValue = "1" )Integer _page,
                                                        @RequestParam( value="_page_size", required=false,defaultValue = "99999999" )Integer _page_size,
                                                        @RequestParam( value="Organ_Name", required=false)String Organ_Name){
        return wrpIrrBSManageInstitutionService.findAll(_page,_page_size,Organ_Name);
    }
}
