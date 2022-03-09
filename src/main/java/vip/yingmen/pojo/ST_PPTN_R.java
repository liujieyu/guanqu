package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ST_PPTN_R {
    private Integer ID;
    private String STNM;
    private String STCD;
    private Timestamp TM;
    private BigDecimal DRP;
    private BigDecimal INTV;
    private BigDecimal PDR;
    private BigDecimal DYP;
    private String WTH;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    @JSONField(format="yyyy-MM-dd HH:mm:ss.SSS")
    public Timestamp getTM() {
        return TM;
    }

    public void setTM(Timestamp TM) {
        this.TM = TM;
    }

    public BigDecimal getDRP() {
        return DRP;
    }

    public void setDRP(BigDecimal DRP) {
        this.DRP = DRP;
    }

    public BigDecimal getINTV() {
        return INTV;
    }

    public void setINTV(BigDecimal INTV) {
        this.INTV = INTV;
    }

    public BigDecimal getPDR() {
        return PDR;
    }

    public void setPDR(BigDecimal PDR) {
        this.PDR = PDR;
    }

    public BigDecimal getDYP() {
        return DYP;
    }

    public void setDYP(BigDecimal DYP) {
        this.DYP = DYP;
    }

    public String getWTH() {
        return WTH;
    }

    public void setWTH(String WTH) {
        this.WTH = WTH;
    }
}
