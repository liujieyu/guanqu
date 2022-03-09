package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_DP_CMapper;
import vip.yingmen.pojo.ST_DP_C;
import vip.yingmen.service.ST_DP_CService;

import java.util.List;

@Service
public class ST_DP_CServiceImpl implements ST_DP_CService {
    @Autowired
    private ST_DP_CMapper stDpCMapper;
    //雨情gis的第二滑框的日列表查询
    @Override
    public PageInfo<ST_DP_C> findBySingleRiBiao(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_DP_C> bySingleRiBiao = stDpCMapper.findBySingleRiBiao(STCD,Time_min,Time_max);
        PageInfo<ST_DP_C> stDpCPageInfo = new PageInfo<>(bySingleRiBiao);
        return stDpCPageInfo;
    }
}
