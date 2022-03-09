package vip.yingmen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author sa
 * @since 2019-09-17
 */
@TableName("ST_HP_C")
public class StHpC extends Model<StHpC> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "STNM")
    private String stnm;

    @JSONField(name = "STCD")
    private String stcd;

    @JSONField(name = "DT")
    private Date dt;

    @JSONField(name = "TM")
    private Integer tm;

    @JSONField(name = "P")
    private Double p;

    @JSONField(name = "PRCD")
    private String prcd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Integer getTm() {
        return tm;
    }

    public void setTm(Integer tm) {
        this.tm = tm;
    }

    public Double getP() {
        return p;
    }

    public void setP(Double p) {
        this.p = p;
    }

    public String getPrcd() {
        return prcd;
    }

    public void setPrcd(String prcd) {
        this.prcd = prcd;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
