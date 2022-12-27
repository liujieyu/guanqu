package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_RSV_Alarm;

import java.util.List;

public interface ST_RSV_AlarmMapper {
    public List<ST_RSV_Alarm> findBySTCD(@Param("STCD") String STCD);
}
