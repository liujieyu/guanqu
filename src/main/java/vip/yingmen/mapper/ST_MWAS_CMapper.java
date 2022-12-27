package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_MWAS_C;

import java.util.List;

public interface ST_MWAS_CMapper {
    //闸阀水情gis第二滑框的月列表查询
    public List<ST_MWAS_C> findBySingleYue(@Param("STCD")String STCD, @Param("Time_min")String Time_min, @Param("Time_max")String Time_max);
}
