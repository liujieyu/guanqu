package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_RIVER_AlarmMapper;
import vip.yingmen.pojo.ST_RIVER_Alarm;
import vip.yingmen.service.ST_RIVER_AlarmService;

import java.util.List;

@Service
public class ST_RIVER_AlarmServiceImpl implements ST_RIVER_AlarmService {
    @Autowired
    private ST_RIVER_AlarmMapper stRiverAlarmMapper;
    //根据stcd查询
    @Override
    public PageInfo<ST_RIVER_Alarm> findBySTCD(Integer _page, Integer _page_size, String STCD) {
        PageHelper.startPage(_page,_page_size);
        List<ST_RIVER_Alarm> bySTCD = stRiverAlarmMapper.findBySTCD(STCD);
        PageInfo<ST_RIVER_Alarm> stRiverAlarmPageInfo = new PageInfo<>(bySTCD);
        return stRiverAlarmPageInfo;
    }
}
