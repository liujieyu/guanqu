package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.LsYxgkMapper;
import vip.yingmen.pojo.LiShiYunXingGongKuang;
import vip.yingmen.service.LiShiYunXingGongKuangService;

import java.util.List;

@Service
public class LiShiYunXingGongKuangServiceImpl implements LiShiYunXingGongKuangService {
    @Autowired
    private LsYxgkMapper lsYxgkMapper;


    @Override
    public PageInfo<LiShiYunXingGongKuang> findByGongKuang(Integer _page, Integer _page_size, String _orderby, String STCD, String Time_min, String Time_max) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<LiShiYunXingGongKuang> byLiShiTuXiangXinXi = lsYxgkMapper.findByYunXingGongKuang(STCD,Time_min,Time_max);
        PageInfo<LiShiYunXingGongKuang> pageInfo = new PageInfo<>(byLiShiTuXiangXinXi);
        return pageInfo;
    }
}
