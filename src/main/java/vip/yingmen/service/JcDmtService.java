/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcDmtService
 * Author:   dabindream
 * Description: 基础数据的多媒体信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.JcDuoMeiTi;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的多媒体信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JcDmtService {
    public PageInfo<JcDuoMeiTi> findByDuoMeiTi(Integer page, Integer pageSize, String orderBy, String mattype, String mat);
}
