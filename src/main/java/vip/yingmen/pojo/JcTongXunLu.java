/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcTongXunLu
 * Author:   dabindream
 * Description: 基础数据的通讯录
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的通讯录〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public class JcTongXunLu {
    private String nm;
    private String types;
    private String mobile;
    private String unit;
    private String zw;
    private String adnm;
    private String gs;

    @JSONField(name = "NM")
    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    @JSONField(name = "TYPES")
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    @JSONField(name = "MOBILE")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JSONField(name = "UNIT")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JSONField(name = "ZW")
    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    @JSONField(name = "AD_NM")
    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    @JSONField(name = "GS")
    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }
}