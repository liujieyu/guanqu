package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 水库站基本信息
 * </p>
 *
 * @author liujieyu
 * @since 2022-12-26
 */
public class StRsrBsin implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;         //主键ID

    private String stcd;        //测站编码

    private String rtunm;       //测站名称

    private String rvcd;        //河流名称

    private String hnnm;        //水系名称

    private String ctcd;        //流域名称

    private String lgtd1;       //经度

    private String lttd1;       //纬度

    private String stlc;        //站址

    private String addvcd;      //行政区划码

    private String dtmnm;       //基面名称

    private String dtmel;       //基面高程

    private String dtpr;        //基面修正值

    private String sttp;        //站类

    private String frgrd;       //报汛等级

    private String drna;        //集水面积

    private String phcd;        //拼音码

    private String usfl;        //启用标志

    private String comments;    //备注

    private String addtime;     //创建时间

    private String dtuptm;      //更新时间

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

    public String getRtunm() {
        return rtunm;
    }

    public void setRtunm(String rtunm) {
        this.rtunm = rtunm;
    }

    public String getRvcd() {
        return rvcd;
    }

    public void setRvcd(String rvcd) {
        this.rvcd = rvcd;
    }

    public String getHnnm() {
        return hnnm;
    }

    public void setHnnm(String hnnm) {
        this.hnnm = hnnm;
    }

    public String getCtcd() {
        return ctcd;
    }

    public void setCtcd(String ctcd) {
        this.ctcd = ctcd;
    }

    public String getLgtd1() {
        return lgtd1;
    }

    public void setLgtd1(String lgtd1) {
        this.lgtd1 = lgtd1;
    }

    public String getLttd1() {
        return lttd1;
    }

    public void setLttd1(String lttd1) {
        this.lttd1 = lttd1;
    }

    public String getStlc() {
        return stlc;
    }

    public void setStlc(String stlc) {
        this.stlc = stlc;
    }

    public String getAddvcd() {
        return addvcd;
    }

    public void setAddvcd(String addvcd) {
        this.addvcd = addvcd;
    }

    public String getDtmnm() {
        return dtmnm;
    }

    public void setDtmnm(String dtmnm) {
        this.dtmnm = dtmnm;
    }

    public String getDtmel() {
        return dtmel;
    }

    public void setDtmel(String dtmel) {
        this.dtmel = dtmel;
    }

    public String getDtpr() {
        return dtpr;
    }

    public void setDtpr(String dtpr) {
        this.dtpr = dtpr;
    }

    public String getSttp() {
        return sttp;
    }

    public void setSttp(String sttp) {
        this.sttp = sttp;
    }

    public String getFrgrd() {
        return frgrd;
    }

    public void setFrgrd(String frgrd) {
        this.frgrd = frgrd;
    }

    public String getDrna() {
        return drna;
    }

    public void setDrna(String drna) {
        this.drna = drna;
    }

    public String getPhcd() {
        return phcd;
    }

    public void setPhcd(String phcd) {
        this.phcd = phcd;
    }

    public String getUsfl() {
        return usfl;
    }

    public void setUsfl(String usfl) {
        this.usfl = usfl;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getDtuptm() {
        return dtuptm;
    }

    public void setDtuptm(String dtuptm) {
        this.dtuptm = dtuptm;
    }
}
