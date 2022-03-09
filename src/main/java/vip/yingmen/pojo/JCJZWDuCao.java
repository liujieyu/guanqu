/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCJZWDuCao
 * Author:   user
 * Date:     2019/8/12 10:28
 * Description: 基础数据的建筑物渡槽
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的建筑物渡槽〉
 *
 * @author user
 * @create 2019/8/12
 * @since 1.0.0
 */
public class JCJZWDuCao {
    private String flumName;
    private String matieralType;
    private String flumBodyType;
    private String flumLength;
    private String dfl;
    private String addfl;
    private String inz;
    private String outz;
    private String canalName;
    private String gs;

    @JSONField(name = "Flum_Name")
    public String getFlumName() {
        return flumName;
    }

    public void setFlumName(String flumName) {
        this.flumName = flumName;
    }

    @JSONField(name = "Matieral_Type")
    public String getMatieralType() {
        return matieralType;
    }

    public void setMatieralType(String matieralType) {
        this.matieralType = matieralType;
    }

    @JSONField(name = "FlumBody_Type")
    public String getFlumBodyType() {
        return flumBodyType;
    }

    public void setFlumBodyType(String flumBodyType) {
        this.flumBodyType = flumBodyType;
    }

    @JSONField(name = "Flum_Length")
    public String getFlumLength() {
        return flumLength;
    }

    public void setFlumLength(String flumLength) {
        this.flumLength = flumLength;
    }

    @JSONField(name = "D_FL")
    public String getDfl() {
        return dfl;
    }

    public void setDfl(String dfl) {
        this.dfl = dfl;
    }

    @JSONField(name = "ADD_FL")
    public String getAddfl() {
        return addfl;
    }

    public void setAddfl(String addfl) {
        this.addfl = addfl;
    }

    @JSONField(name = "IN_Z")
    public String getInz() {
        return inz;
    }

    public void setInz(String inz) {
        this.inz = inz;
    }

    @JSONField(name = "OUT_Z")
    public String getOutz() {
        return outz;
    }

    public void setOutz(String outz) {
        this.outz = outz;
    }

    @JSONField(name = "Canal_Name")
    public String getCanalName() {
        return canalName;
    }

    public void setCanalName(String canalName) {
        this.canalName = canalName;
    }

    @JSONField(name = "GS")
    public String getGs() {
        return gs;
    }

    public void setGs(String gs) {
        this.gs = gs;
    }
}