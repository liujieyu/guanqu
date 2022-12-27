package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.QuDaoShuiQingRiBiaoMapper;
import vip.yingmen.pojo.QuDaoShuiQingRiBiao;
import vip.yingmen.service.QuDaoShuiQingRiBiaoService;

import java.util.List;

@Service
public class QuDaoShuiQingRiBiaoServiceImpl implements QuDaoShuiQingRiBiaoService {
    @Autowired
    private QuDaoShuiQingRiBiaoMapper quDaoShuiQingRiBiaoMapper;

    //历史数据的渠道水情日表查询
    @Override
    public PageInfo<QuDaoShuiQingRiBiao> findByQuDaoShuiQingRiBiao(Integer _page_size, Integer _page, String tm, String addvcd,  String canal_code,  String stype,String stnm,String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<QuDaoShuiQingRiBiao> quDaoShuiQingRiBiao = quDaoShuiQingRiBiaoMapper.findByQuDaoShuiQingRiBiao(tm,addvcd,canal_code,stype,stnm);
        PageInfo<QuDaoShuiQingRiBiao> quDaoShuiQingRiBiaoPageInfo = new PageInfo<>(quDaoShuiQingRiBiao);
        return quDaoShuiQingRiBiaoPageInfo;
    }
}
