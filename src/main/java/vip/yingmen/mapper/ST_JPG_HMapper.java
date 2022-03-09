package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_JPG_H;

import java.util.List;

public interface ST_JPG_HMapper {
    //图像gis第二滑框的图像历史列表查询
    public List<ST_JPG_H> findBySingleLiShi(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
