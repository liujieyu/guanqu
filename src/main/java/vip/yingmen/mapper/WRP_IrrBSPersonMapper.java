package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.WRP_IrrBSPerson;

import java.util.List;

public interface WRP_IrrBSPersonMapper {
    //基础数据的灌区人员基本信息查询
    public List<WRP_IrrBSPerson> findAll(@Param("Post_Code") String Post_Code,@Param("Sex")String Sex,@Param("Positional_Title") String Positional_Title,@Param("Educastional_Level") String Educastional_Level, @Param("Personal_Name")String Personal_Name);
}
