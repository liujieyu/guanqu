package vip.yingmen.pojo;

import java.io.Serializable;

public class FeatureLayers implements Serializable {
    private String itype;
    private String title;
    private String icon;
    private String icon_warning;
    private String url;
    private String show;

    public String getItype() {
        return itype;
    }

    public void setItype(String itype) {
        this.itype = itype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon_warning() {
        return icon_warning;
    }

    public void setIcon_warning(String icon_warning) {
        this.icon_warning = icon_warning;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }
}
