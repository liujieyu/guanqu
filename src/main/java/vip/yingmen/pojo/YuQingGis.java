package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class YuQingGis {
    private String ID;
    private String STCD;
    private String STTP;
    private String LTTD;
    private String LGTD;
    private String STNM;
    private String p;
    private String adnm;
    private String canal_name;
    private String _status;

    @JSONField(name = "_status")
    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    public String getCanal_name() {
        return canal_name;
    }

    public void setCanal_name(String canal_name) {
        this.canal_name = canal_name;
    }
}
