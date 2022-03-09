package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ST_Canal_R;

import java.util.Date;
import java.util.List;

public interface ST_Canal_RMapper {
    //渠道水情gis的第二滑框历史表查询
    public List<ST_Canal_R> findBySingleLiShi(@Param("STCD") String STCD, @Param("STNM") String STNM,@Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
}
