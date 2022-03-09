package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.QuDaoTree;
import vip.yingmen.service.QuDaoTreeService;

import java.util.List;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class QuDaoTreeController {
    @Autowired
    private QuDaoTreeService quDaoTreeService;
    /**
     * http://v3.yingmen.vip/guanqu/table/xingzhen_tree?type=4
     * 这是存储过程查询
     * 渠道树形图
     * @return
     */
    @GetMapping(value = "/table/qudao_tree")
    public List<QuDaoTree> findByType(@RequestParam Integer type){
        return   quDaoTreeService.findByType(type);
    }

    @GetMapping(value = "/table/qudao_gongkuang_tree")
    public List<QuDaoTree> findByYunXingGongKuang(){
        return   quDaoTreeService.findByYunXingGongKuang();
    }
}
