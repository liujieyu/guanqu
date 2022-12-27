package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;

/**
 *渠道水情预警信息表
 * 渠道水情预警信息包括水位和流量预警临界值。
 */

public class ST_Canal_Alarm {

    private int ID;         //序号主键自增
    private String STNM;        //测站名称
    private String STCD;        //测站名称
    private BigDecimal Q;       //预警流量
    private BigDecimal Z;       //预警水位
    private BigDecimal JYQ;     //经验预警流量
    private BigDecimal JYZ;     //经验预警水位
    private String MEMO;        //备注

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

    @JSONField(name = "Q")
    public BigDecimal getQ() {
        return Q;
    }

    public void setQ(BigDecimal q) {
        Q = q;
    }

    @JSONField(name = "Z")
    public BigDecimal getZ() {
        return Z;
    }

    public void setZ(BigDecimal z) {
        Z = z;
    }

    public BigDecimal getJYQ() {
        return JYQ;
    }

    public void setJYQ(BigDecimal JYQ) {
        this.JYQ = JYQ;
    }

    public BigDecimal getJYZ() {
        return JYZ;
    }

    public void setJYZ(BigDecimal JYZ) {
        this.JYZ = JYZ;
    }

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO;
    }
}
