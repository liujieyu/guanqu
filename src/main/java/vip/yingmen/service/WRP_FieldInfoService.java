package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WRP_FieldInfo;

public interface WRP_FieldInfoService {
    //查询基本信息基础数据
    public PageInfo<WRP_FieldInfo> findByJiBenXinXi(Integer _page, Integer _page_size, String FieldID);

    //查询基本信息基础数据
    public PageInfo<WRP_FieldInfo> findByShuiKuShuiQingLevle(Integer _page, Integer _page_size, String FieldID);
}
