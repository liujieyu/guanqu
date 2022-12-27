package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.JiChuJianCeZhanDian;
import vip.yingmen.pojo.JiChuQuShuiSheShiShuiZha;

public interface JiChuJianCeZhanDianService {

    //查询基础数据的监测站点的信息
    public PageInfo<JiChuJianCeZhanDian> findByJianCeZhanDian(Integer _page, Integer _page_size, String _orderby, String STNM, String ADDVCD, String Canal_Code, String STTP, String STGR, String TYPE);
}
