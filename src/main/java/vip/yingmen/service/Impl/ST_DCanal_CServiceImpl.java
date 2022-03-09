package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_DCanal_CMapper;
import vip.yingmen.pojo.ST_DCanal_C;
import vip.yingmen.service.ST_DCanal_CService;

import java.util.List;

@Service
public class ST_DCanal_CServiceImpl implements ST_DCanal_CService {
    @Autowired
    private ST_DCanal_CMapper stDCanalCMapper;

    //渠道水情gis第二滑框的日列表查询
    @Override
    public PageInfo<ST_DCanal_C> findBySingleRi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_DCanal_C> bySingleRi = stDCanalCMapper.findBySingleRi(STCD,Time_min,Time_max);
        PageInfo<ST_DCanal_C> stDCanalCPageInfo = new PageInfo<>(bySingleRi);
        return stDCanalCPageInfo;
    }
}
