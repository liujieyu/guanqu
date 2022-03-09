package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class ZhaFaKaiDuLiShi {
    private String TM;
    private String OD;
    private String Q;
    private String UPZ;
    private String DWZ;

    public String getTM() {
        return TM;
    }

    public void setTM(String TM) {
        this.TM = TM;
    }

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
}
