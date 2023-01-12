package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.math.BigDecimal;
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
@Data
@TableName("ST_RSR_BSIN")
public class StRsrBsin implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;         //主键ID
    @TableField("STCD")
    private String stcd;        //测站编码
    @TableField("RTUNM")
    private String rtunm;       //测站名称
    @TableField("RVCD")
    private String rvcd;        //河流名称
    @TableField("HNNM")
    private String hnnm;        //水系名称
    @TableField("CTCD")
    private String ctcd;        //流域名称
    @TableField("LGTD1")
    private BigDecimal lgtd1;       //经度
    @TableField("LTTD1")
    private BigDecimal lttd1;       //纬度
    @TableField("STLC")
    private String stlc;        //站址
    @TableField("ADDVCD")
    private String addvcd;      //行政区划码
    @TableField("DTMNM")
    private String dtmnm;       //基面名称
    @TableField("DTMEL")
    private BigDecimal dtmel;       //基面高程
    @TableField("DTPR")
    private BigDecimal dtpr;        //基面修正值
    @TableField("STTP")
    private String sttp;        //站类
    @TableField("FRGRD")
    private String frgrd;       //报汛等级
    @TableField("DRNA")
    private Integer drna;        //集水面积
    @TableField("PHCD")
    private String phcd;        //拼音码
    @TableField("USFL")
    private String usfl;        //启用标志
    @TableField("COMMENTS")
    private String comments;    //备注
    @TableField("ADDTIME")
    private String addtime;     //创建时间
    @TableField("DTUPTM")
    private String dtuptm;      //更新时间

    private String dlog;        //建设单位

    private String admauth;     //管理单位

    private String types;       //监控要素

    private String stgr;        //等级

    private String ystcd;       //用于编辑功能  修改站点编码  获取原站点编码

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

    public BigDecimal getLgtd1() {
        return lgtd1;
    }

    public void setLgtd1(BigDecimal lgtd1) {
        this.lgtd1 = lgtd1;
    }

    public BigDecimal getLttd1() {
        return lttd1;
    }

    public void setLttd1(BigDecimal lttd1) {
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

    public BigDecimal getDtmel() {
        return dtmel;
    }

    public void setDtmel(BigDecimal dtmel) {
        this.dtmel = dtmel;
    }

    public BigDecimal getDtpr() {
        return dtpr;
    }

    public void setDtpr(BigDecimal dtpr) {
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

    public Integer getDrna() {
        return drna;
    }

    public void setDrna(Integer drna) {
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

    public String getDlog() {
        return dlog;
    }

    public void setDlog(String dlog) {
        this.dlog = dlog;
    }

    public String getAdmauth() {
        return admauth;
    }

    public void setAdmauth(String admauth) {
        this.admauth = admauth;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getStgr() {
        return stgr;
    }

    public void setStgr(String stgr) {
        this.stgr = stgr;
    }

    public String getYstcd() {
        return ystcd;
    }

    public void setYstcd(String ystcd) {
        this.ystcd = ystcd;
    }
}
