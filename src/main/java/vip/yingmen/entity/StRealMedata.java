package vip.yingmen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p>
 * 
 * </p>
 *
 * @author liujieyu
 * @since 2019-10-29
 */
@TableName("ST_REAL_MEDATA")
public class StRealMedata extends Model<StRealMedata> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "ME_CODE")
    private String meCode;

    @JSONField(name = "ME_TM")
    private Date meTm;

    @JSONField(name = "STCD")
    private String stcd;

    @JSONField(name = "STNM")
    private String stnm;

    @JSONField(name = "CANAL_CODE")
    private String canalCode;

    @JSONField(name = "Z")
    private Double z;

    @JSONField(name = "Q")
    private Double q;

    @JSONField(name = "MEMO")
    private String memo;

    @JSONField(name = "CANAL_NAME")
    private String canalName;

    @JSONField(name = "ME_TMSTR")
    private String meTmstr;

    @JSONField(name = "ROWID")
    private Integer rowId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeCode() {
        return meCode;
    }

    public void setMeCode(String meCode) {
        this.meCode = meCode;
    }

    public Date getMeTm() {
        return meTm;
    }

    public void setMeTm(Date meTm) {
        this.meTm = meTm;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public String getStnm() {
        return stnm;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm;
    }

    public String getCanalCode() {
        return canalCode;
    }

    public void setCanalCode(String canalCode) {
        this.canalCode = canalCode;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getQ() {
        return q;
    }

    public void setQ(Double q) {
        this.q = q;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getCanalName() {
        return canalName;
    }

    public void setCanalName(String canalName) {
        this.canalName = canalName;
    }

    public String getMeTmstr() {
        return meTmstr;
    }

    public void setMeTmstr(String meTmstr) {
        this.meTmstr = meTmstr;
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
