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
 * @since 2019-10-10
 */
@TableName("ST_GATE_DD")
public class StGateDd extends Model<StGateDd> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "DLTYPE")
    private Integer dltype;

    @JSONField(name = "Z")
    private Double z;

    @JSONField(name = "DL_KD")
    private Double dlKd;

    @JSONField(name = "DL_Q")
    private Double dlQ;

    @JSONField(name = "XH_KD")
    private Double xhKd;

    @JSONField(name = "XH_Q")
    private Double xhQ;

    @JSONField(name = "SUM_Q")
    private Double sumQ;

    @JSONField(name = "DLKDNAME")
    private String dlkdname;

    @JSONField(name = "XHKDNAME")
    private String xhkdname;

    @JSONField(name = "ROWID")
    private Integer rowId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDltype() {
        return dltype;
    }

    public void setDltype(Integer dltype) {
        this.dltype = dltype;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getDlKd() {
        return dlKd;
    }

    public void setDlKd(Double dlKd) {
        this.dlKd = dlKd;
    }

    public Double getDlQ() {
        return dlQ;
    }

    public void setDlQ(Double dlQ) {
        this.dlQ = dlQ;
    }

    public Double getXhKd() {
        return xhKd;
    }

    public void setXhKd(Double xhKd) {
        this.xhKd = xhKd;
    }

    public Double getXhQ() {
        return xhQ;
    }

    public void setXhQ(Double xhQ) {
        this.xhQ = xhQ;
    }

    public Double getSumQ() {
        return sumQ;
    }

    public void setSumQ(Double sumQ) {
        this.sumQ = sumQ;
    }

    public String getDlkdname() {
        return dlkdname;
    }

    public void setDlkdname(String dlkdname) {
        this.dlkdname = dlkdname;
    }

    public String getXhkdname() {
        return xhkdname;
    }

    public void setXhkdname(String xhkdname) {
        this.xhkdname = xhkdname;
    }

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
