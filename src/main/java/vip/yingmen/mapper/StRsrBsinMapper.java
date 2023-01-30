package vip.yingmen.mapper;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import vip.yingmen.entity.StPpAlarm;
import vip.yingmen.pojo.StRsrBsin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import vip.yingmen.pojo.StRsrHych;
import vip.yingmen.pojo.WrpSectionB;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  测站水库站基本信息和防洪信息  Mapper 接口
 * </p>
 *
 * @author liujieyu
 * @since 2022-12-26
 */
public interface StRsrBsinMapper extends BaseMapper<StRsrBsin> {
    //水库站基本信息查询
    List<StRsrBsin> selectRsrBsinInfoByCon(@RequestParam("searchMap") Map searchMap);
    //测站防洪基本信息查询
    List<StRsrHych> selectRsrHychByCon(@RequestParam("searchMap") Map searchMap);
    //获取监测站点列表
    List<Map> selectStcdList();
    //判断断面编号是否存在
    Integer selectDamcdByCheck(@Param("DAMCD") String DAMCD);
    //根据断面编号查询断面信息
    WrpSectionB selectDminfoByDamcd(@Param("id") int id);
    //判断特征点编号是否存在
    Integer selectDamscdBycheck(@Param("DAMSCD") String DAMSCD);
    //根据断面ID删除断面特征信息
    void deleteDamsinfoByDmId(@Param("ids") String ids);
    //新增监测站点信息
    void insertStStbprpB(StRsrBsin pojo);
    //修改监测站点信息
    void updateStstbprpB(StRsrBsin pojo);
    //删除监测站点信息
    void deleteStstbprpB(@Param("stcds") String stcds);
    //根据ID查询站点信息
    StRsrBsin selectSiteInfoById(@Param("ID") int ID);
    //新增监测要素
    void insertStStbprpF(List<Map> list);
    //根据编号删除监测要素
    void deleteStStbprpF(@Param("stcds") String stcds);
    //判断监测站点编码是否存在
    Integer selectStcdExist(@Param("STCD") String STCD);
    //查询监测站点基本信息（维护）
    List<StRsrBsin> selectSiteInfoManageByPage(@RequestParam("searchMap") Map searchMap);
    //获取监测站点ID
    Integer selectIDFromSite();
    //获取监测要素信息ID
    Integer selectIDFromStbprpF();
    //根据ID查询测站防洪信息
    StRsrHych selectRsrAlarmById(@Param("ID") int ID);
    //获取水库水位预警ID
    Integer selectIDFromRsrAlarm();
    //新增水库水位预警信息
    void insertStRsvAlarm(StRsrHych pojo);
    //修改水库水位预警信息
    void updateStRsvAlarm(StRsrHych pojo);
    //根据ID删除水库预警信息
    void deleteStRsvAlarmById(@Param("alarmids") String alarmids);
    //判断防洪预警中监测站点是否存在
    Integer selectStcdInStRsvAlarm(@Param("stcd") String stcd);
    //判断雨量预警中监测站点是否存在
    Integer selectStcdInPpAlarm(@Param("stcd") String stcd,@Param("ewl") int ewl);
    //获取雨量预警ID
    Integer selectIDFromPpAlarm();
    //根据ID查询雨量预警信息
    StPpAlarm selectRainAlarmById(@Param("ID") int ID);
}
