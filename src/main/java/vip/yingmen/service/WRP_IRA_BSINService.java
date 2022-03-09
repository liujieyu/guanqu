package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.WRP_IRA_BSIN;

import java.util.List;

public interface WRP_IRA_BSINService {
    public List<WRP_IRA_BSIN> findAll();                //查找全部
    public PageInfo<WRP_IRA_BSIN> findByIARHWPRTPAndIRASC(Integer _page,Integer _page_size,String IARHWPRTP,String IRASC);                //根据IARHWPRTP或者IRASC查找全部
}
