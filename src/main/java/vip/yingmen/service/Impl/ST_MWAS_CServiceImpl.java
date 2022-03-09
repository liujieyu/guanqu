package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_MWAS_CMapper;
import vip.yingmen.mapper.ST_RSVR_MMapper;
import vip.yingmen.pojo.ST_MWAS_C;
import vip.yingmen.pojo.ST_RSVR_M;
import vip.yingmen.service.ST_MWAS_CService;
import vip.yingmen.service.ST_RSVR_MService;

import java.util.List;

@Service
public class ST_MWAS_CServiceImpl implements ST_MWAS_CService {
    @Autowired
    private ST_MWAS_CMapper stMwasCMapper;

    //闸阀水情gis第二滑框的月列表查询
    @Override
    public PageInfo<ST_MWAS_C> findBySingleYue(Integer _page, Integer _page_size,String STCD,String _orderby, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_MWAS_C> bySingleYue = stMwasCMapper.findBySingleYue(STCD,Time_min,Time_max);
        PageInfo<ST_MWAS_C> stMwasCPageInfo = new PageInfo<>(bySingleYue);
        return stMwasCPageInfo;
    }
}
