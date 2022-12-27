package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class ZhaFaLiShiZhaMen {
    private  String STCD;
    private  String STNM;
    private  String B_TM;
    private  String E_TM;
    private  String E_KD;
    private  String WQ;
    private  String T_L;
    private  String GB_TM;
    private  String GE_TM;
    private  String S_KD;
    private  String Op_Man;
    private  String OP_Result;
    private  String OP_R;

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    @JSONField(name = "B_TM")
    public String getB_TM() {
        return B_TM;
    }

    public void setB_TM(String b_TM) {
        B_TM = b_TM;
    }

    @JSONField(name = "E_TM")
    public String getE_TM() {
        return E_TM;
    }

    public void setE_TM(String e_TM) {
        E_TM = e_TM;
    }

    @JSONField(name = "E_KD")
    public String getE_KD() {
        return E_KD;
    }

    public void setE_KD(String e_KD) {
        E_KD = e_KD;
    }

    @JSONField(name = "WQ")
    public String getWQ() {
        return WQ;
    }

    public void setWQ(String WQ) {
        this.WQ = WQ;
    }

    @JSONField(name = "T_L")
    public String getT_L() {
        return T_L;
    }

    public void setT_L(String t_L) {
        T_L = t_L;
    }

    @JSONField(name = "GB_TM")
    public String getGB_TM() {
        return GB_TM;
    }

    public void setGB_TM(String GB_TM) {
        this.GB_TM = GB_TM;
    }

    @JSONField(name = "GE_TM")
    public String getGE_TM() {
        return GE_TM;
    }

    public void setGE_TM(String GE_TM) {
        this.GE_TM = GE_TM;
    }

    @JSONField(name = "S_KD")
    public String getS_KD() {
        return S_KD;
    }

    public void setS_KD(String s_KD) {
        S_KD = s_KD;
    }

    @JSONField(name = "Op_Man")
    public String getOp_Man() {
        return Op_Man;
    }

    public void setOp_Man(String op_Man) {
        Op_Man = op_Man;
    }

    @JSONField(name = "OP_Result")
    public String getOP_Result() {
        return OP_Result;
    }

    public void setOP_Result(String OP_Result) {
        this.OP_Result = OP_Result;
    }

    @JSONField(name = "OP_R")
    public String getOP_R() {
        return OP_R;
    }

    public void setOP_R(String OP_R) {
        this.OP_R = OP_R;
    }
}
