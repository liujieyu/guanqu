package vip.yingmen.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 灌区基本信息表
 * 用于描述灌区代码、所在地以及灌区的一些基本特征信息。
 */
public class WRP_IRA_BSIN implements Serializable {


    private int ID;             //序号 自增

    private String IRACD;        //灌区编码 主键

    private String IRANM;           //灌区名称

    private String WTPLNM;          //水源名称

    private String IARHWPRTP;       //水源工程类别

    private String IRASC;           //灌区规模

    private String DTST;            //排水标准

    private String MNUN;            //管理单位

    private String CMUN;            //主管单位

    private String LC;              //管理局所在地

    private String IRRN;            //灌溉范围


    private BigDecimal DSYFL;       //设计年引水量

    private BigDecimal INGYFL;      //正常年引水量

    private String QUWTP;           //引水方式

    private String QUWTPL;          //引水地点

    private BigDecimal IRPL;        //灌溉设计保证率

    private BigDecimal DSIRAR;      //设计灌溉面积

    private BigDecimal ACIRAR;      //实际灌溉面积

    private String CNHWPS;          //渠首建筑物位置

    private String CNHWNM;          //渠首建筑物名称

    private BigDecimal CNHDDVFL;      //渠首设计引水流量

    private BigDecimal CNINGYFL;        //渠首正常年 引水量

    private int MNCHNB;                //灌区总干渠条数

    private BigDecimal MNCHLEN;       //总干渠长度

    private int DTMCNB;             //排水量干渠（沟）

    private BigDecimal DTMCLN;      //排水总干渠长度

    private BigDecimal ANPP;        //年降水情况

    private String IRAOV;           //灌区概况

    private Date DTUPDT;            //数据更新日期

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIRACD() {
        return IRACD;
    }

    public void setIRACD(String IRACD) {
        this.IRACD = IRACD;
    }

    public String getIRANM() {
        return IRANM;
    }

    public void setIRANM(String IRANM) {
        this.IRANM = IRANM;
    }

    public String getWTPLNM() {
        return WTPLNM;
    }

    public void setWTPLNM(String WTPLNM) {
        this.WTPLNM = WTPLNM;
    }

    public String getIARHWPRTP() {
        return IARHWPRTP;
    }

    public void setIARHWPRTP(String IARHWPRTP) {
        this.IARHWPRTP = IARHWPRTP;
    }

    public String getIRASC() {
        return IRASC;
    }

    public void setIRASC(String IRASC) {
        this.IRASC = IRASC;
    }

    public String getDTST() {
        return DTST;
    }

    public void setDTST(String DTST) {
        this.DTST = DTST;
    }

    public String getMNUN() {
        return MNUN;
    }

    public void setMNUN(String MNUN) {
        this.MNUN = MNUN;
    }

    public String getCMUN() {
        return CMUN;
    }

    public void setCMUN(String CMUN) {
        this.CMUN = CMUN;
    }

    public String getLC() {
        return LC;
    }

    public void setLC(String LC) {
        this.LC = LC;
    }

    public String getIRRN() {
        return IRRN;
    }

    public void setIRRN(String IRRN) {
        this.IRRN = IRRN;
    }

    public BigDecimal getDSYFL() {
        return DSYFL;
    }

    public void setDSYFL(BigDecimal DSYFL) {
        this.DSYFL = DSYFL;
    }

    public BigDecimal getINGYFL() {
        return INGYFL;
    }

    public void setINGYFL(BigDecimal INGYFL) {
        this.INGYFL = INGYFL;
    }

    public String getQUWTP() {
        return QUWTP;
    }

    public void setQUWTP(String QUWTP) {
        this.QUWTP = QUWTP;
    }

    public String getQUWTPL() {
        return QUWTPL;
    }

    public void setQUWTPL(String QUWTPL) {
        this.QUWTPL = QUWTPL;
    }

    public BigDecimal getIRPL() {
        return IRPL;
    }

    public void setIRPL(BigDecimal IRPL) {
        this.IRPL = IRPL;
    }

    public BigDecimal getDSIRAR() {
        return DSIRAR;
    }

    public void setDSIRAR(BigDecimal DSIRAR) {
        this.DSIRAR = DSIRAR;
    }

    public BigDecimal getACIRAR() {
        return ACIRAR;
    }

    public void setACIRAR(BigDecimal ACIRAR) {
        this.ACIRAR = ACIRAR;
    }

    public String getCNHWPS() {
        return CNHWPS;
    }

    public void setCNHWPS(String CNHWPS) {
        this.CNHWPS = CNHWPS;
    }

    public String getCNHWNM() {
        return CNHWNM;
    }

    public void setCNHWNM(String CNHWNM) {
        this.CNHWNM = CNHWNM;
    }

    public BigDecimal getCNHDDVFL() {
        return CNHDDVFL;
    }

    public void setCNHDDVFL(BigDecimal CNHDDVFL) {
        this.CNHDDVFL = CNHDDVFL;
    }

    public BigDecimal getCNINGYFL() {
        return CNINGYFL;
    }

    public void setCNINGYFL(BigDecimal CNINGYFL) {
        this.CNINGYFL = CNINGYFL;
    }

    public int getMNCHNB() {
        return MNCHNB;
    }

    public void setMNCHNB(int MNCHNB) {
        this.MNCHNB = MNCHNB;
    }

    public BigDecimal getMNCHLEN() {
        return MNCHLEN;
    }

    public void setMNCHLEN(BigDecimal MNCHLEN) {
        this.MNCHLEN = MNCHLEN;
    }

    public int getDTMCNB() {
        return DTMCNB;
    }

    public void setDTMCNB(int DTMCNB) {
        this.DTMCNB = DTMCNB;
    }

    public BigDecimal getDTMCLN() {
        return DTMCLN;
    }

    public void setDTMCLN(BigDecimal DTMCLN) {
        this.DTMCLN = DTMCLN;
    }

    public BigDecimal getANPP() {
        return ANPP;
    }

    public void setANPP(BigDecimal ANPP) {
        this.ANPP = ANPP;
    }

    public String getIRAOV() {
        return IRAOV;
    }

    public void setIRAOV(String IRAOV) {
        this.IRAOV = IRAOV;
    }

    public Date getDTUPDT() {
        return DTUPDT;
    }

    public void setDTUPDT(Date DTUPDT) {
        this.DTUPDT = DTUPDT;
    }
}
