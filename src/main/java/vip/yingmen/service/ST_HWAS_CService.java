package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_HWAS_C;

public interface ST_HWAS_CService {
    //闸阀水情gis第二滑框小时列表查询
    public PageInfo<ST_HWAS_C> findBySingleXiaoShi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby);
}
