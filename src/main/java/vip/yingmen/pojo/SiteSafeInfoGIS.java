package vip.yingmen.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 大坝安全监测GIS实时监控数据
 */
public class SiteSafeInfoGIS {
    private String ID;                       //主键ID
    private String STCD;                     //站点编码
    private String STTP;                     //站类
    private String LTTD;                     //经度
    private String LGTD;                     //纬度
    private String STNM;                     //站名
    private String adnm;                     //行政区划
    private String sllyj="0";                //渗流量预警
    private String slylyj="0";               //渗流压力预警
    private String spwyyj="0";               //水平位移预警
    private String czwyyj="0";               //垂直位移预警
    private List<WrpSpgSpprL> slllist=new ArrayList<WrpSpgSpprL>();        //渗流量实时监测列表
    private List<WrpSpgSppr> slyllist=new ArrayList<WrpSpgSppr>();         //渗压水位实时监测列表
    private List<WrpDfrSrhrds> spwylist=new ArrayList<WrpDfrSrhrds>();     //表面位移变形实时监测列表
    private List<WrpDfrSrvrds> czwylist=new ArrayList<WrpDfrSrvrds>();     //表面垂直位移实时监测列表
    private int sortsign=0;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getSTTP() {
        return STTP;
    }

    public void setSTTP(String STTP) {
        this.STTP = STTP;
    }

    public String getLTTD() {
        return LTTD;
    }

    public void setLTTD(String LTTD) {
        this.LTTD = LTTD;
    }

    public String getLGTD() {
        return LGTD;
    }

    public void setLGTD(String LGTD) {
        this.LGTD = LGTD;
    }

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    public List<WrpSpgSpprL> getSlllist() {
        return slllist;
    }

    public void setSlllist(List<WrpSpgSpprL> slllist) {
        this.slllist = slllist;
    }

    public List<WrpSpgSppr> getSlyllist() {
        return slyllist;
    }

    public void setSlyllist(List<WrpSpgSppr> slyllist) {
        this.slyllist = slyllist;
    }

    public List<WrpDfrSrhrds> getSpwylist() {
        return spwylist;
    }

    public void setSpwylist(List<WrpDfrSrhrds> spwylist) {
        this.spwylist = spwylist;
    }

    public List<WrpDfrSrvrds> getCzwylist() {
        return czwylist;
    }

    public void setCzwylist(List<WrpDfrSrvrds> czwylist) {
        this.czwylist = czwylist;
    }

    public void addSllobj(WrpSpgSpprL sllobj){
        this.slllist.add(sllobj);
    }

    public void addSlylobj(WrpSpgSppr slylobj){
        this.slyllist.add(slylobj);
    }

    public void addSpwyobj(WrpDfrSrhrds spwyobj){
        this.spwylist.add(spwyobj);
    }

    public void addCzwyobj(WrpDfrSrvrds czwyobj){
        this.czwylist.add(czwyobj);
    }

    public String getSllyj() {
        return sllyj;
    }

    public void setSllyj(String sllyj) {
        this.sllyj = sllyj;
    }

    public String getSlylyj() {
        return slylyj;
    }

    public void setSlylyj(String slylyj) {
        this.slylyj = slylyj;
    }

    public String getSpwyyj() {
        return spwyyj;
    }

    public void setSpwyyj(String spwyyj) {
        this.spwyyj = spwyyj;
    }

    public String getCzwyyj() {
        return czwyyj;
    }

    public void setCzwyyj(String czwyyj) {
        this.czwyyj = czwyyj;
    }

    public int getSortsign() {
        return sortsign;
    }

    public void setSortsign(int sortsign) {
        this.sortsign = sortsign;
    }
}
