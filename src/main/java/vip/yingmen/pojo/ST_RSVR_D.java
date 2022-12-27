package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 水库水情日表
 * 水库水情日表存储各站点水库水位日数据，本表每个站点每天仅有一条数据，每日的0时通过后台支持软件自动赋初值。
 */

public class ST_RSVR_D {
    private String TM;
    private String RZ;
    private String INQ;
    private String OTQ;
    private String DW;

    public String getTm() {
        return TM;
    }

    public void setTm(String tm) {
        this.TM = tm;
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

    @JSONField(name = "DW")
    public String getDW() {
        return DW;
    }

    public void setDW(String DW) {
        this.DW = DW;
    }
}
