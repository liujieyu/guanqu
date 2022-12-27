package vip.yingmen.model;

import vip.yingmen.domain.SysRole;
import vip.yingmen.domain.WebUser;
import vip.yingmen.template.BeanCopierMapper;

public class WebUserFactory {
	public static WebUser getNewWebUser(WebUser webUser) {
		WebUser newWebUser = BeanCopierMapper.copyObject(webUser, WebUser.class);
		newWebUser.role(BeanCopierMapper.copyObject(webUser.getRole(), SysRole.class));
		return newWebUser;
	}
}
