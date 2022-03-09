package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.XingZhenTree;
import vip.yingmen.service.XingZhenTreeService;

import java.util.List;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class XingZhenTreeController {
    @Autowired
    private XingZhenTreeService xingZhenTreeService;
    /**
     * http://v3.yingmen.vip/guanqu/table/xingzhen_tree?type=4
     * 这是存储过程查询
     * 行政树形图
     * @return
     */
    @GetMapping(value = "/table/xingzhen_tree")
    public List<XingZhenTree> findByType(@RequestParam Integer type){
        return   xingZhenTreeService.findByType(type);
    }

    @GetMapping(value = "/table/xingzhen_gongkuang_tree")
    public List<XingZhenTree> findByYunXingGongKuang(){
        return   xingZhenTreeService.findByYunXingGongKuang();
    }
}
