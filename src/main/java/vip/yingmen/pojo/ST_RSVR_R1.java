package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ST_RSVR_R1 {
    private Integer ID;
    private String STNM;
    private String STCD;
    private String ANO;
    private Timestamp TM;
    private BigDecimal RZ;
    private BigDecimal CV;
    private Integer LEVEL;
    private BigDecimal INQ;
    private BigDecimal W;
    private BigDecimal BLRZ;
    private BigDecimal OTQ;
    private String RWCHRCD;
    private String RWPTN;
    private BigDecimal INQDR;
    private String MSQMT;
    private Integer Alarm;

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

    public String getANO() {
        return ANO;
    }

    public void setANO(String ANO) {
        this.ANO = ANO;
    }

    public Timestamp getTM() {
        return TM;
    }

    public void setTM(Timestamp TM) {
        this.TM = TM;
    }

    public BigDecimal getRZ() {
        return RZ;
    }

    public void setRZ(BigDecimal RZ) {
        this.RZ = RZ;
    }

    public BigDecimal getCV() {
        return CV;
    }

    public void setCV(BigDecimal CV) {
        this.CV = CV;
    }

    public Integer getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(Integer LEVEL) {
        this.LEVEL = LEVEL;
    }

    public BigDecimal getINQ() {
        return INQ;
    }

    public void setINQ(BigDecimal INQ) {
        this.INQ = INQ;
    }

    @JSONField(name = "W")
    public BigDecimal getW() {
        return W;
    }

    public void setW(BigDecimal w) {
        W = w;
    }

    public BigDecimal getBLRZ() {
        return BLRZ;
    }

    public void setBLRZ(BigDecimal BLRZ) {
        this.BLRZ = BLRZ;
    }

    public BigDecimal getOTQ() {
        return OTQ;
    }

    public void setOTQ(BigDecimal OTQ) {
        this.OTQ = OTQ;
    }

    public String getRWCHRCD() {
        return RWCHRCD;
    }

    public void setRWCHRCD(String RWCHRCD) {
        this.RWCHRCD = RWCHRCD;
    }

    public String getRWPTN() {
        return RWPTN;
    }

    public void setRWPTN(String RWPTN) {
        this.RWPTN = RWPTN;
    }

    public BigDecimal getINQDR() {
        return INQDR;
    }

    public void setINQDR(BigDecimal INQDR) {
        this.INQDR = INQDR;
    }

    public String getMSQMT() {
        return MSQMT;
    }

    public void setMSQMT(String MSQMT) {
        this.MSQMT = MSQMT;
    }

    @JSONField(name = "Alarm")
    public Integer getAlarm() {
        return Alarm;
    }

    public void setAlarm(Integer alarm) {
        Alarm = alarm;
    }
}
