/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcDmtMapper
 * Author:   dabindream
 * Description: 基础数据的多媒体信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JcDuoMeiTi;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的多媒体信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JcDmtMapper {
    public List<JcDuoMeiTi> findByDuoMeiTi(@Param("MATType")String mattype,@Param("MAT")String mat);
}
