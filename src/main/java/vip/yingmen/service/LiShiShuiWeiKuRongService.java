package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.LiShiShuiWeiKuRongLieBiao;


public interface LiShiShuiWeiKuRongService {
    //历史数据的水位库容列表查询
    public PageInfo<LiShiShuiWeiKuRongLieBiao> findByLieBiao(Integer _page_size, Integer _page, String ADDVCD, String Canal_Code, String LEVEL, String STGR, String STNM, String _orderby);

}
