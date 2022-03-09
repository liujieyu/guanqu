/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcDmtServiceImpl
 * Author:   dabindream
 * Description: 基础数据的多媒体信息
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcDmtMapper;
import vip.yingmen.pojo.JcDuoMeiTi;
import vip.yingmen.service.JcDmtService;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的多媒体信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
@Service
public class JcDmtServiceImpl implements JcDmtService {
    @Autowired
    private JcDmtMapper jcDmtMapper;
    @Override
    public PageInfo<JcDuoMeiTi> findByDuoMeiTi(Integer page, Integer pageSize, String orderBy, String mattype, String mat) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JcDuoMeiTi> byDuoMeiTi = jcDmtMapper.findByDuoMeiTi(mattype, mat);
        PageInfo<JcDuoMeiTi> pageInfo = new PageInfo<>(byDuoMeiTi);
        return pageInfo;
    }
}