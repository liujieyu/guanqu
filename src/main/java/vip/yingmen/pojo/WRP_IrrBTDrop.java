package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

public class WRP_IrrBTDrop {
    private Integer ID;
    private String Drop_Code;
    private String Drop_Name;
    private String Drop_Type;
    private String Drop_Grade;
    private String Meterial_Type;
    private String Drop_Form;
    private BigDecimal Drop_Differ;
    private String Canal_Code;
    private String Start_Coordinate;
    private String End_Coordinate;
    private String GS;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @JSONField(name = "Drop_Code")
    public String getDrop_Code() {
        return Drop_Code;
    }

    public void setDrop_Code(String drop_Code) {
        Drop_Code = drop_Code;
    }

    @JSONField(name = "Drop_Name")
    public String getDrop_Name() {
        return Drop_Name;
    }

    public void setDrop_Name(String drop_Name) {
        Drop_Name = drop_Name;
    }

    @JSONField(name = "Drop_Type")
    public String getDrop_Type() {
        return Drop_Type;
    }

    public void setDrop_Type(String drop_Type) {
        Drop_Type = drop_Type;
    }

    @JSONField(name = "Drop_Grade")
    public String getDrop_Grade() {
        return Drop_Grade;
    }

    public void setDrop_Grade(String drop_Grade) {
        Drop_Grade = drop_Grade;
    }

    @JSONField(name = "Meterial_Type")
    public String getMeterial_Type() {
        return Meterial_Type;
    }

    public void setMeterial_Type(String meterial_Type) {
        Meterial_Type = meterial_Type;
    }

    @JSONField(name = "Drop_Form")
    public String getDrop_Form() {
        return Drop_Form;
    }

    public void setDrop_Form(String drop_Form) {
        Drop_Form = drop_Form;
    }

    @JSONField(name = "Drop_Differ")
    public BigDecimal getDrop_Differ() {
        return Drop_Differ;
    }

    public void setDrop_Differ(BigDecimal drop_Differ) {
        Drop_Differ = drop_Differ;
    }

    @JSONField(name = "Canal_Code")
    public String getCanal_Code() {
        return Canal_Code;
    }

    public void setCanal_Code(String canal_Code) {
        Canal_Code = canal_Code;
    }

    @JSONField(name = "Start_Coordinate")
    public String getStart_Coordinate() {
        return Start_Coordinate;
    }

    public void setStart_Coordinate(String start_Coordinate) {
        Start_Coordinate = start_Coordinate;
    }

    @JSONField(name = "End_Coordinate")
    public String getEnd_Coordinate() {
        return End_Coordinate;
    }

    public void setEnd_Coordinate(String end_Coordinate) {
        End_Coordinate = end_Coordinate;
    }

    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }
}
