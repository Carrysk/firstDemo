package com.carrysk.Demo03Thread.demo010BaoZi;

public class Demo01Main {
    public static void main(String[] args) {
        BaoZi baozi = new BaoZi("薄皮", "牛肉大葱", true);

        BaoZiPu baozipu = new BaoZiPu(baozi);
        baozipu.setName("包子铺");

        CustomImp run = new CustomImp(baozi);
        Thread custom = new Thread(run);
        custom.setName("吃货");

        baozipu.start();
        custom.start();
    }
}
