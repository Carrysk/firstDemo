package com.carrysk.Demo03Thread.demo07StaticSychronized;

import com.carrysk.Demo03Thread.demo07StaticSychronized.RunnableImp;

public class ThreadMain {
    public static void main(String[] args) {
        // 创建票的Runnable接口实现类
        Runnable run = new RunnableImp();
        System.out.println(run);
        Thread td1= new Thread(run);
        Thread td2= new Thread(run);
        Thread td3= new Thread(run);

        td1.start();
        td2.start();
        td3.start();
    }
}
