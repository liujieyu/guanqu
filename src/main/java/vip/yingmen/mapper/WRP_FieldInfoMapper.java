package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.WRP_FieldInfo;

import java.util.List;

public interface WRP_FieldInfoMapper {
    //查询基本信息基础数据
    public List<WRP_FieldInfo> findByJiBenXinXi(@Param("FieldID") String FieldID);

    //查询基本信息基础数据
    public List<WRP_FieldInfo> findByShuiKuShuiQingLevle(@Param("FieldID") String FieldID);
}
