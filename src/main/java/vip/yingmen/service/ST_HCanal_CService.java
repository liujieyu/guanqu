package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_HCanal_C;

public interface ST_HCanal_CService {
    //渠道水情gis第二滑框的小时列表查询
    public PageInfo<ST_HCanal_C> findBySingleXiaoShi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby);
}
