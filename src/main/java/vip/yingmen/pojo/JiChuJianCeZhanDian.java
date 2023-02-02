package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class JiChuJianCeZhanDian {
    private String STNM;
    private String STTP;
    private String STGR;
    private String THYPE;
    private String ESSTDT;
    private String DLOG;
    private String ADMAUTH;
    private String AD_NM;
    private String CANAL_NAME;
    private String LGTD;
    private String LTTD;

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getSTTP() {
        return STTP;
    }

    public void setSTTP(String STTP) {
        this.STTP = STTP;
    }

    public String getSTGR() {
        return STGR;
    }

    public void setSTGR(String STGR) {
        this.STGR = STGR;
    }

    public String getTHYPE() {
        return THYPE;
    }

    public void setTHYPE(String THYPE) {
        this.THYPE = THYPE;
    }

    public String getESSTDT() {
        return ESSTDT;
    }

    public void setESSTDT(String ESSTDT) {
        this.ESSTDT = ESSTDT;
    }

    public String getDLOG() {
        return DLOG;
    }

    public void setDLOG(String DLOG) {
        this.DLOG = DLOG;
    }

    public String getADMAUTH() {
        return ADMAUTH;
    }

    public void setADMAUTH(String ADMAUTH) {
        this.ADMAUTH = ADMAUTH;
    }
    @JSONField(name = "AD_NM")
    public String getAD_NM() {
        return AD_NM;
    }

    public void setAD_NM(String AD_NM) {
        this.AD_NM = AD_NM;
    }

    @JSONField(name = "CANAL_NAME")
    public String getCANAL_NAME() {
        return CANAL_NAME;
    }

    public void setCANAL_NAME(String CANAL_NAME) {
        this.CANAL_NAME = CANAL_NAME;
    }

    public String getLGTD() {
        return LGTD;
    }

    public void setLGTD(String LGTD) {
        this.LGTD = LGTD;
    }

    public String getLTTD() {
        return LTTD;
    }

    public void setLTTD(String LTTD) {
        this.LTTD = LTTD;
    }
}
