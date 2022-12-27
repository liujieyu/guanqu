package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class YuQingTongJiGIS {
    private String LeiJiYuLiang;
    private String PingJunJiangYu;
    private String ZuiDaJiangYu;

    @JSONField(name = "LeiJiYuLiang")
    public String getLeiJiYuLiang() {
        return LeiJiYuLiang;
    }

    public void setLeiJiYuLiang(String leiJiYuLiang) {
        LeiJiYuLiang = leiJiYuLiang;
    }

    @JSONField(name = "PingJunJiangYu")
    public String getPingJunJiangYu() {
        return PingJunJiangYu;
    }

    public void setPingJunJiangYu(String pingJunJiangYu) {
        PingJunJiangYu = pingJunJiangYu;
    }

    @JSONField(name = "ZuiDaJiangYu")
    public String getZuiDaJiangYu() {
        return ZuiDaJiangYu;
    }

    public void setZuiDaJiangYu(String zuiDaJiangYu) {
        ZuiDaJiangYu = zuiDaJiangYu;
    }
}
