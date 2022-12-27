package vip.yingmen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ZhaFaShuiQingXiaoShiBiaoService {
//    public List<ZhanDian> findByXiaoShi();
    //闸阀水情历史数据的小时表查询
    public List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(String timeMin, String timeMax, String addvcd, String canal_code, String ctype, String stnm);
}
