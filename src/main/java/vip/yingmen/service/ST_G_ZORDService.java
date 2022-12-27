package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_G_ZORD;

public interface ST_G_ZORDService {
    //根据STCD查找
    public PageInfo<ST_G_ZORD> findBySTCD(Integer _page, Integer _page_size, String STCD);
}
