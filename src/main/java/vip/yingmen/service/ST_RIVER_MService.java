package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_RIVER_M;

public interface ST_RIVER_MService {
    //河道水情gis第二滑框的月列表查询
    public PageInfo<ST_RIVER_M> findByYue(Integer _page, Integer _page_size, String STCD, String _orderby, String Time_min, String Time_max);
}
