package vip.yingmen.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.XingZhenTreeMapper;
import vip.yingmen.pojo.XingZhenTree;
import vip.yingmen.service.XingZhenTreeService;

import java.util.List;

@Service
public class XingZhenTreeServiceImpl implements XingZhenTreeService {
    @Autowired
    private XingZhenTreeMapper xingZhenTreeMapper;

    /**
     * http://v3.yingmen.vip/guanqu/table/xingzhen_tree?type=4
     * 这是存储过程查询
     * 行政树形图
     * @return
     */
    @Override
    public List<XingZhenTree> findByType(Integer type) {
        return xingZhenTreeMapper.findByType(type);
    }

    public List<XingZhenTree> findByYunXingGongKuang() {
        return xingZhenTreeMapper.findByYunXingGongKuang();
    }
}
