package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_JPG_HMapper;
import vip.yingmen.mapper.ST_RSVR_R1Mapper;
import vip.yingmen.pojo.ST_JPG_H;
import vip.yingmen.pojo.ST_RSVR_R1;
import vip.yingmen.service.ST_JPG_HService;
import vip.yingmen.service.ST_RSVR_R1Service;

import java.util.List;

@Service
public class ST_RSVR_R1ServiceImpl implements ST_RSVR_R1Service {
    @Autowired
    private ST_RSVR_R1Mapper stRsvrR1Mapper;
    //分页查询全部
    @Override
    public PageInfo<ST_RSVR_R1> findAll(Integer _page, Integer _page_size) {
        PageHelper.startPage(_page,_page_size);
        List<ST_RSVR_R1> stRsvrR1s = stRsvrR1Mapper.findAll();
        PageInfo<ST_RSVR_R1> stRsvrR1PageInfo = new PageInfo<>(stRsvrR1s);
        return stRsvrR1PageInfo;
    }
}
