package vip.yingmen.controller;


import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import vip.yingmen.pojo.StRsrBsin;
import vip.yingmen.pojo.StRsrHych;
import vip.yingmen.service.StRsrBsinService;

import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liujieyu
 * @since 2022-12-26
 */
@RestController
@RequestMapping("/guanqu")
@CrossOrigin
public class StRsrBsinController {
    @Autowired
    private StRsrBsinService stRsrBsinService;
    //根据站点编码查询水库站基本信息查询
    @GetMapping(value = "/base/skczinfo")
    public StRsrBsin findRsrBsinInfoByCon(@RequestParam String STCD){
        Map searchMap=new HashMap();
        searchMap.put("STCD",STCD);
        List<StRsrBsin> list=stRsrBsinService.selectRsrBsinInfoByCon(searchMap);
        if(list!=null && list.size()>0){
            return list.get(0);
        }else{
            return new StRsrBsin();
        }
    }
    //根据站点编码查询测站防洪基本信息查询
    @GetMapping(value = "/base/fhczinfo")
    public StRsrHych findRsrHychByCon(@RequestParam String STCD){
        Map searchMap=new HashMap();
        searchMap.put("STCD",STCD);
        List<StRsrHych> list=stRsrBsinService.selectRsrHychByCon(searchMap);
        if(list!=null && list.size()>0){
            return list.get(0);
        }else{
            return new StRsrHych();
        }
    }
    //分页查询水库站基本信息查询
    @GetMapping(value = "/base/skczpage")
    public PageInfo<StRsrBsin> findRsrBsinInfoByPage(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                     @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                     @RequestParam( value="_orderby", required=false,defaultValue = "RTUNM desc" )String _orderby,
                                                     @RequestParam( value="STNM",required = false) String STNM,
                                                     @RequestParam( value="ADDlist",required = false) String ADDlist){
        Map searchMap=new HashMap();
        if(STNM!=null){
            searchMap.put("STNM",STNM);
        }
        if(ADDlist!=null){
            ArrayList<String> paramlist=new ArrayList<String>(Arrays.asList(ADDlist.split(",")));
            searchMap.put("ADDlist",paramlist);
        }
        return stRsrBsinService.selectRsrBsinInfoByPage(_page,_page_size,_orderby,searchMap);
    }
    //分页查询防洪基本信息
    @GetMapping(value = "/base/fhczpage")
    public PageInfo<StRsrHych> findRsrHychInfoByPage(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                       @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                       @RequestParam( value="_orderby", required=false,defaultValue = "b.STNM asc" )String _orderby,
                                                       @RequestParam( value="STNM",required = false) String STNM,
                                                       @RequestParam( value="ADDlist",required = false) String ADDlist){

        Map searchMap=new HashMap();
        if(STNM!=null){
            searchMap.put("STNM",STNM);
        }
        if(ADDlist!=null){
            ArrayList<String> paramlist=new ArrayList<String>(Arrays.asList(ADDlist.split(",")));
            searchMap.put("ADDlist",paramlist);
        }
        return stRsrBsinService.selectRsrHychInfoByPage(_page,_page_size,_orderby,searchMap);
    }
}
