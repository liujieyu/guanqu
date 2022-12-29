package vip.yingmen.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import vip.yingmen.domain.enumeration.WebUserStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WebUser.class)
public abstract class WebUser_ {

	public static volatile SingularAttribute<WebUser, LocalDate> birthday;
	public static volatile SingularAttribute<WebUser, String> creator;
	public static volatile SingularAttribute<WebUser, SysRole> role;
	public static volatile SingularAttribute<WebUser, String> enterprise;
	public static volatile SingularAttribute<WebUser, String> sex;
	public static volatile SingularAttribute<WebUser, String> modifier;
	public static volatile SingularAttribute<WebUser, String> remark;
	public static volatile SingularAttribute<WebUser, String> login;
	public static volatile SingularAttribute<WebUser, Boolean> delFlag;
	public static volatile SingularAttribute<WebUser, Instant> upTime;
	public static volatile SingularAttribute<WebUser, String> passwd;
	public static volatile SingularAttribute<WebUser, String> phone;
	public static volatile SingularAttribute<WebUser, String> name;
	public static volatile SingularAttribute<WebUser, Instant> ctime;
	public static volatile SetAttribute<WebUser, OnlineWebUser> onlineWebUsers;
	public static volatile SingularAttribute<WebUser, Long> id;
	public static volatile SingularAttribute<WebUser, String> position;
	public static volatile SingularAttribute<WebUser, String> department;
	public static volatile SingularAttribute<WebUser, WebUserStatus> status;

	public static final String BIRTHDAY = "birthday";
	public static final String CREATOR = "creator";
	public static final String ROLE = "role";
	public static final String ENTERPRISE = "enterprise";
	public static final String SEX = "sex";
	public static final String MODIFIER = "modifier";
	public static final String REMARK = "remark";
	public static final String LOGIN = "login";
	public static final String DEL_FLAG = "delFlag";
	public static final String UP_TIME = "upTime";
	public static final String PASSWD = "passwd";
	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String CTIME = "ctime";
	public static final String ONLINE_WEB_USERS = "onlineWebUsers";
	public static final String ID = "id";
	public static final String POSITION = "position";
	public static final String DEPARTMENT = "department";
	public static final String STATUS = "status";

}

