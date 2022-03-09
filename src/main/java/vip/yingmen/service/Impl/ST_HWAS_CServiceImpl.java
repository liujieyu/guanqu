package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_HWAS_CMapper;
import vip.yingmen.pojo.ST_HWAS_C;
import vip.yingmen.service.ST_HWAS_CService;

import java.util.List;

@Service
public class ST_HWAS_CServiceImpl implements ST_HWAS_CService {
    @Autowired
    private ST_HWAS_CMapper stHwasCMapper;
    //闸阀水情gis第二滑框小时列表查询
    @Override
    public PageInfo<ST_HWAS_C> findBySingleXiaoShi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_HWAS_C> bySingleXiaoShi = stHwasCMapper.findBySingleXiaoShi(STCD,Time_min,Time_max);
        PageInfo<ST_HWAS_C> stHwasCPageInfo = new PageInfo<>(bySingleXiaoShi);
        return stHwasCPageInfo;
    }
}
