package vip.yingmen.service;

import vip.yingmen.pojo.XingZhenTree;

import java.util.List;

public interface XingZhenTreeService {
    /**
     * http://v3.yingmen.vip/guanqu/table/xingzhen_tree?type=4
     * 这是存储过程查询
     * 行政树形图
     * @return
     */
    public List<XingZhenTree> findByType(Integer type);

    public List<XingZhenTree> findByYunXingGongKuang();
}
