package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 渠道水情历史表
 * 渠道水情历史表用于存储接收到的渠道水情数据。
 */
public class ST_Canal_R {
    private String STNM;        //测站名称
    private String TM;       //时间
    private String Q;       //流量
    private String Z;       //水位

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getTm() {
        return TM;
    }

    public void setTm(String tm) {
        this.TM = tm;
    }

    @JSONField(name = "Q")
    public String getQ() {
        return Q;
    }

    public void setQ(String q) {
        Q = q;
    }

    @JSONField(name = "Z")
    public String getZ() {
        return Z;
    }

    public void setZ(String z) {
        Z = z;
    }
}
