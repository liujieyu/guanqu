package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *水源信息表
 * 水源信息表用来存储灌区所有的水源，包括水库、河流、井等，它描述灌区水源工程的情况和水源的类型情况。
 */
public class WRP_IrrBFSource {
    private Integer ID;
    private String SourceE_Code;
    private String SourceE_Name;
    private String SourceE_Type;
    private String Source_Type;
    private String GS;

    @JSONField(name = "ID")
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @JSONField(name = "SourceE_Code")
    public String getSourceE_Code() {
        return SourceE_Code;
    }

    public void setSourceE_Code(String sourceE_Code) {
        SourceE_Code = sourceE_Code;
    }

    @JSONField(name = "SourceE_Name")
    public String getSourceE_Name() {
        return SourceE_Name;
    }

    public void setSourceE_Name(String sourceE_Name) {
        SourceE_Name = sourceE_Name;
    }

    @JSONField(name = "SourceE_Type")
    public String getSourceE_Type() {
        return SourceE_Type;
    }

    public void setSourceE_Type(String sourceE_Type) {
        SourceE_Type = sourceE_Type;
    }

    @JSONField(name = "Source_Type")
    public String getSource_Type() {
        return Source_Type;
    }

    public void setSource_Type(String source_Type) {
        Source_Type = source_Type;
    }

    @JSONField(name = "GS")
    public String getGS() {
        return GS;
    }

    public void setGS(String GS) {
        this.GS = GS;
    }
}
