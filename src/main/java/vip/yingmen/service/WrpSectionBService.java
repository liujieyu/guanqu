package vip.yingmen.service;

import vip.yingmen.pojo.WrpSectionB;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
public interface WrpSectionBService extends IService<WrpSectionB> {
    //新增断面信息
    int addWrpSectionInfo(WrpSectionB wrpSectionB);
    //修改断面信息
    int modifyWrpSectionById(WrpSectionB wrpSectionB);
    //删除断面信息
    int dropWrpSectionById(String ids);
    //根据ID查询断面信息
    WrpSectionB queryWrpSectionById(int id);
}
