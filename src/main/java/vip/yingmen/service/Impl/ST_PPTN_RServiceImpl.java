package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_PPTN_RMapper;
import vip.yingmen.mapper.ST_RSVR_RMapper;
import vip.yingmen.pojo.ST_PPTN_R;
import vip.yingmen.pojo.ST_RSVR_R;
import vip.yingmen.service.ST_PPTN_RService;
import vip.yingmen.service.ST_RSVR_RService;

import java.util.List;

@Service
public class ST_PPTN_RServiceImpl implements ST_PPTN_RService {
    @Autowired
    private ST_PPTN_RMapper stPptnRMapper;
    //雨情第二gis滑框的历史列表查询
    @Override
    public PageInfo<ST_PPTN_R> findBySingleLiShi(Integer _page, Integer _page_size,String STCD) {
        PageHelper.startPage(_page,_page_size);
        List<ST_PPTN_R> bySingleLiShi = stPptnRMapper.findBySingleLiShi(STCD);
        PageInfo<ST_PPTN_R> stPptnRPageInfo = new PageInfo<>(bySingleLiShi);
        return stPptnRPageInfo;
    }
}
