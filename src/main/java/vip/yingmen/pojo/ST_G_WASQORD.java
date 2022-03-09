package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ST_G_WASQORD {
    private Integer ID;
    private String STNM;
    private String STCD;
    private Integer YR;
    private Timestamp TMMXQ;
    private BigDecimal TMXQ;
    private BigDecimal YMXUPQZ;
    private BigDecimal YMXDNQZ;

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
    public Timestamp getTMMXQ() {
        return TMMXQ;
    }

    public void setTMMXQ(Timestamp TMMXQ) {
        this.TMMXQ = TMMXQ;
    }

    public BigDecimal getTMXQ() {
        return TMXQ;
    }

    public void setTMXQ(BigDecimal TMXQ) {
        this.TMXQ = TMXQ;
    }

    public BigDecimal getYMXUPQZ() {
        return YMXUPQZ;
    }

    public void setYMXUPQZ(BigDecimal YMXUPQZ) {
        this.YMXUPQZ = YMXUPQZ;
    }

    public BigDecimal getYMXDNQZ() {
        return YMXDNQZ;
    }

    public void setYMXDNQZ(BigDecimal YMXDNQZ) {
        this.YMXDNQZ = YMXDNQZ;
    }
}
