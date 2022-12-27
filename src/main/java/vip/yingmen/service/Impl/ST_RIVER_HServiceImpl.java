package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_RIVER_HMapper;
import vip.yingmen.pojo.ST_RIVER_H;
import vip.yingmen.service.ST_RIVER_HService;

import java.util.List;

@Service
public class ST_RIVER_HServiceImpl implements ST_RIVER_HService {
    @Autowired
    private ST_RIVER_HMapper stRiverHMapper;
    //河道水情gis第二滑框的小时列表查询
    @Override
    public PageInfo<ST_RIVER_H> findByXiaoShi(Integer _page, Integer _page_size,String STCD,String _orderby, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_RIVER_H> byXiaoShi = stRiverHMapper.findByXiaoShi(STCD,Time_min,Time_max);
        PageInfo<ST_RIVER_H> stRiverHPageInfo = new PageInfo<>(byXiaoShi);
        return stRiverHPageInfo;
    }
}
