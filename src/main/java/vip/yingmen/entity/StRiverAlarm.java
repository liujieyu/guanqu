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
 * @since 2020-07-07
 */
@TableName("ST_RIVER_Alarm")
public class StRiverAlarm extends Model<StRiverAlarm> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "ROWID")
    private Integer rowid;

    @JSONField(name = "STNM")
    private String stnm;

    @JSONField(name = "STCD")
    private String stcd;

    @JSONField(name = "AWL")
    private Double awl;

    @JSONField(name = "BZWL")
    private Double bzwl;

    @JSONField(name = "SJWL")
    private Double sjwl;

    @JSONField(name = "XHWL")
    private Double xhwl;

    @JSONField(name = "JYWL")
    private Double jywl;

    @JSONField(name = "MEMO")
    private String memo;

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

    public String getStnm() {
        return stnm;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public Double getAwl() {
        return awl;
    }

    public void setAwl(Double awl) {
        this.awl = awl;
    }

    public Double getBzwl() {
        return bzwl;
    }

    public void setBzwl(Double bzwl) {
        this.bzwl = bzwl;
    }

    public Double getSjwl() {
        return sjwl;
    }

    public void setSjwl(Double sjwl) {
        this.sjwl = sjwl;
    }

    public Double getXhwl() {
        return xhwl;
    }

    public void setXhwl(Double xhwl) {
        this.xhwl = xhwl;
    }

    public Double getJywl() {
        return jywl;
    }

    public void setJywl(Double jywl) {
        this.jywl = jywl;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
