package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_RIVER_RMapper;
import vip.yingmen.mapper.ST_RSVR_MMapper;
import vip.yingmen.pojo.ST_RIVER_R;
import vip.yingmen.pojo.ST_RSVR_M;
import vip.yingmen.service.ST_RIVER_RService;
import vip.yingmen.service.ST_RSVR_MService;

import java.util.List;

@Service
public class ST_RIVER_RServiceImpl implements ST_RIVER_RService {
    @Autowired
    private ST_RIVER_RMapper stRiverRMapper;
    //河道水情gis的第二滑框历史列表查询
    @Override
    public PageInfo<ST_RIVER_R> findByLiShi(Integer _page, Integer _page_size,String STCD,String _orderby, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_RIVER_R> byLiShi = stRiverRMapper.findByLiShi(STCD,Time_min,Time_max);
        PageInfo<ST_RIVER_R> stRiverRPageInfo = new PageInfo<>(byLiShi);
        return stRiverRPageInfo;
    }
}
