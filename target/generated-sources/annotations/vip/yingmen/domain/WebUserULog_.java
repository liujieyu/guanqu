package vip.yingmen.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WebUserULog.class)
public abstract class WebUserULog_ {

	public static volatile SingularAttribute<WebUserULog, WebUser> webUser;
	public static volatile SingularAttribute<WebUserULog, String> loginIp;
	public static volatile SingularAttribute<WebUserULog, String> browser;
	public static volatile SingularAttribute<WebUserULog, Long> id;
	public static volatile SingularAttribute<WebUserULog, Instant> time;
	public static volatile SingularAttribute<WebUserULog, String> type;
	public static volatile SingularAttribute<WebUserULog, String> content;

	public static final String WEB_USER = "webUser";
	public static final String LOGIN_IP = "loginIp";
	public static final String BROWSER = "browser";
	public static final String ID = "id";
	public static final String TIME = "time";
	public static final String TYPE = "type";
	public static final String CONTENT = "content";

}

