package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ZhaFaLiShiMapper;
import vip.yingmen.pojo.ZhaFaKaiDuLiShi;
import vip.yingmen.pojo.ZhaFaLiShiZhaMen;
import vip.yingmen.service.ZhaFaLiShiService;

import java.util.List;

@Service
public class ZhaFaLiShiServiceImpl implements ZhaFaLiShiService {
    @Autowired
    private ZhaFaLiShiMapper zhaFaLiShiMapper;

    @Override
    public PageInfo<ZhaFaKaiDuLiShi> findByKaiDu(Integer _page, Integer _page_size, String _orderby, String STCD, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ZhaFaKaiDuLiShi> byLiShiTuXiangXinXi = zhaFaLiShiMapper.findByKaiDu(STCD,Time_min,Time_max);
        PageInfo<ZhaFaKaiDuLiShi> pageInfo = new PageInfo<>(byLiShiTuXiangXinXi);
        return pageInfo;
    }

    @Override
    public PageInfo<ZhaFaLiShiZhaMen> findByZhaMen(Integer _page, Integer _page_size, String _orderby, String STCD, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ZhaFaLiShiZhaMen> byZhaMen = zhaFaLiShiMapper.findByZhaMen(STCD,Time_min,Time_max);
        PageInfo<ZhaFaLiShiZhaMen> pageInfo = new PageInfo<>(byZhaMen);
        return pageInfo;
    }
}
