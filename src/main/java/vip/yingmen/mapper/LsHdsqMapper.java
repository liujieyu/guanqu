package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface LsHdsqMapper {
    //河道水情历史数据的小时表站点查询，查询出来的数据给小时查询做为参数
    public ArrayList<Map<Object, String>> findByZhanDian(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code,@Param("LEVEL") String LEVEL,@Param("STGR") String STGR,@Param("STNM") String STNM);

    //河道水情历史数据的小时表查询，拿查询出来的数据给小时查询做为参数
    public ArrayList<Map<Object, String>> findByXiaoShi(@Param("Time_min") String Time_min,@Param("Time_max") String Time_max,@Param("list") List list);

    //历史数据报表的河道水情日表
    public List<HeDaoShuiQingRiBiao> fandByRiBiao(@Param("TM") String TM, @Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code,  @Param("STGR") String STGR, @Param("STNM") String STNM);

    //历史数据报表的河道水情月表
    public List<HeDaoShuiQingYueBiao> fandByYueBiao(@Param("YR") String YR, @Param("MON") String MON, @Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code,  @Param("STGR") String STGR, @Param("STNM") String STNM);

    //历史数据报表的河道水情历史表
    public List<HeDaoShuiQingLiShiBiao> fandByLiShiBiao( @Param("Time_min") String Time_min, @Param("Time_max") String Time_max,@Param("STCD") String STCD);

    //历史数据的河道水情的最高水位查询
    public List<HeDaoShuiQingZuiGaoShuiWeiBiao> findByZuiGaoShuiWei(@Param("YR") String YR,@Param("ADDVCD") String ADDVCD, @Param("STGR") String STGR, @Param("STNM") String STNM);
}
