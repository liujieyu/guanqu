package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.XingZhenTree;

import java.util.List;

public interface XingZhenTreeMapper {
    /**
     * http://v3.yingmen.vip/guanqu/table/xingzhen_tree?type=4
     * 这是存储过程查询
     * 行政树形图
     * @return
     */
    public List<XingZhenTree> findByType(@Param("type") Integer type);

    public List<XingZhenTree> findByYunXingGongKuang();
}
