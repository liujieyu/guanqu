package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_RSV_Alarm;

public interface ST_RSV_AlarmService {
    //根据stcd查询
    public PageInfo<ST_RSV_Alarm> findBySTCD(Integer _page, Integer _page_size, String STCD);
}
