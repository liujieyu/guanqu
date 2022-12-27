package vip.yingmen.pojo;

/**
 * 断面信息
 */
public class WrpSectionB {

  private int id;           //主键ID
  private String stcd;      //站点编号
  private String damcd;     //断面编号
  private String wallType;  //防渗墙类型
  private String damlen;    //断面长度
  private String damwd;     //断面宽度
  private String text;      //预留字段
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


  public String getDamlen() {
    return damlen;
  }

  public void setDamlen(String damlen) {
    this.damlen = damlen;
  }


  public String getDamwd() {
    return damwd;
  }

  public void setDamwd(String damwd) {
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
