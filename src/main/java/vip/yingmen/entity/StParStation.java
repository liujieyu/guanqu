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
 * @since 2019-12-17
 */
@TableName("ST_PAR_STATION")
public class StParStation extends Model<StParStation> {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "ID")
    private Integer id;

    @JSONField(name = "STCD")
    private String stcd;

    @JSONField(name = "STNM")
    private String stnm;

    @JSONField(name = "CANAL_CODE")
    private String canalCode;

    @JSONField(name = "CANAL_NAME")
    private String canalName;

    @JSONField(name = "MODEL")
    private Integer model;

    @JSONField(name = "MODELNAME")
    private String modelname;

    @JSONField(name = "Z_MAX")
    private Double zMax;

    @JSONField(name = "Q_MAX")
    private Double qMax;

    @JSONField(name = "ROWID")
    private Integer rowid;

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

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public Double getzMax() {
        return zMax;
    }

    public void setzMax(Double zMax) {
        this.zMax = zMax;
    }

    public Double getqMax() {
        return qMax;
    }

    public void setqMax(Double qMax) {
        this.qMax = qMax;
    }

    public String getCanalName() {
        return canalName;
    }

    public void setCanalName(String canalName) {
        this.canalName = canalName;
    }

    public Integer getRowid() {
        return rowid;
    }

    public void setRowid(Integer rowid) {
        this.rowid = rowid;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
