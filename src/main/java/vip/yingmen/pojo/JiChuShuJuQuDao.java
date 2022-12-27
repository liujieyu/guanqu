package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class JiChuShuJuQuDao {
    private String Canal_Code;
    private String Canal_Name;
    private String User_Type;
    private String Canal_Level;
    private String Length;
    private String Normal_Flux;
    private String Max_Flux;
    private String Min_Flux;
    private String Upper_Canal;
    private String Upper_Canal_Coordinate;

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

    @JSONField(name = "User_Type")
    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String user_Type) {
        User_Type = user_Type;
    }

    @JSONField(name = "Canal_Level")
    public String getCanal_Level() {
        return Canal_Level;
    }

    public void setCanal_Level(String canal_Level) {
        Canal_Level = canal_Level;
    }
    @JSONField(name = "Length")
    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }

    @JSONField(name = "Normal_Flux")
    public String getNormal_Flux() {
        return Normal_Flux;
    }

    public void setNormal_Flux(String normal_Flux) {
        Normal_Flux = normal_Flux;
    }

    @JSONField(name = "Max_Flux")
    public String getMax_Flux() {
        return Max_Flux;
    }

    public void setMax_Flux(String max_Flux) {
        Max_Flux = max_Flux;
    }

    @JSONField(name = "Min_Flux")
    public String getMin_Flux() {
        return Min_Flux;
    }

    public void setMin_Flux(String min_Flux) {
        Min_Flux = min_Flux;
    }

    @JSONField(name = "Upper_Canal")
    public String getUpper_Canal() {
        return Upper_Canal;
    }

    public void setUpper_Canal(String upper_Canal) {
        Upper_Canal = upper_Canal;
    }

    @JSONField(name = "Upper_Canal_Coordinate")
    public String getUpper_Canal_Coordinate() {
        return Upper_Canal_Coordinate;
    }

    public void setUpper_Canal_Coordinate(String upper_Canal_Coordinate) {
        Upper_Canal_Coordinate = upper_Canal_Coordinate;
    }
}
