package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class YunXingGongKuangGIS {
    private String ID;
    private String STCD;
    private String STTP;
    private String LTTD;
    private String LGTD;
    private String _status;
    private String STNM;
    private String tm;
    private String vol;
    private String STLC;
    private String VOLMIN;
    private String VOLMAX;

    public String getVOLMIN() {
        return VOLMIN;
    }

    public void setVOLMIN(String VOLMIN) {
        this.VOLMIN = VOLMIN;
    }

    public String getVOLMAX() {
        return VOLMAX;
    }

    public void setVOLMAX(String VOLMAX) {
        this.VOLMAX = VOLMAX;
    }

    public String getSTLC() {
        return STLC;
    }

    public void setSTLC(String STLC) {
        this.STLC = STLC;
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

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    @JSONField(name = "CS")
    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    private String cs
            ;
}
