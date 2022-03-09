package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.QuDaoShuiQingRiBiao;


public interface QuDaoShuiQingRiBiaoService {
    //历史数据的渠道水情日表查询
    public PageInfo<QuDaoShuiQingRiBiao> findByQuDaoShuiQingRiBiao(Integer _page_size, Integer _page, String tm,  String addvcd,  String canal_code,  String stype,String stnm,String _orderby);
}
