package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_HP_C;

public interface ST_HP_CService {
    //雨情gis第二滑框的小时列表查询
    public PageInfo<ST_HP_C> findBySingleXiaoShi(Integer _page,Integer _page_size,String STCD,String Time_min,String Time_max,String _orderby);
}
