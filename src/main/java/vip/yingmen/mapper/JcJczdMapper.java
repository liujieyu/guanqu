package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JiChuJianCeZhanDian;

import java.util.List;

public interface JcJczdMapper {
    public List<JiChuJianCeZhanDian> findByJianCeZhanDian(@Param("STNM") String STNM, @Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STTP")String STTP, @Param("STGR")String STGR, @Param("TYPE") String TYPE);
}
