package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class HeDaoShuiQingRiBiao {
    private String STNM;
    private String STCD;
    private String TM;
    private String RZ;
    private String CV;
    private String INQ;
    private String DW;
    private String AWL;
    private String Max_RZ;
    private String Max_TM;
    private String Min_RZ;
    private String Min_TM;
    private String STGR;
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

    public String getRZ() {
        return RZ;
    }

    public void setRZ(String RZ) {
        this.RZ = RZ;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    public String getINQ() {
        return INQ;
    }

    public void setINQ(String INQ) {
        this.INQ = INQ;
    }

    public String getDW() {
        return DW;
    }

    public void setDW(String DW) {
        this.DW = DW;
    }

    public String getAWL() {
        return AWL;
    }

    public void setAWL(String AWL) {
        this.AWL = AWL;
    }

    @JSONField(name = "Max_RZ")
    public String getMax_RZ() {
        return Max_RZ;
    }

    public void setMax_RZ(String max_RZ) {
        Max_RZ = max_RZ;
    }

    @JSONField(name = "Max_TM")
    public String getMax_TM() {
        return Max_TM;
    }

    public void setMax_TM(String max_TM) {
        Max_TM = max_TM;
    }

    @JSONField(name = "Min_RZ")
    public String getMin_RZ() {
        return Min_RZ;
    }

    public void setMin_RZ(String min_RZ) {
        Min_RZ = min_RZ;
    }

    @JSONField(name = "Min_TM")
    public String getMin_TM() {
        return Min_TM;
    }

    public void setMin_TM(String min_TM) {
        Min_TM = min_TM;
    }

    public String getSTGR() {
        return STGR;
    }

    public void setSTGR(String STGR) {
        this.STGR = STGR;
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
