package vip.yingmen.pojo;
/**
 * 行政区划树数据
 * */
public class TreeData {
    private String stcd;   //站点编码
    private String stnm;   //站点名称
    private String adcd;   //村级行政区划编码
    private String adnm;   //村级行政区划名称
    private String updacd; //镇级行政区划编码
    private String upnm;   //镇级行政区划名称

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public String getStnm() {
        return stnm;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm;
    }

    public String getAdcd() {
        return adcd;
    }

    public void setAdcd(String adcd) {
        this.adcd = adcd;
    }

    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    public String getUpdacd() {
        return updacd;
    }

    public void setUpdacd(String updacd) {
        this.updacd = updacd;
    }

    public String getUpnm() {
        return upnm;
    }

    public void setUpnm(String upnm) {
        this.upnm = upnm;
    }
}
