package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ZhaFaShuiQingRiBiao;

import java.util.List;

public interface ZhaFaShuiQingRiBiaoMapper {
    public List<ZhaFaShuiQingRiBiao> fandByRiBiao(@Param("TM") String TM, @Param("ADDVCD") String ADDVCD, @Param("Canal_Code") String Canal_Code, @Param("CTYPE") String CTYPE , @Param("STNM") String STNM);
}
