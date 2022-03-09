/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCJZWService
 * Author:   user
 * Date:     2019/8/12 10:11
 * Description: 基础数据的建筑物
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.service;

import com.github.pagehelper.PageInfo;
import vip.yingmen.pojo.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的建筑物〉
 *
 * @author user
 * @create 2019/8/12
 * @since 1.0.0
 */
public interface JCJZWService {
    public PageInfo<JCJZWDuCao> findByDuCao(Integer page,Integer pageSize,String orderBy,String matieralType,String flumBodyType,String canalCode, String flumName);

    public PageInfo<JCJZWSuiDong> findBySuiDong(Integer page, Integer pageSize, String orderBy, String tunnelName, String canalCode);

    public PageInfo<JCJZWDaoHongXi> findByDaoHongXi(Integer page, Integer pageSize, String orderBy, String isiphonName, String canalCode, String isiphonType, String structureType, String style);

    public PageInfo<JCJZWHanDong> findByHanDong(Integer page, Integer pageSize, String orderBy, String culvertName, String canalCode, String entranceForm, String bodyType);

    public PageInfo<JCJZWDouPo> findByDouPo(Integer page, Integer pageSize, String orderBy, String chuteName, String canalCode);

    public PageInfo<JCJZWChenShaDi> findByChenShaDi(Integer page,Integer pageSize,String orderBy,String dediBasinName,String canalCode);
}
