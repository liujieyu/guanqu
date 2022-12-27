package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_G_CQORD;

import java.util.Date;
import java.util.List;

public interface ST_G_CQORDMapper {
    //根据stcd查找
    public List<ST_G_CQORD> findBySTCD(@Param("STCD") String STCD, @Param("Time_min") Integer Time_min, @Param("Time_max") Integer Time_max);
}
