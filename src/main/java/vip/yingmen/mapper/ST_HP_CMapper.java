package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_HP_C;

import java.util.List;

public interface ST_HP_CMapper {
    //雨情gis第二滑框的小时列表查询
    public List<ST_HP_C> findBySingleXiaoShi(@Param("STCD") String STCD,@Param("Time_min") String Time_min,@Param("Time_max") String Time_max);
}
