package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_DP_C;

import java.util.List;

public interface ST_DP_CMapper {
    //雨情gis的第二滑框的日列表查询
    public List<ST_DP_C> findBySingleRiBiao(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
