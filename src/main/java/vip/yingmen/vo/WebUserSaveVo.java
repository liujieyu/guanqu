package vip.yingmen.vo;
import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import vip.yingmen.domain.enumeration.WebUserStatus;

/**
 * Web账号
 */
@ApiModel(description = "Web账号-保存VO")
public class WebUserSaveVo implements Serializable {

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
    
    @NotNull
    @ApiModelProperty(value = "确认密码", required = true)
    private String confirmPasswd;



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
     * （前端更新时，只需传ID）角色
     */
    @ApiModelProperty(value = "（前端更新时，只需传ID）角色", required = true)
    @NotNull
    private Long roleId;

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

    public WebUserSaveVo login(String login) {
        this.login = login;
        return this;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public WebUserSaveVo name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public WebUserSaveVo passwd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getConfirmPasswd() {
		return confirmPasswd;
	}

	public void setConfirmPasswd(String confirmPasswd) {
		this.confirmPasswd = confirmPasswd;
	}
    public WebUserStatus getStatus() {
        return status;
    }

    public WebUserSaveVo status(WebUserStatus status) {
        this.status = status;
        return this;
    }

    public void setStatus(WebUserStatus status) {
        this.status = status;
    }

    public String getSex() {
        return sex;
    }

    public WebUserSaveVo sex(String sex) {
        this.sex = sex;
        return this;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public WebUserSaveVo enterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getDepartment() {
        return department;
    }

    public WebUserSaveVo department(String department) {
        this.department = department;
        return this;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public WebUserSaveVo position(String position) {
        this.position = position;
        return this;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public WebUserSaveVo birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public WebUserSaveVo phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public WebUserSaveVo remark(String remark) {
        this.remark = remark;
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WebUserSaveVo)) {
            return false;
        }
        return id != null && id.equals(((WebUserSaveVo) o).id);
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
            "}";
    }
}
