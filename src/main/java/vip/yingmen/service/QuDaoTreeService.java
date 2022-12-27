package vip.yingmen.service;

import vip.yingmen.pojo.QuDaoTree;

import java.util.List;

public interface QuDaoTreeService {
    /**
     * http://v3.yingmen.vip/guanqu/table/xingzhen_tree?type=4
     * 这是存储过程查询
     * 渠道树形图
     * @return
     */
    public List<QuDaoTree> findByType(Integer type);

    public List<QuDaoTree> findByYunXingGongKuang();
}
