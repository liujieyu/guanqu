package vip.yingmen.service;

import vip.yingmen.pojo.Details;
import vip.yingmen.pojo.ShiPinDetails;

public interface DetalisService {
    //gis的第二滑框站点信息查询
    public Details findByZhanDianXinXi(String ID);

    //gis的第二滑框站点信息查询
    public ShiPinDetails findByZhanDianShiPin(String ID);
}
