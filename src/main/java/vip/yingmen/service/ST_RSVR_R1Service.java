package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_RSVR_R1;

public interface ST_RSVR_R1Service {
    //查询全部
    public PageInfo<ST_RSVR_R1> findAll(Integer _page, Integer _page_size);
}
