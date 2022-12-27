package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_Canal_Alarm;
import vip.yingmen.pojo.WRP_IrrBTCanalSystem;

public interface ST_Canal_AlarmService {
    //根据STCD查询渠道水情预警信息
    public PageInfo<ST_Canal_Alarm> findBySTCD(String STCD);
}
