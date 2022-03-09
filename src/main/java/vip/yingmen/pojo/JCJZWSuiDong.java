/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: JCJZWSuiDong
 * Author:   user
 * Date:     2019/8/12 11:11
 * Description: 基础数据的建筑物隧道
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈基础数据的建筑物隧洞〉
 *
 * @author user
 * @create 2019/8/12
 * @since 1.0.0
 */
public class JCJZWSuiDong {
    private String tunnelName;
    private String tunnelDiameter;
    private String tunnelLength;
    private String designFlux;
    private String addFlux;
    private String canalName;
    private String gs;

    @JSONField(name = "Tunnel_Name")
    public String getTunnelName() {
        return tunnelName;
    }

    public void setTunnelName(String tunnelName) {
        this.tunnelName = tunnelName;
    }

    @JSONField(name = "Tunnel_Diameter")
    public String getTunnelDiameter() {
        return tunnelDiameter;
    }

    public void setTunnelDiameter(String tunnelDiameter) {
        this.tunnelDiameter = tunnelDiameter;
    }

    @JSONField(name = "Tunnel_Length")
    public String getTunnelLength() {
        return tunnelLength;
    }

    public void setTunnelLength(String tunnelLength) {
        this.tunnelLength = tunnelLength;
    }

    @JSONField(name = "Design_Flux")
    public String getDesignFlux() {
        return designFlux;
    }

    public void setDesignFlux(String designFlux) {
        this.designFlux = designFlux;
    }

    @JSONField(name = "Add_Flux")
    public String getAddFlux() {
        return addFlux;
    }

    public void setAddFlux(String addFlux) {
        this.addFlux = addFlux;
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