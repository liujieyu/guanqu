package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_RSVR_R;

import java.util.List;

public interface ST_RSVR_RMapper {
    //水库水清第二gis滑框的历史列表查询
    public List<ST_RSVR_R> findBySingleLiShi(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
