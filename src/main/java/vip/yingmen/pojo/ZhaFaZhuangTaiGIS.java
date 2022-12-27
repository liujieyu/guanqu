package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.sql.Timestamp;

/**
 * 接收闸阀状态的实时列表查询字段实体类
 */
public class ZhaFaZhuangTaiGIS {
    private String ID;
    private String STCD;
    private String STTP;
    private String LTTD;
    private String LGTD;
    private String _status;
    private String STNM;
    private Timestamp TM;
    private String q;
    private String upz;
    private String dwz;
    private String state;
    private String OD;
    private String H;
    private String strobeHight;

    @JSONField(name = "Strobe_Hight")
    public String getStrobeHight() {
        return strobeHight;
    }

    public void setStrobeHight(String strobeHight) {
        this.strobeHight = strobeHight;
    }

    public String getOD() {
        return OD;
    }

    public void setOD(String OD) {
        this.OD = OD;
    }

    @JSONField(name = "H")
    public String getH() {
        return H;
    }

    public void setH(String h) {
        H = h;
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

    @JSONField(format="yyyy-MM-dd HH:mm")
    public Timestamp getTM() {
        return TM;
    }

    public void setTM(Timestamp TM) {
        this.TM = TM;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getUpz() {
        return upz;
    }

    public void setUpz(String upz) {
        this.upz = upz;
    }

    public String getDwz() {
        return dwz;
    }

    public void setDwz(String dwz) {
        this.dwz = dwz;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
