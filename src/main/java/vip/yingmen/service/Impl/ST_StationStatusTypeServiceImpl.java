package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_StationStatusTypeMapper;
import vip.yingmen.pojo.ST_StationStatusType;
import vip.yingmen.service.ST_StationStatusTypeService;

import java.util.List;

@Service
public class ST_StationStatusTypeServiceImpl implements ST_StationStatusTypeService {
    @Autowired
    private ST_StationStatusTypeMapper stStationStatusTypeMapper;

    //查找全部
    @Override
    public PageInfo<ST_StationStatusType> findAll(Integer _page, Integer _page_size) {
        PageHelper.startPage(_page, _page_size);
        List<ST_StationStatusType> byYunXingGongKuang = stStationStatusTypeMapper.findAll();
        PageInfo<ST_StationStatusType> pageInfo = new PageInfo<>(byYunXingGongKuang);
        return pageInfo;
    }
}
