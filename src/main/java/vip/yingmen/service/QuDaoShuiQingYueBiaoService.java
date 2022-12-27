package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.QuDaoShuiQingYueBiao;

import java.util.List;

public interface QuDaoShuiQingYueBiaoService {
    //历史数据的渠道水情月表查询
    public PageInfo<QuDaoShuiQingYueBiao> findByYueBiao(Integer _page,Integer _page_size,String ye, String mon, String addvcd, String canal_code, String stype, String stnm);
}
