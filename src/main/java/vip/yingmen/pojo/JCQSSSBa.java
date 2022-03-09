/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCQSSSBa
 * Author:   user
 * Date:     2019/8/8 11:58
 * Description: 基础数据的取水设施的坝信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的取水设施的坝信息〉
 *
 * @author user
 * @create 2019/8/8
 * @since 1.0.0
 */
public class JCQSSSBa {
    private String damType;
    private String damGrade;
    private String damName;
    private String structureType;
    private String damHeight;
    private String standardFc;

    @JSONField(name = "Dam_Type")
    public String getDamType() {
        return damType;
    }

    public void setDamType(String damType) {
        this.damType = damType;
    }

    @JSONField(name = "Dam_Grade")
    public String getDamGrade() {
        return damGrade;
    }

    public void setDamGrade(String damGrade) {
        this.damGrade = damGrade;
    }

    @JSONField(name = "Dam_Name")
    public String getDamName() {
        return damName;
    }

    public void setDamName(String damName) {
        this.damName = damName;
    }

    @JSONField(name = "Structure_Type")
    public String getStructureType() {
        return structureType;
    }

    public void setStructureType(String structureType) {
        this.structureType = structureType;
    }

    @JSONField(name = "Dam_Height")
    public String getDamHeight() {
        return damHeight;
    }

    public void setDamHeight(String damHeight) {
        this.damHeight = damHeight;
    }

    @JSONField(name = "Standard_FC")
    public String getStandardFc() {
        return standardFc;
    }

    public void setStandardFc(String standardFc) {
        this.standardFc = standardFc;
    }
}