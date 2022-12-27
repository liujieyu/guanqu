package vip.yingmen.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 灌区人员基本信息表
 * 描述灌区人员基本情况信息。
 */
public class WRP_IrrBSPerson {
    private String Personal_Code;
    private String Post_Code;
    private String Personal_Name;
    private String Sex;
    private String Age;
    private String Offical_Rank;
    private String Positional_Title;
    private String Educastional_Level;
    private String Work_Time;
    private String Working_Life;
    private String IRACD;
    private String Organ_Code;

    @JSONField(name = "Personal_Code")
    public String getPersonal_Code() {
        return Personal_Code;
    }

    public void setPersonal_Code(String personal_Code) {
        Personal_Code = personal_Code;
    }

    @JSONField(name = "Post_Code")
    public String getPost_Code() {
        return Post_Code;
    }

    public void setPost_Code(String post_Code) {
        Post_Code = post_Code;
    }

    @JSONField(name = "Personal_Name")
    public String getPersonal_Name() {
        return Personal_Name;
    }

    public void setPersonal_Name(String personal_Name) {
        Personal_Name = personal_Name;
    }

    @JSONField(name = "Sex")
    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    @JSONField(name = "Age")
    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    @JSONField(name = "Offical_Rank")
    public String getOffical_Rank() {
        return Offical_Rank;
    }

    public void setOffical_Rank(String offical_Rank) {
        Offical_Rank = offical_Rank;
    }

    @JSONField(name = "Positional_Title")
    public String getPositional_Title() {
        return Positional_Title;
    }

    public void setPositional_Title(String positional_Title) {
        Positional_Title = positional_Title;
    }

    @JSONField(name = "Educastional_Level")
    public String getEducastional_Level() {
        return Educastional_Level;
    }

    public void setEducastional_Level(String educastional_Level) {
        Educastional_Level = educastional_Level;
    }

    @JSONField(name = "Work_Time")
    public String getWork_Time() {
        return Work_Time;
    }

    public void setWork_Time(String work_Time) {
        Work_Time = work_Time;
    }

    @JSONField(name = "Working_Life")
    public String getWorking_Life() {
        return Working_Life;
    }

    public void setWorking_Life(String working_Life) {
        Working_Life = working_Life;
    }

    @JSONField(name = "IRACD")
    public String getIRACD() {
        return IRACD;
    }

    public void setIRACD(String IRACD) {
        this.IRACD = IRACD;
    }

    @JSONField(name = "Organ_Code")
    public String getOrgan_Code() {
        return Organ_Code;
    }

    public void setOrgan_Code(String organ_Code) {
        Organ_Code = organ_Code;
    }
}
