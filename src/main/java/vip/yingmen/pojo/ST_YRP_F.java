package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 *雨情年表
 * 本表存储各站点按年统计得到的降雨量信息表，包括最大日降雨、最大月降雨量等。
 */

public class ST_YRP_F {
    private String YR;
    private String P;

    public String getYR() {
        return YR;
    }

    public void setYR(String YR) {
        this.YR = YR;
    }

    @JSONField(name = "P")
    public String getP() {
        return P;
    }

    public void setP(String p) {
        P = p;
    }
}
