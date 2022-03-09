package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class ZhaFaShuiQingYueBiao {
    private String STNM;
    private String STCD;
    private String DT;
    private String MA_UPZ;
    private String MA_DWZ;
    private String MA_Q;
    private String MWQ;
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

    public String getDT() {
        return DT;
    }

    public void setDT(String DT) {
        this.DT = DT;
    }

    @JSONField(name = "MA_UPZ")
    public String getMA_UPZ() {
        return MA_UPZ;
    }

    public void setMA_UPZ(String MA_UPZ) {
        this.MA_UPZ = MA_UPZ;
    }

    @JSONField(name = "MA_DWZ")
    public String getMA_DWZ() {
        return MA_DWZ;
    }


    public void setMA_DWZ(String MA_DWZ) {
        this.MA_DWZ = MA_DWZ;
    }

    @JSONField(name = "MA_Q")
    public String getMA_Q() {
        return MA_Q;
    }

    public void setMA_Q(String MA_Q) {
        this.MA_Q = MA_Q;
    }

    @JSONField(name = "MWQ")
    public String getMWQ() {
        return MWQ;
    }

    public void setMWQ(String MWQ) {
        this.MWQ = MWQ;
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
