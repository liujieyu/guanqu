package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import vip.yingmen.pojo.WrpDamsB;
import vip.yingmen.mapper.WrpDamsBMapper;
import vip.yingmen.service.WrpDamsBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * <p>
 *  断面特征服务实现类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
@Service
public class WrpDamsBServiceImpl extends ServiceImpl<WrpDamsBMapper, WrpDamsB> implements WrpDamsBService {
    @Autowired
    private WrpDamsBMapper wrpDamsBMapper;
    //新增断面特征信息
    public int addWrpDamsB(WrpDamsB wrpDamsB){
        return wrpDamsBMapper.insert(wrpDamsB);
    }
    //修改断面特征信息
    public int modifyWrpDamsB(WrpDamsB wrpDamsB){
        return wrpDamsBMapper.updateById(wrpDamsB);
    }
    //删除断面特征信息
    public int dropWrpDamsB(String ids){
        return wrpDamsBMapper.deleteBatchIds(Arrays.asList(ids.split(",")));
    }
    //根据ID查询断面特征信息
    public WrpDamsB findWrpDamsBById(int id){
        return wrpDamsBMapper.selectById(id);
    }
}
