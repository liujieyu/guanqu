package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_STBPRP_BMapper;
import vip.yingmen.pojo.ST_STBPRP_B;
import vip.yingmen.service.ST_STBPRP_BService;

import java.util.List;

@Service
public class ST_STBPRP_BServiceImpl implements ST_STBPRP_BService {
    @Autowired
    private ST_STBPRP_BMapper stStbprpBDao;
    @Override
    public List<ST_STBPRP_B> findAll() {
        return stStbprpBDao.findAll();
    }

    //根据关联编号RelateCode来查询测站基本信息
    @Override
    public PageInfo<ST_STBPRP_B> findByRELATECODE(String RELATECODE) {
        PageHelper.startPage(1,999999999);
        List<ST_STBPRP_B> byRELATECODE = stStbprpBDao.findByRELATECODE(RELATECODE);
        PageInfo<ST_STBPRP_B> stStbprpBPageInfo = new PageInfo<>(byRELATECODE);
        return stStbprpBPageInfo;
    }
}

