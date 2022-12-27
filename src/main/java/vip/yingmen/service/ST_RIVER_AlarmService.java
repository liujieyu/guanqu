package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_RIVER_Alarm;

public interface ST_RIVER_AlarmService {
    //根据STCD查找
    public PageInfo<ST_RIVER_Alarm> findBySTCD(Integer _page, Integer _page_size,String STCD);
}
