package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_DWAS_CMapper;
import vip.yingmen.pojo.ST_DWAS_C;
import vip.yingmen.service.ST_DWAS_CService;

import java.util.List;

@Service
public class ST_DWAS_CServiceImpl implements ST_DWAS_CService {
    @Autowired
    private ST_DWAS_CMapper stDwasCMapper;
    //闸阀水情gis第二滑框的日列表查询
    @Override
    public PageInfo<ST_DWAS_C> findBySingleRi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_DWAS_C> bySingleRi = stDwasCMapper.findBySingleRi(STCD,Time_min,Time_max);
        PageInfo<ST_DWAS_C> stDwasCPageInfo = new PageInfo<>(bySingleRi);
        return stDwasCPageInfo;
    }
}
