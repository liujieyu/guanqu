package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.WRP_IrrBSManageInstitution;

import java.util.List;

public interface WRP_IrrBSManageInstitutionMapper {
    //基础数据的灌区管理机构查询
    public List<WRP_IrrBSManageInstitution> findAll(@Param("Organ_Name")String Organ_Name);
}
