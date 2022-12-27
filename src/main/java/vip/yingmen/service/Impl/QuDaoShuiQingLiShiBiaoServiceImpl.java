package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.QuDaoShuiQingLiShiBiaoMapper;
import vip.yingmen.pojo.QuDaoShuiQingLiShiBiao;
import vip.yingmen.service.QuDaoShuiQingLiShiBiaoService;

import java.util.List;

@Service
public class QuDaoShuiQingLiShiBiaoServiceImpl implements QuDaoShuiQingLiShiBiaoService {
    @Autowired
    private QuDaoShuiQingLiShiBiaoMapper quDaoShuiQingLiShiBiaoMapper;

    //历史数据的渠道水情历史表查询
    @Override
    public PageInfo<QuDaoShuiQingLiShiBiao> findByQuDaoShuiQingLiShiBiao(Integer _page_size, Integer _page, String Time_min, String Time_max, String STCD, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<QuDaoShuiQingLiShiBiao> byLiShiBiao = quDaoShuiQingLiShiBiaoMapper.findByLiShiBiao(Time_min,Time_max,STCD);
        PageInfo<QuDaoShuiQingLiShiBiao> pageInfo = new PageInfo<>(byLiShiBiao);
        return pageInfo;
    }
}
