package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JiChuJianCeZhanDian;

import java.util.List;

public interface JcJczdMapper {
    public List<JiChuJianCeZhanDian> findByJianCeZhanDian(@Param("STNM") String STNM, @Param("ADDlist") List ADDlist, @Param("STTP")String STTP, @Param("STGR")String STGR, @Param("TYPE") String TYPE);
}
