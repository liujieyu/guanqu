package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 渠道水情月表
 * 本表用于存储渠道水情站每月平均流量和累计水量。每个监测站1个月有且仅有1条数据存在，该表通过触发器自动统计而成。
 */
public class ST_MCanal_C {
    private String DT;
    private String MA_Z;
    private String MA_Q;
    private String MWQ;

    public String getDt() {
        return DT;
    }

    public void setDt(String dt) {
        this.DT = dt;
    }

    @JSONField(name = "MA_Z")
    public String getMA_Z() {
        return MA_Z;
    }

    public void setMA_Z(String MA_Z) {
        this.MA_Z = MA_Z;
    }

    @JSONField(name = "MA_Q")
    public String getMA_Q() {
        return MA_Q;
    }

    public void setMA_Q(String MA_Q) {
        this.MA_Q = MA_Q;
    }

    public String getMWQ() {
        return MWQ;
    }

    public void setMWQ(String MWQ) {
        this.MWQ = MWQ;
    }
}
