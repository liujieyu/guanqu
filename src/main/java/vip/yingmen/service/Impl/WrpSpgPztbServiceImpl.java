package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import vip.yingmen.pojo.WrpSpgPztb;
import vip.yingmen.mapper.WrpSpgPztbMapper;
import vip.yingmen.service.WrpSpgPztbService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
@Service
public class WrpSpgPztbServiceImpl extends ServiceImpl<WrpSpgPztbMapper, WrpSpgPztb> implements WrpSpgPztbService {
    @Autowired
    private WrpSpgPztbMapper wrpSpgPztbMapper;
    //新增渗压管信息
    public int addSpgPztb(WrpSpgPztb pojo){
        return wrpSpgPztbMapper.insert(pojo);
    }
    //修改渗压管信息
    public int modifySpgPztb(WrpSpgPztb pojo){
        return wrpSpgPztbMapper.updateById(pojo);
    }
    //删除渗压管信息
    public int dropSpgPztb(String ids){
        return wrpSpgPztbMapper.deleteBatchIds(Arrays.asList(ids.split(",")));
    }
    //根据ID查询渗压管信息
    public WrpSpgPztb findSpgPztbById(int ID){
        return wrpSpgPztbMapper.selectSlylInfoById(ID);
    }
}
