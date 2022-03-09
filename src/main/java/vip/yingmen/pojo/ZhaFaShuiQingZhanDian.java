package vip.yingmen.pojo;

import lombok.Data;

/**
 * 闸阀水情的站点查询
 * 用于接收ZhaFaShuiQingMapping.xml的多表查询
 */
@Data
public class ZhaFaShuiQingZhanDian {
    private String stnm;
    private String stcd;
}
