package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class ST_MWAS_C {
    private String DT;
    private String MA_UPZ;
    private String MA_DWZ;
    private String MA_Q;
    private String MWQ;

    public String getDt() {
        return DT;
    }

    public void setDt(String dt) {
        this.DT = dt;
    }

    @JSONField(name = "MA_UPZ")
    public String getMA_UPZ() {
        return MA_UPZ;
    }

    public void setMA_UPZ(String MA_UPZ) {
        this.MA_UPZ = MA_UPZ;
    }

    @JSONField(name = "MA_DWZ")
    public String getMA_DWZ() {
        return MA_DWZ;
    }

    public void setMA_DWZ(String MA_DWZ) {
        this.MA_DWZ = MA_DWZ;
    }

    @JSONField(name = "MA_Q")
    public String getMA_Q() {
        return MA_Q;
    }

    public void setMA_Q(String MA_Q) {
        this.MA_Q = MA_Q;
    }

    @JSONField(name = "MWQ")
    public String getMWQ() {
        return MWQ;
    }

    public void setMWQ(String MWQ) {
        this.MWQ = MWQ;
    }
}
