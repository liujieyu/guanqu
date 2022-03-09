package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.ShiPinFuZhu;
import vip.yingmen.pojo.ShiPinGIS;

import java.util.List;
import java.util.Map;

public interface ShiPinGISMapper {
    //视频gis列表实时查询
    public List<ShiPinGIS> findByShiPinGIS(@RequestParam("searchMap") Map searchMap);
    //视频gis列表实时查询
    public List<ShiPinGIS> findByShiPinGIS();

    public List<ShiPinFuZhu> findByShiPin(@Param("STCD")String stcd);
}
