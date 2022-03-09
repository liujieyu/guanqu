package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_PPTN_R;

public interface ST_PPTN_RService {
    //雨情第二gis滑框的历史列表查询
    public PageInfo<ST_PPTN_R> findBySingleLiShi(Integer _page, Integer _page_size, String STCD);
}
