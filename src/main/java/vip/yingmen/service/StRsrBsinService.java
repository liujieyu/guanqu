package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.StRsrBsin;
import com.baomidou.mybatisplus.extension.service.IService;
import vip.yingmen.pojo.StRsrHych;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liujieyu
 * @since 2022-12-26
 */
public interface StRsrBsinService extends IService<StRsrBsin> {
    //水库站基本信息查询
    List<StRsrBsin> selectRsrBsinInfoByCon(Map searchMap);
    //测站防洪基本信息查询
    List<StRsrHych> selectRsrHychByCon(Map searchMap);
    //分页查询水库站基本信息查询
    PageInfo<StRsrBsin> selectRsrBsinInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap);
    //分页查询防洪基本信息
    PageInfo<StRsrHych> selectRsrHychInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap);
    //获取监测站点列表
    List<Map> selectStcdList();
    //判断断面编号是否存在
    Integer selectDamcdByCheck(String DAMCD);
    //判断断面特征编号是否存在
    Integer selectDamscdBycheck(String DAMSCD);
}
