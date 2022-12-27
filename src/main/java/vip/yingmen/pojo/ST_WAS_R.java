package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 闸阀水情历史表
 * 闸阀水情历史表用于存储接收到的闸阀水情数据。
 */
public class ST_WAS_R {
    private String TM;
    private String UPZ;
    private String DWZ;
    private String Q;

    @JSONField(name = "TM")
    public String getTm() {
        return TM;
    }

    public void setTm(String tm) {
        this.TM = tm;
    }

    public String getUPZ() {
        return UPZ;
    }

    public void setUPZ(String UPZ) {
        this.UPZ = UPZ;
    }

    public String getDWZ() {
        return DWZ;
    }

    public void setDWZ(String DWZ) {
        this.DWZ = DWZ;
    }

    @JSONField(name = "Q")
    public String getQ() {
        return Q;
    }

    public void setQ(String q) {
        Q = q;
    }
}
