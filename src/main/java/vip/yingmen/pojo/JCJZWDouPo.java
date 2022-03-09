/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCJZWDouPo
 * Author:   user
 * Date:     2019/8/12 11:57
 * Description: 基础数据的建筑物陡坡
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的建筑物陡坡〉
 *
 * @author user
 * @create 2019/8/12
 * @since 1.0.0
 */
public class JCJZWDouPo {
    private  String chuteName;
    private  String startCoordinate;
    private  String endCoordinate;
    private  String canalName;
    private  String gs;

    @JSONField(name = "Chute_Name")
    public String getChuteName() {
        return chuteName;
    }

    public void setChuteName(String chuteName) {
        this.chuteName = chuteName;
    }

    @JSONField(name = "Start_Coordinate")
    public String getStartCoordinate() {
        return startCoordinate;
    }

    public void setStartCoordinate(String startCoordinate) {
        this.startCoordinate = startCoordinate;
    }

    @JSONField(name = "End_Coordinate")
    public String getEndCoordinate() {
        return endCoordinate;
    }

    public void setEndCoordinate(String endCoordinate) {
        this.endCoordinate = endCoordinate;
    }

    @JSONField(name = "Canal_Name")
    public String getCanalName() {
        return canalName;
    }

    public void setCanalName(String canalName) {
        this.canalName = canalName;
    }

    @JSONField(name = "GS")
    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }
}