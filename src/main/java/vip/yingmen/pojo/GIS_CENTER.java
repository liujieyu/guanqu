package vip.yingmen.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GIS_CENTER {

    private String xmin;
    private String xmax;
    private String ymin;
    private String ymax;

    public GIS_CENTER() {
    }

    public GIS_CENTER(String xmin, String xmax, String ymin, String ymax) {
        this.xmin = xmin;
        this.xmax = xmax;
        this.ymin = ymin;
        this.ymax = ymax;
    }

    public String getXmin() {
        return xmin;
    }

    @Value("${jingweidu.xmin:#{null}}")
    public void setXmin(String xmin) {
        this.xmin = xmin;
    }

    public String getXmax() {
        return xmax;
    }

    @Value("${jingweidu.xmax:#{null}}")
    public void setXmax(String xmax) {
        this.xmax = xmax;
    }

    public String getYmin() {
        return ymin;
    }

    @Value("${jingweidu.ymin:#{null}}")
    public void setYmin(String ymin) {
        this.ymin = ymin;
    }

    public String getYmax() {
        return ymax;
    }

    @Value("${jingweidu.ymax:#{null}}")
    public void setYmax(String ymax) {
        this.ymax = ymax;
    }
}
