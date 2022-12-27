package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.LiShiYunXingGongKuang;

public interface LiShiYunXingGongKuangService {
    public PageInfo<LiShiYunXingGongKuang> findByGongKuang(Integer _page, Integer _page_size,String _orderby,String STCD,String Time_min,String Time_max);
}
