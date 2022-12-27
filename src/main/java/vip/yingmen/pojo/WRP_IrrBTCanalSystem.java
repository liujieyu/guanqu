package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;

public class WRP_IrrBTCanalSystem {

    private int ID;                         //序号自增
    private String Canal_Code;               //渠道编码 主键
    private String Canal_Name;               //渠道名称
    private String GS;                      //归属灌区 外键
    private String Canal_PY;                 //拼音
    private String User_Type;                //作用类型
    private BigDecimal Canal_Length;         //渠道长度
    private String Upper_Canal_Code;          //上级渠道  外键
    private String Upper_Canal_Coordinate;     //上级渠道桩号
    private String Upper_Canal_Name;          //上级渠道名称
    private String Canal_Level;              //渠道等级

    @JSONField(name = "ID")
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @JSONField(name = "Canal_Code")
    public String getCanal_Code() {
        return Canal_Code;
    }

    public void setCanal_Code(String canal_Code) {
        Canal_Code = canal_Code;
    }

    @JSONField(name = "Canal_Name")
    public String getCanal_Name() {
        return Canal_Name;
    }

    public void setCanal_Name(String canal_Name) {
        Canal_Name = canal_Name;
    }

    @JSONField(name = "GS")
    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }

    @JSONField(name = "Canal_PY")
    public String getCanal_PY() {
        return Canal_PY;
    }

    public void setCanal_PY(String canal_PY) {
        Canal_PY = canal_PY;
    }

    @JSONField(name = "User_Type")
    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String user_Type) {
        User_Type = user_Type;
    }

    @JSONField(name = "Canal_Length")
    public BigDecimal getCanal_Length() {
        return Canal_Length;
    }

    public void setCanal_Length(BigDecimal canal_Length) {
        Canal_Length = canal_Length;
    }

    @JSONField(name = "Upper_Canal_Code")
    public String getUpper_Canal_Code() {
        return Upper_Canal_Code;
    }

    public void setUpper_Canal_Code(String upper_Canal_Code) {
        Upper_Canal_Code = upper_Canal_Code;
    }

    @JSONField(name = "Upper_Canal_Coordinate")
    public String getUpper_Canal_Coordinate() {
        return Upper_Canal_Coordinate;
    }

    public void setUpper_Canal_Coordinate(String upper_Canal_Coordinate) {
        Upper_Canal_Coordinate = upper_Canal_Coordinate;
    }

    @JSONField(name = "Upper_Canal_Name")
    public String getUpper_Canal_Name() {
        return Upper_Canal_Name;
    }

    public void setUpper_Canal_Name(String upper_Canal_Name) {
        Upper_Canal_Name = upper_Canal_Name;
    }

    @JSONField(name = "Canal_Level")
    public String getCanal_Level() {
        return Canal_Level;
    }

    public void setCanal_Level(String canal_Level) {
        Canal_Level = canal_Level;
    }
}
