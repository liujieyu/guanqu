package vip.yingmen.mapper;

import vip.yingmen.pojo.WRP_IrrBFSource;

import java.util.List;

public interface WRP_IrrBFSourceMapper {
    //基础数据的水源信息查询
    public List<WRP_IrrBFSource> findByShuiYuanXinXi();
}
