package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class ShuiKuShuiQingGIS {
    private String ID;
    private String STCD;
    private String STTP;
    private String LTTD;
    private String LGTD;
    private String _status;
    private String STNM;
    private String tm;
    private String YUJING_FWL;
    private String YUJING_FWL79;
    private String RZ;
    private String RWPTN;
    private String jxx;
    private String CV;
    private String singular;
    private String W;

    public String getSingular() {
        return singular;
    }

    public void setSingular(String singular) {
        this.singular = singular;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
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

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    @JSONField(name = "YUJING_FWL")
    public String getYUJING_FWL() {
        return YUJING_FWL;
    }

    public void setYUJING_FWL(String YUJING_FWL) {
        this.YUJING_FWL = YUJING_FWL;
    }

    @JSONField(name = "YUJING_FWL79")
    public String getYUJING_FWL79() {
        return YUJING_FWL79;
    }

    public void setYUJING_FWL79(String YUJING_FWL79) {
        this.YUJING_FWL79 = YUJING_FWL79;
    }

    public String getRZ() {
        return RZ;
    }

    public void setRZ(String RZ) {
        this.RZ = RZ;
    }

    public String getRWPTN() {
        return RWPTN;
    }

    public void setRWPTN(String RWPTN) {
        this.RWPTN = RWPTN;
    }

    public String getJxx() {
        return jxx;
    }

    public void setJxx(String jxx) {
        this.jxx = jxx;
    }

    public String getW() {
        return W;
    }

    public void setW(String w) {
        W = w;
    }
}
