package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 渠道水情最大流量表
 * 存储测站历年最大流量信息。每个站点1年仅有一条数据。
 */
public class ST_G_CQORD {
    private Integer ID;
    private String STNM;
    private String STCD;
    private Integer YR;
    private Timestamp TMMXQ;
    private BigDecimal TMXQ;
    private BigDecimal YMXQZ;

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

    public BigDecimal getYMXQZ() {
        return YMXQZ;
    }

    public void setYMXQZ(BigDecimal YMXQZ) {
        this.YMXQZ = YMXQZ;
    }
}
