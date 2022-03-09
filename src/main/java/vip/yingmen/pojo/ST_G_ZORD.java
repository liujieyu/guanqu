package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ST_G_ZORD {
    private Integer ID;
    private String STNM;
    private String STCD;
    private Integer YR;
    private Timestamp TMHZ;
    private BigDecimal THZ;
    private BigDecimal YHZQ;

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

    public Integer getYR() {
        return YR;
    }

    public void setYR(Integer YR) {
        this.YR = YR;
    }

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    public Timestamp getTMHZ() {
        return TMHZ;
    }

    public void setTMHZ(Timestamp TMHZ) {
        this.TMHZ = TMHZ;
    }

    public BigDecimal getTHZ() {
        return THZ;
    }

    public void setTHZ(BigDecimal THZ) {
        this.THZ = THZ;
    }

    public BigDecimal getYHZQ() {
        return YHZQ;
    }

    public void setYHZQ(BigDecimal YHZQ) {
        this.YHZQ = YHZQ;
    }
}
