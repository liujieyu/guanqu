package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.ZhaFaShuiQingYueBiao;

public interface ZhaFaShuiQingYueBiaoService {
    //历史数据的闸阀水情月表查询
    public PageInfo<ZhaFaShuiQingYueBiao> findByYueBiao(Integer _page, Integer _page_size, String YR, String MON, String ADDVCD, String Canal_Code, String CTYPE, String STNM,String _orderby);
}
