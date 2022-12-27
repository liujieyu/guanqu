package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.QuDaoShuiQingLiShiBiao;


public interface QuDaoShuiQingLiShiBiaoService {
    //历史数据的渠道水情历史表查询
    public PageInfo<QuDaoShuiQingLiShiBiao> findByQuDaoShuiQingLiShiBiao(Integer _page_size, Integer _page, String Time_min, String Time_max, String STCD, String _orderby);
}
