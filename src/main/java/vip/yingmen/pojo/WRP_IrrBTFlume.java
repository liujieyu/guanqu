package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

public class WRP_IrrBTFlume {
    private Integer ID;
    private String Flum_Code;
    private String Flum_Name;
    private String Matieral_Type;
    private String Flum_Grade;
    private String FlumBody_Type;
    private BigDecimal Flow_Rate;
    private String Canal_Code;
    private String Start_Coordinate;
    private String End_Coordinate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @JSONField(name = "Flum_Code")
    public String getFlum_Code() {
        return Flum_Code;
    }

    public void setFlum_Code(String flum_Code) {
        Flum_Code = flum_Code;
    }

    @JSONField(name = "Flum_Name")
    public String getFlum_Name() {
        return Flum_Name;
    }

    public void setFlum_Name(String flum_Name) {
        Flum_Name = flum_Name;
    }

    @JSONField(name = "Matieral_Type")
    public String getMatieral_Type() {
        return Matieral_Type;
    }


    public void setMatieral_Type(String matieral_Type) {
        Matieral_Type = matieral_Type;
    }

    @JSONField(name = "Flum_Grade")
    public String getFlum_Grade() {
        return Flum_Grade;
    }


    public void setFlum_Grade(String flum_Grade) {
        Flum_Grade = flum_Grade;
    }

    @JSONField(name = "FlumBody_Type")
    public String getFlumBody_Type() {
        return FlumBody_Type;
    }


    public void setFlumBody_Type(String flumBody_Type) {
        FlumBody_Type = flumBody_Type;
    }

    @JSONField(name = "Flow_Rate")
    public BigDecimal getFlow_Rate() {
        return Flow_Rate;
    }

    public void setFlow_Rate(BigDecimal flow_Rate) {
        Flow_Rate = flow_Rate;
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
}
