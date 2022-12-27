package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WrpDfrSrhrds;
import vip.yingmen.pojo.WrpDfrSrvrds;
import vip.yingmen.pojo.WrpSpgSppr;
import vip.yingmen.pojo.WrpSpgSpprL;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
public interface WrpSpgSpprLService extends IService<WrpSpgSpprL> {

    //根据条件获取实时大坝站点信息
    public Map findSafeBySiteInfoGIS(Map searchMap);
    //大坝安全监测情势分析
    public Map<String,Object> findSafeCurYujing();
    //渗流压力历史数据
    public PageInfo<WrpSpgSppr> findSafeSlylBylishi(Integer _page, Integer _page_size, String MPCD, String Time_min, String Time_max, String _orderby);
    //渗流量历史数据
    public PageInfo<WrpSpgSpprL> findSafeSllBylishi(Integer _page, Integer _page_size,String MPCD,String Time_min,String Time_max,String _orderby);
    //表面水平位移历史数据
    public PageInfo<WrpDfrSrhrds> findSafeSpwyBylishi(Integer _page, Integer _page_size, String MPCD, String Time_min, String Time_max, String _orderby);
    //表面垂直位移历史数据
    public PageInfo<WrpDfrSrvrds> findSafeCzwyBylishi(Integer _page, Integer _page_size, String MPCD, String Time_min, String Time_max, String _orderby);
    //大坝安全监测超阈值统计
    public Map<String,Object> findSafeChartByTongji();
}
