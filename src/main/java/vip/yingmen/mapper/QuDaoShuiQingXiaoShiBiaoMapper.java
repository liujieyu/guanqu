package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface QuDaoShuiQingXiaoShiBiaoMapper {
    //历史数据的渠道水情小时表站点查询，需要先把站点查出来给小时查询当作参数
    public ArrayList<Map<Object, String>> findByZhanDian(@Param("addvcd") String addvcd, @Param("canal_code") String canal_code, @Param("stype") String stype , @Param("stnm") String stnm);
    //历史数据的渠道水情小时表查询
    public ArrayList<Map<Object, String>> findByXiaoShi(@Param("timeMin") String timeMin,@Param("timeMax") String timeMax,@Param("list") List list);
}
