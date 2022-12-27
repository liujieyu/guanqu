package vip.yingmen.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class StNeedwaterPlan extends Model<StNeedwaterPlan> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "STCD")
    private String stcd;

    @JSONField(name = "STNM")
    private String stnm;

    @JSONField(name = "CANAL_CODE")
    private String canalCode;

    @JSONField(name = "CANAL_NANME")
    private String canalName;

    @JSONField(name = "YR")
    private Integer yr;

    @JSONField(name = "ONE")
    private Double one;

    @JSONField(name = "TWO")
    private Double two;

    @JSONField(name = "THREE")
    private Double three;

    @JSONField(name = "FOUR")
    private Double four;

    @JSONField(name = "FIVE")
    private Double five;

    @JSONField(name = "SIX")
    private Double six;

    @JSONField(name = "SEVEN")
    private Double seven;

    @JSONField(name = "EIGHT")
    private Double eight;

    @JSONField(name = "NINE")
    private Double nine;

    @JSONField(name = "TEN")
    private Double ten;

    @JSONField(name = "ELEVEN")
    private Double eleven;

    @JSONField(name = "TWELVE")
    private Double twelve;

    @JSONField(name = "SUMW")
    private Double sumw;

    @JSONField(name = "UP_MAN")
    private String upMan;

    @JSONField(name = "UP_DT")
    private Date upDt;

    @JSONField(name = "AU_MAN")
    private String auMan;

    @JSONField(name = "AU_DT")
    private Date auDt;

    @JSONField(name = "MEMO")
    private String memo;

    @JSONField(name = "ORGAN_CODE")
    private String organCode;

    @JSONField(name = "ORGAN_NAME")
    private String organName;

    @JSONField(name = "children")
    private List<StNeedwaterPlan> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCanalName() {
        return canalName;
    }

    public void setCanalName(String canalName) {
        this.canalName = canalName;
    }

    public Integer getYr() {
        return yr;
    }

    public void setYr(Integer yr) {
        this.yr = yr;
    }

    public Double getOne() {
        return one;
    }

    public void setOne(Double one) {
        this.one = one;
    }

    public Double getTwo() {
        return two;
    }

    public void setTwo(Double two) {
        this.two = two;
    }

    public Double getThree() {
        return three;
    }

    public void setThree(Double three) {
        this.three = three;
    }

    public Double getFour() {
        return four;
    }

    public void setFour(Double four) {
        this.four = four;
    }

    public Double getFive() {
        return five;
    }

    public void setFive(Double five) {
        this.five = five;
    }

    public Double getSix() {
        return six;
    }

    public void setSix(Double six) {
        this.six = six;
    }

    public Double getSeven() {
        return seven;
    }

    public void setSeven(Double seven) {
        this.seven = seven;
    }

    public Double getEight() {
        return eight;
    }

    public void setEight(Double eight) {
        this.eight = eight;
    }

    public Double getNine() {
        return nine;
    }

    public void setNine(Double nine) {
        this.nine = nine;
    }

    public Double getTen() {
        return ten;
    }

    public void setTen(Double ten) {
        this.ten = ten;
    }

    public Double getEleven() {
        return eleven;
    }

    public void setEleven(Double eleven) {
        this.eleven = eleven;
    }

    public Double getTwelve() {
        return twelve;
    }

    public void setTwelve(Double twelve) {
        this.twelve = twelve;
    }

    public Double getSumw() {
        return sumw;
    }

    public void setSumw(Double sumw) {
        BigDecimal b = new BigDecimal(sumw);
        this.sumw = b.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public String getUpMan() {
        return upMan;
    }

    public void setUpMan(String upMan) {
        this.upMan = upMan;
    }

    public Date getUpDt() {
        return upDt;
    }

    public void setUpDt(Date upDt) {
        this.upDt = upDt;
    }

    public String getAuMan() {
        return auMan;
    }

    public void setAuMan(String auMan) {
        this.auMan = auMan;
    }

    public Date getAuDt() {
        return auDt;
    }

    public void setAuDt(Date auDt) {
        this.auDt = auDt;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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

    public List<StNeedwaterPlan> getChildren() {
        return children;
    }

    public void setChildren(List<StNeedwaterPlan> children) {
        this.children = children;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
