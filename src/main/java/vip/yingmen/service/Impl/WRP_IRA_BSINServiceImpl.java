package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.WRP_IRA_BSINMapper;
import vip.yingmen.pojo.WRP_IRA_BSIN;
import vip.yingmen.service.WRP_IRA_BSINService;

import java.util.List;

@Service
public class WRP_IRA_BSINServiceImpl implements WRP_IRA_BSINService {
    @Autowired
    private WRP_IRA_BSINMapper wrpIraBsinMapper;

    @Override
    public List<WRP_IRA_BSIN> findAll() {
        return wrpIraBsinMapper.findAll();
    }

    //基础数据的灌区基本信息查询
    @Override
    public PageInfo<WRP_IRA_BSIN> findByIARHWPRTPAndIRASC(Integer _page,Integer _page_size,String IARHWPRTP,String IRASC) {
        PageHelper.startPage(_page,_page_size);
        List<WRP_IRA_BSIN> all = wrpIraBsinMapper.findByIARHWPRTPAndIRASC(IARHWPRTP,IRASC);
        PageInfo<WRP_IRA_BSIN> wrpIraBsinPageInfo = new PageInfo<>(all);
        return wrpIraBsinPageInfo;
    }
}
