package vip.yingmen.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 *  测站基本信息表
 *  描述每个监测站点的基本信息。
 */
public class ST_STBPRP_B implements Serializable {
    private int ID;             //序号 自增
    private String STCD;        //站码，主键
    private String STNM;        //站名
    private String STTP;        //站点大类归属
    private String STGR;        //等级
    private Integer RELATECODE;     //关联编码
    private String ADDVCD;      //行政区划编码
    private String GS;          //归属灌区
    private BigDecimal LGTD;    //经度
    private BigDecimal LTTD;    //维度
    private String STLC;        //站址
    private String HNNM;        //水系名称
    private String CTCD;        //流域编码
    private String RVCD;        //河流编码
    private Date ESSTDT;        //建站日期
    private Date WDSTDT;        //撤站日期
    private String DTMNM;       //基面名
    private BigDecimal DTMEL;  //基面高程
    private String DLOG;        //建设单位
    private String ATCUNIT;     //隶属单位
    private String ADMAUTH;     //管理单位
    private String LOCALITY;    //交换单位
    private String STBK;        //测站岸别
    private BigDecimal STAZT;    //断面方位角
    private BigDecimal DRNA;    //集水面积
    private String FLTO;        //流入河流
    private BigDecimal DSTRVM;    //至河口距离
    private Timestamp MODITIME;     //时间戳
    private String COMMENTS;        //备注

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

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

    public String getSTTP() {
        return STTP;
    }

    public void setSTTP(String STTP) {
        this.STTP = STTP;
    }

    public String getSTGR() {
        return STGR;
    }

    public void setSTGR(String STGR) {
        this.STGR = STGR;
    }

    public Integer getRELATECODE() {
        return RELATECODE;
    }

    public void setRELATECODE(Integer RELATECODE) {
        this.RELATECODE = RELATECODE;
    }

    public String getADDVCD() {
        return ADDVCD;
    }

    public void setADDVCD(String ADDVCD) {
        this.ADDVCD = ADDVCD;
    }

    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }

    public BigDecimal getLGTD() {
        return LGTD;
    }

    public void setLGTD(BigDecimal LGTD) {
        this.LGTD = LGTD;
    }

    public BigDecimal getLTTD() {
        return LTTD;
    }

    public void setLTTD(BigDecimal LTTD) {
        this.LTTD = LTTD;
    }

    public String getSTLC() {
        return STLC;
    }

    public void setSTLC(String STLC) {
        this.STLC = STLC;
    }

    public String getHNNM() {
        return HNNM;
    }

    public void setHNNM(String HNNM) {
        this.HNNM = HNNM;
    }

    public String getCTCD() {
        return CTCD;
    }

    public void setCTCD(String CTCD) {
        this.CTCD = CTCD;
    }

    public String getRVCD() {
        return RVCD;
    }

    public void setRVCD(String RVCD) {
        this.RVCD = RVCD;
    }

    public Date getESSTDT() {
        return ESSTDT;
    }

    public void setESSTDT(Date ESSTDT) {
        this.ESSTDT = ESSTDT;
    }

    public Date getWDSTDT() {
        return WDSTDT;
    }

    public void setWDSTDT(Date WDSTDT) {
        this.WDSTDT = WDSTDT;
    }

    public String getDTMNM() {
        return DTMNM;
    }

    public void setDTMNM(String DTMNM) {
        this.DTMNM = DTMNM;
    }

    public BigDecimal getDTMEL() {
        return DTMEL;
    }

    public void setDTMEL(BigDecimal DTMEL) {
        this.DTMEL = DTMEL;
    }

    public String getDLOG() {
        return DLOG;
    }

    public void setDLOG(String DLOG) {
        this.DLOG = DLOG;
    }

    public String getATCUNIT() {
        return ATCUNIT;
    }

    public void setATCUNIT(String ATCUNIT) {
        this.ATCUNIT = ATCUNIT;
    }

    public String getADMAUTH() {
        return ADMAUTH;
    }

    public void setADMAUTH(String ADMAUTH) {
        this.ADMAUTH = ADMAUTH;
    }

    public String getLOCALITY() {
        return LOCALITY;
    }

    public void setLOCALITY(String LOCALITY) {
        this.LOCALITY = LOCALITY;
    }

    public String getSTBK() {
        return STBK;
    }

    public void setSTBK(String STBK) {
        this.STBK = STBK;
    }

    public BigDecimal getSTAZT() {
        return STAZT;
    }

    public void setSTAZT(BigDecimal STAZT) {
        this.STAZT = STAZT;
    }

    public BigDecimal getDRNA() {
        return DRNA;
    }

    public void setDRNA(BigDecimal DRNA) {
        this.DRNA = DRNA;
    }

    public String getFLTO() {
        return FLTO;
    }

    public void setFLTO(String FLTO) {
        this.FLTO = FLTO;
    }

    public BigDecimal getDSTRVM() {
        return DSTRVM;
    }

    public void setDSTRVM(BigDecimal DSTRVM) {
        this.DSTRVM = DSTRVM;
    }

    public Timestamp getMODITIME() {
        return MODITIME;
    }

    public void setMODITIME(Timestamp MODITIME) {
        this.MODITIME = MODITIME;
    }

    public String getCOMMENTS() {
        return COMMENTS;
    }

    public void setCOMMENTS(String COMMENTS) {
        this.COMMENTS = COMMENTS;
    }
}
