package vip.yingmen.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 *流域基本信息表
 * 描述流域信息。
 */
@Data
public class WRP_LY_BSIN {
    private Integer ID;
    private String CTCD;
    private String CTNM;
    private String GS;
    private String IWSCD;
    private String OWSCD;
    private String Address;
    private BigDecimal VA;
    private Integer RK;
    private BigDecimal GD;
    private String MEMO;
}
