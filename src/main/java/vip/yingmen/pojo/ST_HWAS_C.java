package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 闸阀水情小时表
 * 本表用于存储闸阀水情监测站每小时的平均流量和累计水量，每个站点1小时有且仅有一条数据存在，该表通过触发器自动统计而成
 */
public class ST_HWAS_C {
    private String DT;
    private String A_UPZ;
    private String A_DWZ;
    private String A_Q;
    private String WQ;

    public String getDt() {
        return DT;
    }

    public void setDt(String dt) {
        this.DT = dt;
    }

    @JSONField(name = "A_UPZ")
    public String getA_UPZ() {
        return A_UPZ;
    }

    public void setA_UPZ(String a_UPZ) {
        A_UPZ = a_UPZ;
    }

    @JSONField(name = "A_DWZ")
    public String getA_DWZ() {
        return A_DWZ;
    }

    public void setA_DWZ(String a_DWZ) {
        A_DWZ = a_DWZ;
    }

    @JSONField(name = "A_Q")
    public String getA_Q() {
        return A_Q;
    }

    public void setA_Q(String a_Q) {
        A_Q = a_Q;
    }

    @JSONField(name = "WQ")
    public String getWQ() {
        return WQ;
    }

    public void setWQ(String WQ) {
        this.WQ = WQ;
    }
}
