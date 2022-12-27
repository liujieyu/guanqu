package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ZhaFaShuiQingYueBiaoMapper;
import vip.yingmen.pojo.ZhaFaShuiQingYueBiao;
import vip.yingmen.service.ZhaFaShuiQingYueBiaoService;

import java.util.List;

@Service
public class ZhaFaShuiQingYueBiaoServiceImpl implements ZhaFaShuiQingYueBiaoService {
    @Autowired
    private ZhaFaShuiQingYueBiaoMapper yueBiaoMapper;
    //历史数据的闸阀水情月表查询
    @Override
    public PageInfo<ZhaFaShuiQingYueBiao> findByYueBiao(Integer _page, Integer _page_size, String YR, String MON, String ADDVCD, String Canal_Code, String CTYPE, String STNM,String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ZhaFaShuiQingYueBiao> byYueBiao = yueBiaoMapper.findByYueBiao(YR, MON, ADDVCD, Canal_Code, CTYPE, STNM);
        PageInfo<ZhaFaShuiQingYueBiao> yueBiaoPageInfo = new PageInfo<>(byYueBiao);
        return yueBiaoPageInfo;
    }
}
