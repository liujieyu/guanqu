package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_Gatage_H;

public interface ST_Gatage_HService {
    //闸阀状态gis第二滑框的闸阀门开度历史列表查询
    public PageInfo<ST_Gatage_H> findByZhaFaZhuangTai(Integer _page,Integer _page_size,String STCD,String Time_min,String Time_max,String _orderby);
}
