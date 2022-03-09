package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_JPG_H;

public interface ST_JPG_HService {
    //图像gis的第二滑框历史表查询
    public PageInfo<ST_JPG_H> findBySingleLiShi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max,String _orderby);
}
