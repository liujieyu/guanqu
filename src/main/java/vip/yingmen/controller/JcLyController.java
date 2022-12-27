/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcLyController
 * Author:   dabindream
 * Description: 基础信息的流域信息
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.yingmen.pojo.JcLiuYuXinXi;
import vip.yingmen.service.JcLyService;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础信息的流域信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/guanqu")
@CrossOrigin
public class JcLyController {
    @Autowired
    private JcLyService jcLyService;
    /**
     * 基础数据的流域基本信息
     */
    @GetMapping(value = "/jcly/liuyuxinxi")
    public PageInfo<JcLiuYuXinXi> findByJcLiuYuXinXi(@RequestParam(value = "_page", required = false, defaultValue = "1") Integer page,
                                                     @RequestParam(value = "_page_size", required = false, defaultValue = "999999") Integer pageSize,
                                                     @RequestParam(value = "_orderby", required = false) String orderBy,
                                                     @RequestParam(value = "GS", required = false) String gs,
                                                     @RequestParam(value = "CTNM", required = false) String ctnm) {
        return jcLyService.findByJcLiuYuXinXi(  page,  pageSize,  orderBy,  gs,  ctnm);
    }
}
