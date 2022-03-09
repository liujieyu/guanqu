package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.QuDaoTreeMapper;
import vip.yingmen.pojo.QuDaoTree;
import vip.yingmen.service.QuDaoTreeService;

import java.util.List;

@Service
public class QuDaoTreeServiceImpl implements QuDaoTreeService {
    @Autowired
    private QuDaoTreeMapper quDaoTreeMapper;

    /**
     * http://v3.yingmen.vip/guanqu/table/xingzhen_tree?type=4
     * 这是存储过程查询
     * 渠道树形图
     * @return
     */
    @Override
    public List<QuDaoTree> findByType(Integer type) {
        return quDaoTreeMapper.findByType(type);
    }

    public List<QuDaoTree> findByYunXingGongKuang() {
        return quDaoTreeMapper.findByYunXingGongKuang();
    }
}
