package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

public class ST_ZQRL_B {
    private int ID;             //序号主键自增
    private String STNM;        //测站名称
    private String STCD;        //测站编码
    private Integer YR;         //测算年份
    private BigDecimal Z;       // 水位
    private BigDecimal Q;       //流量
    private String FLAG;        //启用标志
    private String Memo;        //备注

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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

    @JSONField(name = "Z")
    public BigDecimal getZ() {
        return Z;
    }

    public void setZ(BigDecimal z) {
        Z = z;
    }

    @JSONField(name = "Q")
    public BigDecimal getQ() {
        return Q;
    }

    public void setQ(BigDecimal q) {
        Q = q;
    }

    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }
}
