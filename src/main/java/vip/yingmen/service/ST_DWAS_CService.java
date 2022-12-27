package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_DWAS_C;
import vip.yingmen.pojo.ST_RSVR_D;

public interface ST_DWAS_CService {
    //闸阀水情gis第二滑框的日列表查询
    public PageInfo<ST_DWAS_C> findBySingleRi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby);
}
