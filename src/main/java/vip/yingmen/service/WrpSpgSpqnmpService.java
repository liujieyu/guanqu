package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.*;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liujieyu
 * @since 2022-09-09
 */
public interface WrpSpgSpqnmpService extends IService<WrpSpgSpqnmp> {
    //根据断面编号获取断面信息
    public List<WrpSectionB> findSafeDmInfoByDmbh(String DAMCD);
    //根据断面编号获取断面特征信息
    public List<WrpDamsB> findSafeDmtzInfoByDmbh(String DAMCD);
    //根据测点编号获取渗流量测点信息
    public List<WrpSpgSpqnmp> findSafeSllInfoByCdbh(String MPCD);
    //根据测点编号获取渗压管信息
    public List<WrpSpgPztb> findSafeSYgInfoByCdbh(String MPCD);
    //根据测点编号获取表面水平位移信息
    public List<WrpDfrSrhrdsmp> findSafeSpwyInfoByCdbh(String MPCD);
    //根据测点编号获取表面垂直位移信息
    public List<WrpDfrSrvrdsmp> findSafeCzwyInfoByCdbh(String MPCD);
    //获取断面信息表格数据
    public PageInfo<WrpSectionB> findDuanmianInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap);
    //渗流量信息表格数据
    public PageInfo<WrpSpgSpqnmp> findShenliuInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap);
    //渗流压力信息表格数据
    public PageInfo<WrpSpgPztb> fineSheyaInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap);
    //水平位移信息表格数据
    public PageInfo<WrpDfrSrhrdsmp> fineWeiyiInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap);
    //沉降位移信息表格数据
    public PageInfo<WrpDfrSrvrdsmp> fineChenjiangInfoByPage(Integer _page, Integer _page_size, String _orderby, Map searchMap);
    //行政区划树数据
    public List<Map> findXzqhAndSiteTreeData(Integer TYPE);
    //查询测点编号
    public List<Map> findCdbhByTable(Integer TYPE,String STCD);
}
