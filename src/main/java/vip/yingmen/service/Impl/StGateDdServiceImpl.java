package vip.yingmen.service.Impl;

import vip.yingmen.entity.AlarmParam;
import vip.yingmen.entity.StGateDd;
import vip.yingmen.mapper.StGateDdMapper;
import vip.yingmen.service.StGateDdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liujieyu
 * @since 2019-10-10
 */
@Service
public class StGateDdServiceImpl extends ServiceImpl<StGateDdMapper, StGateDd> implements StGateDdService {
    @Autowired
    StGateDdMapper stGateDdMapper;
    //泄洪信息总记录数
    public Integer selectStGateDdByCount(AlarmParam alarmParam){
        return stGateDdMapper.selectStGateDdByCount(alarmParam);
    }
    //泄洪信息分页查询
    public List<StGateDd> selectStGateDdByPage(AlarmParam alarmParam){
        return stGateDdMapper.selectStGateDdByPage(alarmParam);
    }
    //泄洪信息图形数据
    public List<StGateDd> selectStGateDdByType(AlarmParam alarmParam){
        return stGateDdMapper.selectStGateDdByType(alarmParam);
    }
}
