/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JCJZWController
 * Author:   jiaowodabin
 * Date:     2019/8/12 10:10
 * Description: 基础数据的建筑物
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.*;
import vip.yingmen.service.JCJZWService;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础数据的建筑物〉
 *
 * @author user
 * @create 2019/8/9
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JCJZWController {
    @Autowired
    private JCJZWService jcjzwService;

    /**
     * 基础数据的建筑物渡槽基本信息
     */
    @GetMapping(value = "/jcjianzhuwu/ducao")
    public PageInfo<JCJZWDuCao> findByDuCao(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                            @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                            @RequestParam(value = "_orderby", required = false) String orderBy,
                                            @RequestParam(value = "Matieral_Type", required = false) String matieralType,
                                            @RequestParam(value = "FlumBody_Type", required = false) String flumBodyType,
                                            @RequestParam(value = "Canal_Code", required = false) String canalCode,
                                            @RequestParam(value = "Flum_Name", required = false) String flumName) {
        return jcjzwService.findByDuCao( page, pageSize, orderBy, matieralType, flumBodyType, canalCode,  flumName);
    }

    /**
     * 基础数据的建筑物隧洞基本信息
     * @param page
     * @param pageSize
     * @param orderBy
     * @param tunnelName
     * @param canalCode
     * @return
     */
    @GetMapping(value = "/jcjianzhuwu/suidong")
    public PageInfo<JCJZWSuiDong> findBySuiDong(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                @RequestParam(value = "_orderby", required = false) String orderBy,
                                                @RequestParam(value = "Tunnel_Name", required = false) String tunnelName,
                                                @RequestParam(value = "Canal_Code", required = false) String canalCode) {
        return jcjzwService.findBySuiDong( page, pageSize, orderBy, tunnelName, canalCode);
    }

    /**
     * 基础数据的建筑物倒虹吸基本信息
     */
    @GetMapping(value = "/jcjianzhuwu/daohongxi")
    public PageInfo<JCJZWDaoHongXi> findByDaoHongXi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                    @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                    @RequestParam(value = "_orderby", required = false) String orderBy,
                                                    @RequestParam(value = "I_Siphon_Name", required = false) String isiphonName,
                                                    @RequestParam(value = "Canal_Code", required = false) String canalCode,
                                                    @RequestParam(value = "I_Siphon_Type", required = false) String isiphonType,
                                                    @RequestParam(value = "Structure_Type", required = false) String structureType,
                                                    @RequestParam(value = "Style", required = false) String style) {
        return jcjzwService.findByDaoHongXi( page, pageSize, orderBy, isiphonName, canalCode,  isiphonType,structureType,style);
    }

    /**
     *  基础数据的建筑物涵洞基本信息
     */
    @GetMapping(value = "/jcjianzhuwu/handong")
    public PageInfo<JCJZWHanDong> findByHanDong(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                @RequestParam(value = "_orderby", required = false) String orderBy,
                                                @RequestParam(value = "Culvert_Name", required = false) String culvertName,
                                                @RequestParam(value = "Canal_Code", required = false) String canalCode,
                                                @RequestParam(value = "Entrance_Form", required = false) String entranceForm,
                                                @RequestParam(value = "Body_Type", required = false) String bodyType) {
        return jcjzwService.findByHanDong( page, pageSize, orderBy, culvertName, canalCode,  entranceForm,bodyType);
    }

    /**
     * 基础数据的建筑物陡坡基本信息
     */
    @GetMapping(value = "/jcjianzhuwu/doupo")
    public PageInfo<JCJZWDouPo> findByDouPo(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                            @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                            @RequestParam(value = "_orderby", required = false) String orderBy,
                                            @RequestParam(value = "Chute_Name", required = false) String chuteName,
                                            @RequestParam(value = "Canal_Code", required = false) String canalCode) {
        return jcjzwService.findByDouPo( page, pageSize, orderBy, chuteName,  canalCode);
    }

    /**
     * 基础数据的建筑物沉沙地基本信息
     */
    @GetMapping(value = "/jcjianzhuwu/chenshadi")
    public PageInfo<JCJZWChenShaDi> findByChenShaDi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                    @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                    @RequestParam(value = "_orderby", required = false) String orderBy,
                                                    @RequestParam(value = "DediBasin_Name", required = false) String dediBasinName,
                                                    @RequestParam(value = "Canal_Code", required = false) String canalCode) {
        return jcjzwService.findByChenShaDi( page, pageSize, orderBy, dediBasinName, canalCode);
    }
}
