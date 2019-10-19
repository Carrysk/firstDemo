package com.carrysk.Demo03Thread.demo010BaoZi;
import java.lang.Runnable;

public class CustomImp implements Runnable {

    private BaoZi baozi;

    public CustomImp(BaoZi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "启动了");
        while (true) {
            synchronized (baozi) {
                if(baozi.getFlag()) {
                    System.out.println("吃货开始吃"+baozi.getPi() + baozi.getXian()+"包子了");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    baozi.setFlag(false);
                    System.out.println("包子吃完啦");
                    System.out.println("-------------------next one--------------------");
                    baozi.notify();
                } else {
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
