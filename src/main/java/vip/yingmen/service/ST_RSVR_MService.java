package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_RSVR_M;

public interface ST_RSVR_MService {
    //水库水情gis第二滑框月列表查询
    public PageInfo<ST_RSVR_M> findBySingleYue(Integer _page, Integer _page_size, String STCD, String _orderby,String Time_min,String Time_max);
}
