package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.WRP_RVR_BSINMapper;
import vip.yingmen.pojo.WRP_RVR_BSIN;
import vip.yingmen.service.WRP_RVR_BSINService;

import java.util.List;


@Service
public class WRP_RVR_BSINServiceImpl implements WRP_RVR_BSINService {
    @Autowired
    private WRP_RVR_BSINMapper wrpRvrBsinMapper;
    //根据RVCD查询河流基本信息表
    @Override
    public PageInfo<WRP_RVR_BSIN> findByRVCD(String RVCD) {
        PageHelper.startPage(1,999999999);
        List<WRP_RVR_BSIN> wrpRvrBsins = wrpRvrBsinMapper.findByRVCD(RVCD);
        PageInfo<WRP_RVR_BSIN> pageInfo = new PageInfo<>(wrpRvrBsins);
        return pageInfo;
    }
}
