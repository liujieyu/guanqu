package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_StationStatusType;
import vip.yingmen.service.ST_StationStatusTypeService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_StationStatusTypeController {
    @Autowired
    private ST_StationStatusTypeService stStationStatusTypeService;

    //运行工况gis第二滑框的历史列表查询
    @GetMapping(value = "/table/ST_StationStatusType")
    public PageInfo<ST_StationStatusType> findAll(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                  @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size){
        return stStationStatusTypeService.findAll(_page,_page_size);
    }
}
