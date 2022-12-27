package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.LiShiShuiWeiKuRongLieBiao;

import java.util.List;

public interface LsSwkrMapper {
    public List<LiShiShuiWeiKuRongLieBiao> findByLieBiao(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("LEVEL") String LEVEL, @Param("STGR")String STGR, @Param("STNM") String STNM);
}
