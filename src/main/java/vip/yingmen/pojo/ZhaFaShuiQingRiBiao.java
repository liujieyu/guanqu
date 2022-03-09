package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class ZhaFaShuiQingRiBiao {
    private String STNM;
    private String STCD;
    private String TM;
    private String DA_UPZ;
    private String DA_DWZ;
    private String DA_Q;
    private String DWQ;
    private String CTYPE;
    private String Canal_Name;
    private String AD_NM;

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getTM() {
        return TM;
    }

    public void setTM(String TM) {
        this.TM = TM;
    }

    @JSONField(name = "DA_UPZ")
    public String getDA_UPZ() {
        return DA_UPZ;
    }

    public void setDA_UPZ(String DA_UPZ) {
        this.DA_UPZ = DA_UPZ;
    }

    @JSONField(name = "DA_DWZ")
    public String getDA_DWZ() {
        return DA_DWZ;
    }

    public void setDA_DWZ(String DA_DWZ) {
        this.DA_DWZ = DA_DWZ;
    }

    @JSONField(name = "DA_Q")
    public String getDA_Q() {
        return DA_Q;
    }

    public void setDA_Q(String DA_Q) {
        this.DA_Q = DA_Q;
    }

    @JSONField(name = "DWQ")
    public String getDWQ() {
        return DWQ;
    }

    public void setDWQ(String DWQ) {
        this.DWQ = DWQ;
    }


    public String getCTYPE() {
        return CTYPE;
    }

    public void setCTYPE(String CTYPE) {
        this.CTYPE = CTYPE;
    }

    @JSONField(name = "Canal_Name")
    public String getCanal_Name() {
        return Canal_Name;
    }

    public void setCanal_Name(String canal_Name) {
        Canal_Name = canal_Name;
    }

    @JSONField(name = "AD_NM")
    public String getAD_NM() {
        return AD_NM;
    }

    public void setAD_NM(String AD_NM) {
        this.AD_NM = AD_NM;
    }
}
