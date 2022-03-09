package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ShuiKuShuiQingLiShiBiao;
import vip.yingmen.pojo.ShuiKuShuiQingRiBiao;
import vip.yingmen.pojo.ShuiKuShuiQingYueBiao;
import vip.yingmen.pojo.ZhaFaShuiQingRiBiao;


public interface LiShiShuiKuShuiQingService {
    //历史数据的水库水情日表查询
    public PageInfo<ShuiKuShuiQingRiBiao> findByShuiKuShuiQingRiBiao(Integer _page_size, Integer _page, String TM, String ADDVCD, String Canal_Code, String LEVEL, String STGR, String STNM, String _orderby);

    //历史数据的水库水情月表查询
    public PageInfo<ShuiKuShuiQingYueBiao> findByShuiKuShuiQingYueBiao(Integer _page_size, Integer _page, String YR,String MON, String ADDVCD, String Canal_Code, String LEVEL, String STGR, String STNM, String _orderby);

    //历史数据的水库水情历史表查询
    public PageInfo<ShuiKuShuiQingLiShiBiao> findByShuiKuShuiQingLiShiBiao(Integer _page_size, Integer _page, String Time_min, String Time_max, String STCD, String _orderby);
}
