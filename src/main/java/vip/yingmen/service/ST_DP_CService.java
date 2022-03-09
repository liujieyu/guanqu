package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_DP_C;

public interface ST_DP_CService {
    //雨情gis的第二滑框的日列表查询
    public PageInfo<ST_DP_C> findBySingleRiBiao(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby);
}
