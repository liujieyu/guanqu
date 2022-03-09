package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.WRP_LY_BSINMapper;
import vip.yingmen.pojo.WRP_LY_BSIN;
import vip.yingmen.service.WRP_LY_BSINService;

import java.util.List;


@Service
public class WRP_LY_BSINServiceImpl implements WRP_LY_BSINService {
    @Autowired
    private WRP_LY_BSINMapper wrpLyBsinMapper;

    //根据CTCD查询基础数据流域信息
    @Override
    public PageInfo<WRP_LY_BSIN> findByCTCD(String CTCD) {
        PageHelper.startPage(1,999999999);
        List<WRP_LY_BSIN> wrpLyBsinMapperByCTCD = wrpLyBsinMapper.findByCTCD(CTCD);
        PageInfo<WRP_LY_BSIN> pageInfo = new PageInfo<>(wrpLyBsinMapperByCTCD);
        return pageInfo;
    }
}
