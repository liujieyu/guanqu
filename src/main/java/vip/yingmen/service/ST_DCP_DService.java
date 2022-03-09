package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_DCP_D;

public interface ST_DCP_DService {
    //雨情gis第二滑框的旬列表查询
    public PageInfo<ST_DCP_D> findBySingleXun(Integer _page, Integer _page_size, String STCD, String _orderby, String Time_min, String Time_max);
}
