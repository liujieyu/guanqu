package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_G_ZORD;

import java.util.List;

public interface ST_G_ZORDMapper {
    //根据stcd查找
    public List<ST_G_ZORD> findBySTCD(@Param("STCD") String STCD);
}
