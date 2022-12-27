package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.SWKRTwoGISMapper;
import vip.yingmen.pojo.SWKRTwoGIS;
import vip.yingmen.service.SWKRTwoGISService;

import java.util.List;

@Service
public class SWKRTwoGIServiceImpl implements SWKRTwoGISService {
    @Autowired
    private SWKRTwoGISMapper swkrTwoGISMapper;
    @Override
    public PageInfo<SWKRTwoGIS> findByTwoGIS(Integer _page, Integer _page_size, String _orderby, String STCD, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<SWKRTwoGIS> byTwoGIS = swkrTwoGISMapper.findByTwoGIS(STCD,Time_min,Time_max);
        PageInfo<SWKRTwoGIS> pageInfo = new PageInfo<>(byTwoGIS);
        return pageInfo;
    }
}
