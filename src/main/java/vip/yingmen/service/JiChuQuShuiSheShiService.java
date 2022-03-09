package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JCQSSSBa;
import vip.yingmen.pojo.JCQSSSBengZhan;
import vip.yingmen.pojo.JCQSSSSheShi;
import vip.yingmen.pojo.JiChuQuShuiSheShiShuiZha;

public interface JiChuQuShuiSheShiService {

    //查询基础数据的取水设施的水闸信息
    public PageInfo<JiChuQuShuiSheShiShuiZha> findByShuiZha(Integer _page, Integer _page_size, String _orderby, String SLNM, String SLTP, String ADDVCD, String GS);

    //查询基础数据的取水设施的取水设施信息
    public PageInfo<JCQSSSSheShi> findBySheShi(Integer _page, Integer _page_size, String _orderby, String FStructure_Name, String FStructure_Type, String Fetch_Mode, String GS);


    //查询基础数据的取水设施的坝设施信息
    public PageInfo<JCQSSSBa> findByBa(Integer page, Integer pageSize, String orderBy, String damName, String damType, String damGrade, String structureType,String gs);


    public PageInfo<JCQSSSBengZhan> findByBengZhan(Integer page, Integer pageSize, String orderBy, String idstnm, String addvcd, String idsttp,String gs);
}
