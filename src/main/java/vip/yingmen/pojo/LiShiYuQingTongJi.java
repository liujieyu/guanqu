package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class LiShiYuQingTongJi {
    private String ZongZhanShu;
    private String JiangYuZhanShu;
    private String ZuiDaJiangYu;
    private String PingJunJiangYu;

    @JSONField(name = "ZongZhanShu")
    public String getZongZhanShu() {
        return ZongZhanShu;
    }

    public void setZongZhanShu(String zongZhanShu) {
        ZongZhanShu = zongZhanShu;
    }

    @JSONField(name = "JiangYuZhanShu")
    public String getJiangYuZhanShu() {
        return JiangYuZhanShu;
    }

    public void setJiangYuZhanShu(String jiangYuZhanShu) {
        JiangYuZhanShu = jiangYuZhanShu;
    }

    @JSONField(name = "ZuiDaJiangYu")
    public String getZuiDaJiangYu() {
        return ZuiDaJiangYu;
    }

    public void setZuiDaJiangYu(String zuiDaJiangYu) {
        ZuiDaJiangYu = zuiDaJiangYu;
    }

    @JSONField(name = "PingJunJiangYu")
    public String getPingJunJiangYu() {
        return PingJunJiangYu;
    }

    public void setPingJunJiangYu(String pingJunJiangYu) {
        PingJunJiangYu = pingJunJiangYu;
    }
}
