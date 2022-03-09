package vip.yingmen.domain;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * 菜单
 */
@ApiModel(description = "菜单")
@Entity
@Table(name = "web_menu")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class WebMenu implements Serializable {

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
    @Column(name = "name", nullable = false)
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
     * （保存时前端忽略） 数据记录-创建时间
     */
    @ApiModelProperty(value = "（保存时前端忽略） 数据记录-创建时间")
    @Column(name = "ctime")
    private Instant ctime;

    /**
     * （保存时前端忽略） 数据记录-创建人
     */
    @ApiModelProperty(value = "（保存时前端忽略） 数据记录-创建人")
    @Column(name = "creator")
    private String creator;

    /**
     * （保存时前端忽略） 数据记录-更新时间
     */
    @ApiModelProperty(value = "（保存时前端忽略） 数据记录-更新时间")
    @Column(name = "up_time")
    private Instant upTime;

    /**
     * （保存时前端忽略） 数据记录-更新人
     */
    @ApiModelProperty(value = "（保存时前端忽略） 数据记录-更新人")
    @Column(name = "modifier")
    private String modifier;

    /**
     * （保存时前端忽略） 删除标记：  false(1) 正常  ，  true(0) 已删除
     */
    @ApiModelProperty(value = "（保存时前端忽略） 删除标记：   false(0) 正常  ，  true(1) 已删除")
    @Column(name = "del_flag")
    private Boolean delFlag;

    /**
     * （前端忽略）子菜单数组
     */
    @ApiModelProperty(value = "（前端忽略）子菜单数组")
    @OneToMany(mappedBy = "father")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JsonIgnore
    @JSONField(serialize=false)
    private Set<WebMenu> children = new HashSet<>();

    /**
     * （前端更新时，只需传ID）父菜单
     */
    @ApiModelProperty(value = "（前端更新时，只需传ID）父菜单")
    @ManyToOne
    @JsonIgnoreProperties("children")
    private WebMenu father;

    @ManyToMany(mappedBy = "webMenus")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JsonIgnore
    @JSONField(serialize=false)
    private Set<SysRole> sysRoles = new HashSet<>();

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

    public WebMenu name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public WebMenu url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIndex() {
        return index;
    }

    public WebMenu index(Integer index) {
        this.index = index;
        return this;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public WebMenu type(String type) {
        this.type = type;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public WebMenu icon(String icon) {
        this.icon = icon;
        return this;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRemark() {
        return remark;
    }

    public WebMenu remark(String remark) {
        this.remark = remark;
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Instant getCtime() {
        return ctime;
    }

    public WebMenu ctime(Instant ctime) {
        this.ctime = ctime;
        return this;
    }

    public void setCtime(Instant ctime) {
        this.ctime = ctime;
    }

    public String getCreator() {
        return creator;
    }

    public WebMenu creator(String creator) {
        this.creator = creator;
        return this;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Instant getUpTime() {
        return upTime;
    }

    public WebMenu upTime(Instant upTime) {
        this.upTime = upTime;
        return this;
    }

    public void setUpTime(Instant upTime) {
        this.upTime = upTime;
    }

    public String getModifier() {
        return modifier;
    }

    public WebMenu modifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Boolean isDelFlag() {
        return delFlag;
    }

    public WebMenu delFlag(Boolean delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Set<WebMenu> getChildren() {
        return children;
    }

    public WebMenu children(Set<WebMenu> webMenus) {
        this.children = webMenus;
        return this;
    }

    public WebMenu addChild(WebMenu webMenu) {
        this.children.add(webMenu);
        webMenu.setFather(this);
        return this;
    }

    public WebMenu removeChild(WebMenu webMenu) {
        this.children.remove(webMenu);
        webMenu.setFather(null);
        return this;
    }

    public void setChildren(Set<WebMenu> webMenus) {
        this.children = webMenus;
    }

    public WebMenu getFather() {
        return father;
    }

    public WebMenu father(WebMenu webMenu) {
        this.father = webMenu;
        return this;
    }

    public void setFather(WebMenu webMenu) {
        this.father = webMenu;
    }

    public Set<SysRole> getSysRoles() {
        return sysRoles;
    }

    public WebMenu sysRoles(Set<SysRole> sysRoles) {
        this.sysRoles = sysRoles;
        return this;
    }

    public WebMenu addSysRole(SysRole sysRole) {
        this.sysRoles.add(sysRole);
        sysRole.getWebMenus().add(this);
        return this;
    }

    public WebMenu removeSysRole(SysRole sysRole) {
        this.sysRoles.remove(sysRole);
        sysRole.getWebMenus().remove(this);
        return this;
    }

    public void setSysRoles(Set<SysRole> sysRoles) {
        this.sysRoles = sysRoles;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebMenu)) {
            return false;
        }
        return id != null && id.equals(((WebMenu) o).id);
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
            ", ctime='" + getCtime() + "'" +
            ", creator='" + getCreator() + "'" +
            ", upTime='" + getUpTime() + "'" +
            ", modifier='" + getModifier() + "'" +
            ", delFlag='" + isDelFlag() + "'" +
            "}";
    }
}
