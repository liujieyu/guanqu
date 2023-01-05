package vip.yingmen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import vip.yingmen.pojo.WrpSpgPztb;
import vip.yingmen.service.WrpSpgPztbService;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liujieyu
 * @since 2023-01-05
 */
@RestController
@RequestMapping("/guanqu")
@CrossOrigin
public class WrpSpgPztbController {
    @Autowired
    private WrpSpgPztbService wrpSpgPztbService;
    //新增渗压管信息
    @PostMapping(value = "/manage/addslylinfo")
    public Map addSlylInfo(@RequestBody WrpSpgPztb pojo){
        wrpSpgPztbService.addSpgPztb(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //修改渗压管信息
    @PostMapping(value = "/manage/updateslylinfo")
    public Map updateSlylInfo(@RequestBody WrpSpgPztb pojo){
        wrpSpgPztbService.modifySpgPztb(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID删除渗压管信息
    @GetMapping(value = "/manage/delslylinfo")
    public Map delSlylinfoByIds(@RequestParam String ids){
        wrpSpgPztbService.dropSpgPztb(ids);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID查询渗压管信息
    @GetMapping(value = "/manage/slyldetail")
    public WrpSpgPztb getSlylInfoById(@RequestParam int ID){
        return wrpSpgPztbService.findSpgPztbById(ID);
    }
}
