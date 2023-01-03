package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("WRP_SPG_LSY")
public class WrpSpgLsy extends Model<WrpSpgLsy> {
  private static final long serialVersionUID = 1L;
  @TableId(value = "ID", type = IdType.AUTO)
  private int id;
  @TableField("MPCD")
  private String mpcd;

  @TableField("LTYPE")
  private String ltype;

  @TableField("DHNAME")
  private String dhname;

  @TableField("SETINFO")
  private String setinfo;
  @TableField("TDMIN")
  private String tdmin;
  @TableField("SPPRWL")
  private String spprwl;
  @TableField("INDT")
  private String indt;
  @TableField("DVCD")
  private String dvcd;
  @TableField("DTUPTM")
  private String dtuptm;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getMpcd() {
    return mpcd;
  }

  public void setMpcd(String mpcd) {
    this.mpcd = mpcd;
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


  public String getDtuptm() {
    return dtuptm;
  }

  public void setDtuptm(String dtuptm) {
    this.dtuptm = dtuptm;
  }

}
