/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcXzdwMapper
 * Author:   dabindream
 * Description: 基础数据的行政单位
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.mapper;

import org.apache.ibatis.annotations.Param;
import vip.yingmen.pojo.JcXingZhengDanWei;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的行政单位〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JcXzdwMapper {
    public List<JcXingZhengDanWei> findByXingZhengDanWei(@Param("AD_CD")String adcd,@Param("AD_LV")String adlv,@Param("AD_NM")String adnm);
}
