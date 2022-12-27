package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcQdMapper;
import vip.yingmen.pojo.JiChuShuJuQuDao;
import vip.yingmen.service.JiChuShuJuQuDaoService;

import java.util.List;

@Service
public class JiChuShuJuQuDaoServiceImpl implements JiChuShuJuQuDaoService {
    @Autowired
    private JcQdMapper jcQdMapper;

    //查询基础数据的灌区基本信息
    @Override
    public PageInfo<JiChuShuJuQuDao> findByQuDao(Integer _page, Integer _page_size, String _orderby, String Canal_Name, String Canal_Code, String User_Type,String Canal_Level) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<JiChuShuJuQuDao> byQuDao = jcQdMapper.findByQuDao(Canal_Name, Canal_Code, User_Type,Canal_Level);
        PageInfo<JiChuShuJuQuDao> pageInfo = new PageInfo<>(byQuDao);
        return pageInfo;
    }
}
