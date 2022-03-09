package vip.yingmen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author liujieyu
 * @since 2019-12-10
 */
@TableName("WRP_IrrBSManageInstitution")
public class WrpIrrbsmanageinstitution extends Model<WrpIrrbsmanageinstitution> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "Organ_Code")
    private String organCode;

    @JSONField(name = "Organ_Name")
    private String organName;

    @JSONField(name = "TYPES")
    private Integer types;

    @JSONField(name = "CANAL_CODE")
    private String canalCode;

    @JSONField(name = "CANAL_NANME")
    private String canalName;

    @JSONField(name = "children")
    private List<WrpIrrbsmanageinstitution> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public Integer getTypes() {
        return types;
    }

    public void setTypes(Integer types) {
        this.types = types;
    }

    public String getCanalCode() {
        return canalCode;
    }

    public void setCanalCode(String canalCode) {
        this.canalCode = canalCode;
    }

    public String getCanalName() {
        return canalName;
    }

    public void setCanalName(String canalName) {
        this.canalName = canalName;
    }

    public List<WrpIrrbsmanageinstitution> getChildren() {
        return children;
    }

    public void setChildren(List<WrpIrrbsmanageinstitution> children) {
        this.children = children;
    }

    @Override
    protected Serializable pkVal() {
        return this.organCode;
    }

}
