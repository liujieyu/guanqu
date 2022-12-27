/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JCYSHServiceImpl
 * Author:   dabindream
 * Description: 基础数据的用水户
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcYshMapper;
import vip.yingmen.pojo.JcyshGongYeYongShui;
import vip.yingmen.pojo.JcyshNonYeYongShui;
import vip.yingmen.pojo.JcyshYongShuiHu;
import vip.yingmen.service.JCYSHService;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的用水户〉
 *
 * @author dabindream
 * @since 1.0.0
 */
@Service
public class JCYSHServiceImpl implements JCYSHService {
    @Autowired
    private JcYshMapper jcyshMapper;
    @Override
    public PageInfo<JcyshYongShuiHu> findByYongShuiHu(Integer page, Integer pageSize, String orderBy, String cellType, String cellName, String gs) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JcyshYongShuiHu> byYongShuiHu = jcyshMapper.findByYongShuiHu(cellType, cellName, gs);
        PageInfo<JcyshYongShuiHu> pageInfo = new PageInfo<>(byYongShuiHu);
        return pageInfo;
    }

    @Override
    public PageInfo<JcyshNonYeYongShui> findByNonYeYongShui(Integer page, Integer pageSize, String orderBy, String canalCode, String cellName, String adcd) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JcyshNonYeYongShui> byNonYeYongShui = jcyshMapper.findByNonYeYongShui(canalCode, cellName, adcd);
        PageInfo<JcyshNonYeYongShui> pageInfo = new PageInfo<>(byNonYeYongShui);
        return pageInfo;
    }

    @Override
    public PageInfo<JcyshGongYeYongShui> findByGongYeYongShui(Integer page, Integer pageSize, String orderBy, String canalCode, String cellName, String adcd) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JcyshGongYeYongShui> byGongYeYongShui = jcyshMapper.findByGongYeYongShui(canalCode, cellName, adcd);
        PageInfo<JcyshGongYeYongShui> pageInfo = new PageInfo<>(byGongYeYongShui);
        return pageInfo;
    }
}