package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_RIVER_AlarmMapper;
import vip.yingmen.mapper.ST_RSV_AlarmMapper;
import vip.yingmen.pojo.ST_RIVER_Alarm;
import vip.yingmen.pojo.ST_RSV_Alarm;
import vip.yingmen.service.ST_RIVER_AlarmService;
import vip.yingmen.service.ST_RSV_AlarmService;

import java.util.List;

@Service
public class ST_RSV_AlarmServiceImpl implements ST_RSV_AlarmService {
    @Autowired
    private ST_RSV_AlarmMapper stRsvAlarmMapper;
    //根据stcd查询
    @Override
    public PageInfo<ST_RSV_Alarm> findBySTCD(Integer _page, Integer _page_size, String STCD) {
        PageHelper.startPage(_page,_page_size);
        List<ST_RSV_Alarm> bySTCD = stRsvAlarmMapper.findBySTCD(STCD);
        PageInfo<ST_RSV_Alarm> stRsvAlarmPageInfo = new PageInfo<>(bySTCD);
        return stRsvAlarmPageInfo;
    }
}
