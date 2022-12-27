package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.JiChuShuJuQuDao;
import vip.yingmen.service.JiChuShuJuQuDaoService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JiChuShuJuQuDaoConTroller {
    @Autowired
    private JiChuShuJuQuDaoService jiChuShuJuQuDaoService;

    //基础数据的水源基本信息
    @GetMapping(value = "/jichushuju/qudao")
    public PageInfo<JiChuShuJuQuDao> findByQuDao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer _page,
                                                 @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer _page_size,
                                                 @RequestParam(value = "_orderby", required = false) String _orderby,
                                                 @RequestParam(value = "Canal_Name", required = false) String Canal_Name,
                                                 @RequestParam(value = "Canal_Code", required = false) String Canal_Code,
                                                 @RequestParam(value = "User_Type", required = false) String User_Type,
                                                 @RequestParam(value = "Canal_Level", required = false) String Canal_Level) {
        return jiChuShuJuQuDaoService.findByQuDao(_page, _page_size, _orderby, Canal_Name, Canal_Code, User_Type, Canal_Level);
    }
}
