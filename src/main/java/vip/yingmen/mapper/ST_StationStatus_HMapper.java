package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_StationStatus_H;

import java.util.List;

public interface ST_StationStatus_HMapper {
    //运行工况gis第二滑框的历史列表查询
    public List<ST_StationStatus_H> findByYunXingGongKuang(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
