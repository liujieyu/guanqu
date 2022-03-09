package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ZhaFaShuiQingRiBiao;


public interface ZhaFaShuiQingRiBiaoService {
    //历史数据的闸阀水情日表查询
    public PageInfo<ZhaFaShuiQingRiBiao> findByZhaFaShuiQingRiBiao(Integer _page_size, Integer _page, String tm, String addvcd, String canal_code, String ctype, String stnm,String _orderby);
}
