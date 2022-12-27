package vip.yingmen.pojo;

import java.time.Instant;

public class loginNum {
    private int num;
    private Instant locktime;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Instant getLocktime() {
        return locktime;
    }

    public void setLocktime(Instant locktime) {
        this.locktime = locktime;
    }
}
