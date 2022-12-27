package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *行政区划表
 * 本表存储国家、省、市、县、乡、村六级行政区划信息。
 */
public class WRP_AD_B implements Serializable {
    private int ID;             //序号自增
    private String AD_CD;       //行政区划编码 主键
    private String AD_NM;       //行政区划名称
    private Integer AD_LV;      //等级
    private String UP_ADCD;      //上级区划编码
    private String AD_SHNM;     //行政区划简称
    private BigDecimal AD_A;    //行政区划面积
    private Date TS;            //时间戳
    private String MEMO;        //备注

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @JSONField(name = "AD_CD")
    public String getAD_CD() {
        return AD_CD;
    }

    public void setAD_CD(String AD_CD) {
        this.AD_CD = AD_CD;
    }

    @JSONField(name = "AD_NM")
    public String getAD_NM() {
        return AD_NM;
    }

    public void setAD_NM(String AD_NM) {
        this.AD_NM = AD_NM;
    }

    @JSONField(name = "AD_LV")
    public Integer getAD_LV() {
        return AD_LV;
    }

    public void setAD_LV(Integer AD_LV) {
        this.AD_LV = AD_LV;
    }

    @JSONField(name = "AD_SHNM")
    public String getAD_SHNM() {
        return AD_SHNM;
    }

    public void setAD_SHNM(String AD_SHNM) {
        this.AD_SHNM = AD_SHNM;
    }

    @JSONField(name = "AD_A")
    public BigDecimal getAD_A() {
        return AD_A;
    }

    public void setAD_A(BigDecimal AD_A) {
        this.AD_A = AD_A;
    }

    @JSONField(name = "TS")
    public Date getTS() {
        return TS;
    }

    public void setTS(Date TS) {
        this.TS = TS;
    }

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO;
    }

    @JSONField(name = "UP_ADCD")
    public String getUP_ADCD() {
        return UP_ADCD;
    }

    public void setUP_ADCD(String UP_ADCD) {
        this.UP_ADCD = UP_ADCD;
    }
}
