package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_Canal_Alarm;

import java.util.List;

public interface ST_Canal_AlarmMapper {
    //根据STCD查询渠道水情预警信息
    public List<ST_Canal_Alarm> findBySTCD(@Param("STCD") String STCD);
}
