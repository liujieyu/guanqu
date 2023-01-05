package vip.yingmen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import vip.yingmen.pojo.WrpSpgSpqnmp;
import vip.yingmen.service.WrpSpgLsyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liujieyu
 * @since 2023-01-03
 */
@RestController
@RequestMapping("/guanqu")
@CrossOrigin
public class WrpSpgLsyController {
    @Autowired
    private WrpSpgLsyService wrpSpgLsyService;
    //新增渗流量测点设备信息
    @PostMapping(value = "/manage/addsllinfo")
    public Map addSllinfo(@RequestBody WrpSpgSpqnmp pojo){
        wrpSpgLsyService.addSpgLsyAndSpqnmp(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //修改渗流量测点设备信息
    @PostMapping(value = "/manage/updatesllinfo")
    public Map updateSllinfo(@RequestBody WrpSpgSpqnmp pojo){
        wrpSpgLsyService.modifySpgLsyAndSpqnmp(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID删除渗流量测点设备信息
    @GetMapping(value = "/manage/delsllinfo")
    public Map delSllinfoByIds(@RequestParam String ids,@RequestParam String sbids){
        wrpSpgLsyService.dropSpgLsyAndSpqnmp(ids,sbids);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID获取渗流量信息
    @GetMapping(value = "/manage/slldetail")
    public WrpSpgSpqnmp querySllinfoById(@RequestParam int ID,@RequestParam int SBID){
        return wrpSpgLsyService.getSpgLsyAndSpqnmpById(ID,SBID);
    }
    //根据STCD获取断面编码
    @GetMapping(value = "/list/damcdbystcd")
    public List<Map> queryDamcdByStcd(@RequestParam String STCD){
        return wrpSpgLsyService.selectDmcdByStcd(STCD);
    }
    //判断测点编号是否存在
    @GetMapping(value = "/base/checkmpcd")
    public Map checkmpcdBytype(@RequestParam int TYPE,@RequestParam String MPCD){
        Map map=new HashMap();
        Integer sign=wrpSpgLsyService.findMpcdExist(TYPE, MPCD);
        if(sign==0){
            map.put("checksign","no");
        }else{
            map.put("checksign","yes");
            map.put("warning","此测点编号已存在！");
        }
        return map;
    }
}
