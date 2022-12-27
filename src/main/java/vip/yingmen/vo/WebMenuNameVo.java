package vip.yingmen.vo;
import java.io.Serializable;

import vip.yingmen.domain.WebMenu;

public class WebMenuNameVo implements Serializable {

    private static final long serialVersionUID = 1L;

    public Long id;

    
    public String name;


    public static  WebMenuNameVo  getInstance(WebMenu webMenu) {
    	WebMenuNameVo vo = new WebMenuNameVo();
    	vo.id = webMenu.getId();
    	vo.name = webMenu.getName();
    	return vo;
    }

}
