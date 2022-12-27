package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WRP_IrrBSManageInstitution;

public interface WRP_IrrBSManageInstitutionService {
    //基础数据的灌区管理机构查询
    public PageInfo<WRP_IrrBSManageInstitution> findAll(Integer _page,Integer _page_size,String Organ_Name);
}
