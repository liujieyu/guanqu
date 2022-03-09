package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_ZQRL_B;

public interface ST_ZQRL_BService {
    //根据stcd查询
    public PageInfo<ST_ZQRL_B> findBySTCD(Integer _page, Integer _page_size, String STCD);
}
