/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JCYSHService
 * Author:   dabindream
 * Description: 基础数据的用水户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.JcyshGongYeYongShui;
import vip.yingmen.pojo.JcyshNonYeYongShui;
import vip.yingmen.pojo.JcyshYongShuiHu;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的用水户〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public interface JCYSHService {
    public PageInfo<JcyshYongShuiHu> findByYongShuiHu(Integer page,Integer pageSize,String orderBy,String cellType, String cellName, String gs);

    public PageInfo<JcyshNonYeYongShui> findByNonYeYongShui(Integer page,Integer pageSize,String orderBy,String canalCode, String cellName,String adcd);

    public PageInfo<JcyshGongYeYongShui> findByGongYeYongShui(Integer page,Integer pageSize,String orderBy,String canalCode,String cellName,String adcd);
}
