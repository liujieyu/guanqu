package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 水库防洪指标信息
 * </p>
 *
 * @author liujieyu
 * @since 2022-12-26
 */
public class StRsrHych implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;            //主键ID

    private String stcd;           //测站编码

    private String rsvrtp;         //水库类型

    private String damel;          //坝顶高程

    private BigDecimal chfl;           //校核洪水位

    private BigDecimal dsfl;           //设计洪水位

    private BigDecimal normz;          //正常高水位

    private BigDecimal ddwz;           //死水位

    private BigDecimal actz;           //兴利水位

    private BigDecimal ttcp;           //总库容

    private BigDecimal fldcp;          //防洪库容

    private BigDecimal actcp;          //兴利库容

    private BigDecimal ddcp;           //死库容

    private BigDecimal hhrz;           //历史最高库水位

    private BigDecimal hmxw;           //历史最大蓄水量

    private BigDecimal laz;            //低水位告警值

    private BigDecimal sfq;            //启动预报流量标准

    private String moditime;       //时间戳

    private String dtuptm;         //更新时间

    private String stnm;              //站名

    private String stlc;              //所属行政区划

    private BigDecimal SWL;
    private BigDecimal FWL;
    private BigDecimal FWL79;
    private BigDecimal ZCWL;
    private BigDecimal SJWL;
    private BigDecimal XHWL;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public String getRsvrtp() {
        return rsvrtp;
    }

    public void setRsvrtp(String rsvrtp) {
        this.rsvrtp = rsvrtp;
    }

    public String getDamel() {
        return damel;
    }

    public void setDamel(String damel) {
        this.damel = damel;
    }



    public String getModitime() {
        return moditime;
    }

    public void setModitime(String moditime) {
        this.moditime = moditime;
    }

    public String getDtuptm() {
        return dtuptm;
    }

    public void setDtuptm(String dtuptm) {
        this.dtuptm = dtuptm;
    }

    public BigDecimal getChfl() {
        return chfl;
    }

    public void setChfl(BigDecimal chfl) {
        this.chfl = chfl;
    }

    public BigDecimal getDsfl() {
        return dsfl;
    }

    public void setDsfl(BigDecimal dsfl) {
        this.dsfl = dsfl;
    }

    public BigDecimal getNormz() {
        return normz;
    }

    public void setNormz(BigDecimal normz) {
        this.normz = normz;
    }

    public BigDecimal getDdwz() {
        return ddwz;
    }

    public void setDdwz(BigDecimal ddwz) {
        this.ddwz = ddwz;
    }

    public BigDecimal getActz() {
        return actz;
    }

    public void setActz(BigDecimal actz) {
        this.actz = actz;
    }

    public BigDecimal getTtcp() {
        return ttcp;
    }

    public void setTtcp(BigDecimal ttcp) {
        this.ttcp = ttcp;
    }

    public BigDecimal getFldcp() {
        return fldcp;
    }

    public void setFldcp(BigDecimal fldcp) {
        this.fldcp = fldcp;
    }

    public BigDecimal getActcp() {
        return actcp;
    }

    public void setActcp(BigDecimal actcp) {
        this.actcp = actcp;
    }

    public BigDecimal getDdcp() {
        return ddcp;
    }

    public void setDdcp(BigDecimal ddcp) {
        this.ddcp = ddcp;
    }

    public BigDecimal getHhrz() {
        return hhrz;
    }

    public void setHhrz(BigDecimal hhrz) {
        this.hhrz = hhrz;
    }

    public BigDecimal getHmxw() {
        return hmxw;
    }

    public void setHmxw(BigDecimal hmxw) {
        this.hmxw = hmxw;
    }

    public BigDecimal getLaz() {
        return laz;
    }

    public void setLaz(BigDecimal laz) {
        this.laz = laz;
    }

    public BigDecimal getSfq() {
        return sfq;
    }

    public void setSfq(BigDecimal sfq) {
        this.sfq = sfq;
    }

    public String getStnm() {
        return stnm;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm;
    }

    public String getStlc() {
        return stlc;
    }

    public void setStlc(String stlc) {
        this.stlc = stlc;
    }

    public BigDecimal getSWL() {
        return SWL;
    }

    public void setSWL(BigDecimal SWL) {
        this.SWL = SWL;
    }

    public BigDecimal getFWL() {
        return FWL;
    }

    public void setFWL(BigDecimal FWL) {
        this.FWL = FWL;
    }

    public BigDecimal getFWL79() {
        return FWL79;
    }

    public void setFWL79(BigDecimal FWL79) {
        this.FWL79 = FWL79;
    }

    public BigDecimal getZCWL() {
        return ZCWL;
    }

    public void setZCWL(BigDecimal ZCWL) {
        this.ZCWL = ZCWL;
    }

    public BigDecimal getSJWL() {
        return SJWL;
    }

    public void setSJWL(BigDecimal SJWL) {
        this.SJWL = SJWL;
    }

    public BigDecimal getXHWL() {
        return XHWL;
    }

    public void setXHWL(BigDecimal XHWL) {
        this.XHWL = XHWL;
    }
}
