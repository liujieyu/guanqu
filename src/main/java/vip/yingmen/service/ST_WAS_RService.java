package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_WAS_R;

public interface ST_WAS_RService {
    //闸阀水情gis第二滑框的历史列表查询
    public PageInfo<ST_WAS_R> findBySingleLiShi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby);
}
