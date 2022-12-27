package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.WRP_RVR_BSIN;

import java.util.List;

public interface WRP_RVR_BSINMapper {
    //根据RVCD查询河流基本信息表
    public List<WRP_RVR_BSIN> findByRVCD(@Param("RVCD") String RVCD);
}
