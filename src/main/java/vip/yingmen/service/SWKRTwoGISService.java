package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.SWKRTwoGIS;

public interface SWKRTwoGISService {
    public PageInfo<SWKRTwoGIS> findByTwoGIS(Integer _page, Integer _page_size, String _orderby, String STCD, String Time_min, String Time_max);
}
