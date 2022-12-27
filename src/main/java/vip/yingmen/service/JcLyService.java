/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcLyService
 * Author:   dabindream
 * Description: 基础数据的流域信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.JcLiuYuXinXi;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的流域信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JcLyService {
    public PageInfo<JcLiuYuXinXi> findByJcLiuYuXinXi(Integer page, Integer pageSize, String orderBy, String gs, String ctnm);

}
