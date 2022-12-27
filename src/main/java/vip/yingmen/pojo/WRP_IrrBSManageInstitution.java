package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

/**
 * 灌区管理机构表
 * 用于管理各级管理机构信息，灌区管理局（处）为最高管理机构，以下机构分级。
 */
public class WRP_IrrBSManageInstitution {
    private Integer ID;
    private String Organ_PY;
    private String Organ_Code;
    private String Organ_Name;
    private String IRACD;
    private Integer Male_Employee_Number;
    private Integer FeMale_Employee_Number;
    private Integer Senior_Number;
    private Integer Engineer_Number;
    private Integer Upper_Major;
    private BigDecimal Average_Organ_id;
    private String Upper_Organ_Code;

    @JSONField(name = "ID")
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @JSONField(name = "Organ_PY")
    public String getOrgan_PY() {
        return Organ_PY;
    }

    public void setOrgan_PY(String organ_PY) {
        Organ_PY = organ_PY;
    }

    @JSONField(name = "Organ_Code")
    public String getOrgan_Code() {
        return Organ_Code;
    }

    public void setOrgan_Code(String organ_Code) {
        Organ_Code = organ_Code;
    }

    @JSONField(name = "Organ_Name")
    public String getOrgan_Name() {
        return Organ_Name;
    }

    public void setOrgan_Name(String organ_Name) {
        Organ_Name = organ_Name;
    }

    @JSONField(name = "IRACD")
    public String getIRACD() {
        return IRACD;
    }

    public void setIRACD(String IRACD) {
        this.IRACD = IRACD;
    }

    @JSONField(name = "Male_Employee_Number")
    public Integer getMale_Employee_Number() {
        return Male_Employee_Number;
    }

    public void setMale_Employee_Number(Integer male_Employee_Number) {
        Male_Employee_Number = male_Employee_Number;
    }

    @JSONField(name = "FeMale_Employee_Number")
    public Integer getFeMale_Employee_Number() {
        return FeMale_Employee_Number;
    }

    public void setFeMale_Employee_Number(Integer feMale_Employee_Number) {
        FeMale_Employee_Number = feMale_Employee_Number;
    }

    @JSONField(name = "Senior_Number")
    public Integer getSenior_Number() {
        return Senior_Number;
    }

    public void setSenior_Number(Integer senior_Number) {
        Senior_Number = senior_Number;
    }

    @JSONField(name = "Engineer_Number")
    public Integer getEngineer_Number() {
        return Engineer_Number;
    }

    public void setEngineer_Number(Integer engineer_Number) {
        Engineer_Number = engineer_Number;
    }

    @JSONField(name = "Upper_Major")
    public Integer getUpper_Major() {
        return Upper_Major;
    }

    public void setUpper_Major(Integer upper_Major) {
        Upper_Major = upper_Major;
    }

    @JSONField(name = "Average_Organ_id")
    public BigDecimal getAverage_Organ_id() {
        return Average_Organ_id;
    }

    public void setAverage_Organ_id(BigDecimal average_Organ_id) {
        Average_Organ_id = average_Organ_id;
    }

    @JSONField(name = "Upper_Organ_Code")
    public String getUpper_Organ_Code() {
        return Upper_Organ_Code;
    }

    public void setUpper_Organ_Code(String upper_Organ_Code) {
        Upper_Organ_Code = upper_Organ_Code;
    }
}
