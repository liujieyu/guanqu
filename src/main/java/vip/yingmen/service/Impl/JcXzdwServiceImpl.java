/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcXzdwServiceImpl
 * Author:   dabindream
 * Description: 基础数据的行政单位
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcXzdwMapper;
import vip.yingmen.pojo.JcXingZhengDanWei;
import vip.yingmen.service.JcXzdwService;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的行政单位〉
 *
 * @author dabindream
 * @since 1.0.0
 */
@Service
public class JcXzdwServiceImpl implements JcXzdwService {
    @Autowired
    private JcXzdwMapper jcXzdwMapper;
    @Override
    public PageInfo<JcXingZhengDanWei> findByXingZhengDanWei(Integer page, Integer pageSize, String orderBy, String adcd, String adlv, String adnm) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JcXingZhengDanWei> byXingZhengDanWei = jcXzdwMapper.findByXingZhengDanWei(adcd, adlv, adnm);
        PageInfo<JcXingZhengDanWei> pageInfo = new PageInfo<>(byXingZhengDanWei);
        return pageInfo;
    }
}