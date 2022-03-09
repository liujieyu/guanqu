package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface LiShiYuQingService {
    //历史数据的小时表统计
    public PageInfo<LiShiYuQingTongJi> findByXiaoShiTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String Time_min, String Time_max);

    //历史数据的小时表雨量区间站数统计统计
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByXiaoShiZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String Time_min, String Time_max);

    //历史数据的小时表列表查询
    public List<LiSHiYuQingXiaoShiLieBiao> findByXiaoShiLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String Time_min, String Time_max,String _orderby);

    //历史数据的雨情小时表特征查询，需要先把站点查出来给小时查询当作参数
    public  List<Map<String, ArrayList<Map<Object, String>>>> findByXiaoShiTeZheng(String Time_min, String Time_max, String ADDVCD, String Canal_Code, String STGR, String STNM);

    //历史数据的日表统计
    public PageInfo<LiShiYuQingTongJi> findByRiTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String TM);

    //历史数据的日表雨量区间站数统计统计
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByRiZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String TM);

    //历史数据的日表列表查询
    public List<Map> findByRiLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String Time_min, String Time_max, String TM, String _orderby);

    //历史数据的旬表统计
    public PageInfo<LiShiYuQingTongJi> findByXunTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String TM);

    //历史数据的旬表雨量区间站数统计统计
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByXunZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR,String MON);

    //历史数据的旬表列表查询
    public PageInfo<LiSHiYuQingXunLieBiao> findByXunLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P,  String TM, String _orderby, String YR, String MON);

    //历史数据的月表统计
    public PageInfo<LiShiYuQingTongJi> findByYueTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR,String MON);

    //历史数据的月表雨量区间站数统计统计
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByYueZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR,String MON);

    //历史数据的月表列表查询
    public List<Map> findByYueLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR, String MON, String TM, String _orderby);

    //历史数据的年表统计
    public PageInfo<LiShiYuQingTongJi> findByNianTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR);

    //历史数据的年表雨量区间站数统计统计
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByNianZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR);

    //历史数据的年表列表查询
    public List<Map> findByNianLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR, String _orderby);

    //历史数据的最高水位表统计分析栏
    public PageInfo<LSYQShuiWeiTJ> findByZGSWTJ(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String YR);

    //历史数据的最高水位表统计分析栏
    public PageInfo<LSYQZGSWLieBiao> findByZGSWLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String YR);

}
