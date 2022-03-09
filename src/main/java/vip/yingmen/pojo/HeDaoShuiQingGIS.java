package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class HeDaoShuiQingGIS {
    private String ID;
    private String STCD;
    private String STTP;
    private String LTTD;
    private String LGTD;
    private String STNM;
    private String tm;
    private String z;
    private String WPTN;
    private String YUJING_AWL;
    private String _status;
    private String jjj;
    private String CV;
    private String singular;

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    public String getSingular() {
        return singular;
    }

    public void setSingular(String singular) {
        this.singular = singular;
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

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getWPTN() {
        return WPTN;
    }

    public void setWPTN(String WPTN) {
        this.WPTN = WPTN;
    }

    @JSONField(name = "YUJING_AWL")
    public String getYUJING_AWL() {
        return YUJING_AWL;
    }

    public void setYUJING_AWL(String YUJING_AWL) {
        this.YUJING_AWL = YUJING_AWL;
    }

    @JSONField(name = "_status")
    public String get_status() {
        return _status;
    }


    public void set_status(String _status) {
        this._status = _status;
    }

    @JSONField(name = "jjj")
    public String getJjj() {
        return jjj;
    }

    public void setJjj(String jjj) {
        this.jjj = jjj;
    }
}
