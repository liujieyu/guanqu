package vip.yingmen.mapper;

import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.YunXingGongKuangGIS;

import java.util.List;
import java.util.Map;

public interface YunXingGongKuangGISMapper {
    //运行工况的gis第一滑框实时数据
    public List<YunXingGongKuangGIS> findByYunXingGongKuangGIS(@RequestParam("searchMap") Map searchMap);

    //运行工况的gis第一滑框实时数据
    public List<YunXingGongKuangGIS> findByYunXingGongKuangGIS();
}
