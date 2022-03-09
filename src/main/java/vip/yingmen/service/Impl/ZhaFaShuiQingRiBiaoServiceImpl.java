package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ZhaFaShuiQingRiBiaoMapper;
import vip.yingmen.pojo.ZhaFaShuiQingRiBiao;
import vip.yingmen.service.ZhaFaShuiQingRiBiaoService;

import java.util.List;

@Service
public class ZhaFaShuiQingRiBiaoServiceImpl implements ZhaFaShuiQingRiBiaoService {
    @Autowired
    private ZhaFaShuiQingRiBiaoMapper zhaFaShuiQingRiBiaoMapper;

    //历史数据的闸阀水情日表查询
    @Override
    public PageInfo<ZhaFaShuiQingRiBiao> findByZhaFaShuiQingRiBiao(Integer _page_size, Integer _page, String TM, String ADDVCD, String Canal_Code, String CTYPE, String STNM,String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ZhaFaShuiQingRiBiao> zhaFaShuiQingRiBiaos = zhaFaShuiQingRiBiaoMapper.fandByRiBiao(TM,ADDVCD,Canal_Code,CTYPE,STNM);
        PageInfo<ZhaFaShuiQingRiBiao> pageInfo = new PageInfo<>(zhaFaShuiQingRiBiaos);
        return pageInfo;
    }
}
