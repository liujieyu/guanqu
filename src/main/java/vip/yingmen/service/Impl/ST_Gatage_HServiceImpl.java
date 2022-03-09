package vip.yingmen.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vip.yingmen.mapper.ST_Gatage_HMapper;
import vip.yingmen.pojo.ST_Gatage_H;
import vip.yingmen.service.ST_Gatage_HService;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ST_Gatage_HServiceImpl implements ST_Gatage_HService {
    @Autowired
    private ST_Gatage_HMapper stGatageHMapper;

    //闸阀状态gis第二滑框的闸阀门开度历史列表查询
    @Override
    public PageInfo<ST_Gatage_H> findByZhaFaZhuangTai(Integer _page, Integer _page_size, String STCD, String Time_min, String Time_max, String _orderby) {
        PageHelper.startPage(_page, _page_size, _orderby);
        List<ST_Gatage_H> byZhaFaZhuangTai = stGatageHMapper.findByZhaFaZhuangTai(STCD, Time_min, Time_max);
        PageInfo<ST_Gatage_H> stGatageHPageInfo = new PageInfo<>(byZhaFaZhuangTai);
        return stGatageHPageInfo;
//        if (TM != null&TM != ""){                           //判断tm
//            String[] tmArray = TM.split(",");           //以逗号分隔tm的字符串放到数组里面
//            if (!tmArray[1].equals(tmArray[2])){                 //数组里面第二个是最小时间，第三个是最大时间两个做比较如果不相等就把它们传给持久层做为参数。
//
//                try {
//                    Calendar zcal = Calendar.getInstance();//日期类
//                    Timestamp timestampnow_1 = new Timestamp(zcal.getTimeInMillis());//转换成正常的日期格式
//                    Timestamp timestampnow_2 = new Timestamp(zcal.getTimeInMillis());//转换成正常的日期格式
//                    Date timeMin = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(tmArray[1]);//改为需要的东西
//                    Date timeMax = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(tmArray[2]);//改为需要的东西
//                    timestampnow_1 = new Timestamp(timeMin.getTime());
//                    timestampnow_2 = new Timestamp(timeMax.getTime());
//                    System.out.println(timestampnow_1);
//                    System.out.println(timestampnow_2);
//                    List<ST_Gatage_H> byZhaFaZhuangTai = stGatageHMapper.findByZhaFaZhuangTai(timestampnow_1,timestampnow_2);
//                    PageInfo<ST_Gatage_H> stGatageHPageInfo = new PageInfo<>(byZhaFaZhuangTai);
//                    return stGatageHPageInfo;
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }
//      return null;
    }
}
