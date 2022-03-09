package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_RSVR_D;

import java.util.List;

public interface ST_RSVR_DMapper {
    //水库水情gis的第二滑框的日列表查询
    public List<ST_RSVR_D> findBySingleRi(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
