package vip.yingmen.pojo;

/**
 * 渗流压力数据
 * */
public class WrpSpgSppr {

  private int id;          //主键ID
  private String mpcd;     //测点编号
  private String mstm;     //时间
  private String spprwm;   //测压水位
  private String tm;       //温度
  private String pzyz;     //阈值
  private String pzjyz;    //距阈值
  private String stcd;     //站点编号
  private String damcd;    //断面编号

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


  public String getMstm() {
    return mstm;
  }

  public void setMstm(String mstm) {
    this.mstm = mstm;
  }


  public String getSpprwm() {
    return spprwm;
  }

  public void setSpprwm(String spprwm) {
    this.spprwm = spprwm;
  }


  public String getTm() {
    return tm;
  }

  public void setTm(String tm) {
    this.tm = tm;
  }

  public String getPzyz() {
    return pzyz;
  }

  public void setPzyz(String pzyz) {
    this.pzyz = pzyz;
  }

  public String getPzjyz() {
    return pzjyz;
  }

  public void setPzjyz(String pzjyz) {
    this.pzjyz = pzjyz;
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
}
