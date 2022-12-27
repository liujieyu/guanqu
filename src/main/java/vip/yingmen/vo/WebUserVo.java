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
import vip.yingmen.domain.WebUser;
import vip.yingmen.domain.enumeration.WebUserStatus;
import vip.yingmen.template.BeanCopierMapper;

/**
 * Web账号
 */
@ApiModel(description = "Web账号")
public class WebUserVo implements Serializable {
    public static WebUserVo getInstance(WebUser entity) {
		return  BeanCopierMapper.copyObject(entity, WebUserVo.class);
	}
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

    public WebUserVo login(String login) {
        this.login = login;
        return this;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public WebUserVo name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public WebUserVo passwd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public WebUserStatus getStatus() {
        return status;
    }

    public WebUserVo status(WebUserStatus status) {
        this.status = status;
        return this;
    }

    public void setStatus(WebUserStatus status) {
        this.status = status;
    }

    public String getSex() {
        return sex;
    }

    public WebUserVo sex(String sex) {
        this.sex = sex;
        return this;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public WebUserVo enterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getDepartment() {
        return department;
    }

    public WebUserVo department(String department) {
        this.department = department;
        return this;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public WebUserVo position(String position) {
        this.position = position;
        return this;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public WebUserVo birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public WebUserVo phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public WebUserVo remark(String remark) {
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
        if (!(o instanceof WebUserVo)) {
            return false;
        }
        return id != null && id.equals(((WebUserVo) o).id);
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
            "}";
    }
    

}
