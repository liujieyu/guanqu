package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

public class WRP_IrrBTTunnel {
    private Integer ID;
    private String Tunnel_Code;
    private String Tunnel_Name;
    private String Tynnel_Type;
    private String Tunnel_Grade;
    private BigDecimal Tunnel_Diameter;
    private BigDecimal Bending_Radius;
    private BigDecimal Entrance_Altitude;
    private BigDecimal Outlet_Altitude;
    private BigDecimal Design_Flux;
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

    @JSONField(name = "Tunnel_Code")
    public String getTunnel_Code() {
        return Tunnel_Code;
    }

    public void setTunnel_Code(String tunnel_Code) {
        Tunnel_Code = tunnel_Code;
    }

    @JSONField(name = "Tunnel_Name")
    public String getTunnel_Name() {
        return Tunnel_Name;
    }

    public void setTunnel_Name(String tunnel_Name) {
        Tunnel_Name = tunnel_Name;
    }

    @JSONField(name = "Tynnel_Type")
    public String getTynnel_Type() {
        return Tynnel_Type;
    }

    public void setTynnel_Type(String tynnel_Type) {
        Tynnel_Type = tynnel_Type;
    }

    @JSONField(name = "Tunnel_Grade")
    public String getTunnel_Grade() {
        return Tunnel_Grade;
    }

    public void setTunnel_Grade(String tunnel_Grade) {
        Tunnel_Grade = tunnel_Grade;
    }

    @JSONField(name = "Tunnel_Diameter")
    public BigDecimal getTunnel_Diameter() {
        return Tunnel_Diameter;
    }

    public void setTunnel_Diameter(BigDecimal tunnel_Diameter) {
        Tunnel_Diameter = tunnel_Diameter;
    }

    @JSONField(name = "Bending_Radius")
    public BigDecimal getBending_Radius() {
        return Bending_Radius;
    }

    public void setBending_Radius(BigDecimal bending_Radius) {
        Bending_Radius = bending_Radius;
    }

    @JSONField(name = "Entrance_Altitude")
    public BigDecimal getEntrance_Altitude() {
        return Entrance_Altitude;
    }

    public void setEntrance_Altitude(BigDecimal entrance_Altitude) {
        Entrance_Altitude = entrance_Altitude;
    }

    @JSONField(name = "Outlet_Altitude")
    public BigDecimal getOutlet_Altitude() {
        return Outlet_Altitude;
    }

    public void setOutlet_Altitude(BigDecimal outlet_Altitude) {
        Outlet_Altitude = outlet_Altitude;
    }

    @JSONField(name = "Design_Flux")
    public BigDecimal getDesign_Flux() {
        return Design_Flux;
    }

    public void setDesign_Flux(BigDecimal design_Flux) {
        Design_Flux = design_Flux;
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
