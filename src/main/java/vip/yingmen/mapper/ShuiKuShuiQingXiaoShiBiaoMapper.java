package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ShuiKuShuiQingXiaoShiBiaoMapper {
    //历史数据的水库水情小时表站点查询，需要先把站点查出来给小时查询当作参数
    public ArrayList<Map<Object, String>> findByZhanDian(@Param("ADDlist") List ADDlist, @Param("Canal_Code") String Canal_Code, @Param("LEVEL") String LEVEL,@Param("STGR") String STGR, @Param("STNM") String STNM);
    //历史数据的水库水情小时表查询
    public ArrayList<Map<Object, String>> findByXiaoShi(@Param("Time_min") String Time_min, @Param("Time_max") String Time_max, @Param("list") List list);
}
