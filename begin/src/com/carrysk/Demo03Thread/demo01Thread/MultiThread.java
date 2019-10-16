package com.carrysk.Demo03Thread.demo01Thread;

/**
 * 多线程-》 多个线程并发执行 JAVA线程执行方式是-》抢占式执行（优先执行优先级高的，优先级相同随机执行）
 * 创建线程的fun1
 *     1 继承java.lang.Thread类
 *     2 实现Thread类中run方法
 *     3 创建线程子类
 *     4 调用线程的start 方法 启动线程中的run方法
 */

public class MultiThread {
    public static void main(String[] args) {
        // 3 创建线程的子类
        MyThread mt = new MyThread();

        //4 启动线程中的 start方法 -》调用run方法
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main--->>>>" + i);
        }
        // mt中run方法的内容和 main方法中的for循环抢占式执行，每次执行的结果都不同
    }
}
