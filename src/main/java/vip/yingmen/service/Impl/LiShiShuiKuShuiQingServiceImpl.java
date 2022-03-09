package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.LsSksqMapper;
import vip.yingmen.pojo.ShuiKuShuiQingLiShiBiao;
import vip.yingmen.pojo.ShuiKuShuiQingRiBiao;
import vip.yingmen.pojo.ShuiKuShuiQingYueBiao;
import vip.yingmen.service.LiShiShuiKuShuiQingService;

import java.util.List;

@Service
public class LiShiShuiKuShuiQingServiceImpl implements LiShiShuiKuShuiQingService {
    @Autowired
    private LsSksqMapper lsSksqMapper;

    //历史数据的水库水情日表查询
    @Override
    public PageInfo<ShuiKuShuiQingRiBiao> findByShuiKuShuiQingRiBiao(Integer _page_size, Integer _page, String TM, String ADDVCD, String Canal_Code, String LEVEL, String STGR, String STNM, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ShuiKuShuiQingRiBiao> RiBiaoList = lsSksqMapper.fandByRiBiao(TM,ADDVCD,Canal_Code,LEVEL,STGR,STNM);
        PageInfo<ShuiKuShuiQingRiBiao> pageInfo = new PageInfo<>(RiBiaoList);
        return pageInfo;
    }

    //历史数据的水库水情月表查询
    @Override
    public PageInfo<ShuiKuShuiQingYueBiao> findByShuiKuShuiQingYueBiao(Integer _page_size, Integer _page, String YR,String MON, String ADDVCD, String Canal_Code, String LEVEL, String STGR, String STNM, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ShuiKuShuiQingYueBiao> YueBiaoList = lsSksqMapper.fandByYueBiao(YR,MON,ADDVCD,Canal_Code,LEVEL,STGR,STNM);
        PageInfo<ShuiKuShuiQingYueBiao> pageInfo = new PageInfo<>(YueBiaoList);
        return pageInfo;
    }

    //历史数据的水库水情历史表查询
    @Override
    public PageInfo<ShuiKuShuiQingLiShiBiao> findByShuiKuShuiQingLiShiBiao(Integer _page_size, Integer _page, String Time_min, String Time_max, String STCD, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ShuiKuShuiQingLiShiBiao> byLiShiBiao = lsSksqMapper.fandByLiShiBiao(Time_min,Time_max,STCD);
        PageInfo<ShuiKuShuiQingLiShiBiao> pageInfo = new PageInfo<>(byLiShiBiao);
        return pageInfo;
    }
}
