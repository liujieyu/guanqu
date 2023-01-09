package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
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
}
