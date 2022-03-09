package vip.yingmen.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class spatialReference implements Serializable {
    private Integer wkid;

	public Integer getWkid() {
		return wkid;
	}

	public void setWkid(Integer wkid) {
		this.wkid = wkid;
	}
}
