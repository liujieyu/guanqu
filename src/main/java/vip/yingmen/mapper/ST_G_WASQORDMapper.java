package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_G_WASQORD;

import java.util.List;

public interface ST_G_WASQORDMapper {
    public List<ST_G_WASQORD> findBySTCDAndYR(@Param("STCD")String STCD,@Param("YR_min")String YR_min,@Param("YR_max")String YR_max);
}
