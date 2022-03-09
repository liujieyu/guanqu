package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class JiChuShuiYuanJing {
    private String Well_Name;
    private String Diameter;
    private String Depth;
    private String Diameter_Type;
    private String Depth_Type;
    private String Motivity_Type;
    private String Material_Type;
    private String AD_NM;
    private String CANAL_NAME;

    @JSONField(name = "Well_Name")
    public String getWell_Name() {
        return Well_Name;
    }

    public void setWell_Name(String well_Name) {
        Well_Name = well_Name;
    }

    @JSONField(name = "Diameter")
    public String getDiameter() {
        return Diameter;
    }

    public void setDiameter(String diameter) {
        Diameter = diameter;
    }

    @JSONField(name = "Depth")
    public String getDepth() {
        return Depth;
    }

    public void setDepth(String depth) {
        Depth = depth;
    }

    @JSONField(name = "Diameter_Type")
    public String getDiameter_Type() {
        return Diameter_Type;
    }

    public void setDiameter_Type(String diameter_Type) {
        Diameter_Type = diameter_Type;
    }

    @JSONField(name = "Depth_Type")
    public String getDepth_Type() {
        return Depth_Type;
    }

    public void setDepth_Type(String depth_Type) {
        Depth_Type = depth_Type;
    }

    @JSONField(name = "Motivity_Type")
    public String getMotivity_Type() {
        return Motivity_Type;
    }

    public void setMotivity_Type(String motivity_Type) {
        Motivity_Type = motivity_Type;
    }

    @JSONField(name = "Material_Type")
    public String getMaterial_Type() {
        return Material_Type;
    }

    public void setMaterial_Type(String material_Type) {
        Material_Type = material_Type;
    }

    @JSONField(name = "AD_NM")
    public String getAD_NM() {
        return AD_NM;
    }

    public void setAD_NM(String AD_NM) {
        this.AD_NM = AD_NM;
    }

    @JSONField(name = "CANAL_NAME")
    public String getCANAL_NAME() {
        return CANAL_NAME;
    }

    public void setCANAL_NAME(String CANAL_NAME) {
        this.CANAL_NAME = CANAL_NAME;
    }
}
