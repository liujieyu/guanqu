package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.YuQingTongJiGIS;

import java.util.List;

public interface YuQingTongJiGISMapper {
    public YuQingTongJiGIS findByXiaoShi(@Param("STCD") String STCD, @Param("Time_min")String Time_min,@Param("Time_max") String Time_max);

    public YuQingTongJiGIS findByRi(@Param("STCD") String STCD, @Param("Time_min")String Time_min,@Param("Time_max") String Time_max);

    public YuQingTongJiGIS findByXun(@Param("STCD") String STCD, @Param("Time_min")String Time_min,@Param("Time_max") String Time_max);

    public YuQingTongJiGIS findByYue(@Param("STCD") String STCD, @Param("Time_min")String Time_min,@Param("Time_max") String Time_max);

    public YuQingTongJiGIS findByNian(@Param("STCD") String STCD, @Param("Time_min")String Time_min,@Param("Time_max") String Time_max);
}
