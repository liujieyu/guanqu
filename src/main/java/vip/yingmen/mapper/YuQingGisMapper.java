package vip.yingmen.mapper;

import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.YuQingGis;

import java.util.List;
import java.util.Map;

public interface YuQingGisMapper {
    //雨情的gis第一滑框实时数据
    public List<YuQingGis> findByYuQingGIS(@RequestParam("searchMap")Map searchMap);

    //雨情的gis第一滑框实时数据
    public List<YuQingGis> findByYuQingGIS();
}
