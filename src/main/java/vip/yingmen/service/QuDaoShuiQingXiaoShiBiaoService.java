package vip.yingmen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface QuDaoShuiQingXiaoShiBiaoService {
//    public List<ZhanDian> findByXiaoShi();
    //历史数据的渠道水情小时表查询，需要先把站点查出来给小时查询当作参数
    public  List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(String timeMin,String timeMax,String addvcd,  String canal_code,  String stype,String stnm);
}
