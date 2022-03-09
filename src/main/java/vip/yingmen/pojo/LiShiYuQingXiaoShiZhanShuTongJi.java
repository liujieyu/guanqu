package vip.yingmen.pojo;

/**
 * 历史数据的雨情雨量区间站数统计
 * 0-10（0<降雨<10，浅绿色）：rain1
 * 10-25（10<=降雨<25，绿色）：rain2
 * 25-50（25<=降雨<50，浅蓝色）：rain3
 * 50-100（50<=降雨<100，蓝色）：rain4
 * 100-250（100<=降雨<250，橙色）：rain5
 * >=250（250<=降雨，红色）：rain6
 */
public class LiShiYuQingXiaoShiZhanShuTongJi {
    private String rain1;
    private String rain2;
    private String rain3;
    private String rain4;
    private String rain5;
    private String rain6;

    public String getRain1() {
        return rain1;
    }

    public void setRain1(String rain1) {
        this.rain1 = rain1;
    }

    public String getRain2() {
        return rain2;
    }

    public void setRain2(String rain2) {
        this.rain2 = rain2;
    }

    public String getRain3() {
        return rain3;
    }

    public void setRain3(String rain3) {
        this.rain3 = rain3;
    }

    public String getRain4() {
        return rain4;
    }

    public void setRain4(String rain4) {
        this.rain4 = rain4;
    }

    public String getRain5() {
        return rain5;
    }

    public void setRain5(String rain5) {
        this.rain5 = rain5;
    }

    public String getRain6() {
        return rain6;
    }

    public void setRain6(String rain6) {
        this.rain6 = rain6;
    }
}
