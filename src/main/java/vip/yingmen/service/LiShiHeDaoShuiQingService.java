package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.HeDaoShuiQingLiShiBiao;
import vip.yingmen.pojo.HeDaoShuiQingRiBiao;
import vip.yingmen.pojo.HeDaoShuiQingYueBiao;
import vip.yingmen.pojo.HeDaoShuiQingZuiGaoShuiWeiBiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface LiShiHeDaoShuiQingService {

    //河道水情历史数据的小时表查询，拿查询出来的数据给小时查询做为参数
    public List<Map<String,ArrayList<Map<Object, String>>>> findByXiaoShi( String Time_min, String Time_max, String ADDVCD, String Canal_Code,String LEVEL, String STGR, String STNM);

    //历史数据的河道水情日表查询
    public PageInfo<HeDaoShuiQingRiBiao> findByRiBiao(Integer _page_size, Integer _page, String TM, String ADDVCD, String Canal_Code, String STGR, String STNM, String _orderby);

    //历史数据的河道水情月表查询
    public PageInfo<HeDaoShuiQingYueBiao> findByYueBiao(Integer _page_size, Integer _page, String YR, String MON, String ADDVCD, String Canal_Code, String STGR, String STNM, String _orderby);

    //历史数据的河道水情历史表查询
    public PageInfo<HeDaoShuiQingLiShiBiao> findByLiShiBiao(Integer _page_size, Integer _page, String Time_min, String Time_max, String STCD, String _orderby);

    //历史数据的河道水情的最高水位查询
    public PageInfo<HeDaoShuiQingZuiGaoShuiWeiBiao> findByZuiGaoShuiWei(Integer _page, Integer _page_size, String YR, String ADDVCD, String STGR, String STNM, String _orderby);
}
