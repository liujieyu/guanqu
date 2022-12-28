package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import vip.yingmen.pojo.StRsrBsin;
import vip.yingmen.mapper.StRsrBsinMapper;
import vip.yingmen.pojo.StRsrHych;
import vip.yingmen.service.StRsrBsinService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liujieyu
 * @since 2022-12-26
 */
@Service
public class StRsrBsinServiceImpl extends ServiceImpl<StRsrBsinMapper, StRsrBsin> implements StRsrBsinService {
    @Autowired
    private StRsrBsinMapper stRsrBsinMapper;

    //根据站点编码查询水库站基本信息查询
    @Override
    public List<StRsrBsin> selectRsrBsinInfoByCon(Map searchMap){
        return stRsrBsinMapper.selectRsrBsinInfoByCon(searchMap);
    }
    //根据站点编码查询测站防洪基本信息查询
    @Override
    public List<StRsrHych> selectRsrHychByCon(Map searchMap){
        return stRsrBsinMapper.selectRsrHychByCon(searchMap);
    }
    //分页查询水库站基本信息查询
    public PageInfo<StRsrBsin> selectRsrBsinInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<StRsrBsin> list=stRsrBsinMapper.selectRsrBsinInfoByCon(searchMap);
        PageInfo<StRsrBsin> baseinfo=new PageInfo<>(list);
        return baseinfo;
    }
    //分页查询防洪基本信息
    public PageInfo<StRsrHych> selectRsrHychInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap){
        PageHelper.startPage(_page,_page_size,_orderby);
        List<StRsrHych> list=stRsrBsinMapper.selectRsrHychByCon(searchMap);
        PageInfo<StRsrHych> fhinfo=new PageInfo<>(list);
        return fhinfo;
    }
}
