package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ShuiKuShuiQingZuiGaoShuiWeiMapper;
import vip.yingmen.pojo.ShuiKuShuiQingZuiGaoShuiWei;
import vip.yingmen.service.ShuiKuShuiQingZuiGaoShuiWeiService;

import java.util.List;

@Service
public class ShuiKuShuiQingZuiGaoShuiWeiServiceImpl implements ShuiKuShuiQingZuiGaoShuiWeiService {
    @Autowired
    private ShuiKuShuiQingZuiGaoShuiWeiMapper zuiGaoShuiWeiMapper;
    //历史数据的水库水情的最高水位查询
    @Override
    public PageInfo<ShuiKuShuiQingZuiGaoShuiWei> findByZuiGaoShuiWei(Integer _page, Integer _page_size, String yr, String addvcd, String stgr,  String stnm, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ShuiKuShuiQingZuiGaoShuiWei> byZuiGaoShuiWei = zuiGaoShuiWeiMapper.findByZuiGaoShuiWei(yr,addvcd, stgr, stnm);
        PageInfo<ShuiKuShuiQingZuiGaoShuiWei> shuiKuShuiQingZuiGaoShuiWeiPageInfo = new PageInfo<>(byZuiGaoShuiWei);
        return shuiKuShuiQingZuiGaoShuiWeiPageInfo;
    }
}
