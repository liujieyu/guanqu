package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JiChuShuiYuanHeLiu;
import vip.yingmen.pojo.JiChuShuiYuanJing;
import vip.yingmen.pojo.JiChuShuiYuanShuiKu;
import vip.yingmen.pojo.JiChuShuiYuanXinXiShuiYuan;

import java.util.List;

public interface JcSyxxMapper {
    //基础数据水源信息水源
    public List<JiChuShuiYuanXinXiShuiYuan> findByShuiYuan(@Param("SourceE_Type") String SourceE_Type, @Param("Source_Type") String Source_Type, @Param("RSNM") String RSNM);

    //基础数据水源信息水库
    public List<JiChuShuiYuanShuiKu> findByShuiKu(@Param("ADDVCD") String ADDVCD, @Param("PRSC") String PRSC, @Param("BLSYS") String BLSYS, @Param("RSNM") String RSNM);

    //基础数据水源信息河流
    public List<JiChuShuiYuanHeLiu> findByHeLiu(@Param("RVNM") String RVNM, @Param("RVTP") String RVTP, @Param("RLEVEL") String RLEVEL);

    //基础数据水源信息井
    public List<JiChuShuiYuanJing> findByJing(@Param("Well_Name") String Well_Name, @Param("Canal_Code") String Canal_Code, @Param("Diameter_Type") String Diameter_Type, @Param("Depth_Type") String Depth_Type, @Param("Motivity_Type") String Motivity_Type, @Param("Material_Type") String Material_Type);
}
