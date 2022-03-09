package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ZhaFaShuiQingXiaoShiBiaoMapper {
    //闸阀水情历史数据的小时表站点查询，查询出来的数据给小时查询做为参数
    public ArrayList<Map<Object, String>> findByZhanDian(@Param("addvcd") String addvcd, @Param("canal_code") String canal_code, @Param("ctype") String ctype , @Param("stnm") String stnm);
    //闸阀水情历史数据的小时表查询，拿查询出来的数据给小时查询做为参数
    public ArrayList<Map<Object, String>> findByXiaoShi(@Param("timeMin") String timeMin,@Param("timeMax") String timeMax,@Param("list") List list);
}
