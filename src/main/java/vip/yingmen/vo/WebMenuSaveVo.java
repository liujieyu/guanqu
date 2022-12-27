package vip.yingmen.vo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 菜单
 */
@ApiModel(description = "菜单-保存VO")
public class WebMenuSaveVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    /**
     * 名称
     */
    @NotNull
    @ApiModelProperty(value = "名称", required = true)
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    /**
     * Url
     */
    @ApiModelProperty(value = "Url")
    @Column(name = "url")
    private String url;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    @Column(name = "jhi_index")
    private Integer index;

    /**
     * 类型
     */
    @ApiModelProperty(value = "类型")
    @Column(name = "type")
    private String type;

    /**
     * 图标
     */
    @ApiModelProperty(value = "图标")
    @Column(name = "icon")
    private String icon;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    @Lob
    @Column(name = "remark")
    private String remark;


    /**
     * （前端更新时，只需传ID）父菜单
     */
    @ApiModelProperty(value = "（前端更新时，只需传ID）父菜单")
    private Long fatherId;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public WebMenuSaveVo name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public WebMenuSaveVo url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIndex() {
        return index;
    }

    public WebMenuSaveVo index(Integer index) {
        this.index = index;
        return this;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public WebMenuSaveVo type(String type) {
        this.type = type;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public WebMenuSaveVo icon(String icon) {
        this.icon = icon;
        return this;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRemark() {
        return remark;
    }

    public WebMenuSaveVo remark(String remark) {
        this.remark = remark;
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebMenuSaveVo)) {
            return false;
        }
        return id != null && id.equals(((WebMenuSaveVo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "WebMenu{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", url='" + getUrl() + "'" +
            ", index=" + getIndex() +
            ", type='" + getType() + "'" +
            ", icon='" + getIcon() + "'" +
            ", remark='" + getRemark() + "'" +
            "}";
    }

	public Long getFatherId() {
		return fatherId;
	}

	public void setFatherId(Long fatherId) {
		this.fatherId = fatherId;
	}
}
