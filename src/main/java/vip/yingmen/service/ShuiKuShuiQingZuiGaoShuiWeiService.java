package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ShuiKuShuiQingZuiGaoShuiWei;

public interface ShuiKuShuiQingZuiGaoShuiWeiService {
    //历史数据的水库水情的最高水位查询
    public PageInfo<ShuiKuShuiQingZuiGaoShuiWei> findByZuiGaoShuiWei(Integer _page, Integer _page_size, String yr, String addvcd, String stgr, String stnm, String _orderby);
}
