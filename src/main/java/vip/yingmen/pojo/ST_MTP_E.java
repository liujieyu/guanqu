package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 雨情月表
 * 雨情月表存储各站点月降雨量，包括月降雨量、月降雨日数、月最大日降水量等。
 */

public class ST_MTP_E {
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
