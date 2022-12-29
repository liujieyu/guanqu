package vip.yingmen.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OnlineWebUser.class)
public abstract class OnlineWebUser_ {

	public static volatile SingularAttribute<OnlineWebUser, Instant> loginTime;
	public static volatile SingularAttribute<OnlineWebUser, WebUser> webUser;
	public static volatile SingularAttribute<OnlineWebUser, String> loginIp;
	public static volatile SingularAttribute<OnlineWebUser, String> browser;
	public static volatile SingularAttribute<OnlineWebUser, Long> id;
	public static volatile SingularAttribute<OnlineWebUser, Boolean> delFlag;

	public static final String LOGIN_TIME = "loginTime";
	public static final String WEB_USER = "webUser";
	public static final String LOGIN_IP = "loginIp";
	public static final String BROWSER = "browser";
	public static final String ID = "id";
	public static final String DEL_FLAG = "delFlag";

}

