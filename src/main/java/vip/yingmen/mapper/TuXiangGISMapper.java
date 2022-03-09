package vip.yingmen.mapper;

import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.TuXiangGIS;

import java.util.List;
import java.util.Map;

public interface TuXiangGISMapper {
    //图像的gis第一滑框实时数据
    public List<TuXiangGIS> findByTuXiangGIS(@RequestParam("searchMap") Map searchMap);

    //图像的gis第一滑框实时数据
    public List<TuXiangGIS> findByTuXiangGIS();
}
