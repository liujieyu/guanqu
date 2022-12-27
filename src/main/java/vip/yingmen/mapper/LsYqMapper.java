package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import vip.yingmen.pojo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public interface LsYqMapper {
    //历史数据的小时表统计
    public List<LiShiYuQingTongJi> findByXiaoShiTongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);

    //历史数据的雨情雨量区间站数统计
    public List<LiShiYuQingXiaoShiZhanShuTongJi> findByXiaoShiTZhanShuongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);

    //历史数据的雨情的列表查询
    public List<LiSHiYuQingXiaoShiLieBiao> findByXiaoShiLieBiao(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);

    //历史数据的雨情小时表站点查询，需要先把站点查出来给小时查询当作参数
    public ArrayList<Map<Object, String>> findByZhanDian(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR , @Param("STNM") String STNM);
    //历史数据的雨情小时表查询
    public ArrayList<Map<Object, String>> findByXiaoShiTeZheng(@Param("Time_min") String Time_min,@Param("Time_max") String Time_max,@Param("list") List list);

    //历史数据的日表统计
    public List<LiShiYuQingTongJi> findByRiTongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("TM") String TM);

    //历史数据的雨情雨量区间站数统计
    public List<LiShiYuQingXiaoShiZhanShuTongJi> findByRiZhanShuTongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("TM") String TM);

    //历史数据的雨情的列表查询
    public List<Map> findByRiLieBiao(@Param("_page") Integer _page,@Param("_page_size") Integer _page_size,@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max, @Param("TM") String TM,@Param("_orderby") String _orderby);

    //历史数据的旬表统计
    public List<LiShiYuQingTongJi> findByXunTongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("TM") String TM);

    //历史数据的雨情旬雨量区间站数统计
    public List<LiShiYuQingXiaoShiZhanShuTongJi> findByXunZhanShuTongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("YR") String YR,@Param("MON") String MON);

    //历史数据的雨情的旬列表查询
    public List<LiSHiYuQingXunLieBiao> findByXunLieBiao( @Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("TM") String TM, @Param("YR") String YR,@Param("MON") String MON);

    //历史数据的月表统计
    public List<LiShiYuQingTongJi> findByYueTongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("YR") String YR,@Param("MON") String MON);

    //历史数据的雨情月雨量区间站数统计
    public List<LiShiYuQingXiaoShiZhanShuTongJi> findByYueZhanShuTongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("YR") String YR,@Param("MON") String MON);

    //历史数据的雨情的月列表查询
    public List<Map> findByYueLieBiao(@Param("_page") Integer _page,@Param("_page_size") Integer _page_size,@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("YR") String YR, @Param("MON") String MON, @Param("TM") String TM,@Param("_orderby") String _orderby);

    //历史数据的年表统计
    public List<LiShiYuQingTongJi> findByNianTongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("YR") String YR);

    //历史数据的雨情年雨量区间站数统计
    public List<LiShiYuQingXiaoShiZhanShuTongJi> findByNianZhanShuTongJi(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("YR") String YR);

    //历史数据的雨情的年列表查询
    public List<Map> findByNianLieBiao(@Param("_page") Integer _page,@Param("_page_size") Integer _page_size,@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("P") String P, @Param("YR") String YR,@Param("_orderby") String _orderby);


    //历史数据的雨情最高水位的统计分析
    public List<LSYQShuiWeiTJ> findByZGSWTJ(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("YR") String YR);

    //历史数据的雨情最高水位的列表查询
    public List<LSYQZGSWLieBiao> findByZGSWLieBiao(@Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("STGR") String STGR, @Param("STNM") String STNM, @Param("YR") String YR);

}
