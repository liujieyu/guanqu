package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.LsTxxxMapper;
import vip.yingmen.pojo.LiShiTuXiangXinXi;
import vip.yingmen.service.LiShiTuXiangXinXiService;

import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LiShiTuXiangXinXiServiceImpl implements LiShiTuXiangXinXiService {
    @Autowired
    private HttpServletResponse response;
    @Autowired
    private LsTxxxMapper lsTxxxMapper;
    @Override
    public PageInfo<LiShiTuXiangXinXi> findByLiShiTuXiangXinXi(Integer _page,Integer _page_size,String addvcd,String stnm,String canalCode) {
        PageHelper.startPage(_page,_page_size);
        List<LiShiTuXiangXinXi> byLiShiTuXiangXinXi = lsTxxxMapper.findByLiShiTuXiangXinXi(addvcd,stnm,canalCode);
        PageInfo<LiShiTuXiangXinXi> pageInfo = new PageInfo<>(byLiShiTuXiangXinXi);
        return pageInfo;
    }

    @Override
    public byte[] findByLiShiTuXiangpic(String STCD) {
        response.setHeader("Content-Type","image/jpeg");
        LiShiTuXiangXinXi byLiShiTuXiangpic = lsTxxxMapper.findByLiShiTuXiangpic(STCD);
        if (byLiShiTuXiangpic !=null){
            return byLiShiTuXiangpic.getImage();
        }
        return null;
    }

    @Override
    public Integer findByLiShiTuXiangXinXiTj() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date();
        String substring = df.format(date1).substring(0, 11);
        System.out.println(substring);
        List<LiShiTuXiangXinXi> byLiShiTuXiangXinXi = lsTxxxMapper.findByLsTuXiangTj(substring+"00:00:00",df.format(date1));
        return byLiShiTuXiangXinXi.size();
    }


}
