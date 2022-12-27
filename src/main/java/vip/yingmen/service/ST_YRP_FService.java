package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_YRP_F;

public interface ST_YRP_FService {
    //雨情gis第二滑框的年列表查询
    public PageInfo<ST_YRP_F> findBySingleNian(Integer _page, Integer _page_size, String STCD, String _orderby,String Time_min,String Time_max);
}
