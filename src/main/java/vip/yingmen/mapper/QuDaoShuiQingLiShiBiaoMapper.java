package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.QuDaoShuiQingLiShiBiao;

import java.util.List;

public interface QuDaoShuiQingLiShiBiaoMapper {
    public List<QuDaoShuiQingLiShiBiao> findByLiShiBiao( @Param("Time_min") String Time_min, @Param("Time_max") String Time_max,@Param("STCD") String STCD);
}
