/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCJZWDaoHongXi
 * Author:   user
 * Date:     2019/8/12 11:15
 * Description: 基础数据的建筑物的倒虹吸
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的建筑物的倒虹吸〉
 *
 * @author user
 * @create 2019/8/12
 * @since 1.0.0
 */
public class JCJZWDaoHongXi {
    private String isiphonName;
    private String isiphonType;
    private String structureType;
    private String style;
    private String designFlux;
    private String checkFlux;
    private String ilength;
    private String diameter;
    private String inz;
    private String outz;
    private String canalName;
    private String gs;

    @JSONField(name = "I_Siphon_Name")
    public String getIsiphonName() {
        return isiphonName;
    }

    public void setIsiphonName(String isiphonName) {
        this.isiphonName = isiphonName;
    }

    @JSONField(name = "I_Siphon_Type")
    public String getIsiphonType() {
        return isiphonType;
    }

    public void setIsiphonType(String isiphonType) {
        this.isiphonType = isiphonType;
    }

    @JSONField(name = "Structure_Type")
    public String getStructureType() {
        return structureType;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType;
    }

    @JSONField(name = "Style")
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @JSONField(name = "Design_Flux")
    public String getDesignFlux() {
        return designFlux;
    }

    public void setDesignFlux(String designFlux) {
        this.designFlux = designFlux;
    }

    @JSONField(name = "Check_Flux")
    public String getCheckFlux() {
        return checkFlux;
    }

    public void setCheckFlux(String checkFlux) {
        this.checkFlux = checkFlux;
    }

    @JSONField(name = "I_Length")
    public String getIlength() {
        return ilength;
    }

    public void setIlength(String ilength) {
        this.ilength = ilength;
    }

    @JSONField(name = "DIAMETER")
    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    @JSONField(name = "IN_Z")
    public String getInz() {
        return inz;
    }

    public void setInz(String inz) {
        this.inz = inz;
    }

    @JSONField(name = "OUT_Z")
    public String getOutz() {
        return outz;
    }

    public void setOutz(String outz) {
        this.outz = outz;
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