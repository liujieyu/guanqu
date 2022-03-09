package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class JiChuQuShuiSheShiShuiZha {
    private String SLNM;
    private String SLTP;
    private String GTHLAM;
    private String GTHLNTHG;
    private String GTHLNTWD;
    private String GTTTWD;
    private String GTTTLEN;
    private String AD_NM;
    private String ADDVCD;

    public String getADDVCD() {
        return ADDVCD;
    }

    public void setADDVCD(String ADDVCD) {
        this.ADDVCD = ADDVCD;
    }

    public String getSLNM() {
        return SLNM;
    }

    public void setSLNM(String SLNM) {
        this.SLNM = SLNM;
    }

    public String getSLTP() {
        return SLTP;
    }

    public void setSLTP(String SLTP) {
        this.SLTP = SLTP;
    }

    public String getGTHLAM() {
        return GTHLAM;
    }

    public void setGTHLAM(String GTHLAM) {
        this.GTHLAM = GTHLAM;
    }

    public String getGTHLNTHG() {
        return GTHLNTHG;
    }

    public void setGTHLNTHG(String GTHLNTHG) {
        this.GTHLNTHG = GTHLNTHG;
    }

    public String getGTHLNTWD() {
        return GTHLNTWD;
    }

    public void setGTHLNTWD(String GTHLNTWD) {
        this.GTHLNTWD = GTHLNTWD;
    }

    public String getGTTTWD() {
        return GTTTWD;
    }

    public void setGTTTWD(String GTTTWD) {
        this.GTTTWD = GTTTWD;
    }

    public String getGTTTLEN() {
        return GTTTLEN;
    }

    public void setGTTTLEN(String GTTTLEN) {
        this.GTTTLEN = GTTTLEN;
    }

    @JSONField(name = "AD_NM")
    public String getAD_NM() {
        return AD_NM;
    }

    public void setAD_NM(String AD_NM) {
        this.AD_NM = AD_NM;
    }
}
