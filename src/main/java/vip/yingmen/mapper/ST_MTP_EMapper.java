package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_MTP_E;

import java.util.List;

public interface ST_MTP_EMapper {
    //雨情gis第二滑框月列表查询
    public List<ST_MTP_E> findBySingleYue(@Param("STCD")String STCD,@Param("Time_min") String Time_min,@Param("Time_max") String Time_max);
}
