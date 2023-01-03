package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

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
  private String ofax;      //轴距
  @TableField("EL")
  private String el;        //高程
  @TableField("INDT")
  private String indt;      //安装日期
  @TableField("DVCD")
  private String dvcd;      //仪器编号
  @TableField("ESLG")
  private String eslg;      //经度
  @TableField("NRLT")
  private String nrlt;      //纬度
  @TableField("RM")
  private String rm;        //备注
  @TableField("DTUPTM")
  private String dtuptm;    //更新日期
  private int sbid;      //渗流量设备ID
  private String ltype;     //测量方式
  private String dhname;    //设施名称
  private String setinfo;   //安装信息
  private String tdmin;     //测量最小值
  private String spprwl;    //测流阈值
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


  public String getOfax() {
    return ofax;
  }

  public void setOfax(String ofax) {
    this.ofax = ofax;
  }


  public String getEl() {
    return el;
  }

  public void setEl(String el) {
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


  public String getEslg() {
    return eslg;
  }

  public void setEslg(String eslg) {
    this.eslg = eslg;
  }


  public String getNrlt() {
    return nrlt;
  }

  public void setNrlt(String nrlt) {
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

  public String getTdmin() {
    return tdmin;
  }

  public void setTdmin(String tdmin) {
    this.tdmin = tdmin;
  }

  public String getSpprwl() {
    return spprwl;
  }

  public void setSpprwl(String spprwl) {
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

  public int getSbid() {
    return sbid;
  }

  public void setSbid(int sbid) {
    this.sbid = sbid;
  }
}
