package vip.yingmen.domain;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import vip.yingmen.domain.enumeration.WebUserStatus;

/**
 * Web账号
 */
@ApiModel(description = "Web账号")
@Entity
@Table(name = "web_user")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class WebUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    /**
     * 用户名
     */
    @NotNull
    @ApiModelProperty(value = "用户名", required = true)
    @Column(name = "login", nullable = false, unique = true)
    private String login;

    /**
     * 姓名
     */
    @NotNull
    @ApiModelProperty(value = "姓名", required = true)
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 密码
     */
    @NotNull
    @ApiModelProperty(value = "密码", required = true)
    @Column(name = "passwd", nullable = false)
    private String passwd;

    /**
     * 状态: NORMAL(正常)FREEZE(冻结)
     */
    @NotNull
    @ApiModelProperty(value = "状态: NORMAL(正常)FREEZE(冻结)", required = true)
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private WebUserStatus status;

    /**
     * 性别
     */
    @Size(max = 10)
    @ApiModelProperty(value = "性别")
    @Column(name = "sex", length = 10)
    private String sex;

    /**
     * 单位
     */
    @ApiModelProperty(value = "单位")
    @Column(name = "enterprise")
    private String enterprise;

    /**
     * 部门
     */
    @ApiModelProperty(value = "部门")
    @Column(name = "department")
    private String department;

    /**
     * 职位
     */
    @ApiModelProperty(value = "职位")
    @Column(name = "position")
    private String position;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日")
    @Column(name = "birthday")
    private LocalDate birthday;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话")
    @Column(name = "phone")
    private String phone;

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
     * （前端忽略） 数据记录-更新人
     */
    @ApiModelProperty(value = "（前端忽略） 数据记录-更新人")
    @Column(name = "modifier")
    private String modifier;

    /**
     * （前端忽略） 删除标记：  false(1) 正常  ，  true(0) 已删除
     */
    @ApiModelProperty(value = "（前端忽略） 删除标记：  false(0) 正常  ，  true(1) 已删除")
    @Column(name = "del_flag")
    private Boolean delFlag;

    /**
     * （前端忽略）Web账号登录记录数组
     */
    @ApiModelProperty(value = "（前端忽略）Web账号登录记录数组")
    @OneToMany(mappedBy = "webUser")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JSONField(serialize=false)
    @JsonIgnore
    private Set<OnlineWebUser> onlineWebUsers = new HashSet<>();

    /**
     * （前端更新时，只需传ID）角色
     */
    @ApiModelProperty(value = "（前端更新时，只需传ID）角色")
    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties("webUsers")
    private SysRole role;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public WebUser login(String login) {
        this.login = login;
        return this;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public WebUser name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public WebUser passwd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public WebUserStatus getStatus() {
        return status;
    }

    public WebUser status(WebUserStatus status) {
        this.status = status;
        return this;
    }

    public void setStatus(WebUserStatus status) {
        this.status = status;
    }

    public String getSex() {
        return sex;
    }

    public WebUser sex(String sex) {
        this.sex = sex;
        return this;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public WebUser enterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getDepartment() {
        return department;
    }

    public WebUser department(String department) {
        this.department = department;
        return this;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public WebUser position(String position) {
        this.position = position;
        return this;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public WebUser birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public WebUser phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public WebUser remark(String remark) {
        this.remark = remark;
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Instant getCtime() {
        return ctime;
    }

    public WebUser ctime(Instant ctime) {
        this.ctime = ctime;
        return this;
    }

    public void setCtime(Instant ctime) {
        this.ctime = ctime;
    }

    public String getCreator() {
        return creator;
    }

    public WebUser creator(String creator) {
        this.creator = creator;
        return this;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Instant getUpTime() {
        return upTime;
    }

    public WebUser upTime(Instant upTime) {
        this.upTime = upTime;
        return this;
    }

    public void setUpTime(Instant upTime) {
        this.upTime = upTime;
    }

    public String getModifier() {
        return modifier;
    }

    public WebUser modifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Boolean isDelFlag() {
        return delFlag;
    }

    public WebUser delFlag(Boolean delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Set<OnlineWebUser> getOnlineWebUsers() {
        return onlineWebUsers;
    }

    public WebUser onlineWebUsers(Set<OnlineWebUser> onlineWebUsers) {
        this.onlineWebUsers = onlineWebUsers;
        return this;
    }

    public WebUser addOnlineWebUser(OnlineWebUser onlineWebUser) {
        this.onlineWebUsers.add(onlineWebUser);
        onlineWebUser.setWebUser(this);
        return this;
    }

    public WebUser removeOnlineWebUser(OnlineWebUser onlineWebUser) {
        this.onlineWebUsers.remove(onlineWebUser);
        onlineWebUser.setWebUser(null);
        return this;
    }

    public void setOnlineWebUsers(Set<OnlineWebUser> onlineWebUsers) {
        this.onlineWebUsers = onlineWebUsers;
    }

    public SysRole getRole() {
        return role;
    }

    public WebUser role(SysRole sysRole) {
        this.role = sysRole;
        return this;
    }

    public void setRole(SysRole sysRole) {
        this.role = sysRole;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebUser)) {
            return false;
        }
        return id != null && id.equals(((WebUser) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "WebUser{" +
            "id=" + getId() +
            ", login='" + getLogin() + "'" +
            ", name='" + getName() + "'" +
            ", passwd='" + getPasswd() + "'" +
            ", status='" + getStatus() + "'" +
            ", sex='" + getSex() + "'" +
            ", enterprise='" + getEnterprise() + "'" +
            ", department='" + getDepartment() + "'" +
            ", position='" + getPosition() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", phone='" + getPhone() + "'" +
            ", remark='" + getRemark() + "'" +
            ", ctime='" + getCtime() + "'" +
            ", creator='" + getCreator() + "'" +
            ", upTime='" + getUpTime() + "'" +
            ", modifier='" + getModifier() + "'" +
            ", delFlag='" + isDelFlag() + "'" +
            "}";
    }
}
