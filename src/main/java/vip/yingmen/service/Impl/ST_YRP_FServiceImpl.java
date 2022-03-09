package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_HP_CMapper;
import vip.yingmen.mapper.ST_YRP_FMapper;
import vip.yingmen.pojo.ST_HP_C;
import vip.yingmen.pojo.ST_YRP_F;
import vip.yingmen.service.ST_HP_CService;
import vip.yingmen.service.ST_YRP_FService;

import java.util.List;

@Service
public class ST_YRP_FServiceImpl implements ST_YRP_FService {
    @Autowired
    private ST_YRP_FMapper stYrpFMapper;
    //雨情gis第二滑框的年列表查询
    @Override
    public PageInfo<ST_YRP_F> findBySingleNian(Integer _page, Integer _page_size,String STCD,String _orderby,String Time_min,String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_YRP_F> bySingleNian = stYrpFMapper.findBySingleNian(STCD,Time_min,Time_max);
        PageInfo<ST_YRP_F> stYrpFPageInfo = new PageInfo<>(bySingleNian);
        return stYrpFPageInfo;
    }
}
