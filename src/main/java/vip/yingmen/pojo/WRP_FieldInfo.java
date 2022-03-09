package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *基础数据灵活字段表
 * 描述基础数据灵活字段。
 */
public class WRP_FieldInfo {
    private Integer ID;
    private String FormANDFieldID;
    private String FormID;
    private String FieldID;
    private String Field;
    private String FieldName;

    @JSONField(name = "ID")
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @JSONField(name = "FormANDFieldID")
    public String getFormANDFieldID() {
        return FormANDFieldID;
    }

    public void setFormANDFieldID(String formANDFieldID) {
        FormANDFieldID = formANDFieldID;
    }

    @JSONField(name = "FormID")
    public String getFormID() {
        return FormID;
    }

    public void setFormID(String formID) {
        FormID = formID;
    }
    @JSONField(name = "FieldID")
    public String getFieldID() {
        return FieldID;
    }

    public void setFieldID(String fieldID) {
        FieldID = fieldID;
    }

    @JSONField(name = "Field")
    public String getField() {
        return Field;
    }

    public void setField(String field) {
        Field = field;
    }

    @JSONField(name = "FieldName")
    public String getFieldName() {
        return FieldName;
    }

    public void setFieldName(String fieldName) {
        FieldName = fieldName;
    }
}
