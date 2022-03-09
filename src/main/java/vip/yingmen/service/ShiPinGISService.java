package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ShiPinFuZhu;
import vip.yingmen.pojo.ShiPinGIS;

import java.util.Map;

public interface ShiPinGISService {
    //视频gis列表实时查询
    public Map findByShiPinGIS(Map searchMap);

    //视频gis列表实时查询
    public Map findByShiPinGIS();


    public PageInfo<ShiPinFuZhu> findByShiPin(Integer _page, Integer _page_size, String stcd);
}
