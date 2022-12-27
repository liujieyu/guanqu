package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.yingmen.service.SystemInfoService;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value = "/guanqu")
public class SystemInfoController {
    @Autowired
    private SystemInfoService systemInfoService;

    //system_info的查询
    @GetMapping(value = "/gis/system_info")
    public Map findAll(){
        return systemInfoService.findAll();
    }
}
