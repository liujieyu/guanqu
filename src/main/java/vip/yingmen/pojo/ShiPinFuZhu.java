/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ShiPinFuZhu
 * Author:   user
 * Date:     2019/8/9 16:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/8/9
 * @since 1.0.0
 */
public class ShiPinFuZhu {
    private String STCD;
    private String STTP;
    private String LTTD;
    private String LGTD;
    private String STNM;
    private String STLC;
    private Integer CSTYPE;
    private String IPPort;
    private String PUID;
    private String IDX;
    private String WWWPath;
    private String picPath;


    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD;
    }

    public String getSTTP() {
        return STTP;
    }

    public void setSTTP(String STTP) {
        this.STTP = STTP;
    }

    public String getLTTD() {
        return LTTD;
    }

    public void setLTTD(String LTTD) {
        this.LTTD = LTTD;
    }

    public String getLGTD() {
        return LGTD;
    }

    public void setLGTD(String LGTD) {
        this.LGTD = LGTD;
    }


    public Integer getCSTYPE() {
        return CSTYPE;
    }

    public void setCSTYPE(Integer CSTYPE) {
        this.CSTYPE = CSTYPE;
    }

    public String getIPPort() {
        return IPPort;
    }

    public void setIPPort(String IPPort) {
        this.IPPort = IPPort;
    }

    public String getPUID() {
        return PUID;
    }

    public void setPUID(String PUID) {
        this.PUID = PUID;
    }

    public String getIDX() {
        return IDX;
    }

    public void setIDX(String IDX) {
        this.IDX = IDX;
    }

    public String getWWWPath() {
        return WWWPath;
    }

    public void setWWWPath(String WWWPath) {
        this.WWWPath = WWWPath;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getSTNM() {
        return STNM;
    }

    public void setSTNM(String STNM) {
        this.STNM = STNM;
    }

    public String getSTLC() {
        return STLC;
    }

    public void setSTLC(String STLC) {
        this.STLC = STLC;
    }
}