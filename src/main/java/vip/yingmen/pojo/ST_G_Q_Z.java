package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

public class ST_G_Q_Z {
    private Integer ID;
    private String STNM;
    private String STCD;
    private BigDecimal Q;
    private BigDecimal OD;
    private BigDecimal UPZ;
    private BigDecimal DWZ;
    private String Memo;

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

    @JSONField(name = "Q")
    public BigDecimal getQ() {
        return Q;
    }

    public void setQ(BigDecimal q) {
        Q = q;
    }

    public BigDecimal getOD() {
        return OD;
    }

    public void setOD(BigDecimal OD) {
        this.OD = OD;
    }

    public BigDecimal getUPZ() {
        return UPZ;
    }

    public void setUPZ(BigDecimal UPZ) {
        this.UPZ = UPZ;
    }

    public BigDecimal getDWZ() {
        return DWZ;
    }

    public void setDWZ(BigDecimal DWZ) {
        this.DWZ = DWZ;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }
}
