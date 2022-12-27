package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_HWAS_C;

import java.util.List;

public interface ST_HWAS_CMapper {
    //闸阀水情gis第二滑框小时列表查询
    public List<ST_HWAS_C> findBySingleXiaoShi(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
