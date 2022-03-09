/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcTxlService
 * Author:   dabindream
 * Description: 基础数据的通讯录
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.JcTongXunLu;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的通讯录〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JcTxlService {
    public PageInfo<JcTongXunLu> findByTongXunLu(Integer page, Integer pageSize, String orderBy, String gs, String types,String adcd,String nm);
}
