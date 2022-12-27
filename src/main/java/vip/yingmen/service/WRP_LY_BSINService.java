package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WRP_LY_BSIN;

public interface WRP_LY_BSINService {
    //根据CTCD查询基础数据流域信息
    public PageInfo<WRP_LY_BSIN> findByCTCD(String CTCD);
}
