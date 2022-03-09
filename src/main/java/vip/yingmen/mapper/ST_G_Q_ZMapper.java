package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_G_Q_Z;

import java.util.List;

public interface ST_G_Q_ZMapper {
    public List<ST_G_Q_Z> findBySTCD(@Param("STCD")String STCD);
}
