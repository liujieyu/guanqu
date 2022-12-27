package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcSyxxMapper;
import vip.yingmen.pojo.JiChuShuiYuanHeLiu;
import vip.yingmen.pojo.JiChuShuiYuanJing;
import vip.yingmen.pojo.JiChuShuiYuanShuiKu;
import vip.yingmen.pojo.JiChuShuiYuanXinXiShuiYuan;
import vip.yingmen.service.JiChuShuiYuanXinXiService;

import java.util.List;

@Service
public class JiChuShuiYuanXinXiServiceImpl implements JiChuShuiYuanXinXiService {
    @Autowired
    private JcSyxxMapper jcSyxxMapper;

    //查询基础数据的灌区基本信息
    @Override
    public PageInfo<JiChuShuiYuanXinXiShuiYuan> findByShuiYuan(Integer _page, Integer _page_size, String _orderby, String SourceE_Type, String Source_Type, String RSNM) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<JiChuShuiYuanXinXiShuiYuan> jiBenXinXi = jcSyxxMapper.findByShuiYuan(SourceE_Type, Source_Type, RSNM);
        PageInfo<JiChuShuiYuanXinXiShuiYuan> pageInfo = new PageInfo<>(jiBenXinXi);
        return pageInfo;
    }

    @Override
    public PageInfo<JiChuShuiYuanShuiKu> findByShuiKu(Integer _page, Integer _page_size, String _orderby, String ADDVCD, String PRSC, String BLSYS, String RSNM) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<JiChuShuiYuanShuiKu> byShuiKu = jcSyxxMapper.findByShuiKu(ADDVCD, PRSC, BLSYS, RSNM);
        PageInfo<JiChuShuiYuanShuiKu> pageInfo = new PageInfo<>(byShuiKu);
        return pageInfo;
    }

    @Override
    public PageInfo<JiChuShuiYuanHeLiu> findByHeLiu(Integer _page, Integer _page_size, String _orderby, String RVNM, String RVTP, String RLEVEL) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<JiChuShuiYuanHeLiu> byShuiKu = jcSyxxMapper.findByHeLiu(RVNM, RVTP, RLEVEL);
        PageInfo<JiChuShuiYuanHeLiu> pageInfo = new PageInfo<>(byShuiKu);
        return pageInfo;
    }

    @Override
    public PageInfo<JiChuShuiYuanJing> findByJing(Integer _page, Integer _page_size, String _orderby, String Well_Name, String Canal_Code, String Diameter_Type, String Depth_Type, String Motivity_Type, String Material_Type) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<JiChuShuiYuanJing> byShuiKu = jcSyxxMapper.findByJing(Well_Name, Canal_Code, Diameter_Type,Depth_Type,Motivity_Type,Material_Type);
        PageInfo<JiChuShuiYuanJing> pageInfo = new PageInfo<>(byShuiKu);
        return pageInfo;
    }
}
