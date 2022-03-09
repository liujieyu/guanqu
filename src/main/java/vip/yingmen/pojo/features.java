package vip.yingmen.pojo;

import java.io.Serializable;


public class features implements Serializable {
    private attributes attributes;
    private geometry geometry;
    private Object rowinfo;
    private StGatageR stGatageR;
    private ZhaFaZhuangTaiGIS zhaFaZhuangTaiGIS8;
    public vip.yingmen.pojo.attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(vip.yingmen.pojo.attributes attributes) {
        this.attributes = attributes;
    }

    public vip.yingmen.pojo.geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(vip.yingmen.pojo.geometry geometry) {
        this.geometry = geometry;
    }

    public Object getRowinfo() {
        return rowinfo;
    }

    public void setRowinfo(Object rowinfo) {
        this.rowinfo = rowinfo;
    }

	public StGatageR getStGatageR() {
		return stGatageR;
	}

	public void setStGatageR(StGatageR stGatageR) {
		this.stGatageR = stGatageR;
	}

	public ZhaFaZhuangTaiGIS getZhaFaZhuangTaiGIS8() {
		return zhaFaZhuangTaiGIS8;
	}

	public void setZhaFaZhuangTaiGIS8(ZhaFaZhuangTaiGIS zhaFaZhuangTaiGIS8) {
		this.zhaFaZhuangTaiGIS8 = zhaFaZhuangTaiGIS8;
	}
}
