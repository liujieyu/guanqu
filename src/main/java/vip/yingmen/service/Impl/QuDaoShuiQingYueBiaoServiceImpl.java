package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.QuDaoShuiQingYueBiaoMapper;
import vip.yingmen.pojo.QuDaoShuiQingYueBiao;
import vip.yingmen.service.QuDaoShuiQingYueBiaoService;

import java.util.List;

@Service
public class QuDaoShuiQingYueBiaoServiceImpl implements QuDaoShuiQingYueBiaoService {
    @Autowired
    private QuDaoShuiQingYueBiaoMapper yueBiaoMapper;
    //历史数据的渠道水情月表查询
    @Override
    public PageInfo<QuDaoShuiQingYueBiao> findByYueBiao(Integer _page,Integer _page_size,String ye, String mon, String addvcd, String canal_code, String stype, String stnm) {
        PageHelper.startPage(_page,_page_size);
        List<QuDaoShuiQingYueBiao> byYueBiao = yueBiaoMapper.findByYueBiao(ye, mon, addvcd, canal_code, stype, stnm);
        PageInfo<QuDaoShuiQingYueBiao> quDaoShuiQingYueBiaoPageInfo = new PageInfo<>(byYueBiao);
        return quDaoShuiQingYueBiaoPageInfo;
    }
}
