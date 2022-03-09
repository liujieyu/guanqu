package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ShuiKuShuiQingXiaoShiBiaoMapper;
import vip.yingmen.service.ShuiKuShuiQingXiaoShiBiaoService;

import java.util.*;

@Service
public class ShuiKuShuiQingXiaoShiBiaoServiceImpl implements ShuiKuShuiQingXiaoShiBiaoService {
    @Autowired
    private ShuiKuShuiQingXiaoShiBiaoMapper xiaoShiBiaoMapper;

    //历史数据的水库水情小时表查询，需要先把站点查出来给小时查询当作参数
    @Override
    public  List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(String Time_min, String Time_max, String ADDVCD, String Canal_Code, String LEVEL,String STGR, String STNM) {
        List<Map<String,ArrayList<Map<Object, String>>>> mapArrayList = new ArrayList<>();      //接收mapMap全部过来的数据
        ArrayList<Map<Object, String>> byZhanDian = xiaoShiBiaoMapper.findByZhanDian(ADDVCD, Canal_Code, LEVEL,STGR, STNM);  //接收mapper过来的站点数据
        Map<String,ArrayList<Map<Object, String>>> mapMap = new HashMap<>();            //这个map接收的是dao层传过来的数据
        mapMap.put("zhandian",byZhanDian);

        List<Object> list = new ArrayList<>();              //定义一个list接收map的stnm数据
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
        if (list.size()>0) {
            ArrayList<Map<Object, String>> byXiaoShi = xiaoShiBiaoMapper.findByXiaoShi(Time_min, Time_max, list); //把站点list集合的数据传进小时表查询
            mapMap.put("tongji", byXiaoShi);
        }else{
            mapMap.put("tongji",new ArrayList<>());
        }
        mapArrayList.add(mapMap);
        return mapArrayList;
    }


}
