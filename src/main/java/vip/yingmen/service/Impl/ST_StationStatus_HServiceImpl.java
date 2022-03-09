package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_StationStatus_HMapper;
import vip.yingmen.pojo.ST_StationStatus_H;
import vip.yingmen.service.ST_StationStatus_HService;

import java.util.List;

@Service
public class ST_StationStatus_HServiceImpl implements ST_StationStatus_HService {
    @Autowired
    private ST_StationStatus_HMapper stStationStatusHMapper;

    //运行工况gis第二滑框的历史列表查询
    @Override
    public PageInfo<ST_StationStatus_H> findByYunXingGongKuang(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<ST_StationStatus_H> byYunXingGongKuang = stStationStatusHMapper.findByYunXingGongKuang(STCD, Time_min, Time_max);
        PageInfo<ST_StationStatus_H> stStationStatusHPageInfo = new PageInfo<>(byYunXingGongKuang);
        return stStationStatusHPageInfo;
    }
}
