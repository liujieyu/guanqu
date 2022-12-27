package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ZhaFaShuiQingYueBiao;

import java.util.List;

public interface ZhaFaShuiQingYueBiaoMapper {
    //历史数据的闸阀水情月表查询
    public List<ZhaFaShuiQingYueBiao> findByYueBiao(@Param("YR") String YR, @Param("MON") String MON, @Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("CTYPE") String CTYPE, @Param("STNM") String STNM);
}
