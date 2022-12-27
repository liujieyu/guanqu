package vip.yingmen.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.util.Objects;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author fzq
 * @since 2020-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ST_Gatage_R")
@ApiModel(value="StGatageR对象", description="")
public class StGatageR extends Model<StGatageR> {

    private static final long serialVersionUID = 1L;

//    @TableId(value = "ID", type = IdType.AUTO)
//    private Integer id;

//    @TableField("STNM")
//    private String stnm;
    
    @TableId(value = "STCD", type = IdType.NONE)
    @TableField("STCD")
    private String stcd;
//
//    @TableField("ANO")
//    private String ano;
//
//    @TableField("CTYPE")
//    private String ctype;

    
    @TableField("TM")
    private String tm;

    @TableField("OD")
    private Double od;

    @TableField("H")
    private Double h;

    @TableField("Q")
    private Double q;

    @TableField("UPZ")
    private Double upz;

    @TableField("DWZ")
    private Double dwz;

    
    @TableField("OP")
    private Boolean op;

    @TableField("UP")
    private Boolean up;

    @TableField("DOWN")
    private Boolean down;

    @TableField("STOP")
    private Boolean stop;

    @TableField("LOWERLIMIT")
    private Boolean lowerlimit;

    @TableField("UPPERLIMIT")
    private Boolean upperlimit;

    @TableField("ERROR")
    private Boolean error;

    @TableField("BDKZ")
    private Boolean bdkz;

    @TableField("TD")
    private Boolean td;
    
//    private String picPath;

    @Override
    protected Serializable pkVal() {
        return this.stcd;
    }

}
