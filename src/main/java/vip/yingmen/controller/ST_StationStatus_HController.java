package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_StationStatus_H;
import vip.yingmen.service.ST_StationStatus_HService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_StationStatus_HController {
    @Autowired
    private ST_StationStatus_HService stStationStatusHService;

    //运行工况gis第二滑框的历史列表查询
    @GetMapping(value = "/admin/ST_StationStatus_H")
    public PageInfo<ST_StationStatus_H> findByYunXingGongKuang(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                               @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                               @RequestParam String STCD,
                                                               @RequestParam( value="Time_min", required=false)  String Time_min,
                                                               @RequestParam( value="Time_max", required=false)  String Time_max,
                                                               @RequestParam( value="_orderby", required=false,defaultValue = "TM desc" )String _orderby){
        return stStationStatusHService.findByYunXingGongKuang(_page,_page_size,STCD,Time_min,Time_max,_orderby);
    }
}
