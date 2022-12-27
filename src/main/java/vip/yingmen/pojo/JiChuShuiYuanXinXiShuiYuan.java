package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

public class JiChuShuiYuanXinXiShuiYuan {
    private String SourceE_Name;
    private String SourceE_Type;
    private String Source_Type;

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
}
