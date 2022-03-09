/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcDmtController
 * Author:   dabindream
 * Description: 基础数据的多媒体信息
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.JcDuoMeiTi;
import vip.yingmen.service.JcDmtService;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础数据的多媒体信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JcDmtController {
    @Autowired
    private JcDmtService jcDmtService;
    /**
     * 基础数据的流域基本信息
     */
    @GetMapping(value = "/jcdmt/duomeiti")
    public PageInfo<JcDuoMeiTi> findByDuoMeiTi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                               @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                               @RequestParam(value = "_orderby", required = false) String orderBy,
                                               @RequestParam(value = "MATType", required = false) String mattype,
                                               @RequestParam(value = "MAT", required = false) String mat) {
        return jcDmtService.findByDuoMeiTi(  page,  pageSize,  orderBy,  mattype,  mat);
    }
}
