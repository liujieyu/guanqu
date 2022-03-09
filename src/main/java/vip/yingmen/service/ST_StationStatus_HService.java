package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_StationStatus_H;

public interface ST_StationStatus_HService {
    //运行工况gis第二滑框的历史列表查询
    public PageInfo<ST_StationStatus_H> findByYunXingGongKuang(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby);
}
