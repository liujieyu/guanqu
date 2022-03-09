package vip.yingmen.pojo;

import java.math.BigDecimal;

public class ST_RIVER_Alarm {
    private Integer ID;
    private String STNM;
    private String STCD;
    private BigDecimal AWL;
    private BigDecimal BZWL;
    private BigDecimal SJWL;
    private BigDecimal XHWL;
    private BigDecimal JYWL;
    private String MEMO;

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

    public BigDecimal getAWL() {
        return AWL;
    }

    public void setAWL(BigDecimal AWL) {
        this.AWL = AWL;
    }

    public BigDecimal getBZWL() {
        return BZWL;
    }

    public void setBZWL(BigDecimal BZWL) {
        this.BZWL = BZWL;
    }

    public BigDecimal getSJWL() {
        return SJWL;
    }

    public void setSJWL(BigDecimal SJWL) {
        this.SJWL = SJWL;
    }

    public BigDecimal getXHWL() {
        return XHWL;
    }

    public void setXHWL(BigDecimal XHWL) {
        this.XHWL = XHWL;
    }

    public BigDecimal getJYWL() {
        return JYWL;
    }

    public void setJYWL(BigDecimal JYWL) {
        this.JYWL = JYWL;
    }

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO;
    }
}
