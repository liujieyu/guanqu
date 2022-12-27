package vip.yingmen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liujieyu
 * @since 2019-09-26
 */
@TableName("sms_boxsended")
public class SmsBoxsended extends Model<SmsBoxsended> {

    private static final long serialVersionUID = 1L;
    @JSONField(name = "ID")
    private Integer id;      //ID
    @JSONField(name = "APPID")
    private String appid;    //预警等级
    @JSONField(name = "SENDER")
    private String sender;   //发送用户
    @JSONField(name = "RECEIVER")
    private String receiver;  //接收手机号码
    @JSONField(name = "CONTENT")
    private String content;   //短信内容
    @JSONField(name = "MODULEID")
    private String moduleid;   //发送模块/网关标识
    @JSONField(name = "INSERTTIME")
    private String inserttime;
    @JSONField(name = "CREATETIME")
    private String createtime;
    @JSONField(name = "PRI")
    private String pri;
    @JSONField(name = "SENDTIME")
    private String sendtime;
    @JSONField(name = "TASKBATCHNAME")
    private String taskBatchname;
    @JSONField(name = "RETRYTIMES")
    private Integer retrytimes;
    @JSONField(name = "ADDTION1")
    private String addtion1;
    @JSONField(name = "ADDTION2")
    private String addtion2;
    @JSONField(name = "ADDTION3")
    private String addtion3;
    @JSONField(name = "SENDMODE")
    private String sendmode;
    @JSONField(name = "SID")
    private Integer sid;
    @JSONField(name = "RECEIPT")
    private String receipt;
    @JSONField(name = "RECEIPTTIME")
    private String receipttime;
    @JSONField(name = "INNERID")
    private String innerid;
    @JSONField(name = "FRAGCOUNT")
    private Integer fragcount;
    @JSONField(name = "CONFIGID")
    private String configid;
    @JSONField(name = "LINKID1")
    private String linkid1;
    @JSONField(name = "LINKID2")
    private String linkid2;
    @JSONField(name = "VALIDITYPERIOD")
    private String validityperiod;
    @JSONField(name = "IFRECEIPT")
    private String ifreceipt;
    @JSONField(name = "OUTTERUSER")
    private String outteruser;
    @JSONField(name = "ROWID")
    private String rowid; //序号
    @JSONField(name = "RESULT")
    private String result;//发送结果
    @JSONField(name = "TABLENAME")
    private String tablename;//表名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getPri() {
        return pri;
    }

    public void setPri(String pri) {
        this.pri = pri;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }

    public String getTaskBatchname() {
        return taskBatchname;
    }

    public void setTaskBatchname(String taskBatchname) {
        this.taskBatchname = taskBatchname;
    }

    public Integer getRetrytimes() {
        return retrytimes;
    }

    public void setRetrytimes(Integer retrytimes) {
        this.retrytimes = retrytimes;
    }

    public String getAddtion1() {
        return addtion1;
    }

    public void setAddtion1(String addtion1) {
        this.addtion1 = addtion1;
    }

    public String getAddtion2() {
        return addtion2;
    }

    public void setAddtion2(String addtion2) {
        this.addtion2 = addtion2;
    }

    public String getAddtion3() {
        return addtion3;
    }

    public void setAddtion3(String addtion3) {
        this.addtion3 = addtion3;
    }

    public String getSendmode() {
        return sendmode;
    }

    public void setSendmode(String sendmode) {
        this.sendmode = sendmode;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getReceipttime() {
        return receipttime;
    }

    public void setReceipttime(String receipttime) {
        this.receipttime = receipttime;
    }

    public String getInnerid() {
        return innerid;
    }

    public void setInnerid(String innerid) {
        this.innerid = innerid;
    }

    public Integer getFragcount() {
        return fragcount;
    }

    public void setFragcount(Integer fragcount) {
        this.fragcount = fragcount;
    }

    public String getConfigid() {
        return configid;
    }

    public void setConfigid(String configid) {
        this.configid = configid;
    }

    public String getLinkid1() {
        return linkid1;
    }

    public void setLinkid1(String linkid1) {
        this.linkid1 = linkid1;
    }

    public String getLinkid2() {
        return linkid2;
    }

    public void setLinkid2(String linkid2) {
        this.linkid2 = linkid2;
    }

    public String getValidityperiod() {
        return validityperiod;
    }

    public void setValidityperiod(String validityperiod) {
        this.validityperiod = validityperiod;
    }

    public String getIfreceipt() {
        return ifreceipt;
    }

    public void setIfreceipt(String ifreceipt) {
        this.ifreceipt = ifreceipt;
    }

    public String getOutteruser() {
        return outteruser;
    }

    public void setOutteruser(String outteruser) {
        this.outteruser = outteruser;
    }

    public String getRowid() {
        return rowid;
    }

    public void setRowid(String rowid) {
        this.rowid = rowid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
