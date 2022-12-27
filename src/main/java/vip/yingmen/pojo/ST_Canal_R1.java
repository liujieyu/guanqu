package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 实时渠道水情表
 * 实时渠道水情表用于存储接收到的实时渠道水情数据。
 */
public class ST_Canal_R1 {
    private Integer ID;             //序号 主键 自增
    private String STNM;        //测站名称
    private String STCD;        //测站编码，外键
    private String ANO;         //数据接收编码
    private String STYPE;       //测站类型
    private Timestamp TM;       //时间
    private BigDecimal Q;       //流量
    private BigDecimal Z;       //水位
    private String WPTN;        //水势
    private BigDecimal S;       //流速
    private BigDecimal XSA;     //测流面积
    private String MSQMT;       //测流方法
    private String MSAMT;       //测积方法
    private String MSVMT;       //测速方法
    private String COMMENTS;    //备注
    private Integer ALARM;      //后台预警

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getANO() {
        return ANO;
    }

    public void setANO(String ANO) {
        this.ANO = ANO;
    }

    public String getSTYPE() {
        return STYPE;
    }

    public void setSTYPE(String STYPE) {
        this.STYPE = STYPE;
    }

    @JSONField(format="yyyy-MM-dd HH:mm:ss.SSS")
    public Timestamp getTM() {
        return TM;
    }

    public void setTM(Timestamp TM) {
        this.TM = TM;
    }

    @JSONField(name = "Q")
    public BigDecimal getQ() {
        return Q;
    }

    public void setQ(BigDecimal q) {
        Q = q;
    }

    @JSONField(name = "Z")
    public BigDecimal getZ() {
        return Z;
    }

    public void setZ(BigDecimal z) {
        Z = z;
    }

    public String getWPTN() {
        return WPTN;
    }

    public void setWPTN(String WPTN) {
        this.WPTN = WPTN;
    }

    @JSONField(name = "S")
    public BigDecimal getS() {
        return S;
    }

    public void setS(BigDecimal s) {
        S = s;
    }

    public BigDecimal getXSA() {
        return XSA;
    }

    public void setXSA(BigDecimal XSA) {
        this.XSA = XSA;
    }

    public String getMSQMT() {
        return MSQMT;
    }

    public void setMSQMT(String MSQMT) {
        this.MSQMT = MSQMT;
    }

    public String getMSAMT() {
        return MSAMT;
    }

    public void setMSAMT(String MSAMT) {
        this.MSAMT = MSAMT;
    }

    public String getMSVMT() {
        return MSVMT;
    }

    public void setMSVMT(String MSVMT) {
        this.MSVMT = MSVMT;
    }

    public String getCOMMENTS() {
        return COMMENTS;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }

    public Integer getALARM() {
        return ALARM;
    }

    public void setALARM(Integer ALARM) {
        this.ALARM = ALARM;
    }
}
