package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import vip.yingmen.mapper.WrpSpgSpqnmpMapper;
import vip.yingmen.pojo.WrpSpgLsy;
import vip.yingmen.mapper.WrpSpgLsyMapper;
import vip.yingmen.pojo.WrpSpgSpqnmp;
import vip.yingmen.service.WrpSpgLsyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
@Service
public class WrpSpgLsyServiceImpl extends ServiceImpl<WrpSpgLsyMapper, WrpSpgLsy> implements WrpSpgLsyService {
    @Autowired
    private WrpSpgLsyMapper wrpSpgLsyMapper;
    @Autowired
    private WrpSpgSpqnmpMapper wrpSpgSpqnmpMapper;
    //新增渗流量测站和设备信息
    public int addSpgLsyAndSpqnmp(WrpSpgSpqnmp pojo){
        WrpSpgLsy lsyobj=new WrpSpgLsy();
        lsyobj.setMpcd(pojo.getMpcd());
        lsyobj.setLtype(pojo.getLtype());
        lsyobj.setDhname(pojo.getDhname());
        lsyobj.setSetinfo(pojo.getSetinfo());
        lsyobj.setTdmin(pojo.getTdmin());
        lsyobj.setSpprwl(pojo.getSpprwl());
        lsyobj.setIndt(pojo.getIndt());
        lsyobj.setDvcd(pojo.getDvcd());
        lsyobj.setDtuptm(pojo.getDtuptm());
        wrpSpgSpqnmpMapper.insert(pojo);
        wrpSpgLsyMapper.insert(lsyobj);
        return 1;
    }
    //修改渗流量测站和设备信息
    public int modifySpgLsyAndSpqnmp(WrpSpgSpqnmp pojo){
        WrpSpgLsy lsyobj=new WrpSpgLsy();
        lsyobj.setId(pojo.getSbid());
        lsyobj.setMpcd(pojo.getMpcd());
        lsyobj.setLtype(pojo.getLtype());
        lsyobj.setDhname(pojo.getDhname());
        lsyobj.setSetinfo(pojo.getSetinfo());
        lsyobj.setTdmin(pojo.getTdmin());
        lsyobj.setSpprwl(pojo.getSpprwl());
        lsyobj.setIndt(pojo.getIndt());
        lsyobj.setDvcd(pojo.getDvcd());
        lsyobj.setDtuptm(pojo.getDtuptm());
        wrpSpgSpqnmpMapper.updateById(pojo);
        wrpSpgLsyMapper.updateById(lsyobj);
        return 1;
    }
    //删除渗流量测站和设备信息
    public int dropSpgLsyAndSpqnmp(String ids,String sbids){
        wrpSpgSpqnmpMapper.deleteBatchIds(Arrays.asList(ids.split(",")));
        wrpSpgLsyMapper.deleteBatchIds(Arrays.asList(sbids.split(",")));
        return 1;
    }
    //根据ID获取渗流量测站和设备信息
    public Map getSpgLsyAndSpqnmpById(int ID,int SBID){
        WrpSpgSpqnmp cdinfo=wrpSpgSpqnmpMapper.selectSllcdInfoById(ID);
        WrpSpgLsy sbinfo= wrpSpgLsyMapper.selectById(SBID);
        Map map=new HashMap();
        map.put("cdinfo",cdinfo);
        map.put("sbinfo",sbinfo);
        return map;
    }
}
