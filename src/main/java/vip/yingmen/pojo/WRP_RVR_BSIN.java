package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 河流基本信息表
 * 用于描述河流基本信息及灌区取水设施所在河段的具体情况。
 */
public class WRP_RVR_BSIN {
    private Integer ID;             //序号自增
    private String RVCD;            //河流编码
    private String RVNM;            //河流名称
    private String GS;
    private String ALIAS;          //别名/曾用名
    private String RVTP;            //河流类别
    private String RLEVEL;          //河流等级
    private BigDecimal River_Width;    //河槽平均宽度
    private BigDecimal River_Flux;       //河槽平均流量
    private String DWWT;            //汇入水域
    private String DWWTCD;          //汇入水域代码
    private String HWPS;            //河源位置
    private BigDecimal HWEL;        //河源高程
    private String ESPS;            //河口位置
    private BigDecimal ESEL;        //河口高程
    private String DTPL;            //水准基面
    private BigDecimal RVLEN;       //河流长度
    private BigDecimal AVGG;        //平均比降
    private BigDecimal CTAR;        //流域面积
    private BigDecimal AVANRNAM;    //多年平均径流量
    private BigDecimal ANRNSTDV;     //年经流量标准差
    private String RVOV;            //河流概况
    private Date DTUPDT;            //更新日期
    private String MEMO;            //备注

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getRVCD() {
        return RVCD;
    }

    public void setRVCD(String RVCD) {
        this.RVCD = RVCD;
    }

    public String getRVNM() {
        return RVNM;
    }

    public void setRVNM(String RVNM) {
        this.RVNM = RVNM;
    }

    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }

    public String getALIAS() {
        return ALIAS;
    }

    public void setALIAS(String ALIAS) {
        this.ALIAS = ALIAS;
    }

    public String getRVTP() {
        return RVTP;
    }

    public void setRVTP(String RVTP) {
        this.RVTP = RVTP;
    }

    public String getRLEVEL() {
        return RLEVEL;
    }

    public void setRLEVEL(String RLEVEL) {
        this.RLEVEL = RLEVEL;
    }

    @JSONField(name = "River_Width")
    public BigDecimal getRiver_Width() {
        return River_Width;
    }

    public void setRiver_Width(BigDecimal river_Width) {
        River_Width = river_Width;
    }

    @JSONField(name = "River_Flux")
    public BigDecimal getRiver_Flux() {
        return River_Flux;
    }

    public void setRiver_Flux(BigDecimal river_Flux) {
        River_Flux = river_Flux;
    }

    public String getDWWT() {
        return DWWT;
    }

    public void setDWWT(String DWWT) {
        this.DWWT = DWWT;
    }

    public String getDWWTCD() {
        return DWWTCD;
    }

    public void setDWWTCD(String DWWTCD) {
        this.DWWTCD = DWWTCD;
    }

    public String getHWPS() {
        return HWPS;
    }

    public void setHWPS(String HWPS) {
        this.HWPS = HWPS;
    }

    public BigDecimal getHWEL() {
        return HWEL;
    }

    public void setHWEL(BigDecimal HWEL) {
        this.HWEL = HWEL;
    }

    public String getESPS() {
        return ESPS;
    }

    public void setESPS(String ESPS) {
        this.ESPS = ESPS;
    }

    public BigDecimal getESEL() {
        return ESEL;
    }

    public void setESEL(BigDecimal ESEL) {
        this.ESEL = ESEL;
    }

    public String getDTPL() {
        return DTPL;
    }

    public void setDTPL(String DTPL) {
        this.DTPL = DTPL;
    }

    public BigDecimal getRVLEN() {
        return RVLEN;
    }

    public void setRVLEN(BigDecimal RVLEN) {
        this.RVLEN = RVLEN;
    }

    public BigDecimal getAVGG() {
        return AVGG;
    }

    public void setAVGG(BigDecimal AVGG) {
        this.AVGG = AVGG;
    }

    public BigDecimal getCTAR() {
        return CTAR;
    }

    public void setCTAR(BigDecimal CTAR) {
        this.CTAR = CTAR;
    }

    public BigDecimal getAVANRNAM() {
        return AVANRNAM;
    }

    public void setAVANRNAM(BigDecimal AVANRNAM) {
        this.AVANRNAM = AVANRNAM;
    }

    public BigDecimal getANRNSTDV() {
        return ANRNSTDV;
    }

    public void setANRNSTDV(BigDecimal ANRNSTDV) {
        this.ANRNSTDV = ANRNSTDV;
    }

    public String getRVOV() {
        return RVOV;
    }

    public void setRVOV(String RVOV) {
        this.RVOV = RVOV;
    }

    public Date getDTUPDT() {
        return DTUPDT;
    }

    public void setDTUPDT(Date DTUPDT) {
        this.DTUPDT = DTUPDT;
    }

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO;
    }
}
