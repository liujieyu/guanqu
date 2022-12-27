/**
 * Copyright (C), 2015-2019, 有限公司
 * FileName: JcDuoMeiTi
 * Author:   dabindream
 * Description: 基础数据的多媒体信息
 * History:
 * <author>                 <version>          <desc>
 * 作者姓名                 版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的多媒体信息〉
 *
 * @author dabindream
 * @since 1.0.0
 */
public class JcDuoMeiTi {
    private String mat;
    private String mattype;
    private String comments;

    @JSONField(name = "MAT")
    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    @JSONField(name = "MATType")
    public String getMattype() {
        return mattype;
    }

    public void setMattype(String mattype) {
        this.mattype = mattype;
    }

    @JSONField(name = "COMMENTS")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}