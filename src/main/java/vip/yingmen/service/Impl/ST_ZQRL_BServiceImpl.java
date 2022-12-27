package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_ZQRL_BMapper;
import vip.yingmen.pojo.ST_ZQRL_B;
import vip.yingmen.service.ST_ZQRL_BService;

import java.util.List;

@Service
public class ST_ZQRL_BServiceImpl implements ST_ZQRL_BService {
    @Autowired
    private ST_ZQRL_BMapper stZqrlBMapper;

    //根据STCD查找
    @Override
    public PageInfo<ST_ZQRL_B> findBySTCD(Integer _page, Integer _page_size,String STCD) {
        PageHelper.startPage(_page,_page_size);
        List<ST_ZQRL_B> bySTCD = stZqrlBMapper.findBySTCD(STCD);
        PageInfo<ST_ZQRL_B> stZqrlBPageInfo = new PageInfo<>(bySTCD);
        return stZqrlBPageInfo;
    }
}
