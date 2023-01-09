package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 表面垂直位移信息
 */
@Data
@TableName("WRP_DFR_SRVRDSMP")
public class WrpDfrSrvrdsmp {
  private static final long serialVersionUID = 1L;

  @TableId(value = "ID", type = IdType.AUTO)
  private int id;          //主键ID
  @TableField("STCD")
  private String stcd;     //站点编号
  @TableField("DAMCD")
  private String damcd;    //断面编号
  @TableField("MPCD")
  private String mpcd;     //测点编号
  @TableField("CH")
  private String ch;       //桩号
  @TableField("OFAX")
  private BigDecimal ofax;     //轴距
  @TableField("INEL")
  private BigDecimal inel;     //初始高程
  @TableField("VRDS")
  private BigDecimal vrds;     //位移阈值
  @TableField("TP")
  private String tp;       //型式
  @TableField("BSIN")
  private String bsin;     //基础情况
  @TableField("INDT")
  private String indt;     //安装日期
  @TableField("DTDT")
  private String dtdt;     //测定日期
  @TableField("DVCD")
  private String dvcd;     //设备编号
  @TableField("ESLG")
  private BigDecimal eslg;     //经度
  @TableField("NRLT")
  private BigDecimal nrlt;     //纬度
  @TableField("RM")
  private String rm;       //备注
  @TableField("DTUPTM")
  private String dtuptm;   //更新时间
  private String adnm;      //所属行政区划
  private String stnm;      //站点名称


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getStcd() {
    return stcd;
  }

  public void setStcd(String stcd) {
    this.stcd = stcd;
  }


  public String getDamcd() {
    return damcd;
  }

  public void setDamcd(String damcd) {
    this.damcd = damcd;
  }


  public String getMpcd() {
    return mpcd;
  }

  public void setMpcd(String mpcd) {
    this.mpcd = mpcd;
  }


  public String getCh() {
    return ch;
  }

  public void setCh(String ch) {
    this.ch = ch;
  }


  public BigDecimal getOfax() {
    return ofax;
  }

  public void setOfax(BigDecimal ofax) {
    this.ofax = ofax;
  }


  public BigDecimal getInel() {
    return inel;
  }

  public void setInel(BigDecimal inel) {
    this.inel = inel;
  }


  public BigDecimal getVrds() {
    return vrds;
  }

  public void setVrds(BigDecimal vrds) {
    this.vrds = vrds;
  }


  public String getTp() {
    return tp;
  }

  public void setTp(String tp) {
    this.tp = tp;
  }


  public String getBsin() {
    return bsin;
  }

  public void setBsin(String bsin) {
    this.bsin = bsin;
  }


  public String getIndt() {
    return indt;
  }

  public void setIndt(String indt) {
    this.indt = indt;
  }


  public String getDtdt() {
    return dtdt;
  }

  public void setDtdt(String dtdt) {
    this.dtdt = dtdt;
  }


  public String getDvcd() {
    return dvcd;
  }

  public void setDvcd(String dvcd) {
    this.dvcd = dvcd;
  }


  public BigDecimal getEslg() {
    return eslg;
  }

  public void setEslg(BigDecimal eslg) {
    this.eslg = eslg;
  }


  public BigDecimal getNrlt() {
    return nrlt;
  }

  public void setNrlt(BigDecimal nrlt) {
    this.nrlt = nrlt;
  }


  public String getRm() {
    return rm;
  }

  public void setRm(String rm) {
    this.rm = rm;
  }


  public String getDtuptm() {
    return dtuptm;
  }

  public void setDtuptm(String dtuptm) {
    this.dtuptm = dtuptm;
  }

  public String getAdnm() {
    return adnm;
  }

  public void setAdnm(String adnm) {
    this.adnm = adnm;
  }

  public String getStnm() {
    return stnm;
  }

  public void setStnm(String stnm) {
    this.stnm = stnm;
  }
}
