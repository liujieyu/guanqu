package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class QuDaoShuiQingLiShiBiao {
    private String TM;
    private String Z;
    private String Q;
    private String STCD;

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

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }
}
