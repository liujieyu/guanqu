package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_RIVER_H;

public interface ST_RIVER_HService {
    //河道水情gis第二滑框的小时列表查询
    public PageInfo<ST_RIVER_H> findByXiaoShi(Integer _page, Integer _page_size, String STCD, String _orderby, String Time_min, String Time_max);
}
