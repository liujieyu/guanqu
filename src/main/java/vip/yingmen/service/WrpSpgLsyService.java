package vip.yingmen.service;

import vip.yingmen.pojo.WrpSpgLsy;
import com.baomidou.mybatisplus.extension.service.IService;
import vip.yingmen.pojo.WrpSpgSpqnmp;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
public interface WrpSpgLsyService extends IService<WrpSpgLsy> {
    //新增渗流量测站和设备信息
    int addSpgLsyAndSpqnmp(WrpSpgSpqnmp pojo);
    //修改渗流量测站和设备信息
    int modifySpgLsyAndSpqnmp(WrpSpgSpqnmp pojo);
    //删除渗流量测站和设备信息
    int dropSpgLsyAndSpqnmp(String ids,String sbids);
    //根据ID获取渗流量测站和设备信息
    WrpSpgSpqnmp getSpgLsyAndSpqnmpById(int ID, int SBID);
    //根据站点编号查询断面编号
    List<Map> selectDmcdByStcd(String STCD);
    //判断测点编号是否存在
    Integer findMpcdExist(int TYPE,String MPCD);
}
