/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcLyMapper
 * Author:   dabindream
 * Description: 基础数据的流域信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JcLiuYuXinXi;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的流域信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JcLyMapper {
    public List<JcLiuYuXinXi> findByJcLiuYuXinXi(@Param("GS")String gs,@Param("CTNM")String ctnm);
}
