package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcJczdMapper;
import vip.yingmen.pojo.JiChuJianCeZhanDian;
import vip.yingmen.service.JiChuJianCeZhanDianService;

import java.util.List;

@Service
public class JiChuJianCeZhanDianServiceImpl implements JiChuJianCeZhanDianService {
    @Autowired
    private JcJczdMapper jcJczdMapper;

    //查询基础数据的灌区基本信息
    @Override
    public PageInfo<JiChuJianCeZhanDian> findByJianCeZhanDian(Integer _page, Integer _page_size, String _orderby, String STNM, String ADDVCD, String Canal_Code, String STTP, String STGR, String TYPE) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<JiChuJianCeZhanDian> byJianCeZhanDian = jcJczdMapper.findByJianCeZhanDian(STNM, ADDVCD, Canal_Code,STTP,STGR,TYPE);
        PageInfo<JiChuJianCeZhanDian> pageInfo = new PageInfo<>(byJianCeZhanDian);
        return pageInfo;
    }
}
