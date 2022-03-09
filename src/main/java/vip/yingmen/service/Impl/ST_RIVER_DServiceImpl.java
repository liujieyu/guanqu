package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_RIVER_DMapper;
import vip.yingmen.pojo.ST_RIVER_D;
import vip.yingmen.service.ST_RIVER_DService;

import java.util.List;

@Service
public class ST_RIVER_DServiceImpl implements ST_RIVER_DService {
    @Autowired
    private ST_RIVER_DMapper stRiverDMapper;

    //河道水情gis的第二滑框的日列表查询
    @Override
    public PageInfo<ST_RIVER_D> findByRi(Integer _page, Integer _page_size,String STCD,String _orderby, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_RIVER_D> byRi = stRiverDMapper.findByRi(STCD,Time_min,Time_max);
        PageInfo<ST_RIVER_D> stRiverDPageInfo = new PageInfo<>(byRi);
        return stRiverDPageInfo;
    }
}
