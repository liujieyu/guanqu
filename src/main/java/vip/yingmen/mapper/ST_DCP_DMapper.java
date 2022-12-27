package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_DCP_D;

import java.util.List;

public interface ST_DCP_DMapper {
    //雨情gis第二滑框的旬列表查询
    public List<ST_DCP_D> findBySingleXun(@Param("STCD") String STCD,@Param("Time_min") String Time_min,@Param("Time_max") String Time_max,@Param("Time_min_1") String Time_min_1,@Param("Time_max_1") String Time_max_1);
}
