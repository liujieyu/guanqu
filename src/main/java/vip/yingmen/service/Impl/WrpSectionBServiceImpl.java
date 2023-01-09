package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import vip.yingmen.mapper.StRsrBsinMapper;
import vip.yingmen.pojo.WrpSectionB;
import vip.yingmen.mapper.WrpSectionBMapper;
import vip.yingmen.service.WrpSectionBService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * <p>
 *  断面服务实现类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
@Service
public class WrpSectionBServiceImpl extends ServiceImpl<WrpSectionBMapper, WrpSectionB> implements WrpSectionBService {
    @Autowired
    private WrpSectionBMapper wrpSectionBMapper;
    @Autowired
    private StRsrBsinMapper stRsrBsinMapper;
    //新增断面信息
    public int addWrpSectionInfo(WrpSectionB wrpSectionB){
        return wrpSectionBMapper.insert(wrpSectionB);

    }
    //修改断面信息
    public int modifyWrpSectionById(WrpSectionB wrpSectionB){
        return wrpSectionBMapper.updateById(wrpSectionB);
    }
    //删除断面信息
    public int dropWrpSectionById(String ids){
        stRsrBsinMapper.deleteDamsinfoByDmId(ids);
        return wrpSectionBMapper.deleteBatchIds(Arrays.asList(ids.split(",")));
    }
    //根据ID查询断面信息
    public WrpSectionB queryWrpSectionById(int id){
        return stRsrBsinMapper.selectDminfoByDamcd(id);
    }
}
