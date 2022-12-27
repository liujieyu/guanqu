/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcTxlMapper
 * Author:   dabindream
 * Description: 基础数据的通讯录
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JcTongXunLu;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的通讯录〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JcTxlMapper {
    public List<JcTongXunLu> findByTongXunLu(@Param("GS")String gs,@Param("TYPES")String types,@Param("AD_CD")String adcd,@Param("NM")String nm);
}
