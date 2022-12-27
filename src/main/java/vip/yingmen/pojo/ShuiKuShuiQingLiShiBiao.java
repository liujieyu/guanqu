package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class ShuiKuShuiQingLiShiBiao {
    private String TM;
    private String RZ;
    private String INQ;
    private String OTQ;
    private String W;

    @JSONField(name = "W")
    public String getW() {
        return W;
    }

    public void setW(String w) {
        W = w;
    }

    @JSONField(name = "tm")
    public String getTM() {
        return TM;
    }

    public void setTM(String TM) {
        this.TM = TM;
    }

    public String getRZ() {
        return RZ;
    }

    public void setRZ(String RZ) {
        this.RZ = RZ;
    }

    public String getINQ() {
        return INQ;
    }

    public void setINQ(String INQ) {
        this.INQ = INQ;
    }

    public String getOTQ() {
        return OTQ;
    }

    public void setOTQ(String OTQ) {
        this.OTQ = OTQ;
    }
}
