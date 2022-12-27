package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.JiChuShuiYuanHeLiu;
import vip.yingmen.pojo.JiChuShuiYuanJing;
import vip.yingmen.pojo.JiChuShuiYuanShuiKu;
import vip.yingmen.pojo.JiChuShuiYuanXinXiShuiYuan;

public interface JiChuShuiYuanXinXiService {

    //查询基础数据的水源的水源信息
    public PageInfo<JiChuShuiYuanXinXiShuiYuan> findByShuiYuan(Integer _page, Integer _page_size, String _orderby, String SourceE_Type, String Source_Type, String RSNM);

    //查询基础数据的水源的水库信息
    public PageInfo<JiChuShuiYuanShuiKu> findByShuiKu(Integer _page, Integer _page_size, String _orderby, String ADDVCD, String PRSC, String BLSYS,String RSNM);


    //查询基础数据的水源的河流信息
    public PageInfo<JiChuShuiYuanHeLiu> findByHeLiu(Integer _page, Integer _page_size, String _orderby, String RVNM, String RVTP, String RLEVEL);

    public PageInfo<JiChuShuiYuanJing> findByJing(Integer _page, Integer _page_size, String _orderby, String Well_Name, String Canal_Code, String Diameter_Type, String Depth_Type, String Motivity_Type, String Material_Type);
}
