package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JiChuShuJuQuDao;

import java.util.List;

public interface JcQdMapper {
    public List<JiChuShuJuQuDao> findByQuDao(@Param("Canal_Name") String Canal_Name, @Param("Canal_Code") String Canal_Code, @Param("User_Type") String User_Type, @Param("Canal_Level") String Canal_Level);
}
