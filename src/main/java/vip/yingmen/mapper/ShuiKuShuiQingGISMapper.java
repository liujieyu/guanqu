package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.ShuiKuShuiQingGIS;
import vip.yingmen.pojo.SiteRealInfoGIS;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ShuiKuShuiQingGISMapper {
    //水库水情的gis第一滑框实时数据
    public List<ShuiKuShuiQingGIS> findByShuiKuShuiQingGIS(@RequestParam("searchMap")Map searchMap);

    //水库水情的gis第一滑框实时数据
    public List<ShuiKuShuiQingGIS> findByShuiKuShuiQingGIS();

    //站点水雨情运行工况实时数据
    public List<SiteRealInfoGIS> findBySiteInfoGIS(@RequestParam("searchMap")Map searchMap);

    //获取当前时间
    public String selectCurrentTime();

    //水位-库容-水面面积关系曲线数据
    public List<Map> selectRZKrArData(@Param("STCD") String STCD);

    //根据水位获取库容
    public BigDecimal selectKrByRz(@Param("RZ") Double RZ,@Param("STCD") String STCD);

    //根据水位获取水面面积
    public BigDecimal selectArByRz(@Param("RZ") Double RZ,@Param("STCD") String STCD);
}
