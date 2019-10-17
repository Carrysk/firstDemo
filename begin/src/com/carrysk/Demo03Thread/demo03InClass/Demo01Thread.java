package com.carrysk.Demo03Thread.demo03InClass;

import com.carrysk.Demo03Thread.demo01Thread.ThreadSetName;

/**
 * 匿名内部类 创建线程的方式
 * new Thread/Runnable（）{} => 简化代码
 */


public class Demo01Thread {
    public static void main(String[] args) {

        // 1 创建线程的匿名实现类
        new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "NEW_THREAD");
                }
            }
        }.start();

        // 2 创建匿名的Runnable接口实现类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "NEW_RUNNABLE");
                }
            }
        };
        new Thread(r).start();

        // 3 简化匿名的Runnable接口实现类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "NEW_THREAD_RUNNABLE");
                }
            }
        }).start();
    }
}
