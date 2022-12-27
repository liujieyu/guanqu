package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 大坝安全一张图、实时监测、表格接口
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
public interface WrpSpgSpprLMapper extends BaseMapper<WrpSpgSpprL> {
    //根据条件获取实时大坝站点信息
    public List<SiteSafeInfoGIS> findSafeBySiteInfoGIS(@RequestParam("searchMap") Map searchMap);
    //根据水库站点编码条件查询渗流量
    public List<WrpSpgSpprL> findSafeSllByStcds(@RequestParam("siteMap") Map siteMap);
    //根据水库站点编码条件查询渗流压力
    public List<WrpSpgSppr> findSafeSlylByStcds(@RequestParam("siteMap") Map siteMap);
    //根据水库站点编码条件查询水平位移
    public List<WrpDfrSrhrds> findSafeSpwyByStcds(@RequestParam("siteMap") Map siteMap);
    //根据水库站点编码条件查询垂直位移
    public List<WrpDfrSrvrds> findSafeczwyByStcds(@RequestParam("siteMap") Map siteMap);
    //渗流压力历史数据
    public List<WrpSpgSppr> findSafeSlylBylishi(@Param("MPCD") String MPCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
    //渗流量历史数据
    public List<WrpSpgSpprL> findSafeSllBylishi(@Param("MPCD") String MPCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
    //表面水平位移历史数据
    public List<WrpDfrSrhrds> findSafeSpwyBylishi(@Param("MPCD") String MPCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
    //表面垂直位移历史数据
    public List<WrpDfrSrvrds> findSafeCzwyBylishi(@Param("MPCD") String MPCD, @Param("Time_min") String Time_min, @Param("Time_max") String Time_max);
    //渗流量超阈值统计
    public Map<String,Object> findSafeSllByTongji();
    //渗流压力超阈值统计
    public Map<String,Object> findSafeSlylByTongji();
    //位移变形超阈值统计
    public Map<String,Object> findSafeWybxByTongji();
    //沉降变形超阈值统计
    public Map<String,Object> findSageCjbxByTongji();
}
