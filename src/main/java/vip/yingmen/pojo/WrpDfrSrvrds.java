package vip.yingmen.pojo;

/**
 * 垂直位移监测数据
 */
public class WrpDfrSrvrds {
  private int id;          //主键ID
  private String mpcd;     //测点编号
  private String mstm;     //时间
  private String vrds;     //垂直位移
  private String inel;     //测量高程
  private String vjyz;     //距阈值
  private String damcd;    //断面编号
  private String stcd;     //站点编号
  private String vrdsyj;   //阈值


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


  public String getVrds() {
    return vrds;
  }

  public void setVrds(String vrds) {
    this.vrds = vrds;
  }


  public String getInel() {
    return inel;
  }

  public void setInel(String inel) {
    this.inel = inel;
  }

  public String getVjyz() {
    return vjyz;
  }

  public void setVjyz(String vjyz) {
    this.vjyz = vjyz;
  }

  public String getDamcd() {
    return damcd;
  }

  public void setDamcd(String damcd) {
    this.damcd = damcd;
  }

  public String getStcd() {
    return stcd;
  }

  public void setStcd(String stcd) {
    this.stcd = stcd;
  }

  public String getVrdsyj() {
    return vrdsyj;
  }

  public void setVrdsyj(String vrdsyj) {
    this.vrdsyj = vrdsyj;
  }
}
