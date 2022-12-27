package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 水库水情小时表
 * 水库水情小时表存储各站点水库水位小时数据。
 */

public class ST_RSVR_H {
    private String DT;
    private String RZ;
    private String INQ;
    private String OTQ;
    private String HW;

    public String getDt() {
        return DT;
    }

    public void setDt(String dt) {
        this.DT = dt;
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

    @JSONField(name = "HW")
    public String getHW() {
        return HW;
    }

    public void setHW(String HW) {
        this.HW = HW;
    }
}
