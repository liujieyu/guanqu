package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_MCanal_C;

public interface ST_MCanal_CService {
    //渠道水情gis第二滑框的月列表查询
    public PageInfo<ST_MCanal_C> findBySingleYue(Integer _page, Integer _page_size, String STCD, String _orderby, String Time_min, String Time_max);
}
