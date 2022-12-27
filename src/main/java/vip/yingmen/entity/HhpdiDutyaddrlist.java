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
 * @since 2020-01-16
 */
@TableName("HHPDI_DutyAddrList")
public class HhpdiDutyaddrlist extends Model<HhpdiDutyaddrlist> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "ROWID")
    private Integer rowid;

    @JSONField(name = "YR")
    private Integer yr;

    @JSONField(name = "NM")
    private String nm;

    @JSONField(name = "UNIT")
    private String unit;

    @JSONField(name = "POSITION")
    private String position;

    @JSONField(name = "DUTYTYPE")
    private Integer dutytype;

    @JSONField(name = "TYPENAME")
    private String typename;

    @JSONField(name = "MOBILE")
    private String mobile;

    @JSONField(name = "OPHONE")
    private String ophone;

    @JSONField(name = "WZPX")
    private Integer wzpx;

    @JSONField(name = "Memo")
    private String Memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }

    public Integer getYr() {
        return yr;
    }

    public void setYr(Integer yr) {
        this.yr = yr;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getDutytype() {
        return dutytype;
    }

    public void setDutytype(Integer dutytype) {
        this.dutytype = dutytype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone;
    }

    public Integer getWzpx() {
        return wzpx;
    }

    public void setWzpx(Integer wzpx) {
        this.wzpx = wzpx;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
