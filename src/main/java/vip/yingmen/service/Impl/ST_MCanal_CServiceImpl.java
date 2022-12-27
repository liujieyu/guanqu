package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_MCanal_CMapper;
import vip.yingmen.pojo.ST_MCanal_C;
import vip.yingmen.service.ST_MCanal_CService;

import java.util.List;

@Service
public class ST_MCanal_CServiceImpl implements ST_MCanal_CService {
    @Autowired
    private ST_MCanal_CMapper stMCanalCMapper;

    //渠道水情gis第二滑框的月列表查询
    @Override
    public PageInfo<ST_MCanal_C> findBySingleYue(Integer _page, Integer _page_size,String STCD,String _orderby, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_MCanal_C> bySingleYue = stMCanalCMapper.findBySingleYue(STCD,Time_min,Time_max);
        PageInfo<ST_MCanal_C> stMCanalCPageInfo = new PageInfo<>(bySingleYue);
        return stMCanalCPageInfo;
    }
}
