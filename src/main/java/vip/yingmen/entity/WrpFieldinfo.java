package vip.yingmen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liujieyu
 * @since 2019-09-20
 */
@TableName("WRP_FieldInfo")
public class WrpFieldinfo extends Model<WrpFieldinfo> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "FormANDFieldID")
    private String FormANDFieldID;

    @JSONField(name = "FormID")
    private String FormID;

    @JSONField(name = "FieldID")
    private String FieldID;

    @JSONField(name = "Field")
    private String Field;

    @JSONField(name = "FieldName")
    private String FieldName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormANDFieldID() {
        return FormANDFieldID;
    }

    public void setFormANDFieldID(String formANDFieldID) {
        FormANDFieldID = formANDFieldID;
    }

    public String getFormID() {
        return FormID;
    }

    public void setFormID(String formID) {
        FormID = formID;
    }

    public String getFieldID() {
        return FieldID;
    }

    public void setFieldID(String fieldID) {
        FieldID = fieldID;
    }

    public String getField() {
        return Field;
    }

    public void setField(String field) {
        Field = field;
    }

    public String getFieldName() {
        return FieldName;
    }

    public void setFieldName(String fieldName) {
        FieldName = fieldName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
