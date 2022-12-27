package vip.yingmen.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * Web账号操作日志
 */
@ApiModel(description = "Web账号操作日志")
@Entity
@Table(name = "web_user_u_log")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class WebUserULog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    /**
     * 操作类型
     */
    @ApiModelProperty(value = "操作类型")
    @Column(name = "type")
    private String type;

    /**
     * 操作内容
     */
    @ApiModelProperty(value = "操作内容")
    @Lob
    @Column(name = "content")
    private String content;

    /**
     * 操作时间
     */
    @ApiModelProperty(value = "操作时间")
    @Column(name = "time")
    private Instant time;

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
     * 账号信息
     */
    @ApiModelProperty(value = "账号信息")
    @ManyToOne
    @JsonIgnoreProperties("webUserULogs")
    private WebUser webUser;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public WebUserULog type(String type) {
        this.type = type;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public WebUserULog content(String content) {
        this.content = content;
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getTime() {
        return time;
    }

    public WebUserULog time(Instant time) {
        this.time = time;
        return this;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public WebUserULog loginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getBrowser() {
        return browser;
    }

    public WebUserULog browser(String browser) {
        this.browser = browser;
        return this;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public WebUser getWebUser() {
        return webUser;
    }

    public WebUserULog webUser(WebUser webUser) {
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
        if (!(o instanceof WebUserULog)) {
            return false;
        }
        return id != null && id.equals(((WebUserULog) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "WebUserULog{" +
            "id=" + getId() +
            ", type='" + getType() + "'" +
            ", content='" + getContent() + "'" +
            ", time='" + getTime() + "'" +
            ", loginIp='" + getLoginIp() + "'" +
            ", browser='" + getBrowser() + "'" +
            "}";
    }
}
