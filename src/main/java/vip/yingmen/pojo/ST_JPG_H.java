package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 图像历史表
 * 用于存储图像监测信息。
 */
public class ST_JPG_H {
    private String Save_Path;
    private String TM;

    @JSONField(name = "Save_Path")
    public String getSave_Path() {
        return Save_Path;
    }

    public void setSave_Path(String save_Path) {
        Save_Path = save_Path;
    }

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    public String getTM() {
        return TM;
    }

    public void setTM(String TM) {
        this.TM = TM;
    }
}
