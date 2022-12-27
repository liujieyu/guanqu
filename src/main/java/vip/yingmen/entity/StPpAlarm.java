package vip.yingmen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p>
 * 
 * </p>
 *
 * @author liujieyu
 * @since 2020-06-29
 */
@TableName("ST_PP_Alarm")
public class StPpAlarm extends Model<StPpAlarm> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "ROWID")
    private Integer rowid;

    @JSONField(name = "STNM")
    private String stnm;

    @JSONField(name = "STCD")
    private String stcd;

    @JSONField(name = "EWL")
    private Integer ewl;

    @JSONField(name = "EWLNAME")
    private String ewlname;

    @JSONField(name = "PTD_P")
    private Double ptdP;

    @JSONField(name = "OH_P")
    private Double ohP;

    @JSONField(name = "TH_P")
    private Double thP;

    @JSONField(name = "SH_P")
    private Double shP;

    @JSONField(name = "TWH_P")
    private Double twhP;

    @JSONField(name = "OD_P")
    private Double odP;

    @JSONField(name = "MEMO")
    private String memo;
    @JSONField(name = "STLC")
    private String stlc;

    public Integer getId() {
        return id;
    }

    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
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

    public Integer getEwl() {
        return ewl;
    }

    public void setEwl(Integer ewl) {
        this.ewl = ewl;
    }

    public String getEwlname() {
        return ewlname;
    }

    public void setEwlname(String ewlname) {
        this.ewlname = ewlname;
    }

    public Double getPtdP() {
        return ptdP;
    }

    public void setPtdP(Double ptdP) {
        this.ptdP = ptdP;
    }

    public Double getOhP() {
        return ohP;
    }

    public void setOhP(Double ohP) {
        this.ohP = ohP;
    }

    public Double getThP() {
        return thP;
    }

    public void setThP(Double thP) {
        this.thP = thP;
    }

    public Double getShP() {
        return shP;
    }

    public void setShP(Double shP) {
        this.shP = shP;
    }

    public Double getTwhP() {
        return twhP;
    }

    public void setTwhP(Double twhP) {
        this.twhP = twhP;
    }

    public Double getOdP() {
        return odP;
    }

    public void setOdP(Double odP) {
        this.odP = odP;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getStlc() {
        return stlc;
    }

    public void setStlc(String stlc) {
        this.stlc = stlc;
    }
}
