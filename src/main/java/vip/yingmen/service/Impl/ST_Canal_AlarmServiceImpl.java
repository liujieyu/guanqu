package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_Canal_AlarmMapper;
import vip.yingmen.pojo.ST_Canal_Alarm;
import vip.yingmen.service.ST_Canal_AlarmService;

import java.util.List;


@Service
public class ST_Canal_AlarmServiceImpl implements ST_Canal_AlarmService {
    @Autowired
    private ST_Canal_AlarmMapper stCanalAlarmMapper;
    //根据STCD查询渠道水情预警信息
    @Override
    public PageInfo<ST_Canal_Alarm> findBySTCD(String STCD) {
        PageHelper.startPage(1,999999999);
        List<ST_Canal_Alarm> stCanalAlarmMapperAll = stCanalAlarmMapper.findBySTCD(STCD);
        PageInfo<ST_Canal_Alarm> pageInfo = new PageInfo<ST_Canal_Alarm>(stCanalAlarmMapperAll);
        return pageInfo;
    }
}
