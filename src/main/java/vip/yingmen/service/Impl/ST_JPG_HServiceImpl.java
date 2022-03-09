package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_JPG_HMapper;
import vip.yingmen.pojo.ST_JPG_H;
import vip.yingmen.service.ST_JPG_HService;

import java.util.List;

@Service
public class ST_JPG_HServiceImpl implements ST_JPG_HService {
    @Autowired
    private ST_JPG_HMapper stJpgHMapper;

    //图像gis的第二滑框历史表查询
    @Override
    public PageInfo<ST_JPG_H> findBySingleLiShi(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<ST_JPG_H> bySingleLiShi = stJpgHMapper.findBySingleLiShi(STCD, Time_min, Time_max);
        for (ST_JPG_H s : bySingleLiShi) {     //循环获取ST_JPG_H里面的字段值
            if (s.getSave_Path() != null) {
                String s1 = s.getSave_Path().substring(2, s.getSave_Path().length());//只要c：后面的值
                String s2 = s1.replace('\\', '/');     //把绝对字符修改
                s.setSave_Path(s2);                                     //再存进list
            }

        }
        PageInfo<ST_JPG_H> stJpgHPageInfo = new PageInfo<>(bySingleLiShi);
        stJpgHPageInfo.getList();
        return stJpgHPageInfo;
    }
}
