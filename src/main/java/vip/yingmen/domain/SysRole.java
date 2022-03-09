package vip.yingmen.domain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * 角色
 */
@ApiModel(description = "角色")
@Entity
@Table(name = "sys_role")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SysRole implements Serializable {

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
     * 等级
     */
    @ApiModelProperty(value = "等级")
    @Column(name = "grade")
    private String grade;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    @Lob
    @Column(name = "description")
    private String description;

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
     * （前端忽略）角色下的账号数组
     */
    @ApiModelProperty(value = "（前端忽略）角色下的账号数组")
    @OneToMany(mappedBy = "role")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JSONField(serialize=false)
    @JsonIgnore
    private Set<WebUser> webUsers = new HashSet<>();

    /**
     * 角色赋圈菜单数组
     */
    @ApiModelProperty(value = "（前端忽略）角色赋圈菜单数组")
    @ManyToMany
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JoinTable(name = "sys_role_web_menu",
               joinColumns = @JoinColumn(name = "sys_role_id", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "web_menu_id", referencedColumnName = "id"))
    @JSONField(serialize=false)
    @JsonIgnore
    private Set<WebMenu> webMenus = new HashSet<>();

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

    public SysRole name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public SysRole grade(String grade) {
        this.grade = grade;
        return this;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public SysRole description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public SysRole remark(String remark) {
        this.remark = remark;
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Instant getCtime() {
        return ctime;
    }

    public SysRole ctime(Instant ctime) {
        this.ctime = ctime;
        return this;
    }

    public void setCtime(Instant ctime) {
        this.ctime = ctime;
    }

    public String getCreator() {
        return creator;
    }

    public SysRole creator(String creator) {
        this.creator = creator;
        return this;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Instant getUpTime() {
        return upTime;
    }

    public SysRole upTime(Instant upTime) {
        this.upTime = upTime;
        return this;
    }

    public void setUpTime(Instant upTime) {
        this.upTime = upTime;
    }

    public String getModifier() {
        return modifier;
    }

    public SysRole modifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Boolean isDelFlag() {
        return delFlag;
    }

    public SysRole delFlag(Boolean delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Set<WebUser> getWebUsers() {
        return webUsers;
    }

    public SysRole webUsers(Set<WebUser> webUsers) {
        this.webUsers = webUsers;
        return this;
    }

    public SysRole addWebUser(WebUser webUser) {
        this.webUsers.add(webUser);
        webUser.setRole(this);
        return this;
    }

    public SysRole removeWebUser(WebUser webUser) {
        this.webUsers.remove(webUser);
        webUser.setRole(null);
        return this;
    }

    public void setWebUsers(Set<WebUser> webUsers) {
        this.webUsers = webUsers;
    }

    public Set<WebMenu> getWebMenus() {
        return webMenus;
    }

    public SysRole webMenus(Set<WebMenu> webMenus) {
        this.webMenus = webMenus;
        return this;
    }

    public SysRole addWebMenu(WebMenu webMenu) {
        this.webMenus.add(webMenu);
        webMenu.getSysRoles().add(this);
        return this;
    }

    public SysRole removeWebMenu(WebMenu webMenu) {
        this.webMenus.remove(webMenu);
        webMenu.getSysRoles().remove(this);
        return this;
    }

    public void setWebMenus(Set<WebMenu> webMenus) {
        this.webMenus = webMenus;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SysRole)) {
            return false;
        }
        return id != null && id.equals(((SysRole) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "SysRole{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", grade='" + getGrade() + "'" +
            ", description='" + getDescription() + "'" +
            ", remark='" + getRemark() + "'" +
            ", ctime='" + getCtime() + "'" +
            ", creator='" + getCreator() + "'" +
            ", upTime='" + getUpTime() + "'" +
            ", modifier='" + getModifier() + "'" +
            ", delFlag='" + isDelFlag() + "'" +
            "}";
    }
}
