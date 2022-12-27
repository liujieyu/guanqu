package vip.yingmen.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liujieyu
 * @since 2019-10-12
 */
@TableName("WRP_MAN")
public class WrpMan extends Model<WrpMan> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "NM")
    private String nm;

    @JSONField(name = "TYPES")
    private Integer types;

    @JSONField(name = "MOBILE")
    private String mobile;

    @JSONField(name = "OPHONE")
    private String ophone;

    @JSONField(name = "UNIT")
    private String unit;

    @JSONField(name = "ZW")
    private String zw;

    @JSONField(name = "AD_CD")
    private String adCd;

    @JSONField(name = "AD_NM")
    private String adNm;

    @JSONField(name = "TS")
    private String ts;

    @JSONField(name = "WZPX")
    private Integer wzpx;

    @JSONField(name = "MEMO")
    private String memo;

    @JSONField(name = "GS")
    private String gs;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public Integer getTypes() {
        return types;
    }

    public void setTypes(Integer types) {
        this.types = types;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    public String getAdCd() {
        return adCd;
    }

    public void setAdCd(String adCd) {
        this.adCd = adCd;
    }

    public String getAdNm() {
        return adNm;
    }

    public void setAdNm(String adNm) {
        this.adNm = adNm;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public Integer getWzpx() {
        return wzpx;
    }

    public void setWzpx(Integer wzpx) {
        this.wzpx = wzpx;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }
}
