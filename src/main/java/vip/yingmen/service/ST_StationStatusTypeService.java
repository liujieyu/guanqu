package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_StationStatusType;
import vip.yingmen.pojo.ST_StationStatus_H;

public interface ST_StationStatusTypeService {
    //查找全部
    public PageInfo<ST_StationStatusType> findAll(Integer _page, Integer _page_size);
}
