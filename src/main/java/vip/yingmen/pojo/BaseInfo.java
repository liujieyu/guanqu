package vip.yingmen.pojo;

import java.io.Serializable;

/**
 * http://v3.yingmen.vip/guanqu/gis/system_info 的json
 */

public class BaseInfo implements Serializable {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
