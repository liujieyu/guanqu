package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_RSVR_H;

public interface ST_RSVR_HService {
    //水库水情gis第二滑框小时列表查询
    public PageInfo<ST_RSVR_H> findBySingleXiaoShi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby);
}
