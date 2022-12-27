/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcXzdwController
 * Author:   dabindream
 * Description: 基础数据的行政单位
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.JcXingZhengDanWei;
import vip.yingmen.service.JcXzdwService;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础数据的行政单位〉
 *
 * @author dabindream
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JcXzdwController {
    @Autowired
    private JcXzdwService jcXzdwService;
    /**
     * 基础数据的行政单位基本信息
     */
    @GetMapping(value = "/jcxzdw/xingzhengdanwei")
    public PageInfo<JcXingZhengDanWei> findByXingZhengDanWei(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                             @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                             @RequestParam(value = "_orderby", required = false) String orderBy,
                                                             @RequestParam(value = "AD_CD", required = false) String adcd,
                                                             @RequestParam(value = "AD_LV", required = false) String adlv,
                                                             @RequestParam(value = "AD_NM", required = false) String adnm) {
        return jcXzdwService.findByXingZhengDanWei(  page,  pageSize,  orderBy,  adcd,  adlv,  adnm);
    }

}
