package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 渗流量测点信息
 */
@Data
@TableName("WRP_SPG_SPQNMP")
public class WrpSpgSpqnmp {
  private static final long serialVersionUID = 1L;
  @TableId(value = "ID", type = IdType.AUTO)
  private int id;           //主键ID
  @TableField("STCD")
  private String stcd;      //站点编号
  @TableField("DAMCD")
  private String damcd;     //断面编号
  @TableField("MPCD")
  private String mpcd;      //测点编号
  @TableField("CH")
  private String ch;        //桩号
  @TableField("OFAX")
  private BigDecimal ofax;      //轴距
  @TableField("EL")
  private BigDecimal el;        //高程
  @TableField("INDT")
  private String indt;      //安装日期
  @TableField("DVCD")
  private String dvcd;      //仪器编号
  @TableField("ESLG")
  private BigDecimal eslg;      //经度
  @TableField("NRLT")
  private BigDecimal nrlt;      //纬度
  @TableField("RM")
  private String rm;        //备注
  @TableField("DTUPTM")
  private String dtuptm;    //更新日期
  private Integer sbid;      //渗流量设备ID
  private String ltype;     //测量方式
  private String dhname;    //设施名称
  private String setinfo;   //安装信息
  private BigDecimal tdmin;     //测量最小值
  private BigDecimal spprwl;    //测流阈值
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


  public BigDecimal getEl() {
    return el;
  }

  public void setEl(BigDecimal el) {
    this.el = el;
  }


  public String getIndt() {
    return indt;
  }

  public void setIndt(String indt) {
    this.indt = indt;
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

  public String getLtype() {
    return ltype;
  }

  public void setLtype(String ltype) {
    this.ltype = ltype;
  }

  public String getDhname() {
    return dhname;
  }

  public void setDhname(String dhname) {
    this.dhname = dhname;
  }

  public String getSetinfo() {
    return setinfo;
  }

  public void setSetinfo(String setinfo) {
    this.setinfo = setinfo;
  }

  public BigDecimal getTdmin() {
    return tdmin;
  }

  public void setTdmin(BigDecimal tdmin) {
    this.tdmin = tdmin;
  }

  public BigDecimal getSpprwl() {
    return spprwl;
  }

  public void setSpprwl(BigDecimal spprwl) {
    this.spprwl = spprwl;
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

  public Integer getSbid() {
    return sbid;
  }

  public void setSbid(Integer sbid) {
    this.sbid = sbid;
  }
}
