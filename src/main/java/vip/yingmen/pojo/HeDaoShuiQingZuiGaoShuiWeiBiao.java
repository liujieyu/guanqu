package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class HeDaoShuiQingZuiGaoShuiWeiBiao {
    private String STCD;
    private String STNM;
    private String TM;
    private String THZ;
    private String YHZQ;
    private String STGR;
    private String Canal_Name;
    private String AD_NM;

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
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

    public String getTHZ() {
        return THZ;
    }

    public void setTHZ(String THZ) {
        this.THZ = THZ;
    }

    public String getYHZQ() {
        return YHZQ;
    }

    public void setYHZQ(String YHZQ) {
        this.YHZQ = YHZQ;
    }


    public String getSTGR() {
        return STGR;
    }

    public void setSTGR(String STGR) {
        this.STGR = STGR;
    }

    @JSONField(name = "Canal_Name")
    public String getCanal_Name() {
        return Canal_Name;
    }

    public void setCanal_Name(String canal_Name) {
        Canal_Name = canal_Name;
    }

    @JSONField(name = "AD_NM")
    public String getAD_NM() {
        return AD_NM;
    }

    public void setAD_NM(String AD_NM) {
        this.AD_NM = AD_NM;
    }
}
