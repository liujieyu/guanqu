package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class ZhaFaShuiQingLiShiBiao {
    private String TM;
    private String UPZ;
    private String DWZ;
    private String Q;

    public String getTM() {
        return TM;
    }

    public void setTM(String TM) {
        this.TM = TM;
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
