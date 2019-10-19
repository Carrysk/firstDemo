package com.carrysk.Demo03Thread.demo010BaoZi;

/**
 * 包子类
 */
public class BaoZi  {
    private String pi;
    private  String xian;
    private Boolean flag; // 有没有包子

    public BaoZi() {
        this.pi = "";
        this.xian = "";
        this.flag =false;
    }

    public BaoZi(String pi, String xian, Boolean flag) {
        this.pi = pi;
        this.xian = xian;
        this.flag = flag;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
