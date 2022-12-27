/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCJZWServiceImpl
 * Author:   user
 * Date:     2019/8/12 10:12
 * Description: 基础数据的建筑物
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcJzwMapper;
import vip.yingmen.pojo.*;
import vip.yingmen.service.JCJZWService;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础数据的建筑物〉
 *
 * @author user
 * @create 2019/8/12
 * @since 1.0.0
 */
@Service
public class JCJZWServiceImpl implements JCJZWService {
    @Autowired
    private JcJzwMapper jcjzWmapper;

    @Override
    public PageInfo<JCJZWDuCao> findByDuCao(Integer page, Integer pageSize, String orderBy, String matieralType, String flumBodyType, String canalCode, String flumName) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JCJZWDuCao> byJianZhuWu = jcjzWmapper.findByDuCao(matieralType, flumBodyType, canalCode, flumName);
        PageInfo<JCJZWDuCao> pageInfo = new PageInfo<>(byJianZhuWu);
        return pageInfo;
    }

    @Override
    public PageInfo<JCJZWSuiDong> findBySuiDong(Integer page, Integer pageSize, String orderBy, String tunnelName, String canalCode) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JCJZWSuiDong> byJianZhuWu = jcjzWmapper.findBySuiDong( tunnelName, canalCode);
        PageInfo<JCJZWSuiDong> pageInfo = new PageInfo<>(byJianZhuWu);
        return pageInfo;
    }

    @Override
    public PageInfo<JCJZWDaoHongXi> findByDaoHongXi(Integer page, Integer pageSize, String orderBy, String isiphonName, String canalCode, String isiphonType, String structureType, String style) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JCJZWDaoHongXi> byJianZhuWu = jcjzWmapper.findByDaoHongXi(isiphonName, canalCode, isiphonType,structureType,style);
        PageInfo<JCJZWDaoHongXi> pageInfo = new PageInfo<>(byJianZhuWu);
        return pageInfo;
    }

    @Override
    public PageInfo<JCJZWHanDong> findByHanDong(Integer page, Integer pageSize, String orderBy, String culvertName, String canalCode, String entranceForm, String bodyType) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JCJZWHanDong> byJianZhuWu = jcjzWmapper.findByHanDong(culvertName, canalCode, entranceForm, bodyType);
        PageInfo<JCJZWHanDong> pageInfo = new PageInfo<>(byJianZhuWu);
        return pageInfo;
    }

    @Override
    public PageInfo<JCJZWDouPo> findByDouPo(Integer page, Integer pageSize, String orderBy, String chuteName, String canalCode) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JCJZWDouPo> byJianZhuWu = jcjzWmapper.findByDouPo( chuteName, canalCode);
        PageInfo<JCJZWDouPo> pageInfo = new PageInfo<>(byJianZhuWu);
        return pageInfo;
    }

    @Override
    public PageInfo<JCJZWChenShaDi> findByChenShaDi(Integer page, Integer pageSize, String orderBy, String dediBasinName, String canalCode) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JCJZWChenShaDi> byJianZhuWu = jcjzWmapper.findByChenShaDi( dediBasinName, canalCode);
        PageInfo<JCJZWChenShaDi> pageInfo = new PageInfo<>(byJianZhuWu);
        return pageInfo;
    }
}