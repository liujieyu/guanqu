package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_YRP_F;

import java.util.List;

public interface ST_YRP_FMapper {
    //雨情gis第二滑框的年列表查询
    public List<ST_YRP_F> findBySingleNian(@Param("STCD") String STCD,@Param("Time_min") String Time_min,@Param("Time_max") String Time_max);
}
