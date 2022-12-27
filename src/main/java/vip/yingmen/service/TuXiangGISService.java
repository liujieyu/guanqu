package vip.yingmen.service;

import java.util.Map;

public interface TuXiangGISService {
    //图像的gis第一滑框实时数据
    public Map findByTuXiangGIS(Map searchMap);

    //图像的gis第一滑框实时数据
    public Map findByTuXiangGIS();

    //图像的gis第一滑框实时数据统计
    public Integer findByTuXiangGISTJ(Map searchMap);
}
