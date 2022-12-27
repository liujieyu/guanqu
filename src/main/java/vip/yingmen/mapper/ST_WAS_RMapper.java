package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_WAS_R;

import java.util.List;

public interface ST_WAS_RMapper {
    //闸阀水情gis第二滑框的历史列表查询
    public List<ST_WAS_R> findBySingleLiShi(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
