package vip.yingmen.service.Impl;

import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import vip.yingmen.mapper.StPpAlarmMapper;
import vip.yingmen.mapper.StRsrHychMapper;
import vip.yingmen.entity.StPpAlarm;
import vip.yingmen.pojo.StRsrBsin;
import vip.yingmen.mapper.StRsrBsinMapper;
import vip.yingmen.pojo.StRsrHych;
import vip.yingmen.service.StRsrBsinService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * <p>
 *  水库测站信息、防洪信息和雨量预警信息维护
 * </p>
 *
 * @author liujieyu
 * @since 2022-12-26
 */
@Service
public class StRsrBsinServiceImpl extends ServiceImpl<StRsrBsinMapper, StRsrBsin> implements StRsrBsinService {
    @Autowired
    private StRsrBsinMapper stRsrBsinMapper;
    @Autowired
    private StRsrHychMapper stRsrHychMapper;
    @Autowired
    private StPpAlarmMapper stPpAlarmMapper;

    //根据站点编码查询水库站基本信息查询
    @Override
    public List<StRsrBsin> selectRsrBsinInfoByCon(Map searchMap){
        return stRsrBsinMapper.selectRsrBsinInfoByCon(searchMap);
    }
    //根据站点编码查询测站防洪基本信息查询
    @Override
    public List<StRsrHych> selectRsrHychByCon(Map searchMap){
        return stRsrBsinMapper.selectRsrHychByCon(searchMap);
    }
    //分页查询水库站基本信息查询
    public PageInfo<StRsrBsin> selectRsrBsinInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<StRsrBsin> list=stRsrBsinMapper.selectRsrBsinInfoByCon(searchMap);
        PageInfo<StRsrBsin> baseinfo=new PageInfo<>(list);
        return baseinfo;
    }
    //分页查询防洪基本信息
    public PageInfo<StRsrHych> selectRsrHychInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<StRsrHych> list=stRsrBsinMapper.selectRsrHychByCon(searchMap);
        PageInfo<StRsrHych> fhinfo=new PageInfo<>(list);
        return fhinfo;
    }
    //获取监测站点列表
    public List<Map> selectStcdList(){
        return stRsrBsinMapper.selectStcdList();
    }
    //判断断面编号是否存在
    public Integer selectDamcdByCheck(String DAMCD){
        return stRsrBsinMapper.selectDamcdByCheck(DAMCD);
    }
    //判断断面特征编号是否存在
    public Integer selectDamscdBycheck(String DAMSCD){
        return stRsrBsinMapper.selectDamscdBycheck(DAMSCD);
    }
    //新增监测站点信息
    public void addSiteInfo(StRsrBsin pojo){
        //pojo.setId(stRsrBsinMapper.selectIDFromSite());
        stRsrBsinMapper.insertStStbprpB(pojo);
        String[] typearray=pojo.getTypes().split(",");
        List<Map> list=new ArrayList<Map>();
        //int ysid=stRsrBsinMapper.selectIDFromStbprpF();
        for(int i=0;i<typearray.length;i++){
            // ysid=ysid+i;
            Map map=new HashMap();
            //map.put("id",ysid);
            map.put("stcd",pojo.getStcd());
            map.put("type",Integer.parseInt(typearray[i]));
            list.add(map);
        }
        stRsrBsinMapper.insertStStbprpF(list);
        pojo.setId(null);
        pojo.setDlog(null);
        pojo.setAdmauth(null);
        pojo.setTypes(null);
        pojo.setStgr(null);
        pojo.setYstcd(null);
        stRsrBsinMapper.insert(pojo);
    }
    //修改监测站点信息
    public void modifySiteInfo(StRsrBsin pojo){
        stRsrBsinMapper.updateStstbprpB(pojo);
        String stcds="'"+pojo.getYstcd()+"'";
        stRsrBsinMapper.deleteStStbprpF(stcds);
        String[] typearray=pojo.getTypes().split(",");
        List<Map> list=new ArrayList<Map>();
        //int ysid=stRsrBsinMapper.selectIDFromStbprpF();
        for(int i=0;i<typearray.length;i++){
            //ysid=ysid+i;
            Map map=new HashMap();
            //map.put("id",ysid);
            map.put("stcd",pojo.getStcd());
            map.put("type",typearray[i]);
            list.add(map);
        }
        stRsrBsinMapper.insertStStbprpF(list);
        pojo.setDlog(null);
        pojo.setAdmauth(null);
        pojo.setTypes(null);
        pojo.setStgr(null);
        pojo.setYstcd(null);
        stRsrBsinMapper.updateById(pojo);
    }
    //删除监测站点信息
    public void dropSiteInfo(String ids,String stcds){
        stRsrBsinMapper.deleteBatchIds(Arrays.asList(ids.split(",")));
        stcds="'"+stcds.replace(",","','")+"'";
        stRsrBsinMapper.deleteStstbprpB(stcds);
        stRsrBsinMapper.deleteStStbprpF(stcds);
    }
    //根据ID查询站点信息
    public StRsrBsin selectSiteInfoById(int ID){
        return stRsrBsinMapper.selectSiteInfoById(ID);
    }
    //判断监测站点编码是否存在
    public Integer selectStcdExist(String STCD){
        return stRsrBsinMapper.selectStcdExist(STCD);
    }
    //查询监测站点基本信息（维护）
    public PageInfo<StRsrBsin> selectSiteInfoManageByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<StRsrBsin> list=stRsrBsinMapper.selectSiteInfoManageByPage(searchMap);
        PageInfo<StRsrBsin> siteinfo=new PageInfo<>(list);
        return siteinfo;
    }
    //根据ID查询测站防洪信息
    public StRsrHych selectRsrAlarmById(int ID){
        return stRsrBsinMapper.selectRsrAlarmById(ID);
    }
    //新增水库水位预警信息
    public void addStRsvAlarmInfo(StRsrHych pojo){
        //pojo.setAlarmid(stRsrBsinMapper.selectIDFromRsrAlarm());
        stRsrBsinMapper.insertStRsvAlarm(pojo);
        pojo.setAlarmid(null);
        pojo.setFWL(null);
        pojo.setFWL79(null);
        stRsrHychMapper.insert(pojo);
    }
    //修改水库水位预警信息
    public void modifyStRsvAlarmInfo(StRsrHych pojo){
        stRsrBsinMapper.updateStRsvAlarm(pojo);
        pojo.setAlarmid(null);
        pojo.setFWL(null);
        pojo.setFWL79(null);
        stRsrHychMapper.updateById(pojo);
    }
    //根据ID删除水库预警信息
    public void dropStRsvAlarmInfo(String ids,String alarmids){
        stRsrBsinMapper.deleteStRsvAlarmById(alarmids);
        stRsrHychMapper.deleteBatchIds(Arrays.asList(ids.split(",")));
    }
    //判断防洪预警中监测站点是否存在
    public Integer checkStcdInAlarm(String stcd){
       return stRsrBsinMapper.selectStcdInStRsvAlarm(stcd);
    }
    //新增降雨预警信息
    public void addPpAlarm(StPpAlarm pojo){
        //pojo.setId(stRsrBsinMapper.selectIDFromPpAlarm());
        stPpAlarmMapper.insert(pojo);
    }
    //修改降雨预警信息
    public void modifyPpAlarm(StPpAlarm pojo){
        stPpAlarmMapper.updateById(pojo);
    }
    //删除降雨预警信息
    public void dropPpAlarm(String ids){
        stPpAlarmMapper.deleteBatchIds(Arrays.asList(ids.split(",")));
    }
    //根据ID查询降雨预警信息
    public StPpAlarm selectPpAlarmById(int ID){
        return stRsrBsinMapper.selectRainAlarmById(ID);
    }
    //判断雨量预警中监测站点是否存在
    public Integer selectStcdInPpAlarm(String stcd,int ewl){
        return stRsrBsinMapper.selectStcdInPpAlarm(stcd,ewl);
    }
    //根据STCD获取站点基本信息和库容信息
    public Map selectSiteBaseByStcd(String stcd){
        Map map=new HashMap<String,Object>();
        StRsrBsin jczd=stRsrBsinMapper.selectRsrBsinInfoBySTcd(stcd);
        StRsrHych tzkr=stRsrBsinMapper.selectRsrHychInfoBySTcd(stcd);
        map.put("basesite",jczd);
        map.put("krinfo",tzkr);
        return map;
    }
}
