package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

public class WRP_IrrBTCulvert {
    private Integer ID;
    private String Culvert_Code;
    private String Culvert_Name;
    private String Culvert_Type;
    private String Entrance_Form;
    private String Outlet_Form;
    private String Body_Type;
    private String Hole_diametral;
    private String Culvert_Grade;
    private String Canal_Code;
    private String Start_Coordinate;
    private String End_Coordinate;
    private String GS;
    private BigDecimal Hole_Length;
    private BigDecimal Design_Flux;
    private BigDecimal Add_Flux;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @JSONField(name = "Culvert_Code")
    public String getCulvert_Code() {
        return Culvert_Code;
    }

    public void setCulvert_Code(String culvert_Code) {
        Culvert_Code = culvert_Code;
    }

    @JSONField(name = "Culvert_Name")
    public String getCulvert_Name() {
        return Culvert_Name;
    }

    public void setCulvert_Name(String culvert_Name) {
        Culvert_Name = culvert_Name;
    }

    @JSONField(name = "Culvert_Type")
    public String getCulvert_Type() {
        return Culvert_Type;
    }

    public void setCulvert_Type(String culvert_Type) {
        Culvert_Type = culvert_Type;
    }

    @JSONField(name = "Entrance_Form")
    public String getEntrance_Form() {
        return Entrance_Form;
    }

    public void setEntrance_Form(String entrance_Form) {
        Entrance_Form = entrance_Form;
    }

    @JSONField(name = "Outlet_Form")
    public String getOutlet_Form() {
        return Outlet_Form;
    }

    public void setOutlet_Form(String outlet_Form) {
        Outlet_Form = outlet_Form;
    }

    @JSONField(name = "Body_Type")
    public String getBody_Type() {
        return Body_Type;
    }

    public void setBody_Type(String body_Type) {
        Body_Type = body_Type;
    }

    @JSONField(name = "Hole_diametral")
    public String getHole_diametral() {
        return Hole_diametral;
    }

    public void setHole_diametral(String hole_diametral) {
        Hole_diametral = hole_diametral;
    }

    @JSONField(name = "Culvert_Grade")
    public String getCulvert_Grade() {
        return Culvert_Grade;
    }

    public void setCulvert_Grade(String culvert_Grade) {
        Culvert_Grade = culvert_Grade;
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

    @JSONField(name = "Hole_Length")
    public BigDecimal getHole_Length() {
        return Hole_Length;
    }

    public void setHole_Length(BigDecimal hole_Length) {
        Hole_Length = hole_Length;
    }

    @JSONField(name = "Design_Flux")
    public BigDecimal getDesign_Flux() {
        return Design_Flux;
    }

    public void setDesign_Flux(BigDecimal design_Flux) {
        Design_Flux = design_Flux;
    }

    @JSONField(name = "Add_Flux")
    public BigDecimal getAdd_Flux() {
        return Add_Flux;
    }

    public void setAdd_Flux(BigDecimal add_Flux) {
        Add_Flux = add_Flux;
    }
}
