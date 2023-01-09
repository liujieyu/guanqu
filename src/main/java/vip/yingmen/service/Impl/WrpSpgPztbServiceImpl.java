package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import vip.yingmen.mapper.WrpDfrSrhrdsmpMapper;
import vip.yingmen.mapper.WrpDfrSrvrdsmpMapper;
import vip.yingmen.pojo.WrpDfrSrhrdsmp;
import vip.yingmen.pojo.WrpDfrSrvrdsmp;
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
    @Autowired
    private WrpDfrSrhrdsmpMapper wrpDfrSrhrdsmpMapper;
    @Autowired
    private WrpDfrSrvrdsmpMapper wrpDfrSrvrdsmpMapper;
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
    //新增水平位移测点信息
    public int addSrhrdsmp(WrpDfrSrhrdsmp pojo){
        return wrpDfrSrhrdsmpMapper.insert(pojo);
    }
    //修改水平位移测点信息
    public int modifySrhrdsmp(WrpDfrSrhrdsmp pojo){
        return wrpDfrSrhrdsmpMapper.updateById(pojo);
    }
    //删除水平位移测点信息
    public int dropWrhrdsmp(String ids){
        return wrpDfrSrhrdsmpMapper.deleteBatchIds(Arrays.asList(ids.split(",")));
    }
    //根据ID查询水平位移测点信息
    public WrpDfrSrhrdsmp findSrhrdsmpById(int ID){
        return wrpSpgPztbMapper.selectSpwyInfoById(ID);
    }
    //新增沉降位移测点信息
    public int addSrvrdsmp(WrpDfrSrvrdsmp pojo){
        return wrpDfrSrvrdsmpMapper.insert(pojo);
    }
    //修改沉降位移测点信息
    public int modifySrvrdsmp(WrpDfrSrvrdsmp pojo){
        return wrpDfrSrvrdsmpMapper.updateById(pojo);
    }
    //删除沉降位移测点信息
    public int dropSrvrdsmp(String ids){
        return wrpDfrSrvrdsmpMapper.deleteBatchIds(Arrays.asList(ids.split(",")));
    }
    //根据ID获取沉降位移测点信息
    public WrpDfrSrvrdsmp findSrvrdsmpById(int ID){
        return wrpSpgPztbMapper.selectCjwyInfoById(ID);
    }
}
