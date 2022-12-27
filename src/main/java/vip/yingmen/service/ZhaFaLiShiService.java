package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ZhaFaKaiDuLiShi;
import vip.yingmen.pojo.ZhaFaLiShiZhaMen;

public interface ZhaFaLiShiService {
    public PageInfo<ZhaFaKaiDuLiShi> findByKaiDu(Integer _page, Integer _page_size, String _orderby, String STCD, String Time_min, String Time_max);

    public PageInfo<ZhaFaLiShiZhaMen> findByZhaMen(Integer _page, Integer _page_size, String _orderby, String STCD, String Time_min, String Time_max);
}
