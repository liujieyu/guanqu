package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_WAS_RMapper;
import vip.yingmen.pojo.ST_WAS_R;
import vip.yingmen.service.ST_WAS_RService;

import java.util.List;

@Service
public class ST_WAS_RServiceImpl implements ST_WAS_RService {
    @Autowired
    private ST_WAS_RMapper stWasRMapper;
    //闸阀水情gis第二滑框的历史列表查询
    @Override
    public PageInfo<ST_WAS_R> findBySingleLiShi(Integer _page, Integer _page_size,String STCD,String Time_min,String Time_max,String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_WAS_R> bySingleXiaoShi = stWasRMapper.findBySingleLiShi(STCD,Time_min,Time_max);
        PageInfo<ST_WAS_R> stWasRPageInfo = new PageInfo<>(bySingleXiaoShi);
        return stWasRPageInfo;
    }
}
