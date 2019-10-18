package com.carrysk.Demo03Thread.demo05Sychronized;

import com.carrysk.Demo03Thread.demo04SafeThread.RunnableImp;

public class ThreadMain {
    public static void main(String[] args) {
        // 创建票的Runnable接口实现类
        Runnable run = new RunnableImp();

        Thread td1= new Thread(run);
        Thread td2= new Thread(run);
        Thread td3= new Thread(run);

        td1.start();
        td2.start();
        td3.start();
    }
}
