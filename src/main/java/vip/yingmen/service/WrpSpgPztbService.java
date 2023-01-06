package vip.yingmen.service;

import vip.yingmen.pojo.WrpDfrSrhrdsmp;
import vip.yingmen.pojo.WrpSpgPztb;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
public interface WrpSpgPztbService extends IService<WrpSpgPztb> {
    //新增渗压管信息
    int addSpgPztb(WrpSpgPztb pojo);
    //修改渗压管信息
    int modifySpgPztb(WrpSpgPztb pojo);
    //删除渗压管信息
    int dropSpgPztb(String ids);
    //根据ID查询渗压管信息
    WrpSpgPztb findSpgPztbById(int ID);
    //新增水平位移测点信息
    int addSrhrdsmp(WrpDfrSrhrdsmp pojo);
    //修改水平位移测点信息
    int modifySrhrdsmp(WrpDfrSrhrdsmp pojo);
    //删除水平位移测点信息
    int dropWrhrdsmp(String ids);
    //根据ID查询水平位移测点信息
    WrpDfrSrhrdsmp findSrhrdsmpById(int ID);
}
