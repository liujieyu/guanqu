package vip.yingmen.mapper;

import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.QuDaoShuiQingGIS;

import java.util.List;
import java.util.Map;

public interface QuDaoShuiQingGISMapper {
    //渠道水情的gis第一滑框实时数据
    public List<QuDaoShuiQingGIS> findByQuDaoShuiQingGIS(@RequestParam("searchMap") Map searchMap);

    //渠道水情的gis第一滑框实时数据
    public List<QuDaoShuiQingGIS> findByQuDaoShuiQingGIS();
}
