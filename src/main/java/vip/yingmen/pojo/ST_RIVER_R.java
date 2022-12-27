package vip.yingmen.pojo;


import com.alibaba.fastjson.annotation.JSONField;

/**
 * 河道水情历史表
 * 河道水情历史表用于存储各站点所有接收到的河道水位数据。
 */
public class ST_RIVER_R {
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

    public String getTm() {
        return TM;
    }

    public void setTm(String tm) {
        this.TM = tm;
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
