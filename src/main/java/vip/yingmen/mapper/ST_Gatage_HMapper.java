package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_Gatage_H;

import java.util.Date;
import java.util.List;

public interface ST_Gatage_HMapper {
    //闸阀状态gis第二滑框的闸阀门开度历史列表查询
    public List<ST_Gatage_H> findByZhaFaZhuangTai(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
