package vip.yingmen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.google.common.collect.Maps;

import vip.yingmen.mapper.StGatageRDao;
import vip.yingmen.mapper.ZhaFaZhuangTaiGISMapper;
import vip.yingmen.pojo.StGatageR;
import vip.yingmen.pojo.ZhaFaZhuangTaiGIS;
import vip.yingmen.service.ZhaFaShuiQingGISService;
import vip.yingmen.service.ZhaFaZhuangTaiGISService;

import java.util.Map;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ZhaFaZhuangTaiGISController {
    @Autowired
    private ZhaFaZhuangTaiGISService zhaFaZhuangTaiGISService;
    @Autowired
    private ZhaFaZhuangTaiGISMapper zhaFaZhuangTaiGISMapper;
    @Autowired
    private StGatageRDao stGatageRDao;
    
    //闸阀状态的gis第一滑框实时数据
    @PostMapping(value = "/zhafazhuangtai/gis")
    public Map findByZhaFaZhuangTaiGIS(@RequestBody(required = false) Map searchMap){
        return zhaFaZhuangTaiGISService.findByZhaFaZhuangTaiGIS(searchMap);
    }

    //闸阀状态的gis第一滑框实时数据
    @GetMapping(value = "/zhafazhuangtai/gis")
    public Map findByZhaFaZhuangTaiGIS(){
        return zhaFaZhuangTaiGISService.findByZhaFaZhuangTaiGIS();
    }
    @GetMapping(value = "/zhafazhuangtai/gis/one")
    public Map<String, Object> findByZhaFaZhuangTaiGIS(@RequestParam String stcd){
    	StGatageR stGatageR = this.stGatageRDao.selectById(stcd);
    	ZhaFaZhuangTaiGIS gis8= this.zhaFaZhuangTaiGISMapper.findByZhaFaZhuangTaiGIS8(stcd);
		if (gis8 == null) {
			this.zhaFaZhuangTaiGISMapper.findByZhaFaZhuangTaiGISByOther(stcd);	
		}
		Map<String, Object> resMap = Maps.newHashMap();
		resMap.put("gatageR", stGatageR);
		resMap.put("zhaFaZhuangTaiGIS8", gis8);
		return resMap;
    }
}
