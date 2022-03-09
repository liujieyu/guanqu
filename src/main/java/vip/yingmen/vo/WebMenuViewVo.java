package vip.yingmen.vo;
import java.util.List;

import com.google.common.collect.Lists;

import vip.yingmen.domain.WebMenu;

public class WebMenuViewVo {

	public WebMenu webMenu;
	
	public List<WebMenuNameVo> fatherList = Lists.newArrayList();
	
	public static WebMenuViewVo getInstance(WebMenu webMenu) {
		 WebMenuViewVo webMenuViewVo = new WebMenuViewVo();
     	 webMenuViewVo.webMenu = webMenu;
     	 setWebMenuViewFather(webMenuViewVo,webMenu.getFather());
     	 return webMenuViewVo;
	}
	
	public static void setWebMenuViewFather(WebMenuViewVo webMenuViewVo, WebMenu father) {
		if (father == null) {
			return ;
		}
		webMenuViewVo.fatherList.add(0, WebMenuNameVo.getInstance(father));
		setWebMenuViewFather(webMenuViewVo, father.getFather());
	}
	
}
