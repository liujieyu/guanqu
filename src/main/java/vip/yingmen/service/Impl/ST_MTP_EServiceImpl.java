package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_MTP_EMapper;
import vip.yingmen.pojo.ST_MTP_E;
import vip.yingmen.service.ST_MTP_EService;

import java.util.List;

@Service
public class ST_MTP_EServiceImpl implements ST_MTP_EService {
    @Autowired
    private ST_MTP_EMapper stMtpEMapper;
    //雨情gis第二滑框月列表查询
    @Override
    public PageInfo<ST_MTP_E> findBySingleYue(Integer _page, Integer _page_size, String STCD, String _orderby,String Time_min,String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<ST_MTP_E> bySingleYue = stMtpEMapper.findBySingleYue(STCD,Time_min,Time_max);
        PageInfo<ST_MTP_E> stMtpEPageInfo = new PageInfo<>(bySingleYue);
        return stMtpEPageInfo;
    }
}
