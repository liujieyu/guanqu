package vip.yingmen.pojo;

import lombok.Data;

/**
 * 雨情日表
 * 雨情日表用于存储各站点每日降雨量。规定1天降雨量为本日8时至第二日8时之间的降雨量之和。
 */
@Data
public class ST_DP_C {
    private String TM;
    private String P;

}
