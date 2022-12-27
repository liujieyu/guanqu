package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WRP_AD_B;

import java.util.List;

public interface WRP_AD_BService {
    public List<WRP_AD_B> findAll();                //查找全部
    public PageInfo<WRP_AD_B> findByAD_CD(String AD_CD);       //根据AD_CD查找
}
