package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class HeDaoShuiQingLiShiBiao {
    private String TM;
    private String Z;
    private String Q;
    private String AWL;

    public String getAWL() {
        return AWL;
    }

    public void setAWL(String AWL) {
        this.AWL = AWL;
    }

    @JSONField(name = "tm")
    public String getTM() {
        return TM;
    }

    public void setTM(String TM) {
        this.TM = TM;
    }

    @JSONField(name = "Z")
    public String getZ() {
        return Z;
    }

    public void setZ(String z) {
        Z = z;
    }

    @JSONField(name = "Q")
    public String getQ() {
        return Q;
    }

    public void setQ(String q) {
        Q = q;
    }
}
