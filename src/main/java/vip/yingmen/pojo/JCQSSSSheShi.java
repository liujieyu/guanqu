/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCQSSSSheShi
 * Author:   user
 * Date:     2019/8/8 9:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 基础数据的取水设施的取水设施实体类〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author user
 * @create 2019/8/8
 * @since 1.0.0
 */
public class JCQSSSSheShi {
    private String fstructureName;
    private  String fstructureType;
    private  String fetchMode;

    @JSONField(name = "FStructure_Name")
    public String getFstructureName() {
        return fstructureName;
    }

    public void setFstructureName(String fstructureName) {
        this.fstructureName = fstructureName;
    }

    @JSONField(name = "FStructure_Type")
    public String getFstructureType() {
        return fstructureType;
    }

    public void setFstructureType(String fstructureType) {
        this.fstructureType = fstructureType;
    }

    @JSONField(name = "Fetch_Mode")
    public String getFetchMode() {
        return fetchMode;
    }

    public void setFetchMode(String fetchMode) {
        this.fetchMode = fetchMode;
    }
}