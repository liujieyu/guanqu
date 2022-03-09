package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WRP_IrrBFSource;

public interface WRP_IrrBFSourceService {
    //基础数据的水源信息查询
    public PageInfo<WRP_IrrBFSource> findByShuiYuanXinXi(Integer _page,Integer _page_size);
}
