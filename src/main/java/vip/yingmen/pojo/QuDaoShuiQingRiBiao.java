package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 渠道水情日表多表查询
 */
@Data
public class QuDaoShuiQingRiBiao {
    private String stnm;
    private String stcd;
    @JSONField(format="yyyy-MM-dd")
    private Date tm;
    private BigDecimal da_q;
    private BigDecimal da_z;
    private BigDecimal dwq;
    private String stype;
    private String canal_name;
    private String adnm;
    private String RowId;
}
