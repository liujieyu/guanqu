package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.WRP_FieldInfoMapper;
import vip.yingmen.pojo.WRP_FieldInfo;
import vip.yingmen.service.WRP_FieldInfoService;

import java.util.List;

@Service
public class WRP_FieldInfoServiceImpl implements WRP_FieldInfoService {
    @Autowired
    private WRP_FieldInfoMapper wrpFieldInfoMapper;
    //查询基本信息基础数据
    @Override
    public PageInfo<WRP_FieldInfo> findByJiBenXinXi(Integer _page, Integer _page_size, String FieldID) {
        PageHelper.startPage(_page,_page_size);
        List<WRP_FieldInfo> byJiBenXinXi = wrpFieldInfoMapper.findByJiBenXinXi(FieldID);
        PageInfo<WRP_FieldInfo> wrpFieldInfoPageInfo = new PageInfo<>(byJiBenXinXi);
        return wrpFieldInfoPageInfo;
    }


    //查询基本信息基础数据
    @Override
    public PageInfo<WRP_FieldInfo> findByShuiKuShuiQingLevle(Integer _page, Integer _page_size, String FieldID) {
        PageHelper.startPage(_page,_page_size);
        List<WRP_FieldInfo> byJiBenXinXi = wrpFieldInfoMapper.findByShuiKuShuiQingLevle(FieldID);
        PageInfo<WRP_FieldInfo> wrpFieldInfoPageInfo = new PageInfo<>(byJiBenXinXi);
        return wrpFieldInfoPageInfo;
    }
}
