package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 测压管信息
 */
@Data
@TableName("WRP_SPG_PZTB")
public class WrpSpgPztb {
  private static final long serialVersionUID = 1L;

  @TableId(value = "ID", type = IdType.AUTO)
  private int id;         //主键ID
  @TableField("STCD")
  private String stcd;    //站点名称
  @TableField("DAMCD")
  private String damcd;   //断面编号
  @TableField("MPCD")
  private String mpcd;    //测点编号
  @TableField("CH")
  private String ch;      //桩号
  @TableField("OFAX")
  private BigDecimal ofax;    //坝轴距
  @TableField("MSPS")
  private String msps;    //监测部位
  @TableField("IPBTEL")
  private BigDecimal ipbtel;  //进水段底高程
  @TableField("IPTPEL")
  private BigDecimal iptpel;  //进水段顶高程
  @TableField("TBTPEL")
  private BigDecimal tbtpel;  //管口高程
  @TableField("TBBTEL")
  private BigDecimal tbbtel;  //管底高程
  @TableField("PZTBTEL")
  private BigDecimal pztbtel; //水位阈值高程
  @TableField("DVCD")
  private String dvcd;    //仪器编号
  @TableField("ESLG")
  private BigDecimal eslg;    //经度
  @TableField("NRLT")
  private BigDecimal nrlt;    //纬度
  @TableField("RM")
  private String rm;      //备注
  @TableField("EL")
  private BigDecimal el;      //安装高程
  @TableField("MSTP")
  private String mstp;    //监测类型
  @TableField("DTUPTM")
  private String dtuptm;  //更新时间
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


  public String getMsps() {
    return msps;
  }

  public void setMsps(String msps) {
    this.msps = msps;
  }


  public BigDecimal getIpbtel() {
    return ipbtel;
  }

  public void setIpbtel(BigDecimal ipbtel) {
    this.ipbtel = ipbtel;
  }


  public BigDecimal getIptpel() {
    return iptpel;
  }

  public void setIptpel(BigDecimal iptpel) {
    this.iptpel = iptpel;
  }


  public BigDecimal getTbtpel() {
    return tbtpel;
  }

  public void setTbtpel(BigDecimal tbtpel) {
    this.tbtpel = tbtpel;
  }


  public BigDecimal getTbbtel() {
    return tbbtel;
  }

  public void setTbbtel(BigDecimal tbbtel) {
    this.tbbtel = tbbtel;
  }


  public BigDecimal getPztbtel() {
    return pztbtel;
  }

  public void setPztbtel(BigDecimal pztbtel) {
    this.pztbtel = pztbtel;
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


  public BigDecimal getEl() {
    return el;
  }

  public void setEl(BigDecimal el) {
    this.el = el;
  }


  public String getMstp() {
    return mstp;
  }

  public void setMstp(String mstp) {
    this.mstp = mstp;
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
