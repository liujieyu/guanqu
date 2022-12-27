package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.WRP_AD_BMapper;
import vip.yingmen.pojo.WRP_AD_B;
import vip.yingmen.service.WRP_AD_BService;

import java.util.List;

@Service
public class WRP_AD_BServiceImpl implements WRP_AD_BService {
    @Autowired
    private WRP_AD_BMapper wrpAdBMapper;

    @Override
    public List<WRP_AD_B> findAll() {
        return wrpAdBMapper.findAll();
    }

    //根据AD_CD查询全部行政区划表
    @Override
    public PageInfo<WRP_AD_B> findByAD_CD(String AD_CD) {
        PageHelper.startPage(1,999999999);
        List<WRP_AD_B> byADCd = wrpAdBMapper.findByAD_CD(AD_CD);
        PageInfo<WRP_AD_B> tPageInfo = new PageInfo<>(byADCd);
        return tPageInfo;
    }
}
