package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.LiShiYunXingGongKuang;

import java.util.List;

public interface LsYxgkMapper {
    public List<LiShiYunXingGongKuang> findByYunXingGongKuang(@Param("STCD") String STCD,@Param("Time_min") String Time_min, @Param("Time_max")String Time_max);
}
