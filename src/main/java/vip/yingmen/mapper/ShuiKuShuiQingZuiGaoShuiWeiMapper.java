package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ShuiKuShuiQingZuiGaoShuiWei;

import java.util.List;

public interface ShuiKuShuiQingZuiGaoShuiWeiMapper {
    //历史数据的水库水情的最高水位查询
    public List<ShuiKuShuiQingZuiGaoShuiWei> findByZuiGaoShuiWei(@Param("yr") String yr,@Param("addvcd") String addvcd, @Param("stgr") String stgr, @Param("stnm") String stnm);
}
