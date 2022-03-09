package vip.yingmen.mapper;

import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.HeDaoShuiQingGIS;

import java.util.List;
import java.util.Map;

public interface HeDaoShuiQingGisMapper {
    //河道水情的gis第一滑框实时数据
    public List<HeDaoShuiQingGIS> findByHeDaoShuiQingGIS(@RequestParam("searchMap") Map searchMap);

    //河道水情的gis第一滑框实时数据
    public List<HeDaoShuiQingGIS> findByHeDaoShuiQingGIS();
}
