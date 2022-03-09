package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_RSVR_RMapper;
import vip.yingmen.pojo.ST_RSVR_R;
import vip.yingmen.service.ST_RSVR_RService;

import java.util.List;

@Service
public class ST_RSVR_RServiceImpl implements ST_RSVR_RService {
    @Autowired
    private ST_RSVR_RMapper stRsvrRMapper;
    //水库水清第二gis滑框的历史列表查询
    @Override
    public PageInfo<ST_RSVR_R> findBySingleLiShi(Integer _page, Integer _page_size,String STCD,String Time_min,String Time_max,String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_RSVR_R> bySingleLiShi = stRsvrRMapper.findBySingleLiShi(STCD,Time_min,Time_max);
        PageInfo<ST_RSVR_R> stHpCPageInfo = new PageInfo<>(bySingleLiShi);
        return stHpCPageInfo;
    }
}
