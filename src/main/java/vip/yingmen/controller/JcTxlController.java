/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcTxlController
 * Author:   dabindream
 * Description: 基础数据的通讯录
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.JcTongXunLu;
import vip.yingmen.service.JcTxlService;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础数据的通讯录〉
 *
 * @author dabindream
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JcTxlController {
    @Autowired
    private JcTxlService jcTxlService;
    /**
     * 基础数据的通讯录基本信息
     */
    @GetMapping(value = "/jctxl/tongxunlu")
    public PageInfo<JcTongXunLu> findByJcLiuYuXinXi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                    @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                    @RequestParam(value = "_orderby", required = false) String orderBy,
                                                    @RequestParam(value = "GS", required = false) String gs,
                                                    @RequestParam(value = "TYPES", required = false) String types,
                                                    @RequestParam(value = "AD_CD", required = false) String adcd,
                                                    @RequestParam(value = "NM", required = false) String nm) {
        return jcTxlService.findByTongXunLu(  page,  pageSize,  orderBy, gs,  types,adcd,nm);
    }
}
