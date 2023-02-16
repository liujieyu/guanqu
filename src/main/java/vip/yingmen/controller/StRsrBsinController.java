package vip.yingmen.controller;


import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import vip.yingmen.entity.StPpAlarm;
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
    //获取监测站点列表
    @GetMapping(value = "/base/stcdlist")
    public List<Map> findStcdList(){
        return stRsrBsinService.selectStcdList();
    }

    //判断断面编号是否存在
    @GetMapping(value = "/base/checkdamcd")
    public Map checkDamcd(@RequestParam String DAMCD){
        Map map=new HashMap();
        Integer sign=stRsrBsinService.selectDamcdByCheck(DAMCD);
        if(sign==0){
            map.put("checksign","no");
        }else{
            map.put("checksign","yes");
            map.put("warning","此断面编号已存在！");
        }
        return map;
    }
    //判断断面特征编号是否存在
    @GetMapping(value = "/base/checkdamscd")
    public Map checkDamscd(@RequestParam String DAMSCD){
        Map map=new HashMap();
        Integer sign=stRsrBsinService.selectDamscdBycheck(DAMSCD);
        if(sign==0){
            map.put("checksign","no");
        }else{
            map.put("checksign","yes");
            map.put("warning","此断面特征编号已存在！");
        }
        return map;
    }
    //分页查询监测站点基本信息（维护）
    @GetMapping(value = "/manage/siteinfo")
    public PageInfo<StRsrBsin> findSiteManageByPage(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                              @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                              @RequestParam(value = "_orderby", required = false) String _orderby,
                                                              @RequestParam(value = "STNM", required = false) String STNM,
                                                              @RequestParam(value = "ADDlist", required = false) String ADDlist,
                                                              @RequestParam(value = "STTP", required = false) String STTP,
                                                              @RequestParam(value = "STGR", required = false) String STGR){
        Map searchMap=new HashMap();
        if(STNM!=null){
            searchMap.put("STNM",STNM);
        }
        if(STTP !=null){
            searchMap.put("STTP",STTP);
        }
        if(STGR !=null){
            searchMap.put("STGR",STGR);
        }
        if(ADDlist!=null){
            ArrayList<String> paramlist=new ArrayList<String>(Arrays.asList(ADDlist.split(",")));
            searchMap.put("ADDlist",paramlist);
        }
        return stRsrBsinService.selectSiteInfoManageByPage(_page,_page_size,_orderby,searchMap);
    }
    //新增监测站点信息
    @PostMapping(value = "/manage/addsiteinfo")
    public Map addSiteInfo(@RequestBody StRsrBsin pojo){
        stRsrBsinService.addSiteInfo(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //修改监测站点信息
    @PostMapping(value = "/manage/updatesiteinfo")
    public Map updateSiteInfo(@RequestBody StRsrBsin pojo){
        stRsrBsinService.modifySiteInfo(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //删除监测站点信息
    @GetMapping(value = "/manage/delsiteinfo")
    public Map delSiteInfo(@RequestParam String ids,@RequestParam String stcds){
        stRsrBsinService.dropSiteInfo(ids,stcds);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID查询站点信息
    @GetMapping(value = "/base/findsitebyid")
    public StRsrBsin findSiteInfoById(@RequestParam int ID){
        return stRsrBsinService.selectSiteInfoById(ID);
    }
    //判断监测站点编码是否存在
    @GetMapping(value = "/base/checkstcd")
    public Map checkStcd(@RequestParam String STCD){
        Map map=new HashMap();
        Integer sign=stRsrBsinService.selectStcdExist(STCD);
        if(sign==0){
            map.put("checksign","no");
        }else{
            map.put("checksign","yes");
            map.put("warning","此监测站点编号已存在！");
        }
        return map;
    }
    //根据ID查询测站防洪信息
    @GetMapping(value = "/rsvalarm/detail")
    public StRsrHych rsralarmdetail(@RequestParam int ID){
        return stRsrBsinService.selectRsrAlarmById(ID);
    }
    //新增水库水位预警信息
    @PostMapping(value = "/rsvalarm/addinfo")
    public Map addAlarminfo(@RequestBody StRsrHych pojo){
        stRsrBsinService.addStRsvAlarmInfo(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //修改水库水位预警信息
    @PostMapping(value = "/rsvalarm/updateinfo")
    public Map updateAlarminfo(@RequestBody StRsrHych pojo){
        stRsrBsinService.modifyStRsvAlarmInfo(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID删除水库预警信息
    @GetMapping(value = "/rsvalarm/delinfo")
    public Map delAlarminfo(@RequestParam String ids,@RequestParam String alarmids){
        stRsrBsinService.dropStRsvAlarmInfo(ids,alarmids);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //判断防洪预警中监测站点是否存在
    @GetMapping(value = "/rsvalarm/checkstcd")
    public Map checkAlarmstcd(@RequestParam String stcd){
        Map map=new HashMap();
        Integer sign=stRsrBsinService.checkStcdInAlarm(stcd);
        if(sign==0){
            map.put("checksign","no");
        }else{
            map.put("checksign","yes");
            map.put("warning","此站点防洪信息已存在！");
        }
        return map;
    }
    //新增降雨预警信息
    @PostMapping(value = "/rain/addalarm")
    public Map addRainAlarm(@RequestBody StPpAlarm pojo){
        stRsrBsinService.addPpAlarm(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //修改降雨预警信息
    @PostMapping(value = "/rain/updatealarm")
    public Map updateRainAlarm(@RequestBody StPpAlarm pojo){
        stRsrBsinService.modifyPpAlarm(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //删除降雨预警信息
    @GetMapping(value = "/rain/delalarm")
    public Map delRainAlarm(@RequestParam String ids){
        stRsrBsinService.dropPpAlarm(ids);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID查询降雨预警信息
    @GetMapping(value = "/rain/alarmdetail")
    public StPpAlarm rainalarmdetail(@RequestParam int ID){
        return stRsrBsinService.selectPpAlarmById(ID);
    }
    //判断雨量预警中监测站点是否存在
    @GetMapping(value = "/rain/checkstcd")
    public Map checkRainAlarmStcd(@RequestParam String STCD,@RequestParam int EWL){
        String yjtext="";
        switch (EWL){
            case 1:yjtext="红色预警";
            break;
            case 2:yjtext="橙色预警";
            break;
            case 3:yjtext="黄色预警";
            break;
        }
        Integer sign=stRsrBsinService.selectStcdInPpAlarm(STCD,EWL);
        Map map=new HashMap();
        if(sign==0){
            map.put("checksign","no");
        }else{
            map.put("checksign","yes");
            map.put("warning","此站点"+yjtext+"信息已存在！");
        }
        return map;
    }
    //根据STCD获取站点基本信息和库容信息
    @GetMapping(value = "/base/sitekrinfo")
    public Map getsitekrInfo(@RequestParam String STCD){
        return stRsrBsinService.selectSiteBaseByStcd(STCD);
    }
    //根据STCD获取特征库容信息
    @GetMapping(value = "/alarm/tzkrinfo")
    public StRsrHych getTzkrByStcd(@RequestParam String STCD){return stRsrBsinService.selectTzKrByStcd(STCD);}
}
