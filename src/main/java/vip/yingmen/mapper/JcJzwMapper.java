/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JcJzwMapper
 * Author:   user
 * Date:     2019/8/9 10:09
 * Description: 基础数据的建筑物
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的建筑物〉
 *
 * @author user
 * @create 2019/8/9
 * @since 1.0.0
 */
public interface JcJzwMapper {
    public List<JCJZWDuCao> findByDuCao(@Param("Matieral_Type")String matieralType,@Param("FlumBody_Type")String flumBodyType,@Param("Canal_Code")String canalCode,@Param("Flum_Name")String flumName);

    public List<JCJZWSuiDong> findBySuiDong(@Param("Tunnel_Name")String tunnelName, @Param("Canal_Code")String canalCode);

    public List<JCJZWDaoHongXi> findByDaoHongXi(@Param("I_Siphon_Name")String isiphonName, @Param("Canal_Code")String canalCode, @Param("I_Siphon_Type")String isiphonType, @Param("Structure_Type")String structureType, @Param("Style")String style);

    public List<JCJZWHanDong> findByHanDong(@Param("Culvert_Name")String culvertName, @Param("Canal_Code")String canalCode, @Param("Entrance_Form")String entranceForm, @Param("Body_Type")String bodyType);

    public List<JCJZWDouPo> findByDouPo(@Param("Chute_Name")String chuteName, @Param("Canal_Code")String canalCode);

    public List<JCJZWChenShaDi> findByChenShaDi(@Param("DediBasin_Name")String dediBasinName,@Param("Canal_Code")String canalCode);
}
