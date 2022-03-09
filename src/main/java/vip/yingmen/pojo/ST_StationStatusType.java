package vip.yingmen.pojo;

import java.math.BigDecimal;

public class ST_StationStatusType {
    private Integer ID;
    private Integer VOLTYPE;
    private String VOLNM;
    private BigDecimal VOLMIN;
    private BigDecimal VOLMAX;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getVOLTYPE() {
        return VOLTYPE;
    }

    public void setVOLTYPE(Integer VOLTYPE) {
        this.VOLTYPE = VOLTYPE;
    }

    public String getVOLNM() {
        return VOLNM;
    }

    public void setVOLNM(String VOLNM) {
        this.VOLNM = VOLNM;
    }

    public BigDecimal getVOLMIN() {
        return VOLMIN;
    }

    public void setVOLMIN(BigDecimal VOLMIN) {
        this.VOLMIN = VOLMIN;
    }

    public BigDecimal getVOLMAX() {
        return VOLMAX;
    }

    public void setVOLMAX(BigDecimal VOLMAX) {
        this.VOLMAX = VOLMAX;
    }
}
