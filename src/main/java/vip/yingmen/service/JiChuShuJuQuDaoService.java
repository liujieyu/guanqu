package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.JiChuShuJuQuDao;

public interface JiChuShuJuQuDaoService {

    //查询基础数据的渠道JiChuShuJuQuDaoServer信息
    public PageInfo<JiChuShuJuQuDao> findByQuDao(Integer _page, Integer _page_size, String _orderby, String Canal_Name, String Canal_Code, String User_Type,String Canal_Level);
}
