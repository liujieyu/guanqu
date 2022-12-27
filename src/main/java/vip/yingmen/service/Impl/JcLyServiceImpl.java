/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcLyServiceImpl
 * Author:   dabindream
 * Description: 基础数据的流域信息
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcLyMapper;
import vip.yingmen.pojo.JcLiuYuXinXi;
import vip.yingmen.service.JcLyService;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的流域信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
@Service
public class JcLyServiceImpl implements JcLyService {
    @Autowired
    private JcLyMapper jcLyMapper;
    @Override
    public PageInfo<JcLiuYuXinXi> findByJcLiuYuXinXi(Integer page, Integer pageSize, String orderBy, String gs, String ctnm) {
        PageHelper.startPage(page, pageSize, orderBy);
        List<JcLiuYuXinXi> byJcLiuYuXinXi = jcLyMapper.findByJcLiuYuXinXi(gs, ctnm);
        PageInfo<JcLiuYuXinXi> pageInfo = new PageInfo<>(byJcLiuYuXinXi);
        return pageInfo;
    }
}