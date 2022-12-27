package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class ZhaFaShuiQingGIS {
    private String ID;
    private String STCD;
    private String STTP;
    private String LTTD;
    private String LGTD;
    private String _status;
    private String STNM;
    private String TM;
    private String Q;
    private String YUJING_SZ;
    private String YUJING_EZ;
    private String YUJING_Q;
    private String YUJING_JYSZ;
    private String YUJING_JYEZ;
    private String YUJING_JYQ;
    private String UPZ;
    private String DWZ;
    private String SUPWPTN;
    private String SDWWPTN;
    private String ALARM;

    public String getALARM() {
        return ALARM;
    }

    public void setALARM(String ALARM) {
        this.ALARM = ALARM;
    }

    public String getSUPWPTN() {
        return SUPWPTN;
    }

    public void setSUPWPTN(String SUPWPTN) {
        this.SUPWPTN = SUPWPTN;
    }

    public String getSDWWPTN() {
        return SDWWPTN;
    }

    public void setSDWWPTN(String SDWWPTN) {
        this.SDWWPTN = SDWWPTN;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getSTTP() {
        return STTP;
    }

    public void setSTTP(String STTP) {
        this.STTP = STTP;
    }

    public String getLTTD() {
        return LTTD;
    }

    public void setLTTD(String LTTD) {
        this.LTTD = LTTD;
    }

    public String getLGTD() {
        return LGTD;
    }

    public void setLGTD(String LGTD) {
        this.LGTD = LGTD;
    }

    @JSONField(name = "_status")
    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getTM() {
        return TM;
    }

    public void setTM(String TM) {
        this.TM = TM;
    }

    @JSONField(name = "Q")
    public String getQ() {
        return Q;
    }

    public void setQ(String q) {
        Q = q;
    }

    @JSONField(name = "YUJING_SZ")
    public String getYUJING_SZ() {
        return YUJING_SZ;
    }

    public void setYUJING_SZ(String YUJING_SZ) {
        this.YUJING_SZ = YUJING_SZ;
    }

    @JSONField(name = "YUJING_EZ")
    public String getYUJING_EZ() {
        return YUJING_EZ;
    }

    public void setYUJING_EZ(String YUJING_EZ) {
        this.YUJING_EZ = YUJING_EZ;
    }

    @JSONField(name = "YUJING_Q")
    public String getYUJING_Q() {
        return YUJING_Q;
    }

    public void setYUJING_Q(String YUJING_Q) {
        this.YUJING_Q = YUJING_Q;
    }

    @JSONField(name = "YUJING_JYSZ")
    public String getYUJING_JYSZ() {
        return YUJING_JYSZ;
    }

    public void setYUJING_JYSZ(String YUJING_JYSZ) {
        this.YUJING_JYSZ = YUJING_JYSZ;
    }

    @JSONField(name = "YUJING_JYEZ")
    public String getYUJING_JYEZ() {
        return YUJING_JYEZ;
    }

    public void setYUJING_JYEZ(String YUJING_JYEZ) {
        this.YUJING_JYEZ = YUJING_JYEZ;
    }

    @JSONField(name = "YUJING_JYQ")
    public String getYUJING_JYQ() {
        return YUJING_JYQ;
    }

    public void setYUJING_JYQ(String YUJING_JYQ) {
        this.YUJING_JYQ = YUJING_JYQ;
    }

    public String getUPZ() {
        return UPZ;
    }

    public void setUPZ(String UPZ) {
        this.UPZ = UPZ;
    }

    public String getDWZ() {
        return DWZ;
    }

    public void setDWZ(String DWZ) {
        this.DWZ = DWZ;
    }
}
