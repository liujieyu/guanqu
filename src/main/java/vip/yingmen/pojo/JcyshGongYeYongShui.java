/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcyshGongYeYongShui
 * Author:   dabindream
 * Description: 基础数据的用水户的农业用户单位信息
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的用水户的农业用户单位信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public class JcyshGongYeYongShui {
    private String cellName;
    private String idnm;
    private String yield;
    private String quota;
    private String adnm;
    private String canalName;
    private String gs;

    @JSONField(name = "Cell_Name")
    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    @JSONField(name = "ID_NM")
    public String getIdnm() {
        return idnm;
    }

    public void setIdnm(String idnm) {
        this.idnm = idnm;
    }

    @JSONField(name = "Yield")
    public String getYield() {
        return yield;
    }

    public void setYield(String yield) {
        this.yield = yield;
    }

    @JSONField(name = "Quota")
    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    @JSONField(name = "AD_NM")
    public String getAdnm() {
        return adnm;
    }

    public void setAdnm(String adnm) {
        this.adnm = adnm;
    }

    @JSONField(name = "Canal_Name")
    public String getCanalName() {
        return canalName;
    }

    public void setCanalName(String canalName) {
        this.canalName = canalName;
    }

    @JSONField(name = "GS")
    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }
}