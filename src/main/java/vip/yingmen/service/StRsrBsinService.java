package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.entity.StPpAlarm;
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
    //新增监测站点信息
    void addSiteInfo(StRsrBsin pojo);
    //修改监测站点信息
    void modifySiteInfo(StRsrBsin pojo);
    //删除监测站点信息
    void dropSiteInfo(String ids,String stcds);
    //根据ID查询站点信息
    StRsrBsin selectSiteInfoById(int id);
    //判断监测站点编码是否存在
    Integer selectStcdExist(String STCD);
    //查询监测站点基本信息（维护）
    PageInfo<StRsrBsin> selectSiteInfoManageByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap);
    //根据ID查询测站防洪信息
    StRsrHych selectRsrAlarmById(int ID);
    //新增水库水位预警信息
    void addStRsvAlarmInfo(StRsrHych pojo);
    //修改水库水位预警信息
    void modifyStRsvAlarmInfo(StRsrHych pojo);
    //根据ID删除水库预警信息
    void dropStRsvAlarmInfo(String ids,String alarmids);
    //判断防洪预警中监测站点是否存在
    Integer checkStcdInAlarm(String stcd);
    //新增降雨预警信息
    void addPpAlarm(StPpAlarm pojo);
    //修改降雨预警信息
    void modifyPpAlarm(StPpAlarm pojo);
    //删除降雨预警信息
    void dropPpAlarm(String ids);
    //根据ID查询降雨预警信息
    StPpAlarm selectPpAlarmById(int ID);
    //判断雨量预警中监测站点是否存在
    Integer selectStcdInPpAlarm(String stcd,int ewl);
    //根据STCD获取站点基本信息和库容信息
    Map selectSiteBaseByStcd(String stcd);
    //获取特征库容基本信息
    StRsrHych selectTzKrByStcd(String stcd);
}
