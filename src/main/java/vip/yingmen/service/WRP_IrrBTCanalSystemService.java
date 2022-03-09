package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WRP_IrrBTCanalSystem;

public interface WRP_IrrBTCanalSystemService {
    //基础数据的渠道查询
    public PageInfo<WRP_IrrBTCanalSystem> findAll(Integer _page,Integer _page_size);
}
