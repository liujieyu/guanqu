package vip.yingmen.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SysRole.class)
public abstract class SysRole_ {

	public static volatile SingularAttribute<SysRole, Instant> upTime;
	public static volatile SingularAttribute<SysRole, String> creator;
	public static volatile SingularAttribute<SysRole, String> grade;
	public static volatile SingularAttribute<SysRole, String> modifier;
	public static volatile SingularAttribute<SysRole, String> name;
	public static volatile SetAttribute<SysRole, WebMenu> webMenus;
	public static volatile SingularAttribute<SysRole, String> description;
	public static volatile SingularAttribute<SysRole, Instant> ctime;
	public static volatile SingularAttribute<SysRole, String> remark;
	public static volatile SingularAttribute<SysRole, Long> id;
	public static volatile SetAttribute<SysRole, WebUser> webUsers;
	public static volatile SingularAttribute<SysRole, Boolean> delFlag;

	public static final String UP_TIME = "upTime";
	public static final String CREATOR = "creator";
	public static final String GRADE = "grade";
	public static final String MODIFIER = "modifier";
	public static final String NAME = "name";
	public static final String WEB_MENUS = "webMenus";
	public static final String DESCRIPTION = "description";
	public static final String CTIME = "ctime";
	public static final String REMARK = "remark";
	public static final String ID = "id";
	public static final String WEB_USERS = "webUsers";
	public static final String DEL_FLAG = "delFlag";

}

