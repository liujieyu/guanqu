package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_RIVER_D;

public interface ST_RIVER_DService {
    //河道水情gis的第二滑框的日列表查询
    public PageInfo<ST_RIVER_D> findByRi(Integer _page, Integer _page_size, String STCD, String _orderby, String Time_min, String Time_max);
}
