package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_G_WASQORDMapper;
import vip.yingmen.pojo.ST_G_WASQORD;
import vip.yingmen.service.ST_G_WASQORDService;

import java.util.List;


@Service
public class ST_G_WASQORDServiceImpl implements ST_G_WASQORDService {
    @Autowired
    private ST_G_WASQORDMapper stGWasqordMapper;

    public PageInfo<ST_G_WASQORD> findBySTCDAndYR(Integer _page, Integer _page_size, String STCD,String YR_min,String YR_max) {
        PageHelper.startPage(_page, _page_size);
        List<ST_G_WASQORD> stGWasqords = stGWasqordMapper.findBySTCDAndYR(STCD,YR_min,YR_max);        //传参数进去
        PageInfo<ST_G_WASQORD> pageInfo = new PageInfo<>(stGWasqords);
        return pageInfo;
    }
}
