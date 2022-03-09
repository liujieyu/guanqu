package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_G_Q_Z;

public interface ST_G_Q_ZService {
    //根据STCD查找
    public PageInfo<ST_G_Q_Z> findBySTCD(Integer _page, Integer _page_size, String STCD);
}
