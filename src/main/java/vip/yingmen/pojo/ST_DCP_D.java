package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 雨情旬表
 * 雨情旬表存储各站点每旬降雨量。
 */

public class ST_DCP_D {
    private String DT;
    private String P;

    public String getDT() {
        return DT;
    }

    public void setDT(String DT) {
        this.DT = DT;
    }

    @JSONField(name = "P")
    public String getP() {
        return P;
    }

    public void setP(String p) {
        P = p;
    }
}
