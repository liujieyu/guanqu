package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.JcGqMapper;
import vip.yingmen.pojo.JiChuGuanQuJiBenXinXi;
import vip.yingmen.service.JiChuGuanQuService;

import java.util.List;

@Service
public class JiChuGuanQuServiceImpl implements JiChuGuanQuService {
    @Autowired
    private JcGqMapper jcGqMapper;

    //查询基础数据的灌区基本信息
    @Override
    public PageInfo<JiChuGuanQuJiBenXinXi> findByJiBenXinXi(Integer _page, Integer _page_size, String _orderby, String IARHWPRTP, String IRASC, String IRANM) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<JiChuGuanQuJiBenXinXi> jiBenXinXi = jcGqMapper.findJiBenXinXi(IARHWPRTP, IRASC, IRANM);
        PageInfo<JiChuGuanQuJiBenXinXi> pageInfo = new PageInfo<>(jiBenXinXi);
        return pageInfo;
    }
}
