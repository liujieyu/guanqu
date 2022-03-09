package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 闸阀水情日表
 * 本表用于存储闸阀水情站每天的平均流量和累计水量，每个监测站1天有且仅有1条数据存在，该表通过触发器自动统计而成。
 */
public class ST_DWAS_C {
    private String TM;
    private String DA_UPZ;
    private String DA_DWZ;
    private String DA_Q;
    private String DWQ;

    public String getTm() {
        return TM;
    }

    public void setTm(String tm) {
        this.TM = tm;
    }

    @JSONField(name = "DA_UPZ")
    public String getDA_UPZ() {
        return DA_UPZ;
    }

    public void setDA_UPZ(String DA_UPZ) {
        this.DA_UPZ = DA_UPZ;
    }

    @JSONField(name = "DA_DWZ")
    public String getDA_DWZ() {
        return DA_DWZ;
    }

    public void setDA_DWZ(String DA_DWZ) {
        this.DA_DWZ = DA_DWZ;
    }

    @JSONField(name = "DA_Q")
    public String getDA_Q() {
        return DA_Q;
    }

    public void setDA_Q(String DA_Q) {
        this.DA_Q = DA_Q;
    }

    @JSONField(name = "DWQ")
    public String getDWQ() {
        return DWQ;
    }

    public void setDWQ(String DWQ) {
        this.DWQ = DWQ;
    }
}
