package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ZhaFaShuiQingXiaoShiBiaoMapper;
import vip.yingmen.service.ZhaFaShuiQingXiaoShiBiaoService;

import java.util.*;

@Service
public class ZhaFaShuiQingXiaoShiBiaoServiceImpl implements ZhaFaShuiQingXiaoShiBiaoService {
    @Autowired
    private ZhaFaShuiQingXiaoShiBiaoMapper xiaoShiBiaoMapper;

    //闸阀水情历史数据的小时表查询
    @Override
    public List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(String timeMin, String timeMax, String addvcd, String canal_code, String ctype, String stnm) {
        List<Map<String,ArrayList<Map<Object, String>>>> mapArrayList = new ArrayList<>();
        ArrayList<Map<Object, String>> byZhanDian = xiaoShiBiaoMapper.findByZhanDian(addvcd, canal_code, ctype, stnm);  //接收mapper过来的站点数据
        Map<String,ArrayList<Map<Object, String>>> mapMap = new HashMap<>();            //这个map接收的是dao层传过来的数据
        mapMap.put("zhandian",byZhanDian);

        List<Object> list = new ArrayList<>();              //定义一个list接收map的stnm数据
        for (Map<Object, String> maps : byZhanDian) {                //遍历list站点取得map
            Set<Map.Entry<Object, String>> it2 = maps.entrySet();         //开始遍历map取得stnm的value
            Iterator<Map.Entry<Object, String>> entrys = it2.iterator();
            while (entrys.hasNext()) {
                Map.Entry<Object, String> entry = entrys.next();
                if (entry.getKey().equals("stnm")) {                 //判断key是否为stnm
//                    System.out.println(entry.getValue());
                    list.add(entry.getValue());

                }

            }

        }
//        System.out.println(timeMin);
//        System.out.println(timeMax);
        //对timeMax、timeMin进行字符串判断，而且两个字符串时间判断都是相等也要抛出异常，如果满足条件就把里面的+替换成空格。如果传过来的没有+就直接传进参数
//        if (timeMax!=null & timeMax != ""& timeMax!=null & timeMin != ""& timeMin!=timeMax){
//            if (timeMin.contains("+")&timeMax.contains("+")){
//                String timemin = timeMin.replace("+", " ");
//                String timemax = timeMin.replace("+", " ");
//                System.out.println(timemin);
//                System.out.println(timemax);
//                ArrayList<Map<String, String>> byXiaoShi = xiaoShiBiaoMapper.findByXiaoShi(timemin,timemax,list); //把list集合的数据传进小时表查询
//                mapArrayList.add(byXiaoShi);
//            }
        if (list.size()>0) {
            ArrayList<Map<Object, String>> byXiaoShi = xiaoShiBiaoMapper.findByXiaoShi(timeMin, timeMax, list); //把list集合的数据传进小时表查询
            mapMap.put("tongji",byXiaoShi);
        }else{
            mapMap.put("tongji",new ArrayList<>());
        }
        mapArrayList.add(mapMap);
        return mapArrayList;
    }


}
