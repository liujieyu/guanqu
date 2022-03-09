/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCJZWHanDong
 * Author:   user
 * Date:     2019/8/12 11:36
 * Description: 基础数据的建筑物的涵洞
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的建筑物的涵洞〉
 *
 * @author user
 * @create 2019/8/12
 * @since 1.0.0
 */
public class JCJZWHanDong {
    private  String culvertName;
    private  String entranceForm;
    private  String bodyType;
    private  String holediametral;
    private  String holeLength;
    private  String designFlux;
    private  String addFlux;
    private  String canalName;
    private  String gs;

    @JSONField(name = "Culvert_Name")
    public String getCulvertName() {
        return culvertName;
    }

    public void setCulvertName(String culvertName) {
        this.culvertName = culvertName;
    }

    @JSONField(name = "Entrance_Form")
    public String getEntranceForm() {
        return entranceForm;
    }

    public void setEntranceForm(String entranceForm) {
        this.entranceForm = entranceForm;
    }

    @JSONField(name = "Body_Type")
    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @JSONField(name = "Hole_diametral")
    public String getHolediametral() {
        return holediametral;
    }

    public void setHolediametral(String holediametral) {
        this.holediametral = holediametral;
    }

    @JSONField(name = "Hole_Length")
    public String getHoleLength() {
        return holeLength;
    }

    public void setHoleLength(String holeLength) {
        this.holeLength = holeLength;
    }

    @JSONField(name = "Design_Flux")
    public String getDesignFlux() {
        return designFlux;
    }

    public void setDesignFlux(String designFlux) {
        this.designFlux = designFlux;
    }

    @JSONField(name = "Add_Flux")
    public String getAddFlux() {
        return addFlux;
    }

    public void setAddFlux(String addFlux) {
        this.addFlux = addFlux;
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