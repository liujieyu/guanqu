package vip.yingmen.mapper;

import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.ZhaFaShuiQingGIS;

import java.util.List;
import java.util.Map;

public interface ZhaFaShuiQingGISMapper {
    //闸阀水情的gis第一滑框实时数据
    public List<ZhaFaShuiQingGIS> findByZhaFaShuiQingGISGIS(@RequestParam("searchMap") Map searchMap);
    //闸阀水情的gis第一滑框实时数据
    public List<ZhaFaShuiQingGIS> findByZhaFaShuiQingGISGIS();
}
