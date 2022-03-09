package vip.yingmen.service.Impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.DetailsMapper;
import vip.yingmen.pojo.Details;
import vip.yingmen.pojo.ShiPinDetails;
import vip.yingmen.service.DetalisService;

@Service
public class DetalisServiceImpl implements DetalisService {
    @Autowired
    private DetailsMapper detailsMapper;

    /**
     * gis第二滑框站点信息
     * @param ID
     * @return
     */
    @Override
    public Details findByZhanDianXinXi(String ID) {
        return detailsMapper.findByZhanDianXinXi(ID);
    }

    /**
     * gis第二滑框站点信息
     * @param ID
     * @return
     */
    @Override
    public ShiPinDetails findByZhanDianShiPin(String ID) {
        ShiPinDetails byZhanDianShiPin = detailsMapper.findByZhanDianShiPin(ID);
        if (byZhanDianShiPin != null){
            if (byZhanDianShiPin.getCSTYPE()==null){
                return detailsMapper.findByZhanDianShiPin2(ID);
            }else{
                return byZhanDianShiPin;
            }
        }
       return null;
}
}
