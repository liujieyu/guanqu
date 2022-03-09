package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class WRP_IrrBFStructure {
    private Integer ID;
    private String FStructure_Code;
    private String FStructure_Name;
    private String FStructure_Type;
    private String Fetch_Mode;
    private String SourceE_Code;
    private String MEMO;
    private String GS;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @JSONField(name = "FStructure_Code")
    public String getFStructure_Code() {
        return FStructure_Code;
    }

    public void setFStructure_Code(String FStructure_Code) {
        this.FStructure_Code = FStructure_Code;
    }

    @JSONField(name = "FStructure_Name")
    public String getFStructure_Name() {
        return FStructure_Name;
    }

    public void setFStructure_Name(String FStructure_Name) {
        this.FStructure_Name = FStructure_Name;
    }

    @JSONField(name = "FStructure_Type")
    public String getFStructure_Type() {
        return FStructure_Type;
    }

    public void setFStructure_Type(String FStructure_Type) {
        this.FStructure_Type = FStructure_Type;
    }

    @JSONField(name = "Fetch_Mode")
    public String getFetch_Mode() {
        return Fetch_Mode;
    }

    public void setFetch_Mode(String fetch_Mode) {
        Fetch_Mode = fetch_Mode;
    }

    @JSONField(name = "SourceE_Code")
    public String getSourceE_Code() {
        return SourceE_Code;
    }

    public void setSourceE_Code(String sourceE_Code) {
        SourceE_Code = sourceE_Code;
    }

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO;
    }

    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }
}
