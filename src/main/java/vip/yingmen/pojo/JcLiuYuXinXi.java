/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcLiuYuXinXi
 * Author:   dabindream
 * Description: 基础信息的流域信息
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础信息的流域信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public class JcLiuYuXinXi {
    private String ctnm;
    private String va;
    private String rk;
    private String gd;
    private String address;
    private String gs;

    @JSONField(name = "CTNM")
    public String getCtnm() {
        return ctnm;
    }

    public void setCtnm(String ctnm) {
        this.ctnm = ctnm;
    }

    @JSONField(name = "VA")
    public String getVa() {
        return va;
    }

    public void setVa(String va) {
        this.va = va;
    }

    @JSONField(name = "RK")
    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }

    @JSONField(name = "GD")
    public String getGd() {
        return gd;
    }

    public void setGd(String gd) {
        this.gd = gd;
    }

    @JSONField(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JSONField(name = "GS")
    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }
}