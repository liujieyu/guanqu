package vip.yingmen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ShuiKuShuiQingXiaoShiBiaoService {
//    public List<ZhanDian> findByXiaoShi();
    //历史数据的水库水情小时表查询
    public List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi(String Time_min, String Time_max, String ADDVCD, String Canal_Code, String LEVEL, String STGR, String STNM);
}
