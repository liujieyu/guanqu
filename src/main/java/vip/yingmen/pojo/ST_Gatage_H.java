package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *闸阀门开度历史表
 * 闸阀门开度历史记录表用来记录闸阀门控制站的开度信息。
 */
public class ST_Gatage_H {
    private String TM;
    private String OD;
    private String Q;
    private String UPZ;
    private String DWZ;

    @JSONField(name = "tm")
    public String getTM() {
        return TM;
    }

    public void setTM(String TM) {
        this.TM = TM;
    }

    @JSONField(name = "OD")
    public String getOD() {
        return OD;
    }

    public void setOD(String OD) {
        this.OD = OD;
    }

    @JSONField(name = "Q")
    public String getQ() {
        return Q;
    }

    public void setQ(String q) {
        Q = q;
    }

    @JSONField(name = "UPZ")
    public String getUPZ() {
        return UPZ;
    }

    public void setUPZ(String UPZ) {
        this.UPZ = UPZ;
    }

    @JSONField(name = "DWZ")
    public String getDWZ() {
        return DWZ;
    }

    public void setDWZ(String DWZ) {
        this.DWZ = DWZ;
    }
}
