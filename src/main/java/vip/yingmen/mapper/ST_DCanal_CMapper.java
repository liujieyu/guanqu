package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_DCanal_C;

import java.util.List;

public interface ST_DCanal_CMapper {
    //渠道水情gis第二滑框的日列表查询
    public List<ST_DCanal_C> findBySingleRi(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
