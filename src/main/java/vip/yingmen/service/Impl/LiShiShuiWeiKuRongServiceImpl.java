package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.LsSwkrMapper;
import vip.yingmen.pojo.LiShiShuiWeiKuRongLieBiao;
import vip.yingmen.service.LiShiShuiWeiKuRongService;

import java.util.List;

@Service
public class LiShiShuiWeiKuRongServiceImpl implements LiShiShuiWeiKuRongService {
    @Autowired
    private LsSwkrMapper lsSwkrMapper;

    //历史数据的水位库容列表查询
    @Override
    public PageInfo<LiShiShuiWeiKuRongLieBiao> findByLieBiao(Integer _page_size, Integer _page, String ADDVCD, String Canal_Code, String LEVEL, String STGR, String STNM, String _orderby) {
        PageHelper.startPage(_page,_page_size,_orderby);
        List<LiShiShuiWeiKuRongLieBiao> byLieBiao = lsSwkrMapper.findByLieBiao(ADDVCD,Canal_Code,LEVEL,STGR,STNM);
        PageInfo<LiShiShuiWeiKuRongLieBiao> pageInfo = new PageInfo<>(byLieBiao);
        return pageInfo;
    }
}
