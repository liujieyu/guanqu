package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.WRP_IrrBFSourceMapper;
import vip.yingmen.pojo.WRP_IrrBFSource;
import vip.yingmen.service.WRP_IrrBFSourceService;

import java.util.List;

@Service
public class WRP_IrrBFSourceServiceImpl implements WRP_IrrBFSourceService {
    @Autowired
    private WRP_IrrBFSourceMapper wrpIrrBFSourceMapper;

    //基础数据的水源信息查询
    @Override
    public PageInfo<WRP_IrrBFSource> findByShuiYuanXinXi(Integer _page, Integer _page_size) {
        PageHelper.startPage(_page,_page_size);
        List<WRP_IrrBFSource> byShuiYuanXinXi = wrpIrrBFSourceMapper.findByShuiYuanXinXi();
        PageInfo<WRP_IrrBFSource> wrpIrrBFSourcePageInfo = new PageInfo<>(byShuiYuanXinXi);
        return wrpIrrBFSourcePageInfo;
    }
}
