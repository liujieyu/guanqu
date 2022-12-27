package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_HCanal_C;

import java.util.List;

public interface ST_HCanal_CMapper {
    //渠道水情gis第二滑框的小时列表查询
    public List<ST_HCanal_C> findBySingleXiaoShi(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
