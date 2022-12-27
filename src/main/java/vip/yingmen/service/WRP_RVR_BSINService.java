package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WRP_RVR_BSIN;

public interface WRP_RVR_BSINService {
    //根据RVCD查询河流基本信息表
    public PageInfo<WRP_RVR_BSIN> findByRVCD(String RVCD);
}
