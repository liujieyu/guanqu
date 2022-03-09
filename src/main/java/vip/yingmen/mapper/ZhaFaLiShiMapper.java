package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ZhaFaKaiDuLiShi;
import vip.yingmen.pojo.ZhaFaLiShiZhaMen;

import java.util.List;

public interface ZhaFaLiShiMapper {
    public List<ZhaFaKaiDuLiShi> findByKaiDu(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max")String Time_max);

    public List<ZhaFaLiShiZhaMen> findByZhaMen(@Param("STCD") String STCD, @Param("Time_min") String Time_min, @Param("Time_max")String Time_max);
}
