package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.WRP_IrrBTCanalSystemMapper;
import vip.yingmen.pojo.WRP_IrrBTCanalSystem;
import vip.yingmen.service.WRP_IrrBTCanalSystemService;
import java.util.List;


@Service
public class WRP_IrrBTCanalSystemServiceImpl implements WRP_IrrBTCanalSystemService {
    @Autowired
    private WRP_IrrBTCanalSystemMapper wrpIrrBTCanalSystemMapper;
    //基础数据的渠道查询
    @Override
    public PageInfo<WRP_IrrBTCanalSystem> findAll(Integer _page,Integer _page_size) {
        PageHelper.startPage(_page,_page_size);
        List<WRP_IrrBTCanalSystem> wrpIrrBTCanalSystemMapperAll = wrpIrrBTCanalSystemMapper.findAll();
        PageInfo<WRP_IrrBTCanalSystem> pageInfo = new PageInfo<WRP_IrrBTCanalSystem>(wrpIrrBTCanalSystemMapperAll);
        return pageInfo;
    }
}
