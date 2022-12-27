package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_DCP_DMapper;
import vip.yingmen.pojo.ST_DCP_D;
import vip.yingmen.service.ST_DCP_DService;

import java.util.List;

@Service
public class ST_DCP_DServiceImpl implements ST_DCP_DService {
    @Autowired
    private ST_DCP_DMapper stDcpDMapper;
    //雨情gis第二滑框的旬列表查询
    @Override
    public PageInfo<ST_DCP_D> findBySingleXun(Integer _page, Integer _page_size, String STCD, String _orderby, String Time_min, String Time_max) {
        String Time_min_1 = Time_min.substring(0,7);
        String Time_max_1 = Time_max.substring(0,7);
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_DCP_D> bySingleXun = stDcpDMapper.findBySingleXun(STCD,Time_min,Time_max,Time_min_1,Time_max_1);
        PageInfo<ST_DCP_D> stDcpDPageInfo = new PageInfo<>(bySingleXun);
        return stDcpDPageInfo;
    }
}
