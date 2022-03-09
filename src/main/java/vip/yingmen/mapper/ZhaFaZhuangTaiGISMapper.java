package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.ZhaFaZhuangTaiGIS;

import java.util.List;
import java.util.Map;

public interface ZhaFaZhuangTaiGISMapper {
    //闸阀状态的gis第一滑框实时数据
    public List<ZhaFaZhuangTaiGIS> findByZhaFaZhuangTaiGIS(@Param("STCD") String STCD,@Param("STNM") String STNM,@Param("ADDVCD")String ADDVCD,@Param("Canal_Code")String Canal_Code,@Param("CTYPE")String CTYPE,@Param("list")List list);

    //闸阀状态的gis第一滑框实时数据
    public List<ZhaFaZhuangTaiGIS> findByZhaFaZhuangTaiGIS1();
    public ZhaFaZhuangTaiGIS findByZhaFaZhuangTaiGIS1ByStcd(@Param("stcd") String STCD);
    
    public ZhaFaZhuangTaiGIS findByZhaFaZhuangTaiGIS8(@Param("stcd") String STCD);
    public ZhaFaZhuangTaiGIS findByZhaFaZhuangTaiGISByOther(@Param("stcd") String STCD);

}
