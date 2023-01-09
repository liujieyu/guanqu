package vip.yingmen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import vip.yingmen.pojo.WrpDfrSrhrdsmp;
import vip.yingmen.pojo.WrpDfrSrvrdsmp;
import vip.yingmen.pojo.WrpSpgPztb;
import vip.yingmen.service.WrpSpgPztbService;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  大坝安全测点信息维护
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
    //新增水平位移测点信息
    @PostMapping(value = "/manage/addspwyinfo")
    public Map addSpwylInfo(@RequestBody WrpDfrSrhrdsmp pojo){
        wrpSpgPztbService.addSrhrdsmp(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //修改水平位移测点信息
    @PostMapping(value = "/manage/updatespwyinfo")
    public Map updateSpwylInfo(@RequestBody WrpDfrSrhrdsmp pojo){
        wrpSpgPztbService.modifySrhrdsmp(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //删除水平位移测点信息
    @GetMapping(value = "/manage/delspwyinfo")
    public Map delSpwyinfoByIds(@RequestParam String ids){
        wrpSpgPztbService.dropWrhrdsmp(ids);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID查询水平位移测点信息
    @GetMapping(value = "/manage/spwydetail")
    public WrpDfrSrhrdsmp getSpwyInfoById(@RequestParam int ID){
        return wrpSpgPztbService.findSrhrdsmpById(ID);
    }
    //新增沉降位移测点信息
    @PostMapping(value = "/manage/addcjwyinfo")
    public Map addCjwylInfo(@RequestBody WrpDfrSrvrdsmp pojo){
        wrpSpgPztbService.addSrvrdsmp(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //修改沉降位移测点信息
    @PostMapping(value = "/manage/updatecjwyinfo")
    public Map updateCjwylInfo(@RequestBody WrpDfrSrvrdsmp pojo){
        wrpSpgPztbService.modifySrvrdsmp(pojo);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //删除沉降位移测点信息
    @GetMapping(value = "/manage/delcjwyinfo")
    public Map delCjwyinfoByIds(@RequestParam String ids){
        wrpSpgPztbService.dropSrvrdsmp(ids);
        Map map=new HashMap();
        map.put("sign","ok");
        return map;
    }
    //根据ID查询沉降位移测点信息
    @GetMapping(value = "/manage/cjwydetail")
    public WrpDfrSrvrdsmp getCjwyInfoById(@RequestParam int ID){
        return wrpSpgPztbService.findSrvrdsmpById(ID);
    }
}
