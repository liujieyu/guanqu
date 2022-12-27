package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_RIVER_MMapper;
import vip.yingmen.pojo.ST_RIVER_M;
import vip.yingmen.service.ST_RIVER_MService;

import java.util.List;

@Service
public class ST_RIVER_MServiceImpl implements ST_RIVER_MService {
    @Autowired
    private ST_RIVER_MMapper stRiverMMapper;

    //河道水情gis第二滑框的月列表查询
    @Override
    public PageInfo<ST_RIVER_M> findByYue(Integer _page, Integer _page_size, String STCD, String _orderby, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_RIVER_M> byYue = stRiverMMapper.findByYue(STCD,Time_min,Time_max);
        PageInfo<ST_RIVER_M> stRiverMPageInfo = new PageInfo<>(byYue);
        return stRiverMPageInfo;
    }
}
