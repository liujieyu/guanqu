package vip.yingmen.pojo;

/**
 * 断面特征信息
 */
public class WrpDamsB {

  private int id;          //主键ID
  private String stcd;     //站点编码
  private String damcd;    //断面编号
  private String damscd;   //特征点编号
  private String damsnm;   //特征点名称
  private String redi;     //起点距
  private String poel;     //高程
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


  public String getRedi() {
    return redi;
  }

  public void setRedi(String redi) {
    this.redi = redi;
  }


  public String getPoel() {
    return poel;
  }

  public void setPoel(String poel) {
    this.poel = poel;
  }


  public String getDtuptm() {
    return dtuptm;
  }

  public void setDtuptm(String dtuptm) {
    this.dtuptm = dtuptm;
  }

}
