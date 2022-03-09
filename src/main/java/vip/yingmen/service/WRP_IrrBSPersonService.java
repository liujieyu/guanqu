package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WRP_IrrBSPerson;

public interface WRP_IrrBSPersonService {
    //基础数据的灌区人员基本信息查询
    public PageInfo<WRP_IrrBSPerson> findAll(Integer _page,Integer _page_size,String Post_Code,String Sex,String Positional_Title,String Educastional_Level,String Personal_Name,String _orderby);
}
