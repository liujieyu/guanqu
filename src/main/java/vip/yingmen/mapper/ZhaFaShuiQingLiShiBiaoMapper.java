package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ZhaFaShuiQingLiShiBiao;

import java.util.List;

public interface ZhaFaShuiQingLiShiBiaoMapper {
    public List<ZhaFaShuiQingLiShiBiao> findByLiShiBiao(@Param("Time_min") String Time_min,@Param("Time_max") String Time_max,@Param("STCD") String STCD);
}
