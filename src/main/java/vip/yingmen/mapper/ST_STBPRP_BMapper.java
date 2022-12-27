package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_STBPRP_B;

import java.util.List;

public interface ST_STBPRP_BMapper {
    public List<ST_STBPRP_B> findAll();
    //根据关联编号RelateCode来查询测站基本信息
    public List<ST_STBPRP_B> findByRELATECODE(@Param("RELATECODE") String RELATECODE);
}
