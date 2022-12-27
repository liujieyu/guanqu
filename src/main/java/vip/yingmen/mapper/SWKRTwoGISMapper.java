package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.SWKRTwoGIS;

import java.util.List;

public interface SWKRTwoGISMapper {
    public List<SWKRTwoGIS> findByTwoGIS(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max")String Time_max);
}
