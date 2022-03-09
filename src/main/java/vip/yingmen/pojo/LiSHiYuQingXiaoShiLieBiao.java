package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class LiSHiYuQingXiaoShiLieBiao {
    private String XIAN;
    private String ZHEN;
    private String P;
    private String STNM;
    private String STCD;
    private String RAININFO;

    public String getRAININFO() {
        return RAININFO;
    }

    public void setRAININFO(String RAININFO) {
        this.RAININFO = RAININFO;
    }

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

    public String getXIAN() {
        return XIAN;
    }

    public void setXIAN(String XIAN) {
        this.XIAN = XIAN;
    }

    public String getZHEN() {
        return ZHEN;
    }

    public void setZHEN(String ZHEN) {
        this.ZHEN = ZHEN;
    }

    @JSONField(name = "P")
    public String getP() {
        return P;
    }

    public void setP(String P) {
        this.P = P;
    }
}
