/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCJZWChenShaDi
 * Author:   user
 * Date:     2019/8/12 14:34
 * Description: 基础数据的建筑物沉沙地
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的建筑物沉沙地〉
 *
 * @author user
 * @create 2019/8/12
 * @since 1.0.0
 */
public class JCJZWChenShaDi {
    private String dediBasinName;
    private String dediBasinLength;
    private String averageDepth;
    private String startCoordinate;
    private String endCoordinate;
    private String canalName;
    private String gs;

    @JSONField(name = "DediBasin_Name")
    public String getDediBasinName() {
        return dediBasinName;
    }

    public void setDediBasinName(String dediBasinName) {
        this.dediBasinName = dediBasinName;
    }

    @JSONField(name = "DediBasin_Length")
    public String getDediBasinLength() {
        return dediBasinLength;
    }

    public void setDediBasinLength(String dediBasinLength) {
        this.dediBasinLength = dediBasinLength;
    }
    @JSONField(name = "Average_Depth")
    public String getAverageDepth() {
        return averageDepth;
    }

    public void setAverageDepth(String averageDepth) {
        this.averageDepth = averageDepth;
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