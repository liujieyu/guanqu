package vip.yingmen.domain;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * Web账号登录记录
 */
@ApiModel(description = "Web账号登录记录")
@Entity
@Table(name = "online_web_user")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OnlineWebUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    /**
     * 登录时间
     */
    @ApiModelProperty(value = "登录时间")
    @Column(name = "login_time")
    private Instant loginTime;

    /**
     * 登录IP
     */
    @ApiModelProperty(value = "登录IP")
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 浏览器
     */
    @ApiModelProperty(value = "浏览器")
    @Column(name = "browser")
    private String browser;

    /**
     * （前端忽略） 删除标记：  false(1) 正常  ，  true(0) 已删除
     */
    @ApiModelProperty(value = "（前端忽略） 删除标记：  false(0) 正常  ，  true(1)  已删除")
    @Column(name = "del_flag")
    private Boolean delFlag;

    /**
     * 账号信息
     */
    @ApiModelProperty(value = "账号信息")
    @ManyToOne
    @JsonIgnoreProperties("onlineWebUsers")
    @JSONField(serialzeFeatures = SerializerFeature.DisableCircularReferenceDetect)
    private WebUser webUser;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getLoginTime() {
        return loginTime;
    }

    public OnlineWebUser loginTime(Instant loginTime) {
        this.loginTime = loginTime;
        return this;
    }

    public void setLoginTime(Instant loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public OnlineWebUser loginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getBrowser() {
        return browser;
    }

    public OnlineWebUser browser(String browser) {
        this.browser = browser;
        return this;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public Boolean isDelFlag() {
        return delFlag;
    }

    public OnlineWebUser delFlag(Boolean delFlag) {
        this.delFlag = delFlag;
        return this;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public WebUser getWebUser() {
        return webUser;
    }

    public OnlineWebUser webUser(WebUser webUser) {
        this.webUser = webUser;
        return this;
    }

    public void setWebUser(WebUser webUser) {
        this.webUser = webUser;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OnlineWebUser)) {
            return false;
        }
        return id != null && id.equals(((OnlineWebUser) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "OnlineWebUser{" +
            "id=" + getId() +
            ", loginTime='" + getLoginTime() + "'" +
            ", loginIp='" + getLoginIp() + "'" +
            ", browser='" + getBrowser() + "'" +
            ", delFlag='" + isDelFlag() + "'" +
            "}";
    }
}
