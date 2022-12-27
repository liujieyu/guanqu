package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_DCanal_C;

public interface ST_DCanal_CService {

    //渠道水情gis第二滑框的日列表查询
    public PageInfo<ST_DCanal_C> findBySingleRi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby);
}
