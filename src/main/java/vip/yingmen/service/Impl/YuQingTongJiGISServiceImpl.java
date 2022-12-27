package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.YuQingTongJiGISMapper;
import vip.yingmen.pojo.YuQingTongJiGIS;
import vip.yingmen.service.YuQingTongJiGISService;

@Service
public class YuQingTongJiGISServiceImpl implements YuQingTongJiGISService {
    @Autowired
    private YuQingTongJiGISMapper yuQingTongJiGISMapper;
    //雨情gis第二滑框的小时列表统计查询
    @Override
    public YuQingTongJiGIS findByXiaoShi( String STCD, String Time_min, String Time_max) {
        return yuQingTongJiGISMapper.findByXiaoShi(STCD,Time_min,Time_max);
    }

    //雨情gis第二滑框的日列表统计查询
    @Override
    public YuQingTongJiGIS findByRi(String STCD, String Time_min, String Time_max) {
        return yuQingTongJiGISMapper.findByRi(STCD,Time_min,Time_max);
    }

    //雨情gis第二滑框的旬列表统计查询
    @Override
    public YuQingTongJiGIS findByXun(String STCD, String Time_min, String Time_max) {
        return yuQingTongJiGISMapper.findByXun(STCD,Time_min,Time_max);
    }

    //雨情gis第二滑框的月列表统计查询
    @Override
    public YuQingTongJiGIS findByYue(String STCD, String Time_min, String Time_max) {
        return yuQingTongJiGISMapper.findByYue(STCD,Time_min,Time_max);
    }

    //雨情gis第二滑框的年列表统计查询
    @Override
    public YuQingTongJiGIS findByNian(String STCD, String Time_min, String Time_max) {
        return yuQingTongJiGISMapper.findByNian(STCD,Time_min,Time_max);
    }
}
