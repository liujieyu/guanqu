package vip.yingmen.service;

import vip.yingmen.pojo.SiteRealInfoGIS;

import java.util.List;
import java.util.Map;

public interface ShuiKuShuiQingGISService {
    //水库水情的gis第一滑框实时数据
    public Map findByShuiKuShuiQingGIS(Map searchMap);

    //水库水情的gis第一滑框实时数据
    public Map findByShuiKuShuiQingGIS();

    //站点水雨情运行工况实时数据
    public Map findBySiteInfoGIS(Map searchMap);

    //情势分析  获取预警数据
    public Map findCurYujing();

    //获取当前时间
    public String findCurrentTime();

    //仪表图统计信息
    public Map findSiteTongjiInfo();
}
