package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 水库水情历史表
 * 水库水情历史表用于存储各站点所有接收到的水库水位数据。
 */
public class ST_RSVR_R {
    private String TM;
    private String RZ;
    private String INQ;
    private String OTQ;
    private String BLRZ;
    private String W;

    public String getBLRZ() {
        return BLRZ;
    }

    public void setBLRZ(String BLRZ) {
        this.BLRZ = BLRZ;
    }

    @JSONField(name = "tm")
    public String getTm() {
        return TM;
    }

    public void setTm(String TM) {
        this.TM = TM;
    }

    @JSONField(name = "RZ")
    public String getRZ() {
        return RZ;
    }

    public void setRZ(String RZ) {
        this.RZ = RZ;
    }

    @JSONField(name = "INQ")
    public String getINQ() {
        return INQ;
    }

    public void setINQ(String INQ) {
        this.INQ = INQ;
    }

    @JSONField(name = "OTQ")
    public String getOTQ() {
        return OTQ;
    }

    public void setOTQ(String OTQ) {
        this.OTQ = OTQ;
    }
    @JSONField(name = "W")
    public String getW() { return W; }

    public void setW(String W) { this.W = W; }
}
