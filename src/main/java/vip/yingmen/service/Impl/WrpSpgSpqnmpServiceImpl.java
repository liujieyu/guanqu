package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import vip.yingmen.pojo.*;
import vip.yingmen.mapper.WrpSpgSpqnmpMapper;
import vip.yingmen.service.WrpSpgSpqnmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  大坝监测一张图相关信息
 *  服务实现类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
@Service
public class WrpSpgSpqnmpServiceImpl extends ServiceImpl<WrpSpgSpqnmpMapper, WrpSpgSpqnmp> implements WrpSpgSpqnmpService {
    @Autowired
    private WrpSpgSpqnmpMapper wrpSpgSpqnmpMapper;
    //根据断面编号获取断面信息
    @Override
    public List<WrpSectionB> findSafeDmInfoByDmbh(String DAMCD){
        return wrpSpgSpqnmpMapper.findSafeDmInfoByDmbh(DAMCD);
    }
    //根据断面编号获取断面特征信息
    @Override
    public List<WrpDamsB> findSafeDmtzInfoByDmbh(String DAMCD){
        return wrpSpgSpqnmpMapper.findSafeDmtzInfoByDmbh(DAMCD);
    }
    //根据测点编号获取渗流量测点信息
    @Override
    public List<WrpSpgSpqnmp> findSafeSllInfoByCdbh(String MPCD){
        return wrpSpgSpqnmpMapper.findSafeSllInfoByCdbh(MPCD);
    }
    //根据测点编号获取渗压管信息
    @Override
    public List<WrpSpgPztb> findSafeSYgInfoByCdbh(String MPCD){
        return wrpSpgSpqnmpMapper.findSafeSYgInfoByCdbh(MPCD);
    }
    //根据测点编号获取表面水平位移信息
    @Override
    public List<WrpDfrSrhrdsmp> findSafeSpwyInfoByCdbh(String MPCD){
        return wrpSpgSpqnmpMapper.findSafeSpwyInfoByCdbh(MPCD);
    }
    //根据测点编号获取表面垂直位移信息
    @Override
    public List<WrpDfrSrvrdsmp> findSafeCzwyInfoByCdbh(String MPCD){
        return wrpSpgSpqnmpMapper.findSafeCzwyInfoByCdbh(MPCD);
    }
    //获取断面信息表格数据
    @Override
    public PageInfo<WrpSectionB> findDuanmianInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WrpSectionB> list=wrpSpgSpqnmpMapper.findDuanmianInfoByPage(searchMap);
        PageInfo<WrpSectionB> sectioninfo=new PageInfo<>(list);
        return sectioninfo;
    }
    //渗流量信息表格数据
    @Override
    public PageInfo<WrpSpgSpqnmp> findShenliuInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WrpSpgSpqnmp> list=wrpSpgSpqnmpMapper.findShenliuInfoByPage(searchMap);
        PageInfo<WrpSpgSpqnmp> sllinfo=new PageInfo<>(list);
        return sllinfo;
    }
    //渗流压力信息表格数据
    @Override
    public PageInfo<WrpSpgPztb> fineSheyaInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WrpSpgPztb> list=wrpSpgSpqnmpMapper.fineSheyaInfoByPage(searchMap);
        PageInfo<WrpSpgPztb> syinfo=new PageInfo<>(list);
        return syinfo;
    }
    //水平位移信息表格数据
    @Override
    public PageInfo<WrpDfrSrhrdsmp> fineWeiyiInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WrpDfrSrhrdsmp> list=wrpSpgSpqnmpMapper.fineWeiyiInfoByPage(searchMap);
        PageInfo<WrpDfrSrhrdsmp> spinfo= new PageInfo<>(list);
        return spinfo;
    }
    //沉降位移信息表格数据
    @Override
    public PageInfo<WrpDfrSrvrdsmp> fineChenjiangInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<WrpDfrSrvrdsmp> list=wrpSpgSpqnmpMapper.fineChenjiangInfoByPage(searchMap);
        PageInfo<WrpDfrSrvrdsmp> cjinfo= new PageInfo<>(list);
        return cjinfo;
    }
    //行政区划树数据
    @Override
    public List<Map> findXzqhAndSiteTreeData(Integer TYPE){
        String TABLENAME="WRP_SPG_SPQNMP";
        //1 渗流量  2 渗流压力  3 位移变形 4 沉降变形
        //5 雨情    6 水库水情  7 运行工况
        switch (TYPE) {
            case 1:
                TABLENAME = "WRP_SPG_SPQNMP";
                break;
            case 2:
                TABLENAME = "WRP_SPG_PZTB";
                break;
            case 3:
                TABLENAME = "WRP_DFR_SRHRDSMP";
                break;
            case 4:
                TABLENAME = "WRP_DFR_SRVRDSMP";
                break;
            case 5:
                TABLENAME = "ST_PPTN_R1";
                break;
            case 6:
                TABLENAME = "ST_RSVR_R1";
                break;
            case 7:
                TABLENAME = "ST_StationStatus_R";
                break;
        }
        List<Map> tree=new ArrayList<Map>();
        List<TreeData> yslist=wrpSpgSpqnmpMapper.findXzqhAndSiteTreeData(TABLENAME);
        for(int i=0;i<yslist.size();i++){
            TreeData data=yslist.get(i);
            if(i==0){
                Map<String,Object> supermap=new HashMap<String,Object>();
                supermap.put("id",i+1);
                supermap.put("label",data.getUpnm());
                supermap.put("value",data.getUpdacd());
                supermap.put("level",1);
                Map<String,Object> cunmap=new HashMap<String,Object>();
                cunmap.put("id",(i+1)*10+1);
                cunmap.put("label",data.getAdnm());
                cunmap.put("value",data.getAdcd());
                cunmap.put("parent",data.getUpdacd());
                cunmap.put("level",2);
                Map<String,Object> sitemap=new HashMap<String,Object>();
                sitemap.put("id",((i+1)*10+1)*10+1);
                sitemap.put("label",data.getStnm());
                sitemap.put("value",data.getStcd());
                sitemap.put("parent",data.getUpdacd()+","+data.getAdcd());
                sitemap.put("level",3);
                ArrayList<Map> superchildren=new ArrayList<Map>();
                ArrayList<Map> cunchildren=new ArrayList<Map>();
                cunchildren.add(sitemap);
                cunmap.put("children",cunchildren);
                superchildren.add(cunmap);
                supermap.put("children",superchildren);
                tree.add(supermap);
            }else{
                Map<String,Object> lastmap=tree.get(tree.size()-1);
                if(lastmap.get("value").toString().equals(data.getUpdacd())){
                    ArrayList<Map> cunarray=(ArrayList<Map>)lastmap.get("children");
                    Map<String,Object> lastcunmap=cunarray.get(cunarray.size()-1);
                    if(lastcunmap.get("value").toString().equals(data.getAdcd())){
                        ArrayList<Map> sitearray=(ArrayList<Map>)lastcunmap.get("children");
                        Map<String,Object> lastsitemap=sitearray.get(sitearray.size()-1);
                        Map<String,Object> sitemap=new HashMap<String,Object>();
                        sitemap.put("id",(Integer.parseInt(lastsitemap.get("id").toString())+1));
                        sitemap.put("label",data.getStnm());
                        sitemap.put("value",data.getStcd());
                        sitemap.put("parent",data.getUpdacd()+","+data.getAdcd());
                        sitemap.put("level",3);
                        sitearray.add(sitemap);
                    }else{
                        Map<String,Object> cunmap=new HashMap<String,Object>();
                        cunmap.put("id",Integer.parseInt(lastcunmap.get("id").toString())+1);
                        cunmap.put("label",data.getAdnm());
                        cunmap.put("value",data.getAdcd());
                        cunmap.put("parent",data.getUpdacd());
                        cunmap.put("level",2);
                        Map<String,Object> sitemap=new HashMap<String,Object>();
                        sitemap.put("id",(Integer.parseInt(cunmap.get("id").toString()))*10+1);
                        sitemap.put("label",data.getStnm());
                        sitemap.put("value",data.getStcd());
                        sitemap.put("parent",data.getUpdacd()+","+data.getAdcd());
                        sitemap.put("level",3);
                        ArrayList<Map> cunchildren=new ArrayList<Map>();
                        cunchildren.add(sitemap);
                        cunmap.put("children",cunchildren);
                        cunarray.add(cunmap);
                    }
                }else{
                    Map<String,Object> supermap=new HashMap<String,Object>();
                    supermap.put("id",i+1);
                    supermap.put("label",data.getUpnm());
                    supermap.put("value",data.getUpdacd());
                    supermap.put("level",1);
                    Map<String,Object> cunmap=new HashMap<String,Object>();
                    cunmap.put("id",(i+1)*10+1);
                    cunmap.put("label",data.getAdnm());
                    cunmap.put("value",data.getAdcd());
                    cunmap.put("parent",data.getUpdacd());
                    cunmap.put("level",2);
                    Map<String,Object> sitemap=new HashMap<String,Object>();
                    sitemap.put("id",((i+1)*10+1)*10+1);
                    sitemap.put("label",data.getStnm());
                    sitemap.put("value",data.getStcd());
                    sitemap.put("parent",data.getUpdacd()+","+data.getAdcd());
                    sitemap.put("level",3);
                    ArrayList<Map> superchildren=new ArrayList<Map>();
                    ArrayList<Map> cunchildren=new ArrayList<Map>();
                    cunchildren.add(sitemap);
                    cunmap.put("children",cunchildren);
                    superchildren.add(cunmap);
                    supermap.put("children",superchildren);
                    tree.add(supermap);
                }
            }
        }
        return tree;
    }
    //查询测点编号
    public List<Map> findCdbhByTable(Integer TYPE,String STCD){
        String TABLENAME="WRP_SPG_SPQNMP";
        //1 渗流量  2 渗流压力  3 位移变形 4 沉降变形
        switch (TYPE) {
            case 1:
                TABLENAME = "WRP_SPG_SPQNMP";
                break;
            case 2:
                TABLENAME = "WRP_SPG_PZTB";
                break;
            case 3:
                TABLENAME = "WRP_DFR_SRHRDSMP";
                break;
            case 4:
                TABLENAME = "WRP_DFR_SRVRDSMP";
                break;
        }
        return wrpSpgSpqnmpMapper.findCdbhByTable(TABLENAME,STCD);
    }
}
