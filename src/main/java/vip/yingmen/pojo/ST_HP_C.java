package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 雨情小时表
 * 雨情小时表用于存储各站点每小时的降雨量。
 */

public class ST_HP_C {
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
