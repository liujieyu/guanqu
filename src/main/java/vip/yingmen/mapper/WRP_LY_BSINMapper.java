package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.WRP_LY_BSIN;

import java.util.List;

public interface WRP_LY_BSINMapper {
    //根据CTCD查询基础数据流域信息
    public List<WRP_LY_BSIN> findByCTCD(@Param("CTCD") String CTCD);
}
