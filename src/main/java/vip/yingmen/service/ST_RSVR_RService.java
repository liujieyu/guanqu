package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_RSVR_R;

public interface ST_RSVR_RService {
    //水库水清第二gis滑框的历史列表查询
    public PageInfo<ST_RSVR_R> findBySingleLiShi(Integer _page,Integer _page_size,String STCD,String Time_min,String Time_max,String _orderby);
}
