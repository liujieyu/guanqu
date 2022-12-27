package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 渠道水情月报表多表查询
 */

public class QuDaoShuiQingYueBiao {
    private String stnm;
    private String stcd;
    private String dt;
    private String MA_Q;
    private String MA_Z;
    private String MA_S;
    private String MWQ;
    private String stype;
    private String canal_name;
    private String adnm;

    public String getStnm() {
        return stnm;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    @JSONField(name = "MA_Q")
    public String getMA_Q() {
        return MA_Q;
    }

    public void setMA_Q(String MA_Q) {
        this.MA_Q = MA_Q;
    }

    @JSONField(name = "MA_Z")
    public String getMA_Z() {
        return MA_Z;
    }

    public void setMA_Z(String MA_Z) {
        this.MA_Z = MA_Z;
    }

    @JSONField(name = "MA_S")
    public String getMA_S() {
        return MA_S;
    }

    public void setMA_S(String MA_S) {
        this.MA_S = MA_S;
    }

    public String getMWQ() {
        return MWQ;
    }

    public void setMWQ(String MWQ) {
        this.MWQ = MWQ;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public String getCanal_name() {
        return canal_name;
    }

    public void setCanal_name(String canal_name) {
        this.canal_name = canal_name;
    }

    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }
}
