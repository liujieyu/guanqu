/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcXingZhengDanWei
 * Author:   dabindream
 * Description: 基础数据的行政单位
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的行政单位〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public class JcXingZhengDanWei {
    private String adnm;
    private String adlv;
    private String area;
    private String upadcd;

    @JSONField(name = "AD_NM")
    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    @JSONField(name = "AD_LV")
    public String getAdlv() {
        return adlv;
    }

    public void setAdlv(String adlv) {
        this.adlv = adlv;
    }

    @JSONField(name = "Area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @JSONField(name = "UP_ADCD")
    public String getUpadcd() {
        return upadcd;
    }

    public void setUpadcd(String upadcd) {
        this.upadcd = upadcd;
    }
}