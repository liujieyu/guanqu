package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_HP_CMapper;
import vip.yingmen.pojo.ST_HP_C;
import vip.yingmen.service.ST_HP_CService;

import java.util.List;

@Service
public class ST_HP_CServiceImpl implements ST_HP_CService {
    @Autowired
    private ST_HP_CMapper stHpCMapper;
    //雨情gis第二滑框的小时列表查询
    @Override
    public PageInfo<ST_HP_C> findBySingleXiaoShi(Integer _page, Integer _page_size,String STCD,String Time_min,String Time_max,String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_HP_C> bySingleXiaoShi = stHpCMapper.findBySingleXiaoShi(STCD,Time_min,Time_max);
        PageInfo<ST_HP_C> stHpCPageInfo = new PageInfo<>(bySingleXiaoShi);
        return stHpCPageInfo;
    }
}
