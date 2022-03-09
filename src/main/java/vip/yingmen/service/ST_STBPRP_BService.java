package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ST_STBPRP_B;

import java.util.List;

public interface ST_STBPRP_BService {
    public List<ST_STBPRP_B> findAll();                //查找全部

    //根据关联编号RelateCode来查询测站基本信息
    public PageInfo<ST_STBPRP_B> findByRELATECODE(String RELATECODE);      //根据RELATECODE查找
}
