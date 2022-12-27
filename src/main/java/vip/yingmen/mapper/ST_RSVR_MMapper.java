package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_RSVR_M;

import java.util.List;

public interface ST_RSVR_MMapper {
    //水库水情gis第二滑框月列表查询
    public List<ST_RSVR_M> findBySingleYue(@Param("STCD")String STCD,@Param("Time_min")String Time_min,@Param("Time_max")String Time_max);
}
