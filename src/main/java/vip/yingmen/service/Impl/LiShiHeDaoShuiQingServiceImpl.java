package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.LsHdsqMapper;
import vip.yingmen.pojo.HeDaoShuiQingLiShiBiao;
import vip.yingmen.pojo.HeDaoShuiQingRiBiao;
import vip.yingmen.pojo.HeDaoShuiQingYueBiao;
import vip.yingmen.pojo.HeDaoShuiQingZuiGaoShuiWeiBiao;
import vip.yingmen.service.LiShiHeDaoShuiQingService;

import java.util.*;

@Service
public class LiShiHeDaoShuiQingServiceImpl implements LiShiHeDaoShuiQingService {
    @Autowired
    private LsHdsqMapper lsHdsqMapper;

    //历史数据的河道水情小时表查询，需要先把站点查出来给小时查询当作参数
    @Override
    public List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(String Time_min, String Time_max, String ADDVCD, String Canal_Code, String LEVEL, String STGR, String STNM) {
        List<Map<String,ArrayList<Map<Object, String>>>> mapArrayList = new ArrayList<>();
        ArrayList<Map<Object, String>> byZhanDian = lsHdsqMapper.findByZhanDian(ADDVCD, Canal_Code, LEVEL, STGR, STNM);  //接收mapper过来的站点数据
        Map<String,ArrayList<Map<Object, String>>> mapMap = new HashMap<>();            //这个map接收的是dao层传过来的数据
        mapMap.put("zhandian",byZhanDian);

        List<String> list = new ArrayList<>();              //定义一个list接收map的stnm数据
        for (Map<Object, String> maps : byZhanDian) {                //遍历list站点取得map
            Set<Map.Entry<Object, String>> it2 = maps.entrySet();         //开始遍历map取得stnm的value
            Iterator<Map.Entry<Object, String>> entrys = it2.iterator();
            while (entrys.hasNext()) {
                Map.Entry<Object, String> entry = entrys.next();
                if (entry.getKey().equals("STNM")) {                 //判断key是否为stnm
                    list.add(entry.getValue());
                }
            }
        }
        if (list.size()>0) {
            ArrayList<Map<Object, String>> byXiaoShi = lsHdsqMapper.findByXiaoShi(Time_min, Time_max, list); //把站点list集合的数据传进小时表查询
            mapMap.put("tongji", byXiaoShi);
        }else{
            mapMap.put("tongji",new ArrayList<>());
        }
        mapArrayList.add(mapMap);
        return mapArrayList;
    }

    //历史数据的河道水情日表查询
    @Override
    public PageInfo<HeDaoShuiQingRiBiao> findByRiBiao(Integer _page_size, Integer _page, String TM, String ADDVCD, String Canal_Code, String STGR, String STNM, String _orderby) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<HeDaoShuiQingRiBiao> RiBiaoList = lsHdsqMapper.fandByRiBiao(TM, ADDVCD, Canal_Code, STGR, STNM);
        PageInfo<HeDaoShuiQingRiBiao> pageInfo = new PageInfo<>(RiBiaoList);
        return pageInfo;
    }

    //历史数据的河道水情月表查询
    @Override
    public PageInfo<HeDaoShuiQingYueBiao> findByYueBiao(Integer _page_size, Integer _page, String YR, String MON, String ADDVCD, String Canal_Code, String STGR, String STNM, String _orderby) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<HeDaoShuiQingYueBiao> YueBiaoList = lsHdsqMapper.fandByYueBiao(YR, MON, ADDVCD, Canal_Code, STGR, STNM);
        PageInfo<HeDaoShuiQingYueBiao> pageInfo = new PageInfo<>(YueBiaoList);
        return pageInfo;
    }

    //历史数据的河道水情历史表查询
    @Override
    public PageInfo<HeDaoShuiQingLiShiBiao> findByLiShiBiao(Integer _page_size, Integer _page, String Time_min, String Time_max, String STCD, String _orderby) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<HeDaoShuiQingLiShiBiao> byLiShiBiao = lsHdsqMapper.fandByLiShiBiao(Time_min, Time_max, STCD);
        PageInfo<HeDaoShuiQingLiShiBiao> pageInfo = new PageInfo<>(byLiShiBiao);
        return pageInfo;
    }

    //历史数据的河道水情的最高水位查询
    @Override
    public PageInfo<HeDaoShuiQingZuiGaoShuiWeiBiao> findByZuiGaoShuiWei(Integer _page, Integer _page_size, String YR, String ADDVCD, String STGR,  String STNM, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<HeDaoShuiQingZuiGaoShuiWeiBiao> byZuiGaoShuiWei = lsHdsqMapper.findByZuiGaoShuiWei(YR,ADDVCD, STGR, STNM);
        PageInfo<HeDaoShuiQingZuiGaoShuiWeiBiao> pageInfo = new PageInfo<>(byZuiGaoShuiWei);
        return pageInfo;
    }
}
