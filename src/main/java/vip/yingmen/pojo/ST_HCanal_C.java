package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 渠道水情小时表
 * 本表用于存储渠道水情站每小时的平均流量和累计水量，每个站点每个小时有且仅有一条数据存在，该表通过触发器自动统计而成。
 */
public class ST_HCanal_C {
    private String DT;
    private String A_Q;
    private String A_Z;
    private String WQ;

    public String getDt() {
        return DT;
    }

    public void setDt(String dt) {
        this.DT = dt;
    }

    @JSONField(name = "A_Q")
    public String getA_Q() {
        return A_Q;
    }

    public void setA_Q(String a_Q) {
        A_Q = a_Q;
    }

    @JSONField(name = "A_Z")
    public String getA_Z() {
        return A_Z;
    }

    public void setA_Z(String a_Z) {
        A_Z = a_Z;
    }

    public String getWQ() {
        return WQ;
    }

    public void setWQ(String WQ) {
        this.WQ = WQ;
    }
}
