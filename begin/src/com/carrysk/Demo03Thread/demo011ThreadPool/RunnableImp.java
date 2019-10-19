package com.carrysk.Demo03Thread.demo011ThreadPool;

public class RunnableImp implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 启动了");
    }
}
