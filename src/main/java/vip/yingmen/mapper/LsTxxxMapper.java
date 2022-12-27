package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.LiShiTuXiangXinXi;

import java.util.List;

public interface LsTxxxMapper {
    /**
     * 历史数据的图像信息接口
     * @param addvcd
     * @param stnm
     * @param canalCode
     * @return
     */
    public List<LiShiTuXiangXinXi> findByLiShiTuXiangXinXi(@Param("ADDVCD") String addvcd,@Param("STNM")String stnm,@Param("Canal_Code")String canalCode);

    /**
     * 历史数据的图像信息接口，单独根据stcd拿出图片
     * @param STCD
     * @return
     */
    public LiShiTuXiangXinXi findByLiShiTuXiangpic(@Param("STCD") String STCD);

    /**
     * 历史数据的图像信息用于接收今天收到图像的站数统计
     * @param timeMix
     * @param timeMax
     * @return
     */
    public List<LiShiTuXiangXinXi> findByLsTuXiangTj(@Param("Time_min") String timeMix,@Param("Time_max") String timeMax);
}
