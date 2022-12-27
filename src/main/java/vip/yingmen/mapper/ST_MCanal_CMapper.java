package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_MCanal_C;

import java.util.List;

public interface ST_MCanal_CMapper {
    //渠道水情gis第二滑框月列表查询
    public List<ST_MCanal_C> findBySingleYue(@Param("STCD")String STCD, @Param("Time_min")String Time_min, @Param("Time_max")String Time_max);
}
