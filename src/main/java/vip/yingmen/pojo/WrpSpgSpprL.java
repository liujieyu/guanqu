package vip.yingmen.pojo;

/**
 * 渗流量数据
 * */
public class WrpSpgSpprL {

  private int id;         //主键ID
  private String mpcd;    //测点编号
  private String mstm;    //时间
  private String spprwl;  //渗流量
  private String tm;      //渗流水温
  private String wlyz;    //阈值
  private String wljyz;   //距阈值
  private String stcd;    //站点编号
  private String damcd;   //断面编号

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


  public String getSpprwl() {
    return spprwl;
  }

  public void setSpprwl(String spprwl) {
    this.spprwl = spprwl;
  }


  public String getTm() {
    return tm;
  }

  public void setTm(String tm) {
    this.tm = tm;
  }

  public String getWlyz() {
    return wlyz;
  }

  public void setWlyz(String wlyz) {
    this.wlyz = wlyz;
  }

  public String getWljyz() {
    return wljyz;
  }

  public void setWljyz(String wljyz) {
    this.wljyz = wljyz;
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
