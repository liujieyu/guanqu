/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCQSSSBengZhan
 * Author:   user
 * Date:     2019/8/8 15:12
 * Description: 基础数据的取水设施的泵站信息实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的取水设施的泵站信息实体类〉
 *
 * @author user
 * @create 2019/8/8
 * @since 1.0.0
 */
public class JCQSSSBengZhan {
    private String idstnm;
    private String idsttp;
    private String inpw;
    private String inflw;
    private String unam;
    private String drar;
    private String irar;
    private String cPyr;
    private String adnm;

    @JSONField(name = "IDSTNM")
    public String getIdstnm() {
        return idstnm;
    }

    public void setIdstnm(String idstnm) {
        this.idstnm = idstnm;
    }

    @JSONField(name = "IDSTTP")
    public String getIdsttp() {
        return idsttp;
    }

    public void setIdsttp(String idsttp) {
        this.idsttp = idsttp;
    }

    @JSONField(name = "INPW")
    public String getInpw() {
        return inpw;
    }

    public void setInpw(String inpw) {
        this.inpw = inpw;
    }

    @JSONField(name = "INFLW")
    public String getInflw() {
        return inflw;
    }

    public void setInflw(String inflw) {
        this.inflw = inflw;
    }

    @JSONField(name = "UNAM")
    public String getUnam() {
        return unam;
    }

    public void setUnam(String unam) {
        this.unam = unam;
    }

    @JSONField(name = "DRAR")
    public String getDrar() {
        return drar;
    }

    public void setDrar(String drar) {
        this.drar = drar;
    }

    @JSONField(name = "IRAR")
    public String getIrar() {
        return irar;
    }

    public void setIrar(String irar) {
        this.irar = irar;
    }

    @JSONField(name = "CPYR")
    public String getcPyr() {
        return cPyr;
    }

    public void setcPyr(String cPyr) {
        this.cPyr = cPyr;
    }

    @JSONField(name = "AD_NM")
    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }
}