package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.QuDaoShuiQingRiBiao;

import java.util.List;

public interface QuDaoShuiQingRiBiaoMapper {
    //历史数据的渠道水情日表查询
    public List<QuDaoShuiQingRiBiao> findByQuDaoShuiQingRiBiao(@Param("tm") String tm,@Param("addvcd") String addvcd,@Param("canal_code") String canal_code,@Param("stype") String stype ,@Param("stnm") String stnm);
}
