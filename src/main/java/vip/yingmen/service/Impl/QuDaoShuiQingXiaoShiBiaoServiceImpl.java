package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.QuDaoShuiQingXiaoShiBiaoMapper;
import vip.yingmen.service.QuDaoShuiQingXiaoShiBiaoService;

import java.util.*;

@Service
public class QuDaoShuiQingXiaoShiBiaoServiceImpl implements QuDaoShuiQingXiaoShiBiaoService {
    @Autowired
    private QuDaoShuiQingXiaoShiBiaoMapper xiaoShiBiaoMapper;

    //历史数据的渠道水情小时表查询，需要先把站点查出来给小时查询当作参数
    @Override
    public  List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(String timeMin, String timeMax, String addvcd, String canal_code, String stype, String stnm) {
        List<Map<String,ArrayList<Map<Object, String>>>> mapArrayList = new ArrayList<>();      //接收mapMap全部过来的数据
        ArrayList<Map<Object, String>> byZhanDian = xiaoShiBiaoMapper.findByZhanDian(addvcd, canal_code, stype, stnm);  //接收mapper过来的站点数据
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
            ArrayList<Map<Object, String>> byXiaoShi = xiaoShiBiaoMapper.findByXiaoShi(timeMin, timeMax, list); //把list集合的数据传进小时表查询
            mapMap.put("tongji", byXiaoShi);
        }else{
            mapMap.put("tongji",new ArrayList<>());
        }
        mapArrayList.add(mapMap);
        return mapArrayList;
    }


}
