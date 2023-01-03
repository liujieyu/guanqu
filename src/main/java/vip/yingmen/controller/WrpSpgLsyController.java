package vip.yingmen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import vip.yingmen.service.WrpSpgLsyService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liujieyu
 * @since 2023-01-03
 */
@RestController
@RequestMapping("/guanqu")
@CrossOrigin
public class WrpSpgLsyController {
    @Autowired
    private WrpSpgLsyService wrpSpgLsyService;
}
