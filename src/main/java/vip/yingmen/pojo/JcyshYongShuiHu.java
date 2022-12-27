/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcyshYongShuiHu
 * Author:   dabindream
 * Description: 基础数据的用水户
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的用水户〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public class JcyshYongShuiHu {
    private String cellName;
    private String cellCode;
    private String cellType;
    private String gs;

    @JSONField(name = "Cell_Name")
    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    @JSONField(name = "Cell_Code")
    public String getCellCode() {
        return cellCode;
    }

    public void setCellCode(String cellCode) {
        this.cellCode = cellCode;
    }

    @JSONField(name = "Cell_Type")
    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }

    @JSONField(name = "GS")
    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }
}