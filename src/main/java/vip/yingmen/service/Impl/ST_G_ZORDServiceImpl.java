package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_G_ZORDMapper;
import vip.yingmen.pojo.ST_G_ZORD;
import vip.yingmen.service.ST_G_ZORDService;

import java.util.List;


@Service
public class ST_G_ZORDServiceImpl implements ST_G_ZORDService {
    @Autowired
    private ST_G_ZORDMapper stGZordMapper;

    public PageInfo<ST_G_ZORD> findBySTCD(Integer _page, Integer _page_size, String STCD) {
        PageHelper.startPage(_page, _page_size);
        List<ST_G_ZORD> stGZords = stGZordMapper.findBySTCD(STCD);        //传参数进去
        PageInfo<ST_G_ZORD> pageInfo = new PageInfo<>(stGZords);
        return pageInfo;
    }
}
