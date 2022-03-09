package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JCQSSSBa;
import vip.yingmen.pojo.JCQSSSBengZhan;
import vip.yingmen.pojo.JCQSSSSheShi;
import vip.yingmen.pojo.JiChuQuShuiSheShiShuiZha;

import java.util.List;

public interface JcQsssMapper {
    public List<JiChuQuShuiSheShiShuiZha> findByShuiZha(@Param("SLNM") String SLNM,@Param("SLTP") String SLTP,@Param("ADDVCD") String ADDVCD, @Param("GS")String GS);

    public List<JCQSSSSheShi> findBySheShi(@Param("FStructure_Name")String FStructure_Name,@Param("FStructure_Type") String FStructure_Type, @Param("Fetch_Mode")String Fetch_Mode, @Param("GS")String GS);

    public List<JCQSSSBa> findByBa(@Param("Dam_Name")String damName, @Param("Dam_Type") String damType, @Param("Dam_Grade")String damGrade, @Param("Structure_Type")String structureType,@Param("GS")String gs);

    public List<JCQSSSBengZhan> findByBengZhan(@Param("IDSTNM")String idstnm, @Param("ADDVCD") String addvcd, @Param("IDSTTP")String idsttp,  @Param("GS")String gs);
}
