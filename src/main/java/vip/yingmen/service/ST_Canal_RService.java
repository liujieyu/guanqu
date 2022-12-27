package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_Canal_R;

import java.util.Date;
import java.util.List;

public interface ST_Canal_RService {
    //渠道水情gis的第二滑框历史表查询
    public PageInfo<ST_Canal_R> findBySingleLiShi(Integer _page, Integer _page_size, String STCD,String STNM, String Time_min, String Time_max, String _orderby);
}
