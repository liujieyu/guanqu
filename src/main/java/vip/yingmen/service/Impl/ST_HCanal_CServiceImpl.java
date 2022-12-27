package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_HCanal_CMapper;
import vip.yingmen.pojo.ST_HCanal_C;
import vip.yingmen.service.ST_HCanal_CService;

import java.util.List;

@Service
public class ST_HCanal_CServiceImpl implements ST_HCanal_CService {
    @Autowired
    private ST_HCanal_CMapper stHCanalCMapper;
    //渠道水情gis第二滑框的小时列表查询
    @Override
    public PageInfo<ST_HCanal_C> findBySingleXiaoShi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_HCanal_C> bySingleXiaoShi = stHCanalCMapper.findBySingleXiaoShi(STCD,Time_min,Time_max);
        PageInfo<ST_HCanal_C> stHCanalCPageInfo = new PageInfo<>(bySingleXiaoShi);
        return stHCanalCPageInfo;
    }
}
