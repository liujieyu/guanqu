package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_MTP_E;

public interface ST_MTP_EService {
    //雨情gis第二滑框月列表查询
    public PageInfo<ST_MTP_E> findBySingleYue(Integer _page, Integer _page_size, String STCD, String _orderby,String Time_min,String Time_max);
}
