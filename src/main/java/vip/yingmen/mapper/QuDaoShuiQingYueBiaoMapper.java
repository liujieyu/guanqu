package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.QuDaoShuiQingYueBiao;

import java.util.List;

public interface QuDaoShuiQingYueBiaoMapper {
    //历史数据的渠道水情月表查询
    public List<QuDaoShuiQingYueBiao> findByYueBiao(@Param("ye") String ye,@Param("mon") String mon,@Param("addvcd") String addvcd, @Param("canal_code") String canal_code, @Param("stype") String stype , @Param("stnm") String stnm);
}
