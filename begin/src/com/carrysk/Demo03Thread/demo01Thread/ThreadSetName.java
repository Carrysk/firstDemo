package com.carrysk.Demo03Thread.demo01Thread;

/**
 * Thread 给线程起名字的两种方式
 * fun1 通过 public void  setName(String name) 方法给线程起名
 * fun2 通过构造函数使用super(name) 使Thread给线程实例起名
 * public Thread(String name) {super(name);}
 */

public class ThreadSetName extends Thread  {

    public ThreadSetName() {
    }

    public  ThreadSetName(String name) {
        super(name);
    }

    // 重写run方法
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
