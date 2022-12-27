package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ZhaFaShuiQingLiShiBiao;


public interface ZhaFaShuiQingLiShiBiaoService {
    //历史数据的闸阀水情历史表查询
    public PageInfo<ZhaFaShuiQingLiShiBiao> findByZhaFaShuiQingLiShiBiao(Integer _page_size, Integer _page, String Time_min,String Time_max, String stcd, String _orderby);
}
