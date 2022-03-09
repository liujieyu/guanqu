/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcyshNonYeYongShui
 * Author:   dabindream
 * Description: 基础数据的用水户的用水户信息
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的用水户的用水户信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public class JcyshNonYeYongShui {
    private String cellName;
    private String totalArea;
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

    @JSONField(name = "TotalArea")
    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea;
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