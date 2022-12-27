package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

public class WRP_IrrBTInvertedsiphon {
    private Integer ID;
    private String I_Siphon_Code;
    private String I_Siphon_Name;
    private String I_Siphon_Type;
    private String I_Siphon_Grade;
    private String Tubular_Type;
    private String Pipe_Type;
    private String Structure_Type;
    private String Style;
    private BigDecimal Design_Flux;
    private String Canal_Code;
    private String Start_Coordinate;
    private String End_Coordinate;
    private String GS;
    private BigDecimal Check_Flux;
    private BigDecimal I_Length;
    private BigDecimal DIAMETER;
    private BigDecimal IN_Z;
    private BigDecimal OUT_Z;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @JSONField(name = "I_Siphon_Code")
    public String getI_Siphon_Code() {
        return I_Siphon_Code;
    }

    public void setI_Siphon_Code(String i_Siphon_Code) {
        I_Siphon_Code = i_Siphon_Code;
    }

    @JSONField(name = "I_Siphon_Name")
    public String getI_Siphon_Name() {
        return I_Siphon_Name;
    }

    public void setI_Siphon_Name(String i_Siphon_Name) {
        I_Siphon_Name = i_Siphon_Name;
    }

    @JSONField(name = "I_Siphon_Type")
    public String getI_Siphon_Type() {
        return I_Siphon_Type;
    }

    public void setI_Siphon_Type(String i_Siphon_Type) {
        I_Siphon_Type = i_Siphon_Type;
    }

    @JSONField(name = "I_Siphon_Grade")
    public String getI_Siphon_Grade() {
        return I_Siphon_Grade;
    }

    public void setI_Siphon_Grade(String i_Siphon_Grade) {
        I_Siphon_Grade = i_Siphon_Grade;
    }

    @JSONField(name = "Tubular_Type")
    public String getTubular_Type() {
        return Tubular_Type;
    }

    public void setTubular_Type(String tubular_Type) {
        Tubular_Type = tubular_Type;
    }

    @JSONField(name = "Pipe_Type")
    public String getPipe_Type() {
        return Pipe_Type;
    }

    public void setPipe_Type(String pipe_Type) {
        Pipe_Type = pipe_Type;
    }

    @JSONField(name = "Structure_Type")
    public String getStructure_Type() {
        return Structure_Type;
    }

    public void setStructure_Type(String structure_Type) {
        Structure_Type = structure_Type;
    }

    @JSONField(name = "Style")
    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
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

    @JSONField(name = "Check_Flux")
    public BigDecimal getCheck_Flux() {
        return Check_Flux;
    }

    public void setCheck_Flux(BigDecimal check_Flux) {
        Check_Flux = check_Flux;
    }

    @JSONField(name = "I_Length")
    public BigDecimal getI_Length() {
        return I_Length;
    }

    public void setI_Length(BigDecimal i_Length) {
        I_Length = i_Length;
    }

    @JSONField(name = "DIAMETER")
    public BigDecimal getDIAMETER() {
        return DIAMETER;
    }

    public void setDIAMETER(BigDecimal DIAMETER) {
        this.DIAMETER = DIAMETER;
    }

    @JSONField(name = "IN_Z")
    public BigDecimal getIN_Z() {
        return IN_Z;
    }

    public void setIN_Z(BigDecimal IN_Z) {
        this.IN_Z = IN_Z;
    }

    @JSONField(name = "OUT_Z")
    public BigDecimal getOUT_Z() {
        return OUT_Z;
    }

    public void setOUT_Z(BigDecimal OUT_Z) {
        this.OUT_Z = OUT_Z;
    }
}
