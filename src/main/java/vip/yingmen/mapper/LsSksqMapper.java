package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ShuiKuShuiQingLiShiBiao;
import vip.yingmen.pojo.ShuiKuShuiQingRiBiao;
import vip.yingmen.pojo.ShuiKuShuiQingYueBiao;

import java.util.List;

public interface LsSksqMapper {
    //历史数据报表的水库水情日表
    public List<ShuiKuShuiQingRiBiao> fandByRiBiao(@Param("TM") String TM, @Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("LEVEL") String LEVEL, @Param("STGR") String STGR , @Param("STNM") String STNM);

    //历史数据报表的水库水情月表
    public List<ShuiKuShuiQingYueBiao> fandByYueBiao(@Param("YR") String YR, @Param("MON") String MON, @Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("LEVEL") String LEVEL, @Param("STGR") String STGR , @Param("STNM") String STNM);

    //历史数据报表的水库水情历史表
    public List<ShuiKuShuiQingLiShiBiao> fandByLiShiBiao(@Param("Time_min") String Time_min, @Param("Time_max") String Time_max,@Param("STCD") String STCD);
}
