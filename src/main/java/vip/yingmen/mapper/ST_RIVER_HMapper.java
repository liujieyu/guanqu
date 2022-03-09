package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_RIVER_H;

import java.util.List;

public interface ST_RIVER_HMapper {
    //河道水情gis第二滑框的小时列表查询
    public List<ST_RIVER_H> findByXiaoShi(@Param("STCD")String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
