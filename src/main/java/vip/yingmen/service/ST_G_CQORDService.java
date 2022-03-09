package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_G_CQORD;
import vip.yingmen.pojo.ST_RIVER_Alarm;

public interface ST_G_CQORDService {
    //根据STCD查找
    public PageInfo<ST_G_CQORD> findBySTCD(Integer _page, Integer _page_size, String STCD,String YR);
}
