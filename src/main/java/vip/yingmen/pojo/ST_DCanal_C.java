package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 渠道水情日表
 * 本表用于存储渠道水情站每天的平均流量和累计水量，每个监测站1天有且仅有1条数据存在，该表通过触发器自动统计而成。
 */
public class ST_DCanal_C {
    private String TM;
    private String DA_Q;
    private String DA_Z;
    private String DWQ;

    public String getTm() {
        return TM;
    }

    public void setTm(String tm) {
        this.TM = tm;
    }

    @JSONField(name = "DA_Q")
    public String getDA_Q() {
        return DA_Q;
    }

    public void setDA_Q(String DA_Q) {
        this.DA_Q = DA_Q;
    }

    @JSONField(name = "DA_Z")
    public String getDA_Z() {
        return DA_Z;
    }

    public void setDA_Z(String DA_Z) {
        this.DA_Z = DA_Z;
    }

    public String getDWQ() {
        return DWQ;
    }

    public void setDWQ(String DWQ) {
        this.DWQ = DWQ;
    }
}
