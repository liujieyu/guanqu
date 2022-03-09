package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_ZQRL_B;

import java.util.List;

public interface ST_ZQRL_BMapper {
    //根据stcd查找
    public List<ST_ZQRL_B> findBySTCD(@Param("STCD")String STCD);
}
