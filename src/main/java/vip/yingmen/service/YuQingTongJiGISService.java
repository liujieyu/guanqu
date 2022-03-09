package vip.yingmen.service;

import vip.yingmen.pojo.YuQingTongJiGIS;

public interface YuQingTongJiGISService {
    //雨情gis第二滑框小时列表统计查询
    public YuQingTongJiGIS findByXiaoShi(String STCD, String Time_min, String Time_max);

    //雨情gis第二滑框日列表统计查询
    public YuQingTongJiGIS findByRi(String STCD, String Time_min, String Time_max);

    //雨情gis第二滑框旬列表统计查询
    public YuQingTongJiGIS findByXun(String STCD, String Time_min, String Time_max);

    //雨情gis第二滑框月列表统计查询
    public YuQingTongJiGIS findByYue(String STCD, String Time_min, String Time_max);

    //雨情gis第二滑框年列表统计查询
    public YuQingTongJiGIS findByNian(String STCD, String Time_min, String Time_max);
}
