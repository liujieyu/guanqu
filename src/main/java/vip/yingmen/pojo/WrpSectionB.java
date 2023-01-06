package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 断面信息
 */
@Data
@TableName("WRP_SECTION_B")
public class WrpSectionB extends Model<WrpSectionB> {
  private static final long serialVersionUID = 1L;

  @TableId(value = "ID", type = IdType.AUTO)
  private int id;           //主键ID
  @TableField("STCD")
  private String stcd;      //站点编号
  @TableField("DAMCD")
  private String damcd;     //断面编号
  @TableField("WALL_TYPE")
  private String wallType;  //防渗墙类型
  @TableField("DAMLEN")
  private BigDecimal damlen;    //断面长度
  @TableField("DAMWD")
  private BigDecimal damwd;     //断面宽度
  @TableField("TEXT")
  private String text;      //预留字段
  @TableField("DTUPTIM")
  private String dtuptim;   //更新时间
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


  public String getWallType() {
    return wallType;
  }

  public void setWallType(String wallType) {
    this.wallType = wallType;
  }


  public BigDecimal getDamlen() {
    return damlen;
  }

  public void setDamlen(BigDecimal damlen) {
    this.damlen = damlen;
  }


  public BigDecimal getDamwd() {
    return damwd;
  }

  public void setDamwd(BigDecimal damwd) {
    this.damwd = damwd;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public String getDtuptim() {
    return dtuptim;
  }

  public void setDtuptim(String dtuptim) {
    this.dtuptim = dtuptim;
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
