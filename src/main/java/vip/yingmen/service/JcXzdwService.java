/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcXzdwService
 * Author:   dabindream
 * Description: 基础数据的行政单位
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.JcXingZhengDanWei;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的行政单位〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JcXzdwService {
    public PageInfo<JcXingZhengDanWei> findByXingZhengDanWei(Integer page, Integer pageSize, String orderBy, String adcd, String adlv, String adnm);

}
