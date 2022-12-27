package vip.yingmen.pojo;

/**
 * 表面位移监测数据
 */
public class WrpDfrSrhrds {

  private int id;           //主键ID
  private String mpcd;      //测点面好
  private String mstm;      //时间
  private String xhrds;     //x向水平位移
  private String yhrds;     //y向水平位移
  private String eslg;      //经度
  private String nrlt;      //纬度
  private String xyhrds;    //水平位移阈值
  private String xjyz;      //x向距阈值
  private String yjyz;      //y向距阈值
  private String stcd;      //站点编号
  private String damcd;     //断面编号


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


  public String getXhrds() {
    return xhrds;
  }

  public void setXhrds(String xhrds) {
    this.xhrds = xhrds;
  }


  public String getYhrds() {
    return yhrds;
  }

  public void setYhrds(String yhrds) {
    this.yhrds = yhrds;
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

  public String getXyhrds() {
    return xyhrds;
  }

  public void setXyhrds(String xyhrds) {
    this.xyhrds = xyhrds;
  }

  public String getXjyz() {
    return xjyz;
  }

  public void setXjyz(String xjyz) {
    this.xjyz = xjyz;
  }

  public String getYjyz() {
    return yjyz;
  }

  public void setYjyz(String yjyz) {
    this.yjyz = yjyz;
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
