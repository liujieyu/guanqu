package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class LiSHiYuQingXunLieBiao {
    private String ZhongXunYuLiang;
    private String ShangXunYuLiang;
    private String P;
    private String STNM;
    private String STCD;
    private String XiaXunYuLiang;
    private String STGR;
    private String Canal_Name;
    private String AD_NM;

    @JSONField(name = "ZhongXunYuLiang")
    public String getZhongXunYuLiang() {
        return ZhongXunYuLiang;
    }

    public void setZhongXunYuLiang(String zhongXunYuLiang) {
        ZhongXunYuLiang = zhongXunYuLiang;
    }

    @JSONField(name = "ShangXunYuLiang")
    public String getShangXunYuLiang() {
        return ShangXunYuLiang;
    }

    public void setShangXunYuLiang(String shangXunYuLiang) {
        ShangXunYuLiang = shangXunYuLiang;
    }

    @JSONField(name = "P")
    public String getP() {
        return P;
    }

    public void setP(String p) {
        P = p;
    }

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    @JSONField(name = "XiaXunYuLiang")
    public String getXiaXunYuLiang() {
        return XiaXunYuLiang;
    }

    public void setXiaXunYuLiang(String xiaXunYuLiang) {
        XiaXunYuLiang = xiaXunYuLiang;
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
