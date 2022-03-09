package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.LiShiTuXiangXinXi;

public interface LiShiTuXiangXinXiService {
    public PageInfo<LiShiTuXiangXinXi> findByLiShiTuXiangXinXi(Integer _page,Integer _page_size,String addvcd,String stnm,String canalCode);


    public byte[] findByLiShiTuXiangpic(String STCD);

    public Integer findByLiShiTuXiangXinXiTj();
}
