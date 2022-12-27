package vip.yingmen.controller;


import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.*;
import vip.yingmen.service.WrpSpgSpqnmpService;

import java.util.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
@RestController
@RequestMapping("/guanqu")
@CrossOrigin
public class WrpSpgSpqnmpController {
    @Autowired
    private WrpSpgSpqnmpService wrpSpgSpqnmpService;

    //根据断面编号获取断面信息
    @GetMapping(value = "/detail/dminfo")
    public Map<String,Object> findSafeDmInfoByDmbh(@RequestParam String DAMCD){
          List<WrpSectionB> list=wrpSpgSpqnmpService.findSafeDmInfoByDmbh(DAMCD);
          Map<String,Object> map=new HashMap<String,Object>();
          map.put("dminfo",list);
          return map;
    }
    //根据断面编号获取断面特征信息
    @GetMapping(value = "/detail/dmtzinfo")
    public Map<String,Object> findSafeDmtzInfoByDmbh(@RequestParam String DAMCD){
        List<WrpDamsB> list=wrpSpgSpqnmpService.findSafeDmtzInfoByDmbh(DAMCD);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("dmtzinfo",list);
        return map;
    }
    //根据测点编号获取渗流量测点信息
    @GetMapping(value = "/detail/sllinfo")
    public Map<String,Object> findSafeSllInfoByCdbh(@RequestParam String MPCD){
        List<WrpSpgSpqnmp> list=wrpSpgSpqnmpService.findSafeSllInfoByCdbh(MPCD);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("sllinfo",list);
        return map;
    }
    //根据测点编号获取渗压管信息
    @GetMapping(value = "/detail/syginfo")
    public Map<String,Object> findSafeSYgInfoByCdbh(@RequestParam String MPCD){
        List<WrpSpgPztb> list=wrpSpgSpqnmpService.findSafeSYgInfoByCdbh(MPCD);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("syginfo",list);
        return map;
    }
    //根据测点编号获取表面水平位移信息
    @GetMapping(value = "/detail/spwyinfo")
    public Map<String,Object> findSafeSpwyInfoByCdbh(@RequestParam String MPCD){
        List<WrpDfrSrhrdsmp> list=wrpSpgSpqnmpService.findSafeSpwyInfoByCdbh(MPCD);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("spwyinfo",list);
        return map;
    }
    //根据测点编号获取表面垂直位移信息
    @GetMapping(value = "/detail/czwyinfo")
    public Map<String,Object> findSafeCzwyInfoByCdbh(@RequestParam String MPCD){
        List<WrpDfrSrvrdsmp> list=wrpSpgSpqnmpService.findSafeCzwyInfoByCdbh(MPCD);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("czwyinfo",list);
        return map;
    }
    //获取断面信息表格数据
    @GetMapping(value = "/page/dminfo")
    public PageInfo<WrpSectionB> findDuanmianInfoByPage(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                        @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                        @RequestParam( value="_orderby", required=false,defaultValue = "STNM desc" )String _orderby,
                                                        @RequestParam( value="STNM",required = false) String STNM,
                                                        @RequestParam( value="ADDlist",required = false) String ADDlist,
                                                        @RequestParam( value="WALLTYPE",required = false) String WALLTYPE){
        Map searchMap=new HashMap();
        if(STNM!=null){
            searchMap.put("STNM",STNM);
        }
        if(ADDlist!=null){
            ArrayList<String> paramlist=new ArrayList<String>(Arrays.asList(ADDlist.split(",")));
            searchMap.put("ADDlist",paramlist);
        }
        if(WALLTYPE !=null){
            searchMap.put("WALLTYPE",WALLTYPE);
        }
        return wrpSpgSpqnmpService.findDuanmianInfoByPage(_page,_page_size,_orderby,searchMap);
    }
    //渗流量信息表格数据
    @GetMapping(value = "/page/sllinfo")
    public PageInfo<WrpSpgSpqnmp> findShenliuInfoByPage(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                        @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                        @RequestParam( value="_orderby", required=false,defaultValue = "STNM desc" )String _orderby,
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
        return wrpSpgSpqnmpService.findShenliuInfoByPage(_page,_page_size,_orderby,searchMap);
    }
    //渗流压力信息表格数据
    @GetMapping(value = "/page/slylinfo")
    public PageInfo<WrpSpgPztb> fineSheyaInfoByPage(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                    @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                    @RequestParam( value="_orderby", required=false,defaultValue = "STNM desc" )String _orderby,
                                                    @RequestParam( value="STNM",required = false) String STNM,
                                                    @RequestParam( value="ADDlist",required = false) String ADDlist,
                                                    @RequestParam( value="MSPS",required = false) String MSPS){
        Map searchMap=new HashMap();
        if(STNM!=null){
            searchMap.put("STNM",STNM);
        }
        if(ADDlist!=null){
            ArrayList<String> paramlist=new ArrayList<String>(Arrays.asList(ADDlist.split(",")));
            searchMap.put("ADDlist",paramlist);
        }
        if(MSPS !=null){
            searchMap.put("MSPS",MSPS);
        }
        return wrpSpgSpqnmpService.fineSheyaInfoByPage(_page,_page_size,_orderby,searchMap);
    }
    //水平位移信息表格数据
    @GetMapping(value = "/page/spwyinfo")
    public PageInfo<WrpDfrSrhrdsmp> fineWeiyiInfoByPage(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                        @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                        @RequestParam( value="_orderby", required=false,defaultValue = "STNM desc" )String _orderby,
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
        return wrpSpgSpqnmpService.fineWeiyiInfoByPage(_page,_page_size,_orderby,searchMap);
    }
    //沉降位移信息表格数据
    @GetMapping(value = "/page/cjwyinfo")
    public PageInfo<WrpDfrSrvrdsmp> fineChenjiangInfoByPage(@RequestParam( value="_page", required=false,defaultValue = "1" ) Integer _page,
                                                            @RequestParam( value="_page_size", required=false,defaultValue = "99999" ) Integer _page_size,
                                                            @RequestParam( value="_orderby", required=false,defaultValue = "STNM desc" )String _orderby,
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
        return wrpSpgSpqnmpService.fineChenjiangInfoByPage(_page,_page_size,_orderby,searchMap);
    }
    //行政区划树数据
    @GetMapping(value = "/info/xzqhtree")
    public List<Map> findXzqhAndSiteTreeData(@RequestParam( value="TYPE" ) Integer TYPE){
        return wrpSpgSpqnmpService.findXzqhAndSiteTreeData(TYPE);
    }
    //查询测点编号
    @GetMapping(value = "/info/cdbhlist")
    public List<Map> findCdbhByTable(Integer TYPE,String STCD){
        return wrpSpgSpqnmpService.findCdbhByTable(TYPE, STCD);
    }
}
