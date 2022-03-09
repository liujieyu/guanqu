/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcTxlServiceImpl
 * Author:   dabindream
 * Description: 基础数据的通讯录
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcTxlMapper;
import vip.yingmen.pojo.JcTongXunLu;
import vip.yingmen.service.JcTxlService;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的通讯录〉
 *
 * @author dabindream
 * @since 1.0.0
 */
@Service
public class JcTxlServiceImpl implements JcTxlService {
    @Autowired
    private JcTxlMapper jcTxlMapper;
    @Override
    public PageInfo<JcTongXunLu> findByTongXunLu(Integer page, Integer pageSize, String orderBy, String gs, String types, String adcd, String nm) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JcTongXunLu> byTongXunLu = jcTxlMapper.findByTongXunLu(gs, types,adcd,nm);
        PageInfo<JcTongXunLu> pageInfo = new PageInfo<>(byTongXunLu);
        return pageInfo;
    }
}