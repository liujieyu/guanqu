package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.LsYqMapper;
import vip.yingmen.pojo.*;
import vip.yingmen.service.LiShiYuQingService;

import java.util.*;

@Service
public class LiShiYuQingServiceImpl implements LiShiYuQingService {
    @Autowired
    private LsYqMapper lsYqMapper;

    //历史数据的小时表统计
    @Override
    public PageInfo<LiShiYuQingTongJi> findByXiaoShiTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String Time_min, String Time_max) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingTongJi> byXiaoShiTongJi = lsYqMapper.findByXiaoShiTongJi(ADDVCD, Canal_Code, STGR, STNM, P, Time_min, Time_max);
        PageInfo<LiShiYuQingTongJi> pageInfo = new PageInfo<>(byXiaoShiTongJi);
        return pageInfo;
    }

    //历史数据的小时表雨情雨量区间站数统计
    @Override
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByXiaoShiZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String Time_min, String Time_max) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingXiaoShiZhanShuTongJi> byXiaoShiTZhanShuongJi = lsYqMapper.findByXiaoShiTZhanShuongJi(ADDVCD, Canal_Code, STGR, STNM, P, Time_min, Time_max);
        PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> pageInfo = new PageInfo<>(byXiaoShiTZhanShuongJi);
        return pageInfo;
    }

    //历史数据的小时表雨情列表查询
    @Override
    public List<LiSHiYuQingXiaoShiLieBiao> findByXiaoShiLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String Time_min, String Time_max,String _orderby) {
        List<LiSHiYuQingXiaoShiLieBiao> byXiaoShiLieBiao = lsYqMapper.findByXiaoShiLieBiao(ADDVCD, Canal_Code, STGR, STNM, P, Time_min, Time_max);
        for (LiSHiYuQingXiaoShiLieBiao s:byXiaoShiLieBiao){
            if (!StringUtils.isBlank(s.getRAININFO())){
                String[] tmArray = s.getRAININFO().split(",");
                for (String s1 : tmArray) {
                    String substring = s1.substring(0, StringUtils.lastIndexOf(s1, '-'));
                    String replace = StringUtils.replace(substring, "-", ":");
                }
            }
        }
        return byXiaoShiLieBiao;
    }

    @Override
    public List<Map<String, ArrayList<Map<Object, String>>>> findByXiaoShiTeZheng(String Time_min, String Time_max, String ADDVCD, String Canal_Code, String STGR, String STNM) {
        List<Map<String,ArrayList<Map<Object, String>>>> mapArrayList = new ArrayList<>();      //接收mapMap全部过来的数据
        ArrayList<Map<Object, String>> byZhanDian = lsYqMapper.findByZhanDian(ADDVCD, Canal_Code, STGR, STNM);  //接收mapper过来的站点数据
        Map<String,ArrayList<Map<Object, String>>> mapMap = new HashMap<>();            //这个map接收的是dao层传过来的数据
        mapMap.put("zhandian",byZhanDian);
        List<String> list = new ArrayList<>();              //定义一个list接收map的stnm数据
        for (Map<Object, String> maps : byZhanDian) {                //遍历list站点取得map
            Set<Map.Entry<Object, String>> it2 = maps.entrySet();         //开始遍历map取得stnm的value
            Iterator<Map.Entry<Object, String>> entrys = it2.iterator();
            while (entrys.hasNext()) {
                Map.Entry<Object, String> entry = entrys.next();
                if (entry.getKey().equals("STNM")) {                 //判断key是否为stnm
//                    System.out.println(entry.getValue());
                    list.add(entry.getValue());

                }

            }

        }
//        System.out.println(list.size());
        if (list.size()>0) {
            ArrayList<Map<Object, String>> byXiaoShi = lsYqMapper.findByXiaoShiTeZheng(Time_min, Time_max, list); //把list集合的数据传进小时表查询
            mapMap.put("tongji", byXiaoShi);
        }else{
            mapMap.put("tongji",new ArrayList<>());
        }
        mapArrayList.add(mapMap);
        return mapArrayList;
    }

    //历史数据的日表统计
    @Override
    public PageInfo<LiShiYuQingTongJi> findByRiTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String TM) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingTongJi> byRiTongJi = lsYqMapper.findByRiTongJi(ADDVCD, Canal_Code, STGR, STNM, P, TM);
        PageInfo<LiShiYuQingTongJi> pageInfo = new PageInfo<>(byRiTongJi);
        return pageInfo;
    }

    //历史数据的日表雨情雨量区间站数统计
    @Override
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByRiZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String TM) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingXiaoShiZhanShuTongJi> byXiaoShiTZhanShuongJi = lsYqMapper.findByRiZhanShuTongJi(ADDVCD, Canal_Code, STGR, STNM, P, TM);
        PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> pageInfo = new PageInfo<>(byXiaoShiTZhanShuongJi);
        return pageInfo;
    }

    //历史数据的日表雨情列表查询
    @Override
    public List<Map> findByRiLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String Time_min, String Time_max, String TM, String _orderby) {
        List<Map> byRiLieBiao = lsYqMapper.findByRiLieBiao(_page,_page_size,ADDVCD, Canal_Code, STGR, STNM, P, Time_min, Time_max,TM,_orderby);
        return byRiLieBiao;
    }

    @Override
    public PageInfo<LiShiYuQingTongJi> findByXunTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String TM) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingTongJi> byXunTongJi = lsYqMapper.findByXunTongJi(ADDVCD, Canal_Code, STGR, STNM, P, TM);
        PageInfo<LiShiYuQingTongJi> pageInfo = new PageInfo<>(byXunTongJi);
        return pageInfo;
    }

    @Override
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByXunZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR, String MON) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingXiaoShiZhanShuTongJi> byXiaoShiTZhanShuongJi = lsYqMapper.findByXunZhanShuTongJi(ADDVCD, Canal_Code, STGR, STNM, P, YR,MON);
        PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> pageInfo = new PageInfo<>(byXiaoShiTZhanShuongJi);
        return pageInfo;
    }

    @Override
    public PageInfo<LiSHiYuQingXunLieBiao> findByXunLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P,  String TM, String _orderby, String YR, String MON) {
        PageHelper.startPage(_page, _page_size,_orderby);
        List<LiSHiYuQingXunLieBiao> byXunLieBiao = lsYqMapper.findByXunLieBiao(ADDVCD, Canal_Code, STGR, STNM, P, TM,YR,MON);
        PageInfo<LiSHiYuQingXunLieBiao> pageInfo = new PageInfo<>(byXunLieBiao);
        return pageInfo;
    }

    @Override
    public PageInfo<LiShiYuQingTongJi> findByYueTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR,String MON) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingTongJi> byXunTongJi = lsYqMapper.findByYueTongJi(ADDVCD, Canal_Code, STGR, STNM, P, YR,MON);
        PageInfo<LiShiYuQingTongJi> pageInfo = new PageInfo<>(byXunTongJi);
        return pageInfo;
    }

    @Override
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByYueZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR, String MON) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingXiaoShiZhanShuTongJi> byXiaoShiTZhanShuongJi = lsYqMapper.findByYueZhanShuTongJi(ADDVCD, Canal_Code, STGR, STNM, P, YR,MON);
        PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> pageInfo = new PageInfo<>(byXiaoShiTZhanShuongJi);
        return pageInfo;
    }

    //历史数据的月表雨情列表查询
    @Override
    public List<Map> findByYueLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR, String MON, String TM, String _orderby) {
        List<Map> byRiLieBiao = lsYqMapper.findByYueLieBiao(_page,_page_size,ADDVCD, Canal_Code, STGR, STNM, P, YR, MON,TM,_orderby);
        return byRiLieBiao;
    }

    @Override
    public PageInfo<LiShiYuQingTongJi> findByNianTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingTongJi> byXunTongJi = lsYqMapper.findByNianTongJi(ADDVCD, Canal_Code, STGR, STNM, P, YR);
        PageInfo<LiShiYuQingTongJi> pageInfo = new PageInfo<>(byXunTongJi);
        return pageInfo;
    }

    @Override
    public PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> findByNianZhanShuTongJi(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR) {
        PageHelper.startPage(_page, _page_size);
        List<LiShiYuQingXiaoShiZhanShuTongJi> byXiaoShiTZhanShuongJi = lsYqMapper.findByNianZhanShuTongJi(ADDVCD, Canal_Code, STGR, STNM, P, YR);
        PageInfo<LiShiYuQingXiaoShiZhanShuTongJi> pageInfo = new PageInfo<>(byXiaoShiTZhanShuongJi);
        return pageInfo;
    }

    //历史数据的年表雨情列表查询
    @Override
    public List<Map> findByNianLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String P, String YR, String _orderby) {
        List<Map> byRiLieBiao = lsYqMapper.findByNianLieBiao(_page,_page_size,ADDVCD, Canal_Code, STGR, STNM, P, YR,_orderby);
        return byRiLieBiao;
    }

    @Override
    public PageInfo<LSYQShuiWeiTJ> findByZGSWTJ(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String YR) {
        PageHelper.startPage(_page, _page_size);
        List<LSYQShuiWeiTJ> byZGSWTJ = lsYqMapper.findByZGSWTJ(ADDVCD, Canal_Code, STGR, STNM, YR);
        PageInfo<LSYQShuiWeiTJ> pageInfo = new PageInfo<>(byZGSWTJ);
        return pageInfo;
    }

    @Override
    public PageInfo<LSYQZGSWLieBiao> findByZGSWLieBiao(Integer _page, Integer _page_size, String ADDVCD, String Canal_Code, String STGR, String STNM, String YR) {
        PageHelper.startPage(_page, _page_size);
        List<LSYQZGSWLieBiao> byZGSWTJ = lsYqMapper.findByZGSWLieBiao(ADDVCD, Canal_Code, STGR, STNM, YR);
        PageInfo<LSYQZGSWLieBiao> pageInfo = new PageInfo<>(byZGSWTJ);
        return pageInfo;
    }

}
