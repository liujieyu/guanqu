package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.WRP_IrrBSPersonMapper;
import vip.yingmen.pojo.WRP_IrrBSPerson;
import vip.yingmen.service.WRP_IrrBSPersonService;

import java.util.List;

@Service
public class WRP_IrrBSPersonServiceImpl implements WRP_IrrBSPersonService {
    @Autowired
    private WRP_IrrBSPersonMapper wrpIrrBSPersonMapper;
    //基础数据的灌区人员基本信息查询
    @Override
    public PageInfo<WRP_IrrBSPerson> findAll(Integer _page, Integer _page_size,String Post_Code,String Sex,String Positional_Title,String Educastional_Level,String Personal_Name,String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WRP_IrrBSPerson> all = wrpIrrBSPersonMapper.findAll( Post_Code, Sex, Positional_Title, Educastional_Level, Personal_Name);
        PageInfo<WRP_IrrBSPerson> wrp_irrBSPersonPageInfo = new PageInfo<>(all);
        return wrp_irrBSPersonPageInfo;
    }
}
