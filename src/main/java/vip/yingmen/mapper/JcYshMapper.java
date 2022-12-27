/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcYshMapper
 * Author:   dabindream
 * Description: 基础数据的用水户
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JcyshGongYeYongShui;
import vip.yingmen.pojo.JcyshNonYeYongShui;
import vip.yingmen.pojo.JcyshYongShuiHu;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的用水户 〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JcYshMapper {
    public List<JcyshYongShuiHu> findByYongShuiHu(@Param("Cell_Type")String cellType,@Param("Cell_Name")String cellName,@Param("GS")String gs);

    public List<JcyshNonYeYongShui> findByNonYeYongShui(@Param("Canal_Code")String canalCode, @Param("Cell_Name")String cellName, @Param("AD_CD")String adcd);

    public List<JcyshGongYeYongShui> findByGongYeYongShui(@Param("Canal_Code")String canalCode, @Param("Cell_Name")String cellName, @Param("AD_CD")String adcd);
}