package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.pojo.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 大坝监测一张图相关信息接口
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
public interface WrpSpgSpqnmpMapper extends BaseMapper<WrpSpgSpqnmp> {
    //根据断面编号获取断面信息
    public List<WrpSectionB> findSafeDmInfoByDmbh(@Param("DAMCD") String DAMCD);
    //根据断面编号获取断面特征信息
    public List<WrpDamsB> findSafeDmtzInfoByDmbh(@Param("DAMCD") String DAMCD);
    //根据测点编号获取渗流量测点信息
    public List<WrpSpgSpqnmp> findSafeSllInfoByCdbh(@Param("MPCD") String MPCD);
    //根据测点编号获取渗压管信息
    public List<WrpSpgPztb> findSafeSYgInfoByCdbh(@Param("MPCD") String MPCD);
    //根据测点编号获取表面水平位移信息
    public List<WrpDfrSrhrdsmp> findSafeSpwyInfoByCdbh(@Param("MPCD") String MPCD);
    //根据测点编号获取表面垂直位移信息
    public List<WrpDfrSrvrdsmp> findSafeCzwyInfoByCdbh(@Param("MPCD") String MPCD);
    //获取断面信息表格数据
    public List<WrpSectionB> findDuanmianInfoByPage(@RequestParam("searchMap") Map searchMap);
    //渗流量信息表格数据
    public List<WrpSpgSpqnmp> findShenliuInfoByPage(@RequestParam("searchMap") Map searchMap);
    //渗流压力信息表格数据
    public List<WrpSpgPztb> fineSheyaInfoByPage(@RequestParam("searchMap") Map searchMap);
    //水平位移信息表格数据
    public List<WrpDfrSrhrdsmp> fineWeiyiInfoByPage(@RequestParam("searchMap") Map searchMap);
    //沉降位移信息表格数据
    public List<WrpDfrSrvrdsmp> fineChenjiangInfoByPage(@RequestParam("searchMap") Map searchMap);
    //行政区划树数据
    public List<TreeData> findXzqhAndSiteTreeData(@Param("TABLENAME") String TABLENAME);
    //查询测点编号
    public List<Map> findCdbhByTable(@Param("TABLENAME") String TABLENAME,@Param("STCD") String STCD);
    //根据ID获取渗流量测点信息
    public WrpSpgSpqnmp selectSllcdInfoById(@Param("ID") Integer ID);
}
