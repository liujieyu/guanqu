package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.JiChuGuanQuJiBenXinXi;

public interface JiChuGuanQuService {

    //查询基础数据的灌区基本信息
    public PageInfo<JiChuGuanQuJiBenXinXi> findByJiBenXinXi(Integer _page,Integer _page_size,String _orderby,String IARHWPRTP,String IRASC,String IRANM);
}
