package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_G_CQORDMapper;
import vip.yingmen.pojo.ST_G_CQORD;
import vip.yingmen.service.ST_G_CQORDService;

import java.util.List;


@Service
public class ST_G_CQORDServiceImpl implements ST_G_CQORDService {
    @Autowired
    private ST_G_CQORDMapper stGCqordMapper;

    //渠道水情gis的第二滑框历史表查询
    @Override
//    public PageInfo<ST_G_CQORD> findBySTCD(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max) {
//        PageHelper.startPage(_page, _page_size);
//        List<ST_G_CQORD> bySingleLiShi = stGCqordMapper.findBySTCD(STCD,Time_min, Time_max);
//        PageInfo<ST_G_CQORD> stCanalRPageInfo = new PageInfo<>(bySingleLiShi);
//        return stCanalRPageInfo;
    public PageInfo<ST_G_CQORD> findBySTCD(Integer _page, Integer _page_size, String STCD, String YR) {
        PageHelper.startPage(_page, _page_size);
        if (YR != null & YR != "") {                           //判断tm
            String[] tmArray = YR.split(",");           //以逗号分隔tm的字符串放到数组里面
            if (!tmArray[1].equals(tmArray[2])) {                 //数组里面第二个是最小时间，第三个是最大时间两个做比较如果不相等就把它们传给持久层做为参数。
                Integer Time_min = Integer.valueOf(tmArray[1]);
                Integer Time_max = Integer.valueOf(tmArray[2]);
//                System.out.println(Time_min);
//                System.out.println(Time_max);
                List<ST_G_CQORD> stGCqords = stGCqordMapper.findBySTCD(STCD, Time_min, Time_max);        //传参数进去
                PageInfo<ST_G_CQORD> pageInfo = new PageInfo<>(stGCqords);
                return pageInfo;
            }

        }
        return null;
    }
}
