package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ZhaFaShuiQingLiShiBiaoMapper;
import vip.yingmen.pojo.ZhaFaShuiQingLiShiBiao;
import vip.yingmen.service.ZhaFaShuiQingLiShiBiaoService;

import java.util.List;

@Service
public class ZhaFaShuiQingLiShiBiaoServiceImpl implements ZhaFaShuiQingLiShiBiaoService {
    @Autowired
    private ZhaFaShuiQingLiShiBiaoMapper zhaFaShuiQingLiShiBiaoMapper;

    //历史数据的闸阀水情历史表查询
    @Override
    public PageInfo<ZhaFaShuiQingLiShiBiao> findByZhaFaShuiQingLiShiBiao(Integer _page_size, Integer _page, String Time_min,String Time_max,  String STCD, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ZhaFaShuiQingLiShiBiao> byLiShiBiao = zhaFaShuiQingLiShiBiaoMapper.findByLiShiBiao(Time_min,Time_max,STCD);
        PageInfo<ZhaFaShuiQingLiShiBiao> pageInfo = new PageInfo<>(byLiShiBiao);
        return pageInfo;
    }
}
