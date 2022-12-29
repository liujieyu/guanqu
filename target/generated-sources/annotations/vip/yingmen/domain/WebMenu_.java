package vip.yingmen.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WebMenu.class)
public abstract class WebMenu_ {

	public static volatile SingularAttribute<WebMenu, String> creator;
	public static volatile SingularAttribute<WebMenu, String> modifier;
	public static volatile SingularAttribute<WebMenu, WebMenu> father;
	public static volatile SingularAttribute<WebMenu, String> icon;
	public static volatile SingularAttribute<WebMenu, Integer> index;
	public static volatile SingularAttribute<WebMenu, String> remark;
	public static volatile SingularAttribute<WebMenu, String> type;
	public static volatile SingularAttribute<WebMenu, Boolean> delFlag;
	public static volatile SingularAttribute<WebMenu, String> url;
	public static volatile SingularAttribute<WebMenu, Instant> upTime;
	public static volatile SetAttribute<WebMenu, WebMenu> children;
	public static volatile SingularAttribute<WebMenu, String> name;
	public static volatile SingularAttribute<WebMenu, Instant> ctime;
	public static volatile SingularAttribute<WebMenu, Long> id;
	public static volatile SetAttribute<WebMenu, SysRole> sysRoles;

	public static final String CREATOR = "creator";
	public static final String MODIFIER = "modifier";
	public static final String FATHER = "father";
	public static final String ICON = "icon";
	public static final String INDEX = "index";
	public static final String REMARK = "remark";
	public static final String TYPE = "type";
	public static final String DEL_FLAG = "delFlag";
	public static final String URL = "url";
	public static final String UP_TIME = "upTime";
	public static final String CHILDREN = "children";
	public static final String NAME = "name";
	public static final String CTIME = "ctime";
	public static final String ID = "id";
	public static final String SYS_ROLES = "sysRoles";

}

