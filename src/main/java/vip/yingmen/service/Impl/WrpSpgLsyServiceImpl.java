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
import java.util.List;
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
        pojo.setLtype(null);
        pojo.setDhname(null);
        pojo.setSetinfo(null);
        pojo.setTdmin(null);
        pojo.setSpprwl(null);
        pojo.setSbid(null);
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
        lsyobj.setId(pojo.getSbid().intValue());
        pojo.setLtype(null);
        pojo.setDhname(null);
        pojo.setSetinfo(null);
        pojo.setTdmin(null);
        pojo.setSpprwl(null);
        pojo.setSbid(null);
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
    public WrpSpgSpqnmp getSpgLsyAndSpqnmpById(int ID,int SBID){
        WrpSpgSpqnmp cdinfo=wrpSpgSpqnmpMapper.selectSllcdInfoById(ID);
        WrpSpgLsy sbinfo= wrpSpgLsyMapper.selectById(SBID);
        cdinfo.setDhname(sbinfo.getDhname());
        cdinfo.setLtype(sbinfo.getLtype());
        cdinfo.setSetinfo(sbinfo.getSetinfo());
        cdinfo.setTdmin(sbinfo.getTdmin());
        cdinfo.setSpprwl(sbinfo.getSpprwl());
        cdinfo.setSbid(sbinfo.getId());
        return cdinfo;
    }
    //根据站点编号查询断面编号
    public List<Map> selectDmcdByStcd(String STCD){
        return wrpSpgSpqnmpMapper.selectDmcdByStcd(STCD);
    }
    //判断测点编号是否存在
    public Integer findMpcdExist(int TYPE,String MPCD){
        String TABLENAME="WRP_SPG_SPQNMP";
        //1 渗流量  2渗流压力  3水平位移  4沉降位移
        switch (TYPE){
            case 1:TABLENAME="WRP_SPG_SPQNMP";
            break;
            case 2:TABLENAME="WRP_SPG_PZTB";
            break;
            case 3:TABLENAME="WRP_DFR_SRHRDSMP";
            break;
            case 4:TABLENAME="WRP_DFR_SRVRDSMP";
            break;
        }
        return wrpSpgSpqnmpMapper.findMpcdExist(TABLENAME,MPCD);
    }
}
