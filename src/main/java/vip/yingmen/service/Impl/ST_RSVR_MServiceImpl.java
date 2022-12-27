package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_RSVR_MMapper;
import vip.yingmen.pojo.ST_RSVR_M;
import vip.yingmen.service.ST_RSVR_MService;

import java.util.List;

@Service
public class ST_RSVR_MServiceImpl implements ST_RSVR_MService {
    @Autowired
    private ST_RSVR_MMapper stRsvrMMapper;
    //水库水情gis第二滑框月列表查询
    @Override
    public PageInfo<ST_RSVR_M> findBySingleYue(Integer _page, Integer _page_size,String STCD,String _orderby, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_RSVR_M> bySingleYue = stRsvrMMapper.findBySingleYue(STCD,Time_min,Time_max);
        PageInfo<ST_RSVR_M> stRsvrMPageInfo = new PageInfo<>(bySingleYue);
        return stRsvrMPageInfo;
    }
}
