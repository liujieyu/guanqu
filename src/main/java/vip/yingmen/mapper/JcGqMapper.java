package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JiChuGuanQuJiBenXinXi;

import java.util.List;

public interface JcGqMapper {
    public List<JiChuGuanQuJiBenXinXi> findJiBenXinXi(@Param("IARHWPRTP")String IARHWPRTP,@Param("IRASC")String IRASC,@Param("IRANM")String IRANM);
}
