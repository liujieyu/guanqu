package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_RIVER_D;

import java.util.List;

public interface ST_RIVER_DMapper {
    //河道水情gis的第二滑框的日列表查询
    public List<ST_RIVER_D> findByRi(@Param("STCD")String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
