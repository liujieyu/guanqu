package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_RIVER_M;

import java.util.List;

public interface ST_RIVER_MMapper {
    //河道水情gis第二滑框的月列表查询
    public List<ST_RIVER_M> findByYue(@Param("STCD")String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);

}
