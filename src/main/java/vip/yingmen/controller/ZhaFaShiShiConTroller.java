package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.ZhaFaShiShiService;

import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ZhaFaShiShiConTroller {
    @Autowired
    private ZhaFaShiShiService zhaFaShiShiService;

    @PutMapping(value = "/zhafakongzhi/shishi")
    public void updateByZhaFa(@RequestBody Map searchMap){
       zhaFaShiShiService.updateByZhaFa(searchMap);
    }
}
