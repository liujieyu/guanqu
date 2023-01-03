package vip.yingmen.service;

import vip.yingmen.pojo.WrpDamsB;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
public interface WrpDamsBService extends IService<WrpDamsB> {
    //新增断面特征信息
    int addWrpDamsB(WrpDamsB wrpDamsB);
    //修改断面特征信息
    int modifyWrpDamsB(WrpDamsB wrpDamsB);
    //删除断面特征信息
    int dropWrpDamsB(String ids);
    //根据ID查询断面特征信息
    WrpDamsB findWrpDamsBById(int id);
}
