package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcQsssMapper;
import vip.yingmen.pojo.JCQSSSBa;
import vip.yingmen.pojo.JCQSSSBengZhan;
import vip.yingmen.pojo.JCQSSSSheShi;
import vip.yingmen.pojo.JiChuQuShuiSheShiShuiZha;
import vip.yingmen.service.JiChuQuShuiSheShiService;

import java.util.List;

@Service
public class JiChuQuShuiSheShiServiceImpl implements JiChuQuShuiSheShiService {
    @Autowired
    private JcQsssMapper jcQsssMapper;

    //查询基础数据的灌区基本信息
    @Override
    public PageInfo<JiChuQuShuiSheShiShuiZha> findByShuiZha(Integer _page, Integer _page_size, String _orderby, String SLNM, String SLTP, String ADDVCD, String GS) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<JiChuQuShuiSheShiShuiZha> byShuiZha = jcQsssMapper.findByShuiZha(SLNM, SLTP, ADDVCD,GS);
        PageInfo<JiChuQuShuiSheShiShuiZha> pageInfo = new PageInfo<>(byShuiZha);
        return pageInfo;
    }

    @Override
    public PageInfo<JCQSSSSheShi> findBySheShi(Integer _page, Integer _page_size, String _orderby, String FStructure_Name, String FStructure_Type, String Fetch_Mode, String GS) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<JCQSSSSheShi> bySheShi = jcQsssMapper.findBySheShi(FStructure_Name, FStructure_Type, Fetch_Mode,GS);
        PageInfo<JCQSSSSheShi> pageInfo = new PageInfo<>(bySheShi);
        return pageInfo;
    }

    @Override
    public PageInfo<JCQSSSBa> findByBa(Integer page, Integer pageSize, String orderBy, String damName, String damType, String damGrade, String structureType, String gs) {
        PageHelper.startPage(page,pageSize,orderBy);
        List<JCQSSSBa> byBa = jcQsssMapper.findByBa(damName, damType, damGrade,structureType,gs);
        PageInfo<JCQSSSBa> pageInfo = new PageInfo<>(byBa);
        return pageInfo;
    }

    @Override
    public PageInfo<JCQSSSBengZhan> findByBengZhan(Integer page, Integer pageSize, String orderBy, String idstnm, String addvcd, String idsttp, String gs) {
        PageHelper.startPage(page,pageSize,orderBy);
        List<JCQSSSBengZhan> byBengZhan = jcQsssMapper.findByBengZhan(idstnm, addvcd, idsttp,gs);
        PageInfo<JCQSSSBengZhan> pageInfo = new PageInfo<>(byBengZhan);
        return pageInfo;
    }
}
