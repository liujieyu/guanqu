package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_RIVER_R;

import java.util.List;

public interface ST_RIVER_RMapper {
    //河道水情gis的第二滑框历史列表查询
    public List<ST_RIVER_R> findByLiShi(@Param("STCD")String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
