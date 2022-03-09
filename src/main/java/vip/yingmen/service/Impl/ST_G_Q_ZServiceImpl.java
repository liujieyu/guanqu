package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_G_Q_ZMapper;
import vip.yingmen.mapper.ST_G_ZORDMapper;
import vip.yingmen.pojo.ST_G_Q_Z;
import vip.yingmen.pojo.ST_G_ZORD;
import vip.yingmen.service.ST_G_Q_ZService;
import vip.yingmen.service.ST_G_ZORDService;

import java.util.List;


@Service
public class ST_G_Q_ZServiceImpl implements ST_G_Q_ZService {
    @Autowired
    private ST_G_Q_ZMapper stGQZMapper;

    public PageInfo<ST_G_Q_Z> findBySTCD(Integer _page, Integer _page_size, String STCD) {
        PageHelper.startPage(_page, _page_size);
        List<ST_G_Q_Z> stGQZs = stGQZMapper.findBySTCD(STCD);        //传参数进去
        PageInfo<ST_G_Q_Z> pageInfo = new PageInfo<>(stGQZs);
        return pageInfo;
    }
}
