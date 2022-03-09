package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class LiShiYunXingGongKuang {
    private String TM;
    private String VOL;
    private String CS;
    private String STNM;

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    @JSONField(name = "tm")
    public String getTM() {
        return TM;
    }

    public void setTM(String TM) {
        this.TM = TM;
    }

    public String getVOL() {
        return VOL;
    }

    public void setVOL(String VOL) {
        this.VOL = VOL;
    }

    public String getCS() {
        return CS;
    }

    public void setCS(String CS) {
        this.CS = CS;
    }
}

