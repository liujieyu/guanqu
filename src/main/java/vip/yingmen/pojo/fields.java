package vip.yingmen.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class fields implements Serializable {
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	private String name;
    private String type;
    private String alias;
    private Integer length;
}
