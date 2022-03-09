package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.ST_STBPRP_B;
import vip.yingmen.service.ST_STBPRP_BService;

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class ST_STBPRP_BController {
    @Autowired
    private ST_STBPRP_BService stStbprpBService;

    //查询全部
//    @GetMapping(value = "/admin/ST_STBPRP_B")
//    public List<ST_STBPRP_B> findAll(){
//        return stStbprpBService.findAll();
//    }
    //根据关联编号RelateCode来查询测站基本信息
    @GetMapping(value = "/admin/ST_STBPRP_B")
    public PageInfo<ST_STBPRP_B> findByRELATECODE(@RequestParam( value="RelateCode", required=false) String RelateCode){
        return stStbprpBService.findByRELATECODE(RelateCode);
    }
}
