package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 断面特征信息
 */
@Data
@TableName("WRP_DAMS_B")
public class WrpDamsB extends Model<WrpDamsB> {
  private static final long serialVersionUID = 1L;
  @TableId(value = "ID", type = IdType.AUTO)
  private int id;          //主键ID
  @TableField("STCD")
  private String stcd;     //站点编码
  @TableField("DAMCD")
  private String damcd;    //断面编号
  @TableField("DAMSCD")
  private String damscd;   //特征点编号
  @TableField("DAMSNM")
  private String damsnm;   //特征点名称
  @TableField("REDI")
  private BigDecimal redi;     //起点距
  @TableField("POEL")
  private BigDecimal poel;     //高程
  @TableField("DTUPTM")
  private String dtuptm;   //更新时间


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


  public String getDamscd() {
    return damscd;
  }

  public void setDamscd(String damscd) {
    this.damscd = damscd;
  }


  public String getDamsnm() {
    return damsnm;
  }

  public void setDamsnm(String damsnm) {
    this.damsnm = damsnm;
  }


  public BigDecimal getRedi() {
    return redi;
  }

  public void setRedi(BigDecimal redi) {
    this.redi = redi;
  }


  public BigDecimal getPoel() {
    return poel;
  }

  public void setPoel(BigDecimal poel) {
    this.poel = poel;
  }


  public String getDtuptm() {
    return dtuptm;
  }

  public void setDtuptm(String dtuptm) {
    this.dtuptm = dtuptm;
  }

}
