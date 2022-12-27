package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_RIVER_Alarm;

import java.util.List;

public interface ST_RIVER_AlarmMapper {
    //根据stcd条件查找
    public List<ST_RIVER_Alarm> findBySTCD(@Param("STCD") String STCD);
}
