package vip.yingmen.mapper;

import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.ShuiKuShuiQingGIS;

import java.util.List;
import java.util.Map;

public interface ShuiKuShuiQingGISMapper {
    //水库水情的gis第一滑框实时数据
    public List<ShuiKuShuiQingGIS> findByShuiKuShuiQingGIS(@RequestParam("searchMap")Map searchMap);

    //水库水情的gis第一滑框实时数据
    public List<ShuiKuShuiQingGIS> findByShuiKuShuiQingGIS();
}
