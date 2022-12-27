package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_RSVR_HMapper;
import vip.yingmen.pojo.ST_RSVR_H;
import vip.yingmen.service.ST_RSVR_HService;

import java.util.List;

@Service
public class ST_RSVR_HServiceImpl implements ST_RSVR_HService {
    @Autowired
    private ST_RSVR_HMapper stRsvrHMapper;
    //水库水情gis第二滑框小时列表查询
    @Override
    public PageInfo<ST_RSVR_H> findBySingleXiaoShi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_RSVR_H> bySingleXiaoShi = stRsvrHMapper.findBySingleXiaoShi(STCD,Time_min,Time_max);
        PageInfo<ST_RSVR_H> stRsvrHPageInfo = new PageInfo<>(bySingleXiaoShi);
        return stRsvrHPageInfo;
    }
}
