package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.WRP_IrrBSManageInstitutionMapper;
import vip.yingmen.pojo.WRP_IrrBSManageInstitution;
import vip.yingmen.service.WRP_IrrBSManageInstitutionService;

import java.util.List;

@Service
public class WRP_IrrBSManageInstitutionServiceImpl implements WRP_IrrBSManageInstitutionService {
    @Autowired
    private WRP_IrrBSManageInstitutionMapper    wrpIrrBSManageInstitutionMapper;
    //基础数据的灌区管理机构查询
    @Override
    public PageInfo<WRP_IrrBSManageInstitution> findAll(Integer _page,Integer _page_size,String Organ_Name) {
        PageHelper.startPage(_page,_page_size);
        List<WRP_IrrBSManageInstitution> all = wrpIrrBSManageInstitutionMapper.findAll(Organ_Name);
        PageInfo<WRP_IrrBSManageInstitution> wrp_irrBSManageInstitutionPageInfo = new PageInfo<>(all);
        return wrp_irrBSManageInstitutionPageInfo;
    }
}
