package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_G_WASQORD;

public interface ST_G_WASQORDService {
    //根据STCD和时间查找
    public PageInfo<ST_G_WASQORD> findBySTCDAndYR(Integer _page, Integer _page_size, String STCD,String YR_min,String YR_max);
}
