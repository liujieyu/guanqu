package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.Details;
import vip.yingmen.pojo.ShiPinDetails;

public interface DetailsMapper {
    //gis第二滑框站点信息查询
    public Details findByZhanDianXinXi(@Param("ID")String ID);

    //gis第二滑框站点信息查询
    public ShiPinDetails findByZhanDianShiPin(@Param("ID")String ID);

    //gis第二滑框站点信息查询
    public ShiPinDetails findByZhanDianShiPin2(@Param("ID")String ID);
}
