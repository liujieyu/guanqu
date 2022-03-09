package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class QuDaoShuiQingGIS {
    private String ID;
    private String STCD;
    private String STTP;
    private String LTTD;
    private String LGTD;
    private String _status;
    private String STNM;
    private String TM;
    private String Q;
    private String Z;
    private String YUJING_Q;
    private String YUJING_Z;
    private String WPTN;
    private String ALARM;

    public String getALARM() {
        return ALARM;
    }

    public void setALARM(String ALARM) {
        this.ALARM = ALARM;
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

    @JSONField(name = "Z")
    public String getZ() {
        return Z;
    }

    public void setZ(String z) {
        Z = z;
    }

    @JSONField(name = "YUJING_Q")
    public String getYUJING_Q() {
        return YUJING_Q;
    }

    public void setYUJING_Q(String YUJING_Q) {
        this.YUJING_Q = YUJING_Q;
    }

    @JSONField(name = "YUJING_Z")
    public String getYUJING_Z() {
        return YUJING_Z;
    }

    public void setYUJING_Z(String YUJING_Z) {
        this.YUJING_Z = YUJING_Z;
    }

    public String getWPTN() {
        return WPTN;
    }

    public void setWPTN(String WPTN) {
        this.WPTN = WPTN;
    }
}
