package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 水库水情月表
 * 水库水情月报表存储各站点水库水位月数据，本表每个站点每月仅有一条数据，每月1日的0时通过后台支持软件自动赋初值。
 */
public class ST_RSVR_M {
    private String DT;
    private String RZ;
    private String INQ;
    private String OTQ;
    private String MW;

    @JSONField(name = "dt")
    public String getDT() {
        return DT;
    }

    public void setDT(String DT) {
        this.DT = DT;
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

    @JSONField(name = "MW")
    public String getMW() {
        return MW;
    }

    public void setMW(String MW) {
        this.MW = MW;
    }
}
