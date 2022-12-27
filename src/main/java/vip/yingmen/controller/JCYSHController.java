/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JCYSHController
 * Author:   dabindream
 * Description: 基础数据的用水户
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.JcyshGongYeYongShui;
import vip.yingmen.pojo.JcyshNonYeYongShui;
import vip.yingmen.pojo.JcyshYongShuiHu;
import vip.yingmen.service.JCYSHService;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础数据的用水户〉
 *
 * @author dabindream
 * @since 1.0.0
 */

@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JCYSHController {
    @Autowired
    private JCYSHService jcyshService;

    /**
     * 基础数据的用水户的用水户基本信息
     */
    @GetMapping(value = "/jichuyongshuihu/yongshuihu")
    public PageInfo<JcyshYongShuiHu> findByYongShuiHu(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                      @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                      @RequestParam(value = "_orderby", required = false) String orderBy,
                                                      @RequestParam(value = "Cell_Type", required = false) String cellType,
                                                      @RequestParam(value = "GS", required = false) String gs,
                                                      @RequestParam(value = "Cell_Name", required = false) String cellName) {
        return jcyshService.findByYongShuiHu(page, pageSize, orderBy,cellType, cellName, gs);
    }

    /**
     * 基础数据的用水户的农业用水单位基本信息
     */
    @GetMapping(value = "/jichuyongshuihu/nonyeyongshui")
    public PageInfo<JcyshNonYeYongShui> findByNonYeYongShui(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                            @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                            @RequestParam(value = "_orderby", required = false) String orderBy,
                                                            @RequestParam(value = "Cell_Name", required = false) String cellName,
                                                            @RequestParam(value = "Canal_Code", required = false) String canalCode,
                                                            @RequestParam(value = "AD_CD", required = false) String adcd) {
        return jcyshService.findByNonYeYongShui(page, pageSize, orderBy,cellName, canalCode, adcd);
    }

    /**
     * 基础数据的用水户的农业用水单位基本信息
     */
    @GetMapping(value = "/jichuyongshuihu/gongyeyongshui")
    public PageInfo<JcyshGongYeYongShui> findByGongYeYongShui(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                              @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                              @RequestParam(value = "_orderby", required = false) String orderBy,
                                                              @RequestParam(value = "Cell_Name", required = false) String cellName,
                                                              @RequestParam(value = "Canal_Code", required = false) String canalCode,
                                                              @RequestParam(value = "AD_CD", required = false) String adcd) {
        return jcyshService.findByGongYeYongShui(page, pageSize, orderBy,cellName, canalCode, adcd);
    }
}
