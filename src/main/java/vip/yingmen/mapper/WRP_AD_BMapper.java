package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.WRP_AD_B;

import java.util.List;

public interface WRP_AD_BMapper {
        public List<WRP_AD_B> findAll();
        //根据AD_CD查询全部行政区划表
        public List<WRP_AD_B> findByAD_CD(@Param("AD_CD") String AD_CD);
}
