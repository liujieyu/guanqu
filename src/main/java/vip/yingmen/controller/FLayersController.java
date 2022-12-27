package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.service.FLayersService;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value = "/guanqu")
public class FLayersController {
    @Autowired
    private FLayersService fLayersService;

//    @GetMapping(value = "/gis/FLayers")
//    public Map findFLayers(@RequestParam String TYPE){
//        return fLayersService.findFLayers(TYPE);
//    }

//    @PostMapping(value = "/gis/FLayers")@RequestParam Integer type
//    public Map findSearch(@RequestBody Map searchMap){
//        return fLayersService.findAll(searchMap);
//    }
}
