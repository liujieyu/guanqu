package vip.yingmen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import vip.yingmen.pojo.WrpDamsB;
import vip.yingmen.pojo.WrpSectionB;
import vip.yingmen.service.WrpDamsBService;
import vip.yingmen.service.WrpSectionBService;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liujieyu
 * @since 2022-12-29
 */
@RestController
@RequestMapping("/guanqu")
@CrossOrigin
public class WrpSectionBController {
    @Autowired
    private WrpSectionBService wrpSectionBService;
    @Autowired
    private WrpDamsBService wrpDamsBService;
    //新增断面信息
    @PostMapping(value = "/manage/adddminfo")
    public Map addDuanmian(@RequestBody WrpSectionB pojo){
        wrpSectionBService.addWrpSectionInfo(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //修改断面信息
    @PostMapping(value = "/manage/updatedminfo")
    public Map updateDuanmian(@RequestBody WrpSectionB pojo){
        wrpSectionBService.modifyWrpSectionById(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID获取断面信息
    @GetMapping(value = "/manage/sestiondetail")
    public WrpSectionB queryWrpSectionById(@RequestParam int id){
        return wrpSectionBService.queryWrpSectionById(id);
    }
    //根据ID删除断面信息
    @GetMapping(value = "/manage/deldminfo")
    public Map delDuanmian(@RequestParam String ids){
        wrpSectionBService.dropWrpSectionById(ids);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //新增断面特征信息
    @PostMapping(value = "/manage/adddmtzinfo")
    public Map addDmtzInfo(@RequestBody WrpDamsB pojo){
        wrpDamsBService.addWrpDamsB(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //修改断面特征信息
    @PostMapping(value = "/manage/updatedmtzinfo")
    public Map updateDmtzInfo(@RequestBody WrpDamsB pojo){
        wrpDamsBService.modifyWrpDamsB(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //删除断面特征信息
    @GetMapping(value = "/manage/deldmtzinfo")
    public Map delDmtzInfo(@RequestParam String ids){
        wrpDamsBService.dropWrpDamsB(ids);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID获取断面特征信息
    @GetMapping(value = "/manage/damsdetail")
    public WrpDamsB queryWrpDamsBById(@RequestParam int id){
        return wrpDamsBService.findWrpDamsBById(id);
    }
}
